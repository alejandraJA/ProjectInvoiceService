package com.project.invoice.data.models.facturapi.organizacion
/**
 * <h1>Extras del pdf</h1>
 *
 * Configura qué campos opcionales se queiren mostrar en el PDF. El SAT no
 * obliga a mostrar estos campos, pero pueden activarse según la preferencia de
 * la organización.
 * Usado por {@link Customization}
 *
 * @version 18/03/2022
 * @author Alejandra JA
 * @category Organizacion
 * @category Customization
 */
data class PdfExtra (
    /**
     * Mostrar códigos de catálogos del SAT junto a sus descripciones. Ejemplo: “KGM
     * Kilogramo.
     */
    var codes: Boolean,

    /**
     * Mostrar la clave de producto-servicio.
     */
    var product_key: Boolean,
)