package com.project.invoice.data.models.facturapi.invoice

/**
 * Namespaces a insertar en el nodo raíz de la factura. Requerido en
 * complementos y addenda.
 *
 * @author Alejandra JA - 17/03/2022
 * @see Invoice
 * @see Retention
 */
data class Namespace (
    /** Prefijo o nombre del namespace.  */
    var prefix: String,

    /** Dirección URL asociada al namespace.  */
    var uri: String,

    /** Dirección URL del esquema de validación XSD.  */
    var schema_location: String,
)