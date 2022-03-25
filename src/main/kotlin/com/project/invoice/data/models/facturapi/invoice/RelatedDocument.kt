package com.project.invoice.data.models.facturapi.invoice

/**
 * Documentos relacionados con la factura.
 * <P>
 * Usado por Invoice
 *
 * @version 17/03/2022
 * @author Alejandra JA
 * @category Invoice
 */
data class RelatedDocument(
    /**
     * Clave de relación del catálogo del SAT.
     *
     * @apiNote Es requerido cuando se envíe el parámetro `related`.
     * @apiNote Sus valores pueden ser:
     * <P> `01` Nota de crédito de los documentos relacionados
    </P> * <P> `02` Nota de débito de los documentos relacionados
    </P> * <P> `03` Devolución de mercancía sobre facturas o traslados previos
    </P> * <P> `04` Sustitución de los CFDI previos
    </P> * <P> `05` Traslados de mercancias facturados previamente
    </P> * <P> `06` Factura generada por los traslados previos
    </P> * <P> `07` CFDI por aplicación de anticipo
    </P> * <P> `08` Factura generada por pagos en parcialidades
    </P> * <P> `09` Factura generada por pagos diferidos
     * @see https://docs.facturapi.io/api/.relacion-entre-facturas
    </P> */
    var relationship: String,

    /**
     * Folios fiscales (UUID) de facturas relacionadas.
     */
    var documents: ArrayList<String?>,
)
