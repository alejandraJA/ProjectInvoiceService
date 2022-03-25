package com.project.invoice.data.models.facturapi.invoice.complement.nomina

/**
 * Objeto con información detallada de cada percepción.
 * <P>
 * Usado por {@link Percepciones}
 *
 * @version 16/03/2022
 * @author Alejandra JA
 * @category Percepciones
 */
data class Percepcion (
    /**
     * Tipo de Percepción
     *
     * @apiNote Puede contener:
     * <P>
     * `001` Sueldos, Salarios Rayas y Jornales
    </P> * <P>
     * `002` Gratificación Anual (Aguinaldo)
    </P> * <P>
     * `003` Participación de los Trabajadores en las Utilidades PTU
    </P> * <P>
     * `004` Reembolso de Gastos Médicos Dentales y Hospitalarios
    </P> * <P>
     * `005` Fondo de Ahorro
    </P> * <P>
     * `006` Caja de ahorro
    </P> * <P>
     * `009` Contribuciones a Cargo del Trabajador Pagadas por el
     * Patrón
    </P> * <P>
     * `010` Premios por puntualidad
    </P> * <P>
     * `011` Prima de Seguro de vida
    </P> * <P>
     * `012` Seguro de Gastos Médicos Mayores
    </P> * <P>
     * `013` Cuotas Sindicales Pagadas por el Patrón
    </P> * <P>
     * `014` Subsidios por incapacidad
    </P> * <P>
     * `015` Becas para trabajadores y/o hijos
    </P> * <P>
     * `019` Horas extra
    </P> * <P>
     * `020` Prima dominical
    </P> * <P>
     * `021` Prima vacacional
    </P> * <P>
     * `022` Prima por antigüedad
    </P> * <P>
     * `023` Pagos por separación
    </P> * <P>
     * `024` Seguro de retiro
    </P> * <P>
     * `025` Indemnizaciones
    </P> * <P>
     * `026` Reembolso por funeral
    </P> * <P>
     * `027` Cuotas de seguridad social pagadas por el patrón
    </P> * <P>
     * `028` Comisiones
    </P> * <P>
     * `029` Vales de despensa
    </P> * <P>
     * `030` Vales de restaurante
    </P> * <P>
     * `031` Vales de gasolina
    </P> * <P>
     * `032` Vales de ropa
    </P> * <P>
     * `033` Ayuda para renta
    </P> * <P>
     * `034` Ayuda para artículos escolares
    </P> * <P>
     * `035` Ayuda para anteojos
    </P> * <P>
     * `036` Ayuda para transporte
    </P> * <P>
     * `037` Ayuda para gastos de funeral
    </P> * <P>
     * `038` Otros ingresos por salarios
    </P> * <P>
     * `039` Jubilaciones, pensiones o haberes de retiro
    </P> * <P>
     * `044` Jubilaciones, pensiones o haberes de retiro en
     * parcialidades
    </P> * <P>
     * `045` Ingresos en acciones o títulos valor que representan
     * bienes
    </P> * <P>
     * `046` Ingresos asimilados a salarios
    </P> * <P>
     * `047` Alimentación diferentes a los establecidos en el Art 94
     * último
     * párrafo LISR
    </P> * <P>
     * `048` Habitación
    </P> * <P>
     * `049` Premios por asistencia
    </P> * <P>
     * `050` Viáticos
    </P> * <P>
     * `051` Pagos por gratificaciones, primas, compensaciones,
     * recompensas
     * u otros en parcialidades
    </P> * <P>
     * `052` Pagos por jubilación en parcialidades derivados de una
     * resolución judicial
    </P> * <P>
     * `053` Pagos por jubilación en una sola exhibición derivados de
     * la
     * ejecución de una resolución judicial
    </P> */
    var tipo_percepcion: String,

    /**
     * Concepto de la percepción. Si no se envía, se utilizará la descripción del
     * catálogo del tipo de percepción.
     */
    var concepto: String,
    /**
     * Clave de control interno que asigna el patrón a cada percepción de nómina
     * propia de su contabilidad.
     */
    var clave: String,

    /**
     * Importe gravado por el concepto indicado en el tipo de percepción.
     */
    var importe_gravado: Float,
    /**
     * Importe exento por el concepto indicado en el tipo de percepción.
     */
    var importe_exento: Float,

    /**
     * Objeto para expresar ingresos por acciones o títulos valor que representan
     * bienes. Es requerido cuando existan ingresos por sueldos derivados de
     * adquisición de acciones o títulos.
     * @see Accion
     */
    var acciones_o_titulos: ArrayList<Accion>,

    /**
     * Arreglo de objetos para expresar las horas extra aplicables.
     * @apiNote Requerido cuando
     * el tipo de percepción es `019` Horas extras.
     * @see HorasExtra
     */
    var horas_extra: ArrayList<HorasExtra>
)