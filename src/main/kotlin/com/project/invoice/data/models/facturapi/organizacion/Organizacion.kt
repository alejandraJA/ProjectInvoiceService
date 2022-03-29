package com.project.invoice.data.models.facturapi.organizacion

/**
 * [<h1>Objeto Organización</h1>]
 *
 * @version 17/03/2022
 * @author Alejandra JA - 17/03/2022
 */
data class Organizacion (
    /** Ide de la organización.  */
    var id: String,

    /** Fecha de creación  */
    var created_at: String,

    /**
     * Modo de trabajo
     *
     * Si el valor es `true`, indica que el objeto fue creado en
     * ambiente Live; o si es `false`, en ambiente Test.
     */
    var is_production_ready: Boolean,

    /**
     * Lista de pasos que se necesitan completar para que esta organización pueda
     * emitir facturas válidas en ambiente Live.
     *
     * @see PendingStep
     */
    var pending_steps: ArrayList<PendingStep>,

    /** URL del logo  */
    var logo_url: String,

    /**
     * Datos fiscales de la empresa.
     *
     * @see Legal
     */
    var legal: Legal,

    /**
     * Perzonalización de Facturas
     *
     * Actualiza la información relacionada con la identidad o branding de la
     * organización.
     *
     * @see Customization
     */
    var customization: Customization,

    /**
     * Datos de la certificación
     * @see Certificate
     */
    var certificate: Certificate,

    /**
     * Perzonalización de los recibos
     *
     * Actualiza la información relacionada con la identidad o branding de la
     * organización, con base en los recibos.
     *
     * @see Receipts
     */
    var receipts: Receipts,
)