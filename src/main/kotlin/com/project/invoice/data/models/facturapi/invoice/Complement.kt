package com.project.invoice.data.models.facturapi.invoice

import com.project.invoice.data.models.facturapi.invoice.complement.Nomina

/**
 * [<h1>Complement</h1>]
 *
 * Clase de Complementos a incluir en la factura.
 *
 * @see Invoice
 */
data class Complement (
    /**
     * Tipo de complemento.
     *
     * Los tipos de complemento son: `nomina`, `custom` y
     * `PagoComplementProperties`
     */
    var type: String,

    /**
     * Data del complemento.
     *
     * Dependera del tipo de complemento los datos que contenga.
     * @see Nomina
     */
    var data: Any,
) {
    /**
     * Si [type] es igual a `nomina` o
     * `PagoComplementProperties`, entonces el objeto [data] se
     * convierte a un ojeto de tipo [Nomina] y lo retorna.
     *
     * @return El Complemento de Nómina ([Nomina]).
     * @see Nomina
     */
    val nomina: Nomina?
        get() = data as Nomina?

    /**
     * Si [type] es igual a `custom` entonces el objeto [data]
     * retornará un objeto de tipo String que contiene el XML del comlemento.
     *
     * @return Código XML de tu complemento tal cual como quieres que se inserte en
     * el XML. Debe contener sólamente un nodo XML raíz.
     */
    val custom: String?
        get() = data as String?
}