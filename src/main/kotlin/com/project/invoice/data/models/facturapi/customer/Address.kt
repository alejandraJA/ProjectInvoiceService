package com.project.invoice.data.models.facturapi.customer

/**
 * [<h1>Clase direccion.<h1>]
 *
 * @author Alejandra JA
 * @version 16/03/2022
 * @see Customer
 * @see Invoice
 * @see Legal
 * @see CustomerInfo
 */
data class Address(
    /** Nombre de la calle  */
    var street: String,

    /** Número del exterior  */
    var exterior: String,

    /** Número del interior  */
    var interior: String,

    /** Colonia  */
    var neighborhood: String,

    /** Ciudad  */
    var city: String,

    /** Municipio o delegacion  */
    var municipality: String,

    /** Codigo postal  */
    var zip: String,

    /**
     * Estado.
     *
     * - Si el país es México ("MEX"), contiene el nombre del Estado o
     * Entidad Federativa. Para extranjeros contiene el código de Estado de
     * acuerdo al estándar ISO 3166-2, que puedes consultar en nuestro
     * Catalogo de estados.
     * @see <a href="https://en.wikipedia.org/wiki/ISO_3166-2">ISO 3166-2</a>
     * @see <a href="https://www.facturapi.io/dashboard/catalogs/state">Catalogo de estados</a>
     */
    var state: String,
    /**
     * País.
     *
     * - Código de país acorde al estandar ISO 3166-1 alpha-3, del Catalogo
     * de Países.
     * @see <a href="https://en.wikipedia.org/wiki/ISO_3166-1_alpha-3">ISO 3166-1 alpha-3</a>
     * @see <a href="https://www.facturapi.io/dashboard/catalogs/country">Catalogo de paises</a>
     */
    var country: String,
)
