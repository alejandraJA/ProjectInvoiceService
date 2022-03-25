package com.project.invoice.data.models.facturapi.invoice.complement.nomina

/**
 * Objeto con información detallada de pagos por jubilación, pensiones o haberes
 * de retiro.
 * <P>
 * Usado por {@link Percepciones}
 *
 * @version 13/03/2021
 * @author Alejandra JA
 * @category Percepciones
 */
data class NominaJubilacionProperties (
    /**
     * Monto total del pago entregado en una sola exhibición.
     */
    var total_una_exhibicion: Float,

    /**
     * Monto total del pago entregado en parcialidades.
     */
    var total_parcialidad: Float,

    /**
     * Monto diario percibido por el trabajador cuando el pago se realiza en
     * parcialidades.
     */
    var monto_diario: Float,

    /**
     * Ingresos acumulables percibidos por el trabajador.
     */
    var ingreso_acumulable: Float,

    /**
     * Ingresos no acumulables percibidos por el trabajador.
     */
    var ingreso_no_acumulable: Float,
)