package com.project.invoice.data.models.facturapi.invoice.complement.nomina

import com.project.invoice.data.models.facturapi.invoice.complement.Nomina

/**
 * [<h1>Nomina de Deduccion - Properties</h1>]
 * Arreglo de objetos donde se expresan las deducciones aplicables.
 *
 * @author Alejandra JA - 17/03/2022
 * @see Nomina
 */
data class NominaDeduccionProperties (
    /**
     * Tipo de Deducción
     *
     * Su valor puede ser:
     * - `001` Seguridad social
     * - `002` ISR
     * - `003` Aportaciones a retiro, cesantía en edad avanzada y vejez.
     * - `004` Otros
     * - `005` Aportaciones a Fondo de vivienda
     * - `006` Descuento por incapacidad
     * - `007` Pensión alimenticia
     * - `008` Renta
     * - `009` Préstamos provenientes del Fondo Nacional de la Vivienda para los Trabajadores
     * - `010` Pago por crédito de vivienda
     * - `011` Pago de abonos INFONACOT
     * - `012` Anticipo de salarios
     * - `013` Pagos hechos con exceso al trabajador
     * - `014` Errores
     * - `015` Pérdidas
     * - `016` Averías
     * - `017` Adquisición de artículos producidos por la empresa o establecimiento
     * - `018` Cuotas para la constitución y fomento de sociedades cooperativas y de cajas de ahorro
     * - `019` Cuotas sindicales
     * - `020` Ausencia (Ausentismo)
     * - `021` Cuotas obrero patronales
     * - `022` Impuestos Locales
     * - `023` Aportaciones voluntarias
     * - `024` Ajuste en Gratificación Anual (Aguinaldo) Exento
     * - `025` Ajuste en Gratificación Anual (Aguinaldo) Gravado
     * - `026` Ajuste en Participación de los Trabajadores en las Utilidades PTU Exento
     * - `027` Ajuste en Participación de los Trabajadores en las Utilidades PTU Gravado
     * - `028` Ajuste en Reembolso de Gastos Médicos Dentales y Hospitalarios Exento
     * - `029` Ajuste en Fondo de ahorro Exento
     * - `030` Ajuste en Caja de ahorro Exento
     * - `031` Ajuste en Contribuciones a Cargo del Trabajador Pagadas por el Patrón Exento
     * - `032` Ajuste en Premios por puntualidad Gravado
     * - `033` Ajuste en Prima de Seguro de vida Exento
     * - `034` Ajuste en Seguro de Gastos Médicos Mayores Exento
     * - `035` Ajuste en Cuotas Sindicales Pagadas por el Patrón Exento
     * - `036` Ajuste en Subsidios por incapacidad Exento
     * - `037` Ajuste en Becas para trabajadores y/o hijos Exento
     * - `038` Ajuste en Horas extra Exento
     * - `039` Ajuste en Horas extra Gravado
     * - `040` Ajuste en Prima dominical Exento
     * - `041` Ajuste en Prima dominical Gravado
     * - `042` Ajuste en Prima vacacional Exento
     * - `043` Ajuste en Prima vacacional Gravado
     * - `044` Ajuste en Prima por antigüedad Exento
     * - `045` Ajuste en Prima por antigüedad Gravado
     * - `046` Ajuste en Pagos por separación Exento
     * - `047` Ajuste en Pagos por separación Gravado
     * - `048` Ajuste en Seguro de retiro Exento
     * - `049` Ajuste en Indemnizaciones Exento
     * - `050` Ajuste en Indemnizaciones Gravado
     * - `051` Ajuste en Reembolso por funeral Exento
     * - `052` Ajuste en Cuotas de seguridad social pagadas por el patrón Exento
     * - `053` Ajuste en Comisiones Gravado
     * - `054` Ajuste en Vales de despensa Exento
     * - `055` Ajuste en Vales de restaurante Exento
     * - `056` Ajuste en Vales de gasolina Exento
     * - `057` Ajuste en Vales de ropa Exento
     * - `058` Ajuste en Ayuda para renta Exento
     * - `059` Ajuste en Ayuda para artículos escolares Exento
     * - `060` Ajuste en Ayuda para anteojos Exento
     * - `061` Ajuste en Ayuda para transporte Exento
     * - `062` Ajuste en Ayuda para gastos de funeral Exento
     * - `063` Ajuste en Otros ingresos por salarios Exento
     * - `064` Ajuste en Otros ingresos por salarios Gravado
     * - `065` Ajuste en Jubilaciones, pensiones o haberes de retiro en una sola exhibición Exento
     * - `066` Ajuste en Jubilaciones, pensiones o haberes de retiro en una sola exhibición Gravado
     * - `067` Ajuste en Pagos por separación Acumulable
     * - `068` Ajuste en Pagos por separación No acumulable
     * - `069` Ajuste en Jubilaciones, pensiones o haberes de retiro en parcialidades Exento
     * - `070` Ajuste en Jubilaciones, pensiones o haberes de retiro en parcialidades Gravado
     * - `071` Ajuste en Subsidio para el empleo (efectivamente entregado al trabajador)
     * - `072` Ajuste en Ingresos en acciones o títulos valor que representan bienes Exento
     * - `073` Ajuste en Ingresos en acciones o títulos valor que representan bienes Gravado
     * - `074` Ajuste en Alimentación Exento
     * - `075` Ajuste en Alimentación Gravado
     * - `076` Ajuste en Habitación Exento
     * - `077` Ajuste en Habitación Gravado
     * - `078` Ajuste en Premios por asistencia
     * - `079` Ajuste en Pagos distintos a los listados
     * - `080` Ajuste en Viáticos gravados
     * - `081` Ajuste en Viáticos (entregados al trabajador)
     * - `082` Ajuste en Fondo de ahorro Gravado
     * - `083` Ajuste en Caja de ahorro Gravado
     * - `084` Ajuste en Prima de Seguro de vida Gravado
     * - `085` Ajuste en Seguro de Gastos Médicos Mayores Gravado
     * - `086` Ajuste en Subsidios por incapacidad Gravado
     * - `087` Ajuste en Becas para trabajadores y/o hijos Gravado
     * - `088` Ajuste en Seguro de retiro Gravado
     * - `089` Ajuste en Vales de despensa Gravado
     * - `090` Ajuste en Vales de restaurante Gravado
     * - `091` Ajuste en Vales de gasolina Gravado
     * - `092` Ajuste en Vales de ropa Gravado
     * - `093` Ajuste en Ayuda para renta Gravado
     * - `094` Ajuste en Ayuda para artículos escolares Gravado
     * - `095` Ajuste en Ayuda para anteojos Gravado
     * - `096` Ajuste en Ayuda para transporte Gravado
     * - `097` Ajuste en Ayuda para gastos de funeral Gravado
     * - `098` Ajuste a ingresos asimilados a salarios gravados
     * - `099` Ajuste a ingresos por sueldos y salarios gravados
     * - `100` Ajuste en Viáticos exentos
     * - `101` ISR Retenido de ejercicio anterior
     * - `102` Ajuste a pagos por gratificaciones, primas, compensaciones, recompensas u otros
     * - `103` Ajuste a pagos en parcialidades derivados de una resolución judicial gravados
     * - `104` Ajuste a pagos en parcialidades derivados de una resolución judicial exentos
     * - `105` Ajuste a pagos en una sola exhibición derivados de una resolución judicial gravados
     * - `106` Ajuste a pagos en una sola exhibición derivados de una resolución judicial exentos
     * - `107` Ajuste al Subsidio Causado
    */
    var tipo_deduccion: String,

    /**
     * Concepto de la deducción. Si no se envía, se utilizará la descripción del
     * catálogo del tipo de deducción.
     */
    var concepto: String,

    /**
     * Clave de control interno que asigna el patrón a cada deducción (descuento) de
     * nómina propia de su contabilidad.
     * Su longitud es de `[ 3 .. 15 ]` caracteres.
    </P> */
    var clave: String,

    /**
     * Importe del concepto de deducción.
     */
    var importe: Float,
)