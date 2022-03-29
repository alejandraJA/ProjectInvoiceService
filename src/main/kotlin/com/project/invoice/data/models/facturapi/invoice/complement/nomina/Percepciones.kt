package com.project.invoice.data.models.facturapi.invoice.complement.nomina

import com.project.invoice.data.models.facturapi.invoice.complement.Nomina

/**
 * [<h1>Percepciones</h1>]
 *
 * Objeto para indicar las percepciones aplicables.
 *
 * @version 17/03/2022
 * @author Alejandra JA
 * @see Nomina
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