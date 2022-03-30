package com.project.invoice.controller

import com.fasterxml.jackson.core.JsonProcessingException
import com.fasterxml.jackson.databind.ObjectMapper
import com.google.gson.Gson
import com.google.gson.reflect.TypeToken
import com.project.invoice.data.models.facturapi.product.Product
import com.project.invoice.data.repository.ProductRepository
import com.project.invoice.data.repository.responses.ResponseFacturapi
import okhttp3.OkHttpClient
import okhttp3.OkHttpClient.Builder
import okhttp3.logging.HttpLoggingInterceptor
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.*
import retrofit2.Call
import retrofit2.Response
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import java.io.IOException


/**
 * [<h1>Controlador para el Producto</h1>]
 *
 * Registra, editado, lectura y validación del cliente en Facturapi.
 *
 * @author Alejandra JA - 25/03/2022
 */
@RestController
@RequestMapping("product")
class ProductController {
    private var accessToken: String? = null
    private var service: ProductRepository? = null

    /**
     * Constructor por defecto.
     */
    init {
        val loginInterceptor = HttpLoggingInterceptor()
        loginInterceptor.setLevel(HttpLoggingInterceptor.Level.BODY)
        val okClient: OkHttpClient = Builder().addInterceptor(loginInterceptor).build()
        val retrofit = Retrofit.Builder()
            .baseUrl("https://www.facturapi.io/v2/")
            .addConverterFactory(GsonConverterFactory.create())
            .client(okClient)
            .build()
        service = retrofit.create(ProductRepository::class.java)
        accessToken = "Bearer sk_test_0Lj7YMX1JeVKOeeZp0Jzd239RZOlykGa"
    }

    /**
     * Crear producto
     *
     * Registra un nuevo producto o servicio en tu catálogo de Facturapi.
     *
     * - Puedes usar el ID del producto para crear facturas sin tener que
     * enviar todos los datos del producto cada vez.
     * @param data Es ub objeto de tipo [Product].
     * @return Retorna un objeto de tipo [Product] que contiene la información
     * del producto creado.
     */
    @RequestMapping(value = ["/create"], method = [RequestMethod.POST])
    @Throws(IOException::class)
    fun create(@RequestBody data: Map<String, Any>): Any? {
        val call =
            service!!.create(accessToken, Gson().fromJson(getObject(data), object : TypeToken<Any?>() {}.type))
        return setProduct(call)
    }

    /**
     * Listar productos
     *
     * Regresa una lista paginada de todos los productos de una organización o
     * realiza una búsqueda de acuerdo a parámetros.
     *
     * @return Retorna un objeto de tipo [ResponseFacturapi] que contiene
     * una lista de los prpoductos asociados a la organización.
     */
    @GetMapping("/")
    @Throws(IOException::class)
    fun getProducts(): ResponseEntity<Any?>? {
        val call = service!!.getProducts(accessToken)
        return setData(call)
    }

    /**
     * Obtener producto por ID
     *
     * @param id Es el ID asociado al producto.
     * @return Retorna un objeto de tipo [Product] que contiene la información
     * del producto asociado.
     */
    @GetMapping("get")
    fun get(@RequestParam(value = "id", defaultValue = "null") id: String?): Any? {
        val call = service!![accessToken, id]
        return setProduct(call)
    }

    /**
     * Editar producto
     *
     * Actualiza la información de un producto existente, asignando los valores de
     * los parámetros enviados. Los parámetros que no se envíen en la petición no se
     * modificarán.
     *
     * @param data Objeto de tipo [Product] que contiene los datos del usuario
     * que serán cambiados.
     * @param id Es el ID asociado al producto.
     * @return Retorna un objeto de tipo [Product] que contiene la información
     * actualizada del producto asociado.
     */
    @RequestMapping(value = ["/update"], method = [RequestMethod.PUT])
    @Throws(IOException::class)
    fun update(
        @RequestBody data: Map<String, Any>,
        @RequestParam(value = "id", defaultValue = "null") id: String?
    ): Any? {
        val call =
            service!!.update(accessToken, Gson().fromJson(getObject(data), object : TypeToken<Any?>() {}.type), id)
        return setProduct(call)
    }

    /**
     * Eliminar producto
     *
     * Elimina el producto de tu organización. Las facturas asociadas al producto **no**
     * se eliminarán.
     * @param id Es el ID asociado al producto.
     * @return Retorna un objeto con los datos del [Product] eliminado.
     */
    @RequestMapping(value = ["/delete"], method = [RequestMethod.DELETE])
    fun delete(@RequestParam(value = "id", defaultValue = "null") id: String?): Any? {
        val call = service!!.delete(accessToken, id)
        return setProduct(call)
    }

    @Throws(IOException::class)
    private fun setProduct(call: Call<Product?>?): Any {
        val response: Response<Product?> = call!!.execute()
        return if (response.code() == 200 || response.code() == 201) ResponseEntity.ok(response.body()) else ResponseEntity.ok(
            Gson()
                .fromJson<Any>(response.errorBody()!!.string(), object : TypeToken<Error?>() {}.type)
        )
    }

    /**
     * Convierte un Map en un objeto a string.
     *
     * @param data La data que se debe convertir a String.
     *
     * Puede ser un objeto de tipo: [Product]
     * @return Un string con la data solicitada.
     * @throws JsonProcessingException Error de la conversion.
     */
    @Throws(JsonProcessingException::class)
    private fun getObject(data: Map<String, Any>): String? {
        return ObjectMapper().writeValueAsString(data)
    }

    /**
     * Método encargado de ejecutar la llamada y mostrar la información obtenida.
     *
     * @param call Llamada del web service de tipo [ResponseFacturapi]
     * @return Un objeto de tipo [ResponseFacturapi]
     * @throws IOException Error de la llamada a la API.
     */
    @Throws(IOException::class)
    private fun setData(call: Call<ResponseFacturapi?>?): ResponseEntity<Any?> {
        val response: Response<ResponseFacturapi?> = call!!.execute()
        return if (response.code() == 200) ResponseEntity.ok(response.body()) else ResponseEntity.ok(
            Gson()
                .fromJson(response.errorBody()!!.string(), object : TypeToken<Error?>() {}.type)
        )
    }
}