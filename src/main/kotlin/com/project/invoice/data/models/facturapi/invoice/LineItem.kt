package com.project.invoice.data.models.facturapi.invoice

/**
 * Conceptos incluidos en el documento.
 * <P>
 * Usado por {@link Invoice}, {@link Receipt}.
 *
 * @version 17/03/2022
 * @author Alejandra JA
 * @category Invoice
 * @category Receipt
 */
data class LineItem(

    /**
     * Cantidad de unidades incluídas del mismo concepto.
     */
    var quantity: Int,

    /**
     * Monto total de descuento aplicado a este concepto.
     */
    var discount: Int,

    /**
     * Producto
     *
     * @see Product
     */
    var product: Product,

    /**
     * Partidas
     * @see Parts
     */
    var parts: Parts,
)
