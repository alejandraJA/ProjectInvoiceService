package com.project.invoice.data.models.facturapi.invoice.complement.nomina

/**
 * [<h1>Percepcion</h1>]
 *
 * Objeto con información detallada de cada percepción.
 *
 * @author Alejandra JA - 16/03/2022
 * @see Percepciones
 */
data class Percepcion (
    /**
     * Tipo de Percepción
     *
     * Puede contener:
     * - `001` Sueldos, Salarios Rayas y Jornada
     * - `002` Gratificación Anual (Aguinaldo(
     * - `003` Participación de los Trabajadores en las Utilidades PTU.
     * - `004` Reembolso de Gastos Médicos Dentales y Hospitalarios.
     * - `005` Fondo de Ahorro
     * - `006` Caja de ahorro
     * - `009` Contribuciones a Cargo del Trabajador Pagadas por el Patrón
     * - `010` Premios por puntualidad
     * - `011` Prima de Seguro de vida
     * - `012` Seguro de Gastos Médicos Mayores
     * - `013` Cuotas Sindicales Pagadas por el Patrón
     * - `014` Subsidios por incapacidad
     * - `015` Becas para trabajadores y/o hijos
     * - `019` Horas extra
     * - `020` Prima dominical
     * - `021` Prima vacacional
     * - `022` Prima por antigüedad
     * - `023` Pagos por separación
     * - `024` Seguro de retiro
     * - `025` Indemnizaciones
     * - `026` Reembolso por funeral
     * - `027` Cuotas de seguridad social pagadas por el patrón
     * - `028` Comisiones
     * - `029` Vales de despensa
     * - `030` Vales de restaurante
     * - `031` Vales de gasolina
     * - `032` Vales de ropa
     * - `033` Ayuda para renta
     * - `034` Ayuda para artículos escolares
     * - `035` Ayuda para anteojos
     * - `036` Ayuda para transporte
     * - `037` Ayuda para gastos de funeral
     * - `038` Otros ingresos por salarios
     * - `039` Jubilaciones, pensiones o haberes de retiro
     * - `044` Jubilaciones, pensiones o haberes de retiro en parcialidades
     * - `045` Ingresos en acciones o títulos valor que representan bienes
     * - `046` Ingresos asimilados a salarios
     * - `047` Alimentación diferentes a los establecidos en el Art 94 último párrafo LISR
     * - `048` Habitación
     * - `049` Premios por asistencia
     * - `050` Viáticos
     * - `051` Pagos por gratificaciones, primas, compensaciones, recompensas u otros en parcialidades
     * - `052` Pagos por jubilación en parcialidades derivados de una resolución judicial
     * - `053` Pagos por jubilación en una sola exhibición derivados de la ejecución de una resolución judicial
     */
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
     * Requerido cuando [tipo_percepcion] es `019` Horas extras.
     * @see HorasExtra
     */
    var horas_extra: ArrayList<HorasExtra>
)