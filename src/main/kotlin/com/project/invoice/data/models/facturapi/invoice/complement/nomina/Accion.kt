package com.project.invoice.data.models.facturapi.invoice.complement.nomina
/**
 * Objeto para expresar ingresos por acciones o títulos valor que representan
 * bienes. Es requerido cuando existan ingresos por sueldos derivados de
 * adquisición de acciones o títulos.
 * <P>
 * Usado por {@link Percepcion}
 *
 * @version 16/03/2022
 * @author Alejandra JA
 * @category Percepcion
 */
data class Accion (
    /**
     * Valor de mercado de las Acciones o Títulos valor al ejercer la opción.
     */
    var valor_mercado: Double,

    /**
     * Precio establecido al otorgarse la opción de ingresos en acciones o títulos
     * valor.
     */
    var precio_al_otorgarse: Double,
)