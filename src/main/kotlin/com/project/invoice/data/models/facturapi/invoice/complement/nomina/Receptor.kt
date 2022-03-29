package com.project.invoice.data.models.facturapi.invoice.complement.nomina

import com.project.invoice.data.models.facturapi.invoice.complement.Nomina

/**
 * [<h1>Receptor</h1>]
 *
 * Información del trabajador.
 *
 * @author Alejandra JA - 17/03/2022
 * @see Nomina
 */
data class Receptor (
    /**
     * CURP del trabajador.
     */
    var curp: String,
    /**
     * Número de seguridad social.
     */
    var num_seguridad_social: String,
    /**
     * Fecha de inicio de la relación laboral entre el empleador y el empleado.
     */
    var fecha_inicio_rel_laboral: String,

    /**
     * Antigüedad del empleado en el formato especificado por el SAT.
     *
     * - Si se envía el valor booleano `false`, este campo no se
     * incluirá en la factura.
     *- Si se envía el valor booleano `true` y
     * [.fecha_inicio_rel_laboral] existe, este valor se calculará
     * con la diferencia entre la fecha de inicio de relación laboral y la
     * fecha de pago.
     * - Debido a que se desconoce El formato especificado por el SAT, solo
     * se mandara el valor `Boolean`, ya que la documentación
     * menciona: Si se envía un string, se espera que éste contenga la
     * antigüedad en el formato que especifica el SAT.
     */
    var antiguedad: Boolean,

    /**
     * Tipo de contrato.
     *
     * Los valores que puede contener son:
     * - `01` Contrato de trabajo por tiempo indeterminado.
     * - `02` Contrato de trabajo para obra determinada.
     * - `03` Contrato de trabajo por tiempo determinado.
     * - `04` Contrato de trabajo por temporada.
     * - `05` Contrato de trabajo sujeto a prueba.
     * - `06` Contrato de trabajo con capacitación inicial.
     * - `07` Modalidad de contratación por pago de hora laborada.
     * - `08` Modalidad de trabajo por comisión laboral.
     * - `09` Modalidades de contratación donde no existe relación de trabajo.
     * - `10` Jubilación, pensión, retiro..
     * - `99` Otro contrato.
     */
    var tipo_contrato: String,

    /**
     * Indica si el trabajador está asociado a un sindicato.
     */
    var sindicalizado: String,

    /**
     * Tipo de Jornada
     *
     * Los valores que puede contener son:
     * - `01` Diurna
     * - `02` Nocturna
     * - `03` Mixta
     * - `04` Por hora
     * - `05` Reducida
     * - `06` Continuada
     * - `07` Partida
     * - `08` Por turnos
     * - `99` Otra Jornada
     */
    var tipo_jornada: String,

    /**
     * Tipo de Régimen
     *
     * Los valores pueden ser:
     * - `02` Sueldos (Incluye ingresos señalados en la fracción I del artículo 94 de LISR)
     * - `03` Jubilados
     * - `04` Pensionados
     * - `05` Asimilados Miembros Sociedades Cooperativas Produccion
     * - `06` Asimilados Integrantes Sociedades Asociaciones Civiles
     * - `07` Asimilados Miembros consejos
     * - `08` Asimilados comisionistas
     * - `09` Asimilados Honorarios
     * - `10` Asimilados acciones
     * - `11` Asimilados otros
     * - `12` Jubilados o Pensionados
     * - `13` Indemnización o Separación
     * - `99` Otro Regimen
     */
    var tipo_regimen: String,

    /**
     * Número interno de empleado, asignado por el empleador.
     * `[ 1 .. 15 ]`
     */
    var num_empleado: String,

    /**
     * Nombre del departamento o área a la que pertenece el trabajador.
     */
    var departamento: String,

    /**
     * Nombre del puesto asignado al empleado o el nombre de la actividad que
     * realiza.
     */
    var puesto: String,

    /**
     * Riesgo de puesto.
     *
     * Los valores que puede tener son:
     * - `1` Clase I
     * - `2` Clase II
     * - `3` Clase III
     * - `4` Clase IV
     * - `5` Clase V
     * - `99` No aplica
     */
    var riesgo_puesto: String,

    /**
     * Periodicidad del Pago
     *
     * Los valores que puede contener son:
     * - `01` Diario
     * - `02` Semanal
     * - `03` Catorcenal
     * - `04` Quincenal
     * - `05` Mensual
     * - `06` Bimestral
     * - `07` Unidad obra
     * - `08` Comisión
     * - `09` Precio alzado
     * - `10` Decenal
     * - `99` Otra Periodicidad
     */
    var periodicidad_pago: String,


    /**
     * Clave del banco de acuerdo al catálogo del SAT "Bancos" que puedes consultar
     * utilizando nuestra herramienta de búsqueda.
     *
     * @see <a href="https://www.facturapi.io/dashboard/catalogs/bank">Bancos</a>
     */
    var banco: String,

    /**
     * Número de cuenta bancaria (11 caracteres) o número de teléfono celular (10
     * caracteres) o número de tarjeta (15 ó 16 caracteres) o la CLABE (18
     * caracteres) o número de monedero electrónico donde se realiza el depósito de
     * nómina.
     */
    var cuenta_bancaria: String,

    /**
     * Importe de la retribución en efectivo por cuota diaria, gratificaciones,
     * percepciones, alimentación, habitación, primas, comisiones, prestaciones en
     * especie, etc.
     */
    var salario_base_cot_apor: Int,

    /**
     * Salario que se integra con los pagos hechos en efectivo por cuota diaria,
     * gratificaciones, percepciones, habitación, primas, comisiones, prestaciones
     * en especie y cualquier otra cantidad o prestación que se entregue al
     * trabajador por su trabajo.
     */
    var salario_diario_integrado: Int,

    /**
     * Clave de la entidad federativa en donde el trabajador prestó sus servicios al
     * empleador, que puedes consultar utilizando nuestra herramienta de búsqueda.
     *
     * @see <a href="https://www.facturapi.io/dashboard/catalogs/state">Estados</a>
     */
    var clave_ent_fed: String,

    /**
     * Arreglo de objetos para expresar información sobre la empresa que se
     * beneficia del trabajo del empleado, en casos donde el emisor preste servicios
     * de subcontratación.
     *
     * @see NominaSubContratacionProperties
     */
    var sub_contratacion: ArrayList<NominaSubContratacionProperties>,
)