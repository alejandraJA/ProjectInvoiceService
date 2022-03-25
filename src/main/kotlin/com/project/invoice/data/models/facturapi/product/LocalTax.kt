package com.project.invoice.data.models.facturapi.product

/**
 * <h1>Impuestos locales</h1>
 * Arreglo de impuestos locales (estatales o municipales), en caso de haberlos.
 * <P>
 * Usado por {@link Product}
 *
 * @version 17/03/2022
 * @author Alejandra JA
 * @category Product
 */
data class LocalTax (
    /** Tasa del impuesto  */
    var rate: Int,

    /** Nombre del impuesto. Texto libre.  */
    var type: String,

    /**
     * Indica si se trata de un impuesto retenido `true`, o un impuesto
     * trasladado `false`
     */
    var withholding: Boolean,
)