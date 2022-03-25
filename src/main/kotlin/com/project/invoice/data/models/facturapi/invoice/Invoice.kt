package com.project.invoice.data.models.facturapi.invoice

import com.project.invoice.data.models.facturapi.customer.Address

/**
 * Factura.
 *
 * @version 17/03/2022
 * @author Alejandra JA
 */
data class Invoice (
    /** ID de la factura  */
    var id: String,

    /** Fecha de registro  */
    var created_at: String,

    /**
     * Modo de trabajo
     *
     * @implNote Si el valor es `true`, indica que el objeto fue creado en
     * ambiente Live; o si es `false`, en ambiente Test.
     */
    var livemode: Boolean,

    /**
     * Estado actual de la factura.
     * <P>
     * Sus valores son `valid` y `canceled`.
    </P> */
    var status: String,

    /**
     * Estado de cancelación.
     *
     * @apiNote Sus valores pueden ser:
     * `r`, `none`, `pending`,
     * `accepted`, `rejected`,`expired`.
     * @apiNote Estado actual de la solicitud de cancelación, en caso de
     * haberla
     * realizado. Puedes leer más a detalle en la sección de Cancelar
     * Factura).
     * @see http://docs.facturapi.io/api/.operation/deleteInvoice
     */
    var cancellation_status: String,

    /**
     * Dirección URL para verificar el estado del CFDI en el portal del SAT. Este
     * link es el mismo que aparece en el código QR, en el PDF de la factura.
     */
    var verification_url: String,

    /**
     * Fecha de expedición del comprobante en formato ISO8601 (UTC String).
     */
    var date: String,

    /**
     * Domicilio de expedición de la factura.
     *
     * @see Address
     */
    var address: Address,

    /**
     * Cancelación de comprovante o recivo.
     *
     * @apiNote Si el comprobante fue cancelado, este campo contiene el acuse de
     * recibo de cancelación en formato XML.
     */
    var cancellation_receipt: String,

    /**
     * Tipo de comprobante.
     *
     * @apiNote Puede tener los valores
     * <P>
     * `I`: Ingreso,
    </P> * <P>
     * `P`: Pago,
    </P> * <P>
     * `E`: Egreso,
    </P> * <P>
     * `N`: Nómina,
    </P> * <P>
     * `T`: Traslado.
    </P> */
    var type: String,

    /**
     * Objeto con información parcial del cliente receptor del comprobante. Para
     * obtener el objeto `Customer` completo, deberás consultarlo con el
     * método de Obtener Cliente.
     *
     * @see CustomerInfo
     */
    var customer: CustomerInfo,

    /** Monto total facturado  */
    var total: Double,

    /** Folio fiscal de la factura, asignado por el SAT.  */
    var uuid: String,

    /**
     * Número de folio autoincremental para control interno y sin validez fiscal.
     */
    var folio_number: Int,

    /**
     * Serie. Caracteres designados por la empresa para control interno y sin
     * validez fiscal. En el PDF se imprime junto al Logo.
     *
     */
    var series: String,

    /**
     * Identificador opcional que puedes usar para relacionar esta factura con tus
     * registros para después buscar por este número.
     */
    var external_id: String,

    /**
     * Código que representa la forma de pago, deacuerdo al catálogo del SAT.
     *
     * @apiNote Su valor puede ser:
     * <P>`01` Efectivo
    </P> * <P>`02` Cheque nominativo
    </P> * <P>`03` Transferencia electrónica de fondos
    </P> * <P>`04` Tarjeta de crédito
    </P> * <P>`05` Monedero electrónico
    </P> * <P>`06` Dinero electrónico
    </P> * <P>`08` Vales de despensa
    </P> * <P>`12` Dación en pago
    </P> * <P>`13` Pago por subrogación
    </P> * <P>`14` Pago por consignación
    </P> * <P>`15` Condonación
    </P> * <P>`17` Compensación
    </P> * <P>`23` Novación
    </P> * <P>`24` Confusión
    </P> * <P>`25` Remisión de deuda
    </P> * <P>`26` Prescripción o caducidad
    </P> * <P>`27` A satisfacción del acreedor
    </P> * <P>`28` Tarjeta de débito
    </P> * <P>`29` Tarjeta de servicios
    </P> * <P>`30` Aplicación de anticipos
    </P> * <P>`31` Intermediario pagos
    </P> * <P>`99` Por definir
     * @see https://docs.facturapi.io/api/.forma-de-pago
    </P> */
    var payment_form: Int,

    /**
     * Array de conceptos incluidos en el documento.
     *
     * @see LineItem
     */
    var items: ArrayList<LineItem>,

    /**
     * Documentos relacionados con la factura.
     *
     * @see RelatedDocument
     */
    var related_documents: ArrayList<RelatedDocument>,

    /**
     * Código de la moneda, acorde al estándar ISO 4217.
     *
     * @see https://es.wikipedia.org/wiki/ISO_4217
     */
    var currency: String,

    /**
     * Tipo de cambio conforme a la moneda usada. Representa el número de pesos
     * mexicanos que equivalen a una unidad de la divisa señalada en el atributo
     * [.currency]. Su valor debe ser `>= 0`
     */
    var exchange: Int,

    /**
     * Complementos a incluir en la factura.
     *
     * @see Complement
     */
    var complements: ArrayList<Complement>,

    /**
     * En caso de que necesites incluir más información en el PDF, este campo te
     * permite insertar código HTML con tu propio contenido.
     */
    var pdf_custom_section: String,

    /**
     * Código XML con la Addenda que se necesite agregar a la factura.
     */
    var addenda: String,

    /**
     * Namespaces a insertar en el nodo raíz de la factura. Requerido en
     * complementos y addenda.
     *
     * @see Namespace
     */
    var namespaces: ArrayList<Namespace>,

    /**
     * Información sobre el timbre fiscal digital agregado por el PAC.
     *
     * @see Stamp
     */
    var stamp: Stamp,
)