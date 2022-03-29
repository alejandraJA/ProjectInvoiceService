package com.project.invoice.data.models.facturapi.product

/**
 * [<h1>Impuestos</h1><P>]
 * Lista de impuestos que deberán aplicarse a este producto.
 *
 * @apiNote Si el parámetro se omite o es nulo, se guardará con un elemento que
 * representa el `IVA trasladado 16%`, que es el impuesto más
 * común.
 * @apiNote En caso de mandar explícitamente un arreglo vacío, se entiende que
 * el producto **está exento de impuestos**.
 *
 * @version 17/03/2022
 * @author Alejandra JA
 * @see Product
</P> */
data class Tax (
    /**
     * Tasa del impuesto. Default `0.16`
     */
    var type: String? = null,

    /**
     * Tipo de impuesto.
     *
     * Sus valores pueden ser `IVA`, `ISR` y `IEPS`.
    </P> */
    var rate: Double = 0.0,

    /**
     * Tipo factor
     *
     * Sus valores pueden ser `Tasa`, `Cuota` y `Exento`.
    </P> */
    var factor: String? = null,

    /**
     * Indica si se trata de un impuesto retenido `true`, o un impuesto
     * trasladado `false`.
     */
    var withholding: Boolean = false,
)
