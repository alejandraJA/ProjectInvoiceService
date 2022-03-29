package com.project.invoice.data.models.facturapi.invoice.complement.nomina

/**
 * [<h1>Jubilacion</h1>]
 *
 * Objeto con información detallada de pagos por separación (despido) o
 * indemnización.
 *
 * @author Alejandra JA -17/03/2022
 * @see Percepciones
 */
data class Jubilacion (
    /**
     * Monto total pagado por concepto de separación o indemnización.
     */
    var total_pagado: Float,

    /**
     * Años de servicio que laboró el trabajador, redondeado al entero inmediato
     * superior.
     */
    var num_anos_servicio: Float,

    /**
     * Último sueldo mensual ordinario percibido por el trabajador.
     */
    var ultimo_sueldo_mens_ord: Float,

    /**
     * Monto por ingresos acumulables.
     */
    var ingreso_acumulable: Float,

    /**
     * Monto por ingresos no acumulables.
     */
    var ingreso_no_acumulable: Float,
)