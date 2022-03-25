package com.project.invoice.data.models.facturapi.invoice.complement.nomina

/**
 * Objeto con información de incapacidades.
 * <P>
 * Usado por {@link Nomina}.
 *
 * @version 13/03/2022
 * @author Alejandra JA
 * @category Nomina
 */
data class NominaIncapacidadProperties (
    /**
     * Número de días enteros que el trabajador se incapacitó en el periodo.
     */
    var dias_incapacidad: Int,

    /**
     * Tipo de Incapacidad.
     *
     * @apiNote Su valor puede ser:
     * <P>`01` Riesgo de trabajo.
    </P> * <P>`02` Enfermedad en general.
    </P> * <P>`03` Maternidad.
    </P> * <P>`04` Licencia por cuidados médicos de hijos diagnosticados con
     * cáncer.
    </P> */
    var tipo_incapacidad: String,

    /**
     * Monto del importe monetario de la incapacidad.
     */
    var importe_monetario: Float,
)