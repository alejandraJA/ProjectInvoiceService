package com.project.invoice.data.models.facturapi.organizacion

/**
 * [<h1>Datos de la certificación</h1>]
 *
 * @author Alejandra JA - 18/03/2022
 * @see Organizacion
 */
data class Certificate (
    /** Esta certificado  */
    var has_certificate: Boolean,
    /** Ultima actualizacion de la certificación  */
    var updated_at: Any,
    /** Expiracion de la certificacion.  */
    var expires_at: Any,
)