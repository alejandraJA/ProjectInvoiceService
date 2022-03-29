package com.project.invoice.data.models.facturapi.invoice.complement.nomina

import com.project.invoice.data.models.facturapi.invoice.complement.Nomina

/**
 * [<h1>NominaIncapacidadProperties<h1>]
 *
 * Objeto con información de incapacidades.
 *
 * @version 13/03/2022 - Alejandra JA
 * @see Nomina
 */
data class NominaIncapacidadProperties (
    /**
     * Número de días enteros que el trabajador se incapacitó en el periodo.
     */
    var dias_incapacidad: Int,

    /**
     * Tipo de Incapacidad.
     *
     * Su valor puede ser:
     * - `01` Riesgo de trabajo.
     * - `02` Enfermedad en general.
     * - `03` Maternidad.
     * - `04` Licencia por cuidados médicos de hijos diagnosticados con cáncer.
     */
    var tipo_incapacidad: String,

    /**
     * Monto del importe monetario de la incapacidad.
     */
    var importe_monetario: Float,
)