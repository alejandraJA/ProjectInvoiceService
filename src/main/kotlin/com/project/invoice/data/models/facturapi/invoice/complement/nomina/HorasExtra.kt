package com.project.invoice.data.models.facturapi.invoice.complement.nomina

/**
 * Arreglo de objetos para expresar las horas extra aplicables. Requerido cuando
 * el tipo de percepción es "019" (Horas extras).
 * <P>
 * Usado por {@link Percepcion}
 *
 * @author Alejandra JA
 * @version 16/03/2021
 * @category Percepcion
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
     * @apiNote Puede contener:
     * <P>
     * `01` Dobles
    </P> * <P>
     * `02` Triples
    </P> * <P>
     * `03` Simples
     * @see https://docs.facturapi.io/api/.tipo-de-Horas
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