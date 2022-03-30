package com.project.invoice.controller

import com.fasterxml.jackson.core.JsonProcessingException
import com.fasterxml.jackson.databind.ObjectMapper
import com.google.gson.Gson
import com.google.gson.reflect.TypeToken
import com.project.invoice.data.models.facturapi.organizacion.Customization
import com.project.invoice.data.models.facturapi.organizacion.Legal
import com.project.invoice.data.models.facturapi.organizacion.Organizacion
import com.project.invoice.data.models.facturapi.organizacion.Receipts
import com.project.invoice.data.repository.OrganizationRepository
import com.project.invoice.data.repository.request.CreateOrganizationRequest
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
 * [<h1>Controlador para la organización</h1>]
 * Cuenta con todas las llamadas a la API para obtener los datos de Organización.
 *
 * @author Alejandra JA - 18/03/2022
 */
@RestController
@RequestMapping("organization")
class OrganizationController {
    private var accessToken: String? = null
    private var service: OrganizationRepository? = null

    /** Constructor  */
    init {
        val loginInterceptor = HttpLoggingInterceptor()
        loginInterceptor.setLevel(HttpLoggingInterceptor.Level.BODY)
        val okClient: OkHttpClient = Builder().addInterceptor(loginInterceptor).build()
        val retrofit = Retrofit.Builder()
            .baseUrl("https://www.facturapi.io/v2/")
            .addConverterFactory(GsonConverterFactory.create())
            .client(okClient)
            .build()
        service = retrofit.create(OrganizationRepository::class.java)
        accessToken = "Bearer sk_user_DX8dja0MYW2GAdd4DkMNLpvEnJB356Rx"
    }

    /**
     * Crear organización
     *
     * @param data Objeto de tipo organización.
     * @return Si la respuesta de la API
     *
     *  * `200`, retorna un objeto de tipo [Organizacion].
     *  * Si es diferente, retorna el Json con el error.
     *
     * @throws IOException Error de la llamada a la API.
     * @see Organizacion
     */
    @RequestMapping(value = ["/create"], method = [RequestMethod.POST])
    @Throws(
        IOException::class,
        JsonProcessingException::class
    )
    fun createOrganization(@RequestBody data: Map<String?, Any?>?): Any? {
        val json = ObjectMapper().writeValueAsString(data).toString()
        val organization: CreateOrganizationRequest =
            Gson().fromJson(json, object : TypeToken<CreateOrganizationRequest?>() {}.type)
        val call = service!!.createOrganization(accessToken, organization)
        return setOrganization(call)
    }

    /**
     * Listar organizaciones
     *
     * Regresa una lista paginada de todas las organizaciones registradas bajo tu
     * cuenta, o realiza una búsqueda de acuerdo a parámetros.
     *
     * @return Si la respuesta de la API
     *
     *  * `200`, retorna un array de objetos de tipo
     * [Organizacion].
     *  * Si es diferente, retorna el Json con el error.
     *
     * @throws IOException Error de la llamada a la API.
     */
    @GetMapping("/")
    @Throws(IOException::class)
    fun getListOrganizations(): ResponseEntity<Any?>? {
        val call = service!!.getListOrganizations(accessToken)
        return setData(call)
    }

    /**
     * Editar datos fiscales
     *
     * Actualiza los datos fiscales de la organización.
     *
     * - Si estás buscando cómo editar el RFC, recuerda que la propiedad
     * `tax_id` se asigna automáticamente al subir los Certificados
     * de Sello Digital.
     *
     * @param id   Id de la organización a la que se le cambiara sus datos
     * legales.
     * @param data Objeto de tipo [Legal].
     * @return Si la respuesta de la API
     *
     *  * `200`, retorna un objeto de tipo [Organizacion].
     *  * Si es diferente, retorna el Json con el error.
     *
     * @throws IOException Error de la llamada a la API.
     */
    @RequestMapping(value = ["/updateFiscalData"], method = [RequestMethod.PUT])
    @Throws(IOException::class)
    fun updateFiscalData(
        @RequestBody data: Map<String?, Any?>?,
        @RequestParam(value = "id", defaultValue = "null") id: String?
    ): Any? {
        val json = ObjectMapper().writeValueAsString(data).toString()
        val legal: Legal = Gson().fromJson(json, object : TypeToken<Legal?>() {}.type)
        val call = service!!.updateFiscalData(accessToken, id, legal)
        return setOrganization(call)
    }

    /**
     * Editar personalización
     *
     * Actualiza la información relacionada con la identidad o branding de la
     * organización.
     *
     * @param id     ID de la organización
     * @param custom Objeto de tipo [Customization].
     * @return Si la respuesta de la API
     *
     *  * `200`, retorna un objeto de tipo [Organizacion].
     *  * Si es diferente, retorna el Json con el error.
     *
     * @throws IOException Error de la llamada a la API.
     */
    @RequestMapping(value = ["/updateCustomization"], method = [RequestMethod.PUT])
    @Throws(IOException::class)
    fun updateCustomization(
        @RequestBody data: Map<String?, Any?>?,
        @RequestParam(value = "id", defaultValue = "null") id: String?
    ): Any? {
        val json = ObjectMapper().writeValueAsString(data).toString()
        val custom: Customization = Gson().fromJson(json, object : TypeToken<Customization?>() {}.type)
        val call = service!!.updateCustomization(accessToken, id, custom)
        return setOrganization(call)
    }

    /**
     * Editar config. Recibos
     *
     * Actualiza la configuración de recibos de la organización.
     *
     * @param id       ID de la organización
     * @param receipts Objeto de tipo [Receipts].
     * @return Si la respuesta de la API
     *
     *  * `200`, retorna un objeto de tipo [Organizacion].
     *  * Si es diferente, retorna el Json con el error.
     *
     * @throws IOException Error de la llamada a la API.
     */
    @RequestMapping(value = ["/updateReceipts"], method = [RequestMethod.PUT])
    @Throws(IOException::class)
    fun updateReceipts(
        @RequestBody data: Map<String?, Any?>?,
        @RequestParam(value = "id", defaultValue = "null") id: String?
    ): Any? {
        val json = ObjectMapper().writeValueAsString(data).toString()
        val receipts: Receipts = Gson().fromJson(json, object : TypeToken<Receipts?>() {}.type)
        val call = service!!.updateReceipts(accessToken, id, receipts)
        return setOrganization(call)
    }

    /**
     * Obtener organización por ID
     *
     * Regresa el objeto [Organization] relacionado el [id] especificado.
     *
     * @param id idOrganization Id de la organización.
     * @return Si la respuesta de la API
     *
     *  * `200`, retorna un objeto de tipo [Organizacion].
     *  * Si es diferente, retorna el Json con el error.
     *
     * @throws IOException Error de la llamada a la API.
     */
    @GetMapping("/getOrganization")
    @Throws(IOException::class)
    fun getOrganization(@RequestParam(value = "id", defaultValue = "null") id: String?): Any? {
        val call = service!!.getOrganization(accessToken, id)
        return setOrganization(call)
    }

    /**
     * Eliminar organización
     *
     * Elimina la organización de tu cuenta de Facturapi. Una vez eliminada, ya no
     * podrás acceder a sus recursos, tales como clientes, productos, facturas,
     * recibos o retenciones.
     *
     * @param id Id de la organización.
     * @return Si la respuesta de la API
     *
     *  * `200`, retorna un objeto de tipo [Organizacion].
     *  * Si es diferente, retorna el Json con el error.
     *
     * @throws IOException Error de la llamada a la API.
     */
    @RequestMapping(value = ["/deleteOrganization"], method = [RequestMethod.DELETE])
    @Throws(IOException::class)
    fun deleteOrganization(@RequestParam(value = "id", defaultValue = "null") id: String?): Any? {
        val call = service!!.deleteOrganization(accessToken, id)
        return setOrganization(call)
    }

    /**
     * Método encargado de ejecutar la llamada y mostrar la información obtenida.
     *
     * @param call Llamada del web service de tipo [Organizacion]
     * @return Un objeto de tipo [Organizacion]
     * @throws IOException Error de la llamada a la API.
     */
    @Throws(IOException::class)
    private fun setOrganization(call: Call<Organizacion?>?): Any {
        val response: Response<Organizacion?> = call!!.execute()
        return if (response.code() == 200) ResponseEntity.ok(response.body()) else ResponseEntity.ok(
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
}