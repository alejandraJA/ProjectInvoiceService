package com.project.invoice.controller

import com.fasterxml.jackson.core.JsonProcessingException
import com.fasterxml.jackson.databind.ObjectMapper
import com.google.gson.Gson
import com.google.gson.reflect.TypeToken
import com.project.invoice.data.models.facturapi.customer.Customer
import com.project.invoice.data.repository.CustomerRepository
import com.project.invoice.data.repository.responses.ResponseFacturapi
import okhttp3.OkHttpClient
import okhttp3.logging.HttpLoggingInterceptor
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.*
import retrofit2.Call
import retrofit2.Response
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import java.io.IOException
import okhttp3.OkHttpClient.*


/**
 * [<h1>Controlador para el cliente</h1>]
 *
 * Registra, editado, lectura y validación del cliente en Facturapi.
 *
 * @author Alejandra JA - 23/03/2022
 */
@RestController
@RequestMapping("customer")
class CustomerController {
    private var accessToken: String? = null
    private var service: CustomerRepository? = null

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
        service = retrofit.create(CustomerRepository::class.java)
        accessToken = "Bearer sk_test_0Lj7YMX1JeVKOeeZp0Jzd239RZOlykGa"
    }

    /**
     * Crear cliente
     *
     * - Puedes guardar el ID del cliente y usarlo para crear facturas sin
     * tener que enviar todos los datos fiscales.
     *
     * - Al guardar al cliente, validamos que los datos fiscales coincidan
     * con los registros del SAT para ese RFC, de lo contrario, la llamada
     * devolverá un error indicando el problema.
     * @param data Objeto de tipo [Customer] que contiene la
     * información del cliente.
     * @return Retorna un objeto de tipo [Customer].
     * @throws IOException Error de la llamada.
     */
    @RequestMapping(value = ["/create"], method = [RequestMethod.POST])
    @Throws(IOException::class)
    fun createCustomer(@RequestBody data: Map<String, Any>): Any? {
        val call = service!!
            .createCustomer(accessToken, Gson().fromJson(getObject(data), object : TypeToken<Any?>() {}.type))
        return setCustomer(call)
    }

    /**
     * Listar clientes
     *
     * Regresa una lista paginada de todos los clientes de una organización o
     * realiza una búsqueda de acuerdo a parámetros.
     *
     * @return Retorna un objeto de tipo [ResponseFacturapi].
     * @throws IOException Error de la llamada.
     */
    @GetMapping("/")
    @Throws(IOException::class)
    fun getCustomers(): Any? {
        val call = service!!.getCustomers(accessToken)
        return setData(call)
    }

    /**
     * Obtener cliente por ID
     *
     * Regresa el objeto [Customer] relacionado con él [id] `especificado`.
     *
     * @param id Es el ID asociado al cliente que se desea consultar.
     * @return Retorna un objeto de tipo [Customer].
     * @throws IOException Error de la llamada.
     */
    @RequestMapping(value = ["/get"], method = [RequestMethod.GET])
    @Throws(IOException::class)
    fun getCustomer(@RequestParam(value = "id", defaultValue = "null") id: String?): Any? {
        val call = service!!.getCustomer(accessToken, id)
        return setCustomer(call)
    }

    /**
     * Editar cliente
     *
     * Actualiza la información de un cliente existente, asignando los valores de
     * los parámetros enviados. Los parámetros que no se envíen en la petición no se
     * modificarán.
     *
     * @param data Objeto de tipo [Customer] que contiene la
     * información del cliente.
     * @param id   Es el ID asociado al cliente.
     * @return Retorna un objeto de tipo [Customer].
     * @throws IOException Error de la llamada.
     */
    @RequestMapping(value = ["/update"], method = [RequestMethod.PUT])
    @Throws(IOException::class)
    fun editCustomer(
        @RequestBody data: Map<String, Any>,
        @RequestParam(value = "id", defaultValue = "null") id: String?
    ): Any? {
        val call =
            service!!.editCustomer(
                accessToken,
                id,
                Gson().fromJson(getObject(data), object : TypeToken<Any?>() {}.type)
            )
        return setCustomer(call)
    }

    /**
     * Eliminar cliente
     *
     * Elimina el cliente de tu organización. Las facturas asociadas al cliente no
     * se eliminarán.
     *
     * @param id Es el ID asociado al cliente.
     * @return Retorna un objeto de tipo [Customer].
     * @throws IOException Error de la llamada.
     */
    @RequestMapping(value = ["/delete"], method = [RequestMethod.DELETE])
    @Throws(IOException::class)
    fun deleteCustomer(@RequestParam(value = "id", defaultValue = "null") id: String?): Any? {
        val call = service!!.deleteCustomer(accessToken, id)
        return setCustomer(call)
    }

    /**
     * Validar información fiscal
     *
     * Válida que la información fiscal del cliente coincida con los registros del
     * SAT.
     *
     * - Esta función solo puede ser usada en modo Live, con una suscripción activa.
     *
     * @param id Es el ID asociado al cliente.
     * @return Retorna un objeto con la información que coincide con los registros
     * del SAT, en un array se encuentran la lista de errores encontrados.
     * @throws IOException Error de la llamada.
     */
    @RequestMapping(value = ["/validate"], method = [RequestMethod.GET])
    @Throws(IOException::class)
    fun validateFiscalDataCustomer(@RequestParam(value = "id", defaultValue = "null") id: String?): Any? {
        val call = service!!.validateFiscalDataCustomer(accessToken, id)
        val response = call!!.execute()
        return if (response.code() == 200 || response.code() == 201)
            ResponseEntity.ok(response.body()) else ResponseEntity.ok(
            Gson()
                .fromJson(response.errorBody()!!.string(), object : TypeToken<Error?>() {}.type)
        )
    }

    /**
     * Método encargado de ejecutar la llamada y mostrar la información obtenida.
     *
     * @param call Llamada del web service de tipo [Customer]
     * @return Un objeto de tipo [Customer]
     * @throws IOException Error de la llamada a la API.
     */
    @Throws(IOException::class)
    private fun setCustomer(call: Call<Customer?>?): Any {
        val response: Response<Customer?> = call!!.execute()
        return if (response.code() == 200 || response.code() == 201) ResponseEntity.ok(response.body()) else ResponseEntity.ok(
            Gson()
                .fromJson<Any>(response.errorBody()!!.string(), object : TypeToken<Error?>() {}.type)
        )
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

    /**
     * Convierte un Map en un objeto a string.
     * @param data
     * @return Un string.
     * @throws JsonProcessingException Error de la conversion.
     */
    @Throws(JsonProcessingException::class)
    private fun getObject(data: Map<String, Any>): String? {
        return ObjectMapper().writeValueAsString(data)
    }
}