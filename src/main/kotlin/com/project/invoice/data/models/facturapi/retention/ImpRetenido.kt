package com.project.invoice.data.models.facturapi.retention

/**
 * [<h1>Impuestos retenidos</h1>]
 *
 * Colección de impuestos retenidos.
 * @author Alejandra JA - 17/03/2022
 * @see Retention
 * @see Totales
</P> */
data class ImpRetenido (
    /**
     * Base del impuesto retenido.
     *
     * Su valor puede ser `>=0`
    </P> */
    var base: Int = 0,

    /**
     * Impuesto.
     *
     * Su valor puede ser `ISR` o `IVA`.
     */
    var impuesto: String? = null,

    /**
     * Importe del impuesto retenido.
     *
     * Su valor debe ser `>=0`
     */
    var monto: Int = 0,

    /**
     * Tipo de pago retenido.
     *
     * Su valor puede ser
     * - `01`: Pago definitivo IVA
     * - `02`: Pago definitivo IEPS
     * - `03`: Pago definitivo ISR Plataformas
     * - `04`: Pago provisional ISR
     *
     */
    var tipo_pago_ret: Int = 0,
)
