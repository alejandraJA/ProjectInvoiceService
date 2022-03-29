package com.project.invoice.data.models.facturapi.invoice.complement.nomina

/**
 * [<h1>Horas Extra</h1>]
 * Arreglo de objetos para expresar las horas extra aplicables. Requerido cuando
 * el tipo de percepción es "019" (Horas extras).
 *
 * @author Alejandra JA - 16/03/2021
 * @see Percepcion
 */
data class HorasExtra (
    /**
     * Número de días en que el trabajador laboró horas extra adicionales a su
     * jornada normal de trabajo.
     */
    var dias: Int,
    /**
     * Clave del catálogo Tipo de Horas.
     *
     * Su valor puede ser:
     * - `01` Dobles
     * - `02` Triples
     * - `03` Simples
     * @see <a href="https://docs.facturapi.io/api/.tipo-de-Horas">Tipo de horas</a>
    </P> */
    var tipo_horas: String,

    /**
     * Número de horas extra trabajadas en el periodo.
     */
    var horas_extra: Int,

    /**
     * Importe pagado por las horas extra.
     */
    var importe_pagado: Float,
)