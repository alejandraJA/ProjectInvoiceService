package com.project.invoice.data.models.facturapi.invoice

import com.project.invoice.data.models.facturapi.product.Product
import com.project.invoice.data.models.facturapi.receipt.Receipt

/**
 * [<h1>LineItem</h1>]
 *
 * Conceptos incluidos en el documento.
 *
 * @author Alejandra JA - 17/03/2022
 * @see Invoice
 * @see Receipt
 */
data class LineItem(

    /**
     * Cantidad de unidades incluidas del mismo concepto.
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
