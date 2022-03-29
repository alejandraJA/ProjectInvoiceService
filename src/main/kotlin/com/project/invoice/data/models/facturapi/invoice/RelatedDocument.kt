package com.project.invoice.data.models.facturapi.invoice

/**
 * Documentos relacionados con la factura.
 *
 * @author Alejandra JA - 17/03/2022
 * @category Invoice
 */
data class RelatedDocument(
    /**
     * Clave de relación del catálogo del SAT.
     *
     * **NOTA** Es requerido cuando se envíe el parámetro `related`.
     *
     * Su valor puede ser:
     * - `01` Nota de crédito de los documentos relacionados
     * - `02` Nota de débito de los documentos relacionados
     * - `03` Devolución de mercancía sobre facturas o traslados previos
     * - `04` Sustitución de los CFDI previos
     * - `05` Traslados de mercancias facturados previamente
     * - `06` Factura generada por los traslados previos
     * - `07` CFDI por aplicación de anticipo
     * - `08` Factura generada por pagos en parcialidades
     * - `09` Factura generada por pagos diferidos
     * @see <a href="https://docs.facturapi.io/api/.relacion-entre-facturas">Relacion entre facturas</a>
    </P> */
    var relationship: String,

    /**
     * Folios fiscales (UUID) de facturas relacionadas.
     */
    var documents: ArrayList<String?>,
)
