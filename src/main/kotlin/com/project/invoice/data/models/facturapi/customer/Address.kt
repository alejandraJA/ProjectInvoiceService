package com.project.invoice.data.models.facturapi.customer

/**
 * Clase direccion.
 * <P>
 * Usado por {@link Customer}, {@link Invoice}, {@link Legal},
 * {@link CustomerInfo}
 *
 * @author Alejandra JA
 * @version 16/03/2022
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
     * @apiNote Si el país es México ("MEX"), contiene el nombre del Estado o
     * Entidad Federativa. Para extranjeros contiene el código de Estado de
     * acuerdo al estándar ISO 3166-2, que puedes consultar en nuestro
     * Catalogo de estados.
     * @see https://en.wikipedia.org/wiki/ISO_3166-2
     *
     * @see https://www.facturapi.io/dashboard/catalogs/state
     */
    var state: String,
    /**
     * País.
     *
     * @apiNote Código de país acorde al estandar ISO 3166-1 alpha-3, del Catalogo
     * de Países.
     * @see https://en.wikipedia.org/wiki/ISO_3166-1_alpha-3
     *
     * @see https://www.facturapi.io/dashboard/catalogs/country
     */
    var country: String,
)
