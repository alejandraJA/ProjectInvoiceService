package com.project.invoice.data.models.facturapi.invoice

/**
 * Partida
 *
 * @author Alejandra JA - 17/03/2022
 */
data class Parts(
    /** Descripción del producto o servicio.  */
    var description: String,

    /**
     * Clave de producto/servicio, del catálogo del SAT. Nosotros te proporcionamos
     * una manera más conveniente de encontrarlo utilizando nuestra herramienta de
     * búsqueda de claves.
     */
    var product_key: String,

    /**
     * Cantidad
     */
    var quantity: Int,

    /**
     * Identificador de uso interno designado por la empresa. Puede tener cualquier
     * valor.
     */
    var sku: String,

    /**
     * Precio unitario
     */
    var unit_price: Int,

    /**
     * Nombre de la unidad de medida que expresa la cantidad.
     */
    var unit_name: String,

    /**
     * Números de pedimento aduanal asociados a esta parte.
     */
    var customs_keys: ArrayList<String?>,
)
