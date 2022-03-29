package com.project.invoice.data.models.facturapi.invoice.complement

import com.project.invoice.data.models.facturapi.invoice.complement.nomina.*
import com.project.invoice.data.models.facturapi.invoice.Complement


/**
 * [<h1>Nomina</h1>]
 *
 * Complemento de Nómina.
 *
 * Este campo corresponde a la data que puede tener [Complement.data].
 *
 * @author Alejandra JA - 16/03/2022
 * @see Complement
</P> */
data class Nomina (
    /**
     * Tipo de nómina.
     *
     * Sus valores pueden ser `O` y `E`.
     *
     * `O` (Ordinaria): Cuando corresponde a un pago que se realiza
     * de manera habitual, como sueldos.
     *
     * `E` (Extraordinaria): Para pagos fuera de lo habitual, como
     * liquidaciones, aguinaldos o bonos.
     */
    var tipo_nomina: String,

    /**
     * Fecha de pago de la nómina al trabajador.
     */
    var fecha_pago: String,

    /**
     * Fecha inicial del periodo de pago.
     */
    var fecha_inicial_pago: String,

    /**
     * Fecha final del periodo de pago.
     */
    var fecha_final_pago: String,

    /**
     * Número de días pagados. Puede ser entero o fracción.
     */
    var num_dias_pagados: Int,

    /**
     * Información del emisor, en caso de ser requerida.
     *
     * @see Emisor
     */
    var emisor: Emisor,

    /**
     * Información del trabajador.
     *
     * @see Receptor
     */
    var receptor: Receptor,

    /**
     * Objeto para indicar las percepciones aplicables.
     *
     * @see Percepciones
     */
    var percepciones: Percepciones,

    /**
     * Arreglo de objetos donde se expresan las deducciones aplicables.
     *
     * @see NominaDeduccionProperties
     */
    var deducciones: ArrayList<NominaDeduccionProperties>,

    /**
     * Arreglo de objetos para expresar otros pagos aplicables.
     *
     * @see OtrosPagos
     */
    var otros_pagos: ArrayList<OtrosPagos>,

    /**
     * Arreglo de objetos con información de incapacidades.
     *
     * @see NominaIncapacidadProperties
     */
    var incapacidades: ArrayList<NominaIncapacidadProperties>,
)
