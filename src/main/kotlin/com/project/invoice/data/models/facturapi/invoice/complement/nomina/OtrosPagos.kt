package com.project.invoice.data.models.facturapi.invoice.complement.nomina

/**
 * [<h1>OtrosPagos</h1>]
 *
 * Arreglo de objetos para expresar otros pagos aplicables.
 *
 * @author Alejandra JA - 17/03/2022
 * @see Nomina
 */
data class OtrosPagos (

    /**
     * Tipo de Otro Pago
     *
     * Su valor puede ser:
     * - `001` Reintegro de ISR pagado en exceso.
     * - `002` Subsidio para el empleo (efectivamente entregado al trabajador).
     * - `003` Viáticos (entregados al trabajador).
     * - `004` Aplicación de saldo a favor por compensación anual.
     * - `005` Reintegro de ISR retenido en exceso de ejercicio anterior
     * - `006` Alimentos en bienes (Servicios de comedor y comida).
     * - `007` ISR ajustado por subsidio.
     * - `008` Subsidio efectivamente entregado que no correspondía.
     * - `009` Reembolso de descuentos efectuados para el crédito de vivienda.
     * - `999` Pagos distintos a los listados.
     */
    var tipo_otro_pago: String,

    /**
     * Clave de otro pago de nómina propia de la contabilidad de cada patrón.
     *
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
     * el **Anexo 8 de la Resolución Miscelánea Fiscal vigente**.
     *
     * - Este valor será insertado dentro del nodo `SubsidioAlEmpleo`,
     * y es requerido cuando el valor de [tipo_otro_pago] es `002`.
     */
    var subsidio_causado: Float,

    /**
     * Objeto con información referente a la compensación de saldos a favor de un
     * trabajador.
     *
     * @see NominaCompensacionProperties
     */
    var compensacion_saldos_a_favor: NominaCompensacionProperties,
)