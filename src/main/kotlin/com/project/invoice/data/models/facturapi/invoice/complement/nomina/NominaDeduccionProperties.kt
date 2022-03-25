package com.project.invoice.data.models.facturapi.invoice.complement.nomina

/**
 * Arreglo de objetos donde se expresan las deducciones aplicables.
 * Usado en {@link Nomina}
 *
 * @version 17/03/2022
 * @author Alejandra JA
 * @category Nomina
 */
data class NominaDeduccionProperties (
    /**
     * Tipo de Deducción
     *
     * @apiNote Su valor puede ser:
     * <P>`001` Seguridad social
    </P> * <P>`002` ISR
    </P> * <P>`003` Aportaciones a retiro, cesantía en edad avanzada y vejez.
    </P> * <P>`004` Otros
    </P> * <P>`005` Aportaciones a Fondo de vivienda
    </P> * <P>`006` Descuento por incapacidad
    </P> * <P>`007` Pensión alimenticia
    </P> * <P>`008` Renta
    </P> * <P>`009` Préstamos provenientes del Fondo Nacional de la Vivienda para
     * los Trabajadores
    </P> * <P>`010` Pago por crédito de vivienda
    </P> * <P>`011` Pago de abonos INFONACOT
    </P> * <P>`012` Anticipo de salarios
    </P> * <P>`013` Pagos hechos con exceso al trabajador
    </P> * <P>`014` Errores
    </P> * <P>`015` Pérdidas
    </P> * <P>`016` Averías
    </P> * <P>`017` Adquisición de artículos producidos por la empresa o
     * establecimiento
    </P> * <P>`018` Cuotas para la constitución y fomento de sociedades
     * cooperativas y de cajas de ahorro
    </P> * <P>`019` Cuotas sindicales
    </P> * <P>`020` Ausencia (Ausentismo)
    </P> * <P>`021` Cuotas obrero patronales
    </P> * <P>`022` Impuestos Locales
    </P> * <P>`023` Aportaciones voluntarias
    </P> * <P>`024` Ajuste en Gratificación Anual (Aguinaldo) Exento
    </P> * <P>`025` Ajuste en Gratificación Anual (Aguinaldo) Gravado
    </P> * <P>`026` Ajuste en Participación de los Trabajadores en las Utilidades
     * PTU Exento
    </P> * <P>`027` Ajuste en Participación de los Trabajadores en las Utilidades
     * PTU Gravado
    </P> * <P>`028` Ajuste en Reembolso de Gastos Médicos Dentales y Hospitalarios
     * Exento
    </P> * <P>`029` Ajuste en Fondo de ahorro Exento
    </P> * <P>`030` Ajuste en Caja de ahorro Exento
    </P> * <P>`031` Ajuste en Contribuciones a Cargo del Trabajador Pagadas por el
     * Patrón Exento
    </P> * <P>`032` Ajuste en Premios por puntualidad Gravado
    </P> * <P>`033` Ajuste en Prima de Seguro de vida Exento
    </P> * <P>`034` Ajuste en Seguro de Gastos Médicos Mayores Exento
    </P> * <P>`035` Ajuste en Cuotas Sindicales Pagadas por el Patrón Exento
    </P> * <P>`036` Ajuste en Subsidios por incapacidad Exento
    </P> * <P>`037` Ajuste en Becas para trabajadores y/o hijos Exento
    </P> * <P>`038` Ajuste en Horas extra Exento
    </P> * <P>`039` Ajuste en Horas extra Gravado
    </P> * <P>`040` Ajuste en Prima dominical Exento
    </P> * <P>`041` Ajuste en Prima dominical Gravado
    </P> * <P>`042` Ajuste en Prima vacacional Exento
    </P> * <P>`043` Ajuste en Prima vacacional Gravado
    </P> * <P>`044` Ajuste en Prima por antigüedad Exento
    </P> * <P>`045` Ajuste en Prima por antigüedad Gravado
    </P> * <P>`046` Ajuste en Pagos por separación Exento
    </P> * <P>`047` Ajuste en Pagos por separación Gravado
    </P> * <P>`048` Ajuste en Seguro de retiro Exento
    </P> * <P>`049` Ajuste en Indemnizaciones Exento
    </P> * <P>`050` Ajuste en Indemnizaciones Gravado
    </P> * <P>`051` Ajuste en Reembolso por funeral Exento
    </P> * <P>`052` Ajuste en Cuotas de seguridad social pagadas por el patrón
     * Exento
    </P> * <P>`053` Ajuste en Comisiones Gravado
    </P> * <P>`054` Ajuste en Vales de despensa Exento
    </P> * <P>`055` Ajuste en Vales de restaurante Exento
    </P> * <P>`056` Ajuste en Vales de gasolina Exento
    </P> * <P>`057` Ajuste en Vales de ropa Exento
    </P> * <P>`058` Ajuste en Ayuda para renta Exento
    </P> * <P>`059` Ajuste en Ayuda para artículos escolares Exento
    </P> * <P>`060` Ajuste en Ayuda para anteojos Exento
    </P> * <P>`061` Ajuste en Ayuda para transporte Exento
    </P> * <P>`062` Ajuste en Ayuda para gastos de funeral Exento
    </P> * <P>`063` Ajuste en Otros ingresos por salarios Exento
    </P> * <P>`064` Ajuste en Otros ingresos por salarios Gravado
    </P> * <P>`065` Ajuste en Jubilaciones, pensiones o haberes de retiro en una
     * sola exhibición Exento
    </P> * <P>`066` Ajuste en Jubilaciones, pensiones o haberes de retiro en una
     * sola exhibición Gravado
    </P> * <P>`067` Ajuste en Pagos por separación Acumulable
    </P> * <P>`068` Ajuste en Pagos por separación No acumulable
    </P> * <P>`069` Ajuste en Jubilaciones, pensiones o haberes de retiro en
     * parcialidades Exento
    </P> * <P>`070` Ajuste en Jubilaciones, pensiones o haberes de retiro en
     * parcialidades Gravado
    </P> * <P>`071` Ajuste en Subsidio para el empleo (efectivamente entregado al
     * trabajador)
    </P> * <P>`072` Ajuste en Ingresos en acciones o títulos valor que representan
     * bienes Exento
    </P> * <P>`073` Ajuste en Ingresos en acciones o títulos valor que representan
     * bienes Gravado
    </P> * <P>`074` Ajuste en Alimentación Exento
    </P> * <P>`075` Ajuste en Alimentación Gravado
    </P> * <P>`076` Ajuste en Habitación Exento
    </P> * <P>`077` Ajuste en Habitación Gravado
    </P> * <P>`078` Ajuste en Premios por asistencia
    </P> * <P>`079` Ajuste en Pagos distintos a los listados
    </P> * <P>`080` Ajuste en Viáticos gravados
    </P> * <P>`081` Ajuste en Viáticos (entregados al trabajador)
    </P> * <P>`082` Ajuste en Fondo de ahorro Gravado
    </P> * <P>`083` Ajuste en Caja de ahorro Gravado
    </P> * <P>`084` Ajuste en Prima de Seguro de vida Gravado
    </P> * <P>`085` Ajuste en Seguro de Gastos Médicos Mayores Gravado
    </P> * <P>`086` Ajuste en Subsidios por incapacidad Gravado
    </P> * <P>`087` Ajuste en Becas para trabajadores y/o hijos Gravado
    </P> * <P>`088` Ajuste en Seguro de retiro Gravado
    </P> * <P>`089` Ajuste en Vales de despensa Gravado
    </P> * <P>`090` Ajuste en Vales de restaurante Gravado
    </P> * <P>`091` Ajuste en Vales de gasolina Gravado
    </P> * <P>`092` Ajuste en Vales de ropa Gravado
    </P> * <P>`093` Ajuste en Ayuda para renta Gravado
    </P> * <P>`094` Ajuste en Ayuda para artículos escolares Gravado
    </P> * <P>`095` Ajuste en Ayuda para anteojos Gravado
    </P> * <P>`096` Ajuste en Ayuda para transporte Gravado
    </P> * <P>`097` Ajuste en Ayuda para gastos de funeral Gravado
    </P> * <P>`098` Ajuste a ingresos asimilados a salarios gravados
    </P> * <P>`099` Ajuste a ingresos por sueldos y salarios gravados
    </P> * <P>`100` Ajuste en Viáticos exentos
    </P> * <P>`101` ISR Retenido de ejercicio anterior
    </P> * <P>`102` Ajuste a pagos por gratificaciones, primas, compensaciones,
     * recompensas u otros
    </P> * <P>`103` Ajuste a pagos en parcialidades derivados de una resolución
     * judicial gravados
    </P> * <P>`104` Ajuste a pagos en parcialidades derivados de una resolución
     * judicial exentos
    </P> * <P>`105` Ajuste a pagos en una sola exhibición derivados de una
     * resolución judicial gravados
    </P> * <P>`106` Ajuste a pagos en una sola exhibición derivados de una
     * resolución judicial exentos
    </P> * <P>`107` Ajuste al Subsidio Causado
    </P> */
    var tipo_deduccion: String,

    /**
     * Concepto de la deducción. Si no se envía, se utilizará la descripción del
     * catálogo del tipo de deducción.
     */
    var concepto: String,

    /**
     * Clave de control interno que asigna el patrón a cada deducción (descuento) de
     * nómina propia de su contabilidad.
     * <P>
     * Su longitud es de `[ 3 .. 15 ]` caracteres.
    </P> */
    var clave: String,

    /**
     * Importe del concepto de deducción.
     */
    var importe: Float,
)