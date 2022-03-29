package com.project.invoice.data.models.facturapi.retention

/**
 * [<h1>Periodo</h1>]
 *
 * Información sobre el periodo de la retención.
 *
 * @author Alejandra JA - 17/03/2022
 * @see Retention
 */
data class Periodo (
    /**
     * Mes inicial del periodo de la retención. Su valar puede ser:
     * `[ 1 .. 12 ]`
     */
    var mes_ini: Int = 0,

    /**
     * Mes final del periodo de la retención. Su valar puede ser: `[ 1 .. 12 ]`
     */
    var mes_fin: Int = 0,

    /** Año o ejercicio fiscal en que se realizó la retención.  */
    var ejerc: Int = 0,
)