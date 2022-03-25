package com.project.invoice.data.models.facturapi.invoice.complement.nomina

/**
 * Objeto para indicar las percepciones aplicables.
 * <P>
 * Usado en {@link Nomina}
 *
 * @version 17/03/2022
 * @author Alejandra JA
 * @category Nomina
 */
data class Percepciones (
    /**
     * Objeto con información detallada de cada percepción.
     *
     * @see Percepcion
     */
    var percepcion: ArrayList<Percepcion>,

    /**
     * Objeto con información detallada de pagos por jubilación, pensiones o haberes
     * de retiro.
     *
     * @see NominaJubilacionProperties
     */
    var jubilacion_pension_retiro: NominaJubilacionProperties,

    /**
     * Objeto con información detallada de pagos por separación (despido) o
     * indemnización.
     *
     * @see Jubilacion
     */
    var separacion_indemnizacion: Jubilacion,
)