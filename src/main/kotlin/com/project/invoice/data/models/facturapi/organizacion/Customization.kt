package com.project.invoice.data.models.facturapi.organizacion

/**
 * [<h1>Perzonalización de las facturas</h1>]
 * Actualiza la información relacionada con la identidad o branding de la
 * organización.
 * @author Alejandra JA - 18/03/2022
 * @see Organizacion
 */
data class Customization (
    /**
     * Color en representación Hexadecimal RGB de 6 caracteres.
     * - El caracter de almohadilla (#) al inicio es opcional.
     */
    var color: String,

    /**
     * Siguiente folio de factura
     *
     * Número de folio que se asignará a la siguiente factura en ambiente `Live` (y
     * que se incrementará automáticamente por cada nueva factura).
     */
    var next_folio_number: Int,

    /**
     * Siguiente folio de factura
     *
     * Número de folio que se asignará a la siguiente factura en ambiente `Test` (y
     * que se incrementará automáticamente por cada nueva factura).
     */
    var next_folio_number_test: Int,

    /**
     * Extras del PDF
     * Configura qué campos opcionales se queiren mostrar en el PDF. El SAT no
     * obliga a mostrar estos campos, pero pueden activarse según la preferencia de
     * la organización.
     *
     * @see PdfExtra
     */
    var pdf_extra: PdfExtra,

    /**
     * Campo que indica si cuenta con un logo
     */
    var has_logo: Boolean,
)