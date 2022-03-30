package com.project.invoice.data.repository

import com.project.invoice.data.models.facturapi.organizacion.Customization
import com.project.invoice.data.models.facturapi.organizacion.Legal
import com.project.invoice.data.models.facturapi.organizacion.Organizacion
import com.project.invoice.data.models.facturapi.organizacion.Receipts
import com.project.invoice.data.repository.request.CreateOrganizationRequest
import com.project.invoice.data.repository.responses.ResponseFacturapi
import retrofit2.Call
import retrofit2.http.*

/**
 * [<H1>Repositorio de la organización</H1>]
 *
 * Interface de comunicación para Facturapi.
 *
 * @author Alejandra JA - 17/03/2022
 */
interface OrganizationRepository {
    /**
     * Crear organización
     *
     * @param accessToken  `Secret User Key`.
     * @param organization Objeto de tipo [CreateOrganizationRequest].
     * @return Llamada que traerá consigo una respuesta de tipo
     * [Organizacion].
     */
    @POST("organizations")
    @Headers("Content-Type: application/json")
    fun createOrganization(
        @Header("Authorization") accessToken: String?,
        @Body organization: CreateOrganizationRequest?
    ): Call<Organizacion?>?

    /**
     * Listar organizaciones
     *
     * Regresa una lista paginada de todas las organizaciones registradas bajo tu
     * cuenta, o realiza una búsqueda de acuerdo a parámetros.
     *
     * @param accessToken `Secret User Key`.
     * @return Llamada que traerá un Objeto de tipo [ResponseFacturapi], que a
     * su vez, contendrá un array de objetos de tipo [Organizacion]
     */
    @GET("organizations")
    fun getListOrganizations(@Header("Authorization") accessToken: String?): Call<ResponseFacturapi?>?

    /**
     * Editar datos fiscales
     * Actualiza los datos fiscales de la organización.
     *
     * - Si estás buscando cómo editar el RFC, recuerda que la propiedad
     * `tax_id` se asigna automáticamente al subir los Certificados
     * de Sello Digital.
     *
     * @param accessToken `Secret User Key`.
     * @param id          Id de la organización a la que se le cambiara sus datos
     * legales.
     * @param legal       Objeto de tipo [Legal].
     * @return Llamada que traerá consigo una respuesta de tipo
     * [Organizacion].
     */
    @PUT("organizations/{id_organizacion}/legal")
    @Headers("Content-Type: application/json")
    fun updateFiscalData(
        @Header("Authorization") accessToken: String?,
        @Path("id_organizacion") id: String?,
        @Body legal: Legal?
    ): Call<Organizacion?>?

    /**
     * Editar personalización
     *
     * Actualiza la información relacionada con la identidad o branding de la
     * organización.
     *
     * @param accessToken `Secret User Key`.
     * @param id          ID de la organización
     * @param custom      Objeto de tipo [Customization].
     * @return Llamada que traerá consigo una respuesta de tipo
     * [Organizacion].
     */
    @PUT("organizations/{id_organizacion}/customization  ")
    @Headers("Content-Type: application/json")
    fun updateCustomization(
        @Header("Authorization") accessToken: String?,
        @Path("id_organizacion") id: String?,
        @Body custom: Customization?
    ): Call<Organizacion?>?

    /**
     * Editar config. Recibos
     *
     * Actualiza la configuración de recibos de la organización.
     *
     * @param accessToken `Secret User Key`.
     * @param id          ID de la organización
     * @param receipts    Objeto de tipo [Receipts].
     * @return Llamada que traerá consigo una respuesta de tipo
     * [Organizacion].
     */
    @PUT("organizations/{id_organizacion}/receipts  ")
    @Headers("Content-Type: application/json")
    fun updateReceipts(
        @Header("Authorization") accessToken: String?,
        @Path("id_organizacion") id: String?,
        @Body receipts: Receipts?
    ): Call<Organizacion?>?

    /**
     * Obtener organización por ID
     *
     * Regresa el objeto 'Organization' relacionado con el `id` especificado.
     *
     * @param accessToken    `Secret User Key`.
     * @param idOrganization Id de la organización.
     * @return Llamada que traerá consigo una respuesta de tipo
     * [Organizacion].
     */
    @GET("organizations/{id_organizacion}")
    fun getOrganization(
        @Header("Authorization") accessToken: String?,
        @Path("id_organizacion") idOrganization: String?
    ): Call<Organizacion?>?

    /**
     * Eliminar organización
     *
     * Elimina la organización de tu cuenta de Facturapi. Una vez eliminada, ya no
     * podrás acceder a sus recursos, tales como clientes, productos, facturas,
     * recibos o retenciones.
     *
     * @param accessToken    `Secret User Key`.
     * @param idOrganization Id de la organización.
     * @return Llamada que traerá consigo una respuesta de tipo
     * [Organizacion].
     */
    @DELETE("organizations/{id_organizacion}")
    fun deleteOrganization(
        @Header("Authorization") accessToken: String?,
        @Path("id_organizacion") idOrganization: String?
    ): Call<Organizacion?>?

    /**
     * @Write
     *        Agregar el resto de las funciones que no están listas
     *        -Subir certificados (CSD)
     *        -Subir logotipo
     *        -Obtener test api key
     *        -Renovar cada key
     */
}