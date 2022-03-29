package com.project.invoice.data.models.facturapi.invoice

import com.project.invoice.data.models.facturapi.customer.Address

/**
 * [<h1>Factura</h1>]
 *
 * @author Alejandra JA - 17/03/2022
 */
data class Invoice (
    /** ID de la factura  */
    var id: String,

    /** Fecha de registro  */
    var created_at: String,

    /**
     * Modo de trabajo
     *
     * Si el valor es `true`, indica que el objeto fue creado en
     * ambiente Live; o si es `false`, en ambiente Test.
     */
    var livemode: Boolean,

    /**
     * Estado actual de la factura.
     *
     * Su valor puede ser `valid` o `canceled`.
     */
    var status: String,

    /**
     * Estado de cancelación.
     *
     * - Sus valores pueden ser: `r`, `none`, `pending`,
     * `accepted`, `rejected`,`expired`.
     * - Estado actual de la solicitud de cancelación, en caso
     * de haberla realizado. Puedes leer más a detalle en la
     * sección de Cancelar Factura).
     * @see <a href="http://docs.facturapi.io/api/.operation/deleteInvoice">Cancelación de factura</a>
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
     * Si el comprobante fue cancelado, este campo contiene el acuse de
     * recibo de cancelación en formato XML.
     */
    var cancellation_receipt: String,

    /**
     * Tipo de comprobante.
     *
     * Puede tener los valores
     * - `I`: Ingreso,
     * - `P`: Pago,
     * - `E`: Egreso,
     * - `N`: Nómina,
     * - `T`: Traslado.
     */
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
     * Su valor puede ser:
     * - `01` Efectivo
     * - `02` Cheque nominativo
     * - `03` Transferencia electrónica de fondos
     * - `04` Tarjeta de crédito
     * - `05` Monedero electrónico
     * - `06` Dinero electrónico
     * - `08` Vales de despensa
     * - `12` Dación en pago
     * - `13` Pago por subrogación
     * - `14` Pago por consignación
     * - `15` Condonación
     * - `17` Compensación
     * - `23` Novación
     * - `24` Confusión
     * - `25` Remisión de deuda
     * - `26` Prescripción o caducidad
     * - `27` A satisfacción del acreedor
     * - `28` Tarjeta de débito
     * - `29` Tarjeta de servicios
     * - `30` Aplicación de anticipos
     * - `31` Intermediario pagos
     * - `99` Por definir
     * @see <a href="https://docs.facturapi.io/api/.forma-de-pago">Forma de pago</a>
     */
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
     * @see <a href="https://es.wikipedia.org/wiki/ISO_4217">ISO 4217</a>
     */
    var currency: String,

    /**
     * Tipo de cambio conforme a la moneda usada. Representa el número de pesos
     * mexicanos que equivalen a una unidad de la divisa señalada en el atributo
     * [currency]. Su valor debe ser `>= 0`
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