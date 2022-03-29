package com.project.invoice.data.models.facturapi.retention

import com.project.invoice.data.models.facturapi.invoice.CustomerInfo
import com.project.invoice.data.models.facturapi.invoice.Namespace
import com.project.invoice.data.models.facturapi.invoice.Stamp

/**
 * <h1>Retenciones</h1>
 *
 * @author Alejandra JA - 17/03/2022
 */
class Retention(
    /** ID del recibo.  */
    var id: String? = null,

    /** Fecha de registro.  */
    var created_at: String? = null,

    /**
     * Modo de trabajo
     *
     * Si el valor es `true`, indica que el objeto fue creado en
     * ambiente Live; o si es `false`, en ambiente Test.
     */
    var livemode: Boolean = false,

    /**
     * Estado actual del recibo
     *
     * Su valor puede ser: `open`, `canceled`,
     * `invoiced_to_customer`, `invoiced_globally`
     */
    var status: String? = null,

    /**
     * Dirección URL para verificar el estado de la retención en el portal del SAT.
     * Este link es el mismo que aparece en el código QR, en el PDF de la retención.
     */
    var verification_url: String? = null,

    /**
     * Tipo de comprobante.
     *
     * Value: `Retención`
    </P> */
    var type: String? = null,

    /**
     * Folio fiscal de la retención, asignado por el SAT.
     */
    var uuid: String? = null,

    /**
     * Información sobre el timbre fiscal digital agregado por el PAC.
     *
     * @see Stamp
     */
    var stamp: Stamp? = null,

    /**
     * Cliente
     *
     * Objeto con información parcial del cliente receptor del comprobante. Para
     * obtener el objeto Customer completo, deberás consultarlo con el método de
     * Obtener Cliente.
     *
     * @see CustomerInfo
     */
    var customer: CustomerInfo? = null,

    /**
     * Clave de la retención o información de pagos de acuerdo al catálogo del SAT.
     */
    var cve_retenc: Int = 0,

    /**
     * Fecha de expedición del comprobante en formato ISO8601 (UTC String).
     */
    var fecha_exp: String? = null,

    /**
     * Si la clave de la retención es "25" (Otro tipo de retenciones), este campo se
     * usa para registrar la descripción de la retención.
     */
    var desc_retenc: String? = null,

    /**
     * Identificador alfanumérico para control interno de la empresa y sin
     * relevancia fiscal.
     */
    var folio_int: String? = null,

    /**
     * Información sobre el periodo de la retención.
     *
     * @see Periodo
     */
    var periodo: Periodo? = null,

    /**
     * Información sobre el total de retenciones efectuadas en el periodo
     * correspondiente.
     *
     * @see Totales
     */
    var totales: Totales? = null,

    /**
     * Identificador opcional que puedes usar para relacionar esta retención con tus
     * registros y poder hacer búsquedas usando este identificador. Facturapi no
     * valida que este campo sea único.
     */
    var external_id: String? = null,

    /**
     * Complementos a incluir en la factura.
     *
     * Default: []
     *
     * @see CustomComplement
     */
    var complements: ArrayList<CustomComplement?>? = null,

    /**
     * En caso de que necesites incluir más información en el PDF, este campo te
     * permite insertar código HTML con tu propio contenido.
     */
    var pdf_custom_section: String? = null,

    /**
     * Código XML con la Addenda que se necesite agregar a la factura.
     */
    var addenda: String? = null,

    /**
     * Namespaces a insertar en el nodo raíz de la factura. Requerido en
     * complementos y addenda.
     *
     * @see Namespace
     */
    var namespaces: ArrayList<Namespace?>? = null,
)