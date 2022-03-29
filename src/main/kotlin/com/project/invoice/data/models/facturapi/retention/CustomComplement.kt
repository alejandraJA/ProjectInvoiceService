package com.project.invoice.data.models.facturapi.retention

/**
 * [<h1>Complemento</h1>]
 *
 * Complementos a incluir en la factura.
 *
 * @author Alejandra JA - 17/03/2022
 * @see Retention
 */
data class CustomComplement(
    /**
     * Tipo de complemento.
     *
     * Value: `custom`
     */
    var type: String? = null,

    /**
     * Código XML de tu complemento tal cual como quieres que se inserte en el XML.
     * Debe contener sólamente un nodo XML raíz.
     */
    var data: String? = null,
)
