package com.project.invoice.data.models.facturapi.invoice

/**
 * <h1>Timbrado</h1>
 * Información sobre el timbre fiscal digital agregado por el PAC.
 * <P>
 * Usado por {@link Invoice}, {@link Retention}.
 *
 * @version 17/03/2022
 * @author Alejandra JA
 * @category Invoice
 */
class Stamp (
    /** Sello digital del comprobante fiscal.  */
    var signature: String,

    /**
     * Fecha de timbrado en formato ISO8601 (UTC String).
     * <P>
     * Ejemplo: `2019-08-24T14:15:22Z`
    </P> */
    var date: String,

    /** Número de serie del certificado del SAT usado para timbrar.  */
    var sat_cert_number: String,

    /** Sello digital del timbre fiscal digital.  */
    var sat_signature: String,
)