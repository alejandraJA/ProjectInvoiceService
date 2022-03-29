package com.project.invoice.data.models.facturapi.invoice.complement.nomina
/**
 * [<h1>Ebtidad Sncf</h1>]
 * Información para que las entidades adheridas al Sistema Nacional de
 * Coordinación Fiscal realicen la identificación del origen de los recursos.
 *
 * @author Alejandra JA - 16/03/2022
 * @see Emisor
 */
data class EntidadSncf(
    /**
     * Clave de origen de recurso.
     *
     * Sus valor puede ser:
     * - `IP`: Ingresos Propios
     * - `IF`: Ingresos Federales
     * - `IM`: Ingresos mixtos.
     */
    var origen_recurso: String,
    /**
     * Importe de recursos propios. Requerido cuando el origen del recurso es por
     * ingresos mixtos.
     */
    var monto_recurso_propio: String,
)
