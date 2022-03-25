package com.project.invoice.data.models.facturapi.invoice.complement.nomina

/**
 * Información del trabajador.
 * <P>
 * Usado en {@link Nomina}.
 *
 * @version 17/03/2022
 * @author Alejandra JA
 * @category Nomina
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
     * @apiNote Si se envía el valor booleano `false`, este campo no se
     * incluirá en la factura.
     * @apiNote Si se envía el valor booleano `true` y
     * [.fecha_inicio_rel_laboral] existe, este valor se calculará
     * con la diferencia entre la fecha de inicio de relación laboral y la
     * fecha de pago.
     * @apiNote Debido a que se desconoce El formato especificado por el SAT, solo
     * se mandara el valor `Boolean`, ya que la documentación
     * menciona:
     * <P>
     * Si se envía un string, se espera que éste contenga la antigüedad en
     * el formato que especifica el SAT.
    </P> */
    var antiguedad: Boolean,

    /**
     * Tipo de contrato.
     *
     * @apiNote Los valores que puede contener son:
     * <P>
     * `01` Contrato de trabajo por tiempo indeterminado.
    </P> * <P>
     * `02` Contrato de trabajo para obra determinada.
    </P> * <P>
     * `03` Contrato de trabajo por tiempo determinado.
    </P> * <P>
     * `04` Contrato de trabajo por temporada.
    </P> * <P>
     * `05` Contrato de trabajo sujeto a prueba.
    </P> * <P>
     * `06` Contrato de trabajo con capacitación inicial.
    </P> * <P>
     * `07` Modalidad de contratación por pago de hora laborada.
    </P> * <P>
     * `08` Modalidad de trabajo por comisión laboral.
    </P> * <P>
     * `09` Modalidades de contratación donde no existe relación de
     * trabajo.
    </P> * <P>
     * `10` Jubilación, pensión, retiro..
    </P> * <P>
     * `99` Otro contrato.
    </P> * <P>
    </P> */
    var tipo_contrato: String,

    /**
     * Indica si el trabajador está asociado a un sindicato.
     */
    var sindicalizado: String,

    /**
     * Tipo de Jornada
     *
     * @apiNote Los valores que puede contener son:
     * Clave Descripción
     * <P>
     * `01` Diurna
    </P> * <P>
     * `02` Nocturna
    </P> * <P>
     * `03` Mixta
    </P> * <P>
     * `04` Por hora
    </P> * <P>
     * `05` Reducida
    </P> * <P>
     * `06` Continuada
    </P> * <P>
     * `07` Partida
    </P> * <P>
     * `08` Por turnos
    </P> * <P>
     * `99` Otra Jornada
    </P> */
    var tipo_jornada: String,

    /**
     * Tipo de Régimen
     *
     * @apiNote Los valores pueden ser:
     * <P>`02` Sueldos (Incluye ingresos señalados en la fracción I del
     * artículo 94 de LISR)
    </P> * <P>`03` Jubilados
    </P> * <P>`04` Pensionados
    </P> * <P>`05` Asimilados Miembros Sociedades Cooperativas Produccion
    </P> * <P>`06` Asimilados Integrantes Sociedades Asociaciones Civiles
    </P> * <P>`07` Asimilados Miembros consejos
    </P> * <P>`08` Asimilados comisionistas
    </P> * <P>`09` Asimilados Honorarios
    </P> * <P>`10` Asimilados acciones
    </P> * <P>`11` Asimilados otros
    </P> * <P>`12` Jubilados o Pensionados
    </P> * <P>`13` Indemnización o Separación
    </P> * <P>`99` Otro Regimen
    </P> */
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
     * @apiNote Los valores que puede tener son:
     * <P> `1` Clase I
    </P> * <P> `2` Clase II
    </P> * <P> `3` Clase III
    </P> * <P> `4` Clase IV
    </P> * <P> `5` Clase V
    </P> * <P> `99` No aplica
    </P> */
    var riesgo_puesto: String,

    /**
     * Periodicidad del Pago
     *
     * @apiNote Los valores que puede contener son:
     * <P> `01` Diario
    </P> * <P> `02` Semanal
    </P> * <P> `03` Catorcenal
    </P> * <P> `04` Quincenal
    </P> * <P> `05` Mensual
    </P> * <P> `06` Bimestral
    </P> * <P> `07` Unidad obra
    </P> * <P> `08` Comisión
    </P> * <P> `09` Precio alzado
    </P> * <P> `10` Decenal
    </P> * <P> `99` Otra Periodicidad
    </P> */
    var periodicidad_pago: String,


    /**
     * Clave del banco de acuerdo al catálogo del SAT "Bancos" que puedes consultar
     * utilizando nuestra herramienta de búsqueda.
     *
     * @see https://www.facturapi.io/dashboard/catalogs/bank
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
     *
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
     * @see https://www.facturapi.io/dashboard/catalogs/state
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