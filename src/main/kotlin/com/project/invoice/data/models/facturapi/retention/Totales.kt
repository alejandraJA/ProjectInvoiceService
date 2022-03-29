package com.project.invoice.data.models.facturapi.retention

/**
 * [<h1>Totales</h1>]
 *
 * Información sobre el total de retenciones efectuadas en el periodo
 * correspondiente.
 *
 * @author Alejandra JA - 17/03/2022
 * @see Retention
 */
data class Totales (
    /**
     * Monto total de la operación, con precisión de hasta 6 decimales.
     *
     * Su valor debe ser `>=0`
     */
    var monto_tot_operacion: Int = 0,

    /**
     * Monto total gravado.
     *
     * Su valor debe ser `>=0`
     */
    var monto_tot_grav: Int = 0,

    /**
     * Monto total exento.
     *
     * Su valor debe ser `>=0`
     */
    var monto_tot_exent: Int = 0,

    /**
     * Suma de los montos de impuestos retenidos.
     *
     * Su valor debe ser `>=0`
     */
    var monto_tot_ret: Int = 0,

    /**
     * Colección de impuestos retenidos.
     *
     * @see ImpRetenido
     */
    var imp_retenidos: ArrayList<ImpRetenido?>? = null,
)