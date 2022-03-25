package com.project.invoice.data.models.facturapi.invoice.complement.nomina

/**
 * Información del emisor, en caso de ser requerida.
 * <P>
 * Usado en {@link Nomina}
 *
 * @version 16/03/2022
 * @author Alejandra JA
 * @category Nomina
 */
data class Emisor(
    /**
     * CURP del empleador.
     *
     * @apiNote Requerido cuando el empleador es persona física.
     */
    var curp: String,

    /**
     * Clave de registro patronal asignada por la institución de seguridad social al
     * patrón.
     */
    var registro_patronal: String,

    /**
     * RFC de la persona que fungió como patrón.
     *
     * @apiNote Se usa cuando el pago se realiza a través de un tercero.
     */
    var rfc_patron_origen: String,

    /**
     * Información para que las entidades adheridas al Sistema Nacional de
     * Coordinación Fiscal realicen la identificación del origen de los recursos.
     *
     * @see EntidadSncf
     */
    var entidad_sncf: EntidadSncf,
)