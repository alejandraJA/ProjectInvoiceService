package com.project.invoice.data.models.facturapi.invoice.complement.nomina
/**
 * Información para que las entidades adheridas al Sistema Nacional de
 * Coordinación Fiscal realicen la identificación del origen de los recursos.
 * <P>
 * Usado por {@link Emisor}
 *
 * @author Alejandra Jimenez Acvalos
 * @version 16/03/2022
 * @category Emisor
 */
data class EntidadSncf(
    /**
     * Clave de origen de recurso.
     *
     * @apiNote Sus valores son: `IP`, `IF`, `IM`
     * <P>
     * `IP`: Ingresos Propios
    </P> * <P>
     * `IF`: Ingresos Federales
    </P> * <P>
     * `IM`: Ingresos mixtos.
    </P> */
    var origen_recurso: String,
    /**
     * Importe de recursos propios. Requerido cuando el origen del recurso es por
     * ingresos mixtos.
     */
    var monto_recurso_propio: String,
)
