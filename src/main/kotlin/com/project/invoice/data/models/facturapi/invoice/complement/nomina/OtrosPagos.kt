package com.project.invoice.data.models.facturapi.invoice.complement.nomina

/**
 * Arreglo de objetos para expresar otros pagos aplicables.<P>
 * Usado en {@link Nomina}.
 *
 * @version 17/03/2022
 * @author Alejandra JA
 * @category Nomina
 */
data class OtrosPagos (
    /**
     * Tipo de Otro Pago
     *
     * @apiNote Su valor puede ser:
     * <P>
     * `001` Reintegro de ISR pagado en exceso.
    </P> * <P>
     * `002` Subsidio para el empleo (efectivamente entregado al
     * trabajador).
    </P> * <P>
     * `003` Viáticos (entregados al trabajador).
    </P> * <P>
     * `004` Aplicación de saldo a favor por compensación anual.
    </P> * <P>
     * `005` Reintegro de ISR retenido en exceso de ejercicio
     * anterior
    </P> * <P>
     * `006` Alimentos en bienes (Servicios de comedor y comida).
    </P> * <P>
     * `007` ISR ajustado por subsidio.
    </P> * <P>
     * `008` Subsidio efectivamente entregado que no correspondía.
    </P> * <P>
     * `009` Reembolso de descuentos efectuados para el crédito de
     * vivienda.
    </P> * <P>
     * `999` Pagos distintos a los listados.
    </P> */
    var tipo_otro_pago: String,

    /**
     * Clave de otro pago de nómina propia de la contabilidad de cada patrón.
     * <P>
     * Su longitud es de `[3 .. 15]` caracteres.
    </P> */
    var clave: String,

    /**
     * Descripción alternativa correspondiente a la clave utilizada.
     */
    var concepto: String,

    /**
     * Importe por concepto de otro pago.
     */
    var importe: Float,

    /**
     * Subsudio causado conforme a la tabla del subsidio para el empleo publicada en
     * el <B>Anexo 8 de la Resolución Miscelánea Fiscal vigente<B>.
     *
     * @apiNote Este valor será insertado dentro del nodo `SubsidioAlEmpleo`,
     * y es requerido cuando el valor de `tipo_otro_pago ` es
     * `002`.
    </B></B> */
    var subsidio_causado: Float,

    /**
     * Objeto con información referente a la compensación de saldos a favor de un
     * trabajador.
     *
     * @see NominaCompensacionProperties
     */
    var compensacion_saldos_a_favor: NominaCompensacionProperties,
)