package com.project.invoice.data.models.facturapi.invoice.complement.nomina

/**
 * Objeto con información referente a la compensación de saldos a favor de un
 * trabajador.
 * <P>
 * Usado por {@link OtrosPagos}
 *
 * @version 17/03/2022
 * @author Alejandra JA
 * @category OtrosPagos
 */
data class NominaCompensacionProperties (
    /**
     * Monto por saldo a favor determinado por el patrón al trabajador en periodos o
     * ejercicios anteriores.
     */
    var saldo_a_favor: Float,

    /**
     * Año en que se determinó el saldo a favor del trabajador.
     */
    var ano: Int,

    /**
     * Remanente del saldo a favor del trabajador.
     */
    var remanente_sal_fav: Float,
)