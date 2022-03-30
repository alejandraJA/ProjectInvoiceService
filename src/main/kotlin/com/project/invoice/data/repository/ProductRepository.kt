package com.project.invoice.data.repository

import com.project.invoice.data.models.facturapi.product.Product
import com.project.invoice.data.repository.responses.ResponseFacturapi
import retrofit2.Call
import retrofit2.http.*

/**
 * [<h1>Repositorio de los productos</h1>]
 * Interface de comunicacion con facturapi para el objeto Producto.
 *
 * @author Alejandra JA - 24/03/2022
 */

interface ProductRepository {
    /**
     * Crear producto
     *
     * Registra un nuevo producto o servicio en tu catálogo de Facturapi.
     *
     * - Puedes usar el ID del producto para crear facturas sin tener que
     * enviar todos
     * los datos del producto cada vez.
     *
     *
     * @param accessToken `Secret Live KeySecret` o `Test Key`.
     * @param product     Objeto de tipo ProductRequest.
     * @return Retorna una llamada de tipo [Product].
     */
    @POST("products")
    @Headers("Content-Type: application/json")
    fun create(@Header("Authorization") accessToken: String?, @Body product: Any?): Call<Product?>?

    /**
     * Listar productos
     *
     * Regresa una lista paginada de todos los productos de una organización o
     * realiza una búsqueda de acuerdo a parámetros.
     *
     * @param accessToken `Secret Live KeySecret` o `Test Key`.
     * @return Retorna una llamada a la API que contiene un objeto de tipo
     * [ResponseFacturapi].
     */
    @GET("products")
    fun getProducts(@Header("Authorization") accessToken: String?): Call<ResponseFacturapi?>?

    /**
     * Obtener producto por ID
     *
     * @param accessToken `Secret Live KeySecret` o `Test Key`.
     * @param id          Id asociado al producto.
     * @return Regresa una llamada de tipo [Product] relacionado al `id`
     * especificado.
     */
    @GET("products/{id}")
    operator fun get(@Header("Authorization") accessToken: String?, @Path("id") id: String?): Call<Product?>?

    /**
     * Editar producto
     *
     * Actualiza la información de un producto existente, asignando los valores de
     * los parámetros enviados. Los parámetros que no se envíen en la petición no se
     * modificarán.
     *
     * @param accessToken `Secret Live KeySecret` o `Test Key`.
     * @param product     Objeto de tipo ProductRequest.
     * @param id          Id asociado al producto.
     * @return Retorna una llamada de tipo [Product].
     */
    @PUT("products/{id}")
    @Headers("Content-Type: application/json")
    fun update(
        @Header("Authorization") accessToken: String?,
        @Body product: Any?,
        @Path("id") id: String?
    ): Call<Product?>?

    /**
     * Eliminar producto
     *
     * Elimina el producto de tu organización. Las facturas asociadas al producto **no**
     * se eliminarán.
     *
     * @param accessToken `Secret Live KeySecret` o `Test Key`.
     * @param id          Id asociado al producto.
     * @return Regresa una llamada de tipo [Product] relacionado con el [id]
     * especificado.
     */
    @DELETE("products/{id}")
    fun delete(@Header("Authorization") accessToken: String?, @Path("id") id: String?): Call<Product?>?
}