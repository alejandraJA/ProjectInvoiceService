package com.project.invoice.data.models.facturapi.invoice.complement.nomina

/**
 * Objeto para expresar información sobre la empresa que se
 * beneficia del trabajo del empleado, en casos donde el emisor preste servicios
 * de subcontratación.
 * <P>
 * Usado por {@link Receptor}
 *
 * @version 17/03/2022
 * @author Alejandra JA
 * @category Receptor
 */
class NominaSubContratacionProperties (
    /**
     * RFC de la persona o empresa que subcontrata, es decir, de la persona o
     * empresa en donde el trabajador prestó directamente sus servicios.
     */
    var rfc_labora: String,
    /**
     * Porcentaje de tiempo en que el trabajador prestó sus servicios a la persona o
     * empresa que lo subcontrató.
     * El porcentaje es expresado en el intervalo de `[ 0.001 .. 100 ]`.
     */
    var porcentaje_tiempo: Float,
)