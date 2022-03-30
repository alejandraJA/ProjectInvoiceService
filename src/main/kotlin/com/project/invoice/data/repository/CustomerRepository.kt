package com.project.invoice.data.repository

import com.project.invoice.data.models.facturapi.customer.Customer
import com.project.invoice.data.repository.responses.ResponseFacturapi
import retrofit2.Call
import retrofit2.http.*

/**
 * [<h1>Repositorio del cliente</h1>]
 *
 * Interface de comunicación con facturapi para el objeto Cliente.
 *
 * @author Alejandra JA - 22/03/2022
 */
interface CustomerRepository {
    /**
     * Crear cliente
     *
     * - Puedes guardar el ID del cliente y usarlo para crear facturas sin
     * tener que enviar todos los datos fiscales.
     *
     * - Al guardar al cliente, validamos que los datos fiscales coincidan
     * con los registros del SAT para ese RFC, de lo contrario, la llamada
     * devolverá un error indicando el problema.
     *
     * @param accessToken `Secret Live KeySecret` o `Test Key`.
     * @param customer    Objeto de tipo [Customer] que contiene la
     * información del cliente.
     * @return Retorna una llamada a la API que contiene un objeto de tipo
     * [Customer].
     */
    @POST("customers")
    @Headers("Content-Type: application/json")
    fun createCustomer(@Header("Authorization") accessToken: String?, @Body customer: Any?): Call<Customer?>?

    /**
     * Listar clientes
     *
     * Regresa una lista paginada de todos los clientes de una organización o
     * realiza una búsqueda de acuerdo a parámetros.
     *
     * @param accessToken `Secret Live KeySecret` o `Test Key`.
     * @return Retorna una llamada a la API que contiene un objeto de tipo
     * [ResponseFacturapi].
     */
    @GET("customers")
    fun getCustomers(@Header("Authorization") accessToken: String?): Call<ResponseFacturapi?>?

    /**
     * Obtener cliente por ID
     *
     * Regresa el objeto [Customer] relacionado con él [id] `especificado`.
     *
     * @param accessToken `Secret Live KeySecret` o `Test Key`.
     * @param id          Es el ID asociado al cliente que se desea consultar.
     * @return Retorna una llamada a la API que contiene un objeto de tipo
     * [Customer].
     */
    @GET("customers/{id}")
    fun getCustomer(@Header("Authorization") accessToken: String?, @Path("id") id: String?): Call<Customer?>?

    /**
     * Editar cliente
     *
     * Actualiza la información de un cliente existente, asignando los valores de
     * los parámetros enviados. Los parámetros que no se envíen en la petición no se
     * modificarán.
     *
     * @param accessToken `Secret Live KeySecret` o `Test Key`.
     * @param id          Es el ID asociado al cliente.
     * @param customer    Objeto de tipo [Customer] que contiene la
     * información del cliente.
     * @return Retorna una llamada a la API que contiene un objeto de tipo
     * [Customer].
     */
    @PUT("customers/{id}")
    @Headers("Content-Type: application/json")
    fun editCustomer(
        @Header("Authorization") accessToken: String?, @Path("id") id: String?,
        @Body customer: Any?
    ): Call<Customer?>?

    /**
     * Eliminar cliente
     *
     * Elimina el cliente de tu organización. Las facturas asociadas al cliente no
     * se eliminarán.
     *
     * @param accessToken `Secret Live KeySecret` o `Test Key`.
     * @param id          Es el ID asociado al cliente.
     * @return Objeto de tipo [Customer] que contiene la
     * información del cliente.
     */
    @DELETE("customers/{id}")
    fun deleteCustomer(@Header("Authorization") accessToken: String?, @Path("id") id: String?): Call<Customer?>?

    /**
     * Validar información fiscal
     *
     * Válida que la información fiscal del cliente coincida con los registros del
     * SAT.
     *
     * - **NOTA:** Esta función solo puede ser usada en modo Live, con una suscripción
     * activa.
     *
     * @param accessToken `Secret Live KeySecret`
     * @param id          Es el ID asociado al cliente.
     * @return Retorna un objeto con la información que coincide con los registros
     * del SAT, en un array se encuentran la lista de errores encontrados.
     */
    @GET("customers/{id}/tax-info-validation")
    fun validateFiscalDataCustomer(@Header("Authorization") accessToken: String?, @Path("id") id: String?): Call<Any?>?
}