package com.project.invoice.data.models.facturapi.organizacion

/**
 * <h1>Perzonalización de las facturas</h1>
 * Actualiza la información relacionada con la identidad o branding de la
 * organización.
 * <P>
 * Usado por {@link Organizacion}
 *
 * @version 18/03/2022
 * @author Alejandra JA
 * @category Organizacion
 */
class Customization (
    /**
     * Color en representación Hexadecimal RGB de 6 caracteres.
     *
     * @apiNote El caracter de almohadilla (#) al inicio es opcional.
     */
    var color: String,

    /**
     * <h1>Siguiente folio de factura</h1>
     * Número de folio que se asignará a la siguiente factura en ambiente `Live` (y
     * que se incrementará automáticamente por cada nueva factura).
     */
    var next_folio_number: Int,

    /**
     * <h1>Siguiente folio de factura</h1>
     * Número de folio que se asignará a la siguiente factura en ambiente `Test` (y
     * que se incrementará automáticamente por cada nueva factura).
     *
     */
    var next_folio_number_test: Int,

    /**
     * <h1>Extras del PDF</h1>
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