package com.project.invoice.data.models.facturapi.receipt

import com.project.invoice.data.models.facturapi.invoice.LineItem

/**
 * [<H1>Objeto Recibo</H1>]
 *
 * @author Alejandra JA - 17/03/2022
 */
data class Receipt(
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
     * Fecha de expiración en formato ISO8601 (UTC String). Es la fecha límite para
     * que el cliente pueda facturar su recibo en el portal de autofactura. Se
     * calcula automáticamente a partir de las configuraciones de recibo de la
     * organización.
     */
    var expires_at: String? = null,

    /**
     * Estado actual del recibo.
     *
     * Su valor puede ser: `open`, `canceled`,
     * `invoiced_to_customer`, `invoiced_globally`
     */
    var status: String? = null,

    /**
     * Dirección URL para realizar autofactura. Incluye el key del recibo. Puedes
     * usarla para generar un botón o un QR de facturación para tus clientes.
     */
    var self_invoice_url: String? = null,

    /** Monto total de la operación  */
    var total: Double = 0.0,

    /** ID de la factura asociada, en caso de estar facturado.  */
    var invoice: String? = null,

    /**
     * Autogenerado. Identificador único alfanumérico corto, útil para acceder a la
     * autofactura desde tu micrositio en factura.space
     */
    var key: String? = null,

    /**
     * Conceptos incluidos en el documento.
     *
     * @see LineItem
     */
    var items: ArrayList<LineItem>? = null,

    /**
     * Código que representa la forma de pago, según el catálogo del SAT.
     *
     * Su valor puede ser:
     * - `01` Efectivo.
     * - `02` Cheque nominativo.
     * - `03` Transferencia electrónica de fondos.
     * - `04` Tarjeta de crédito.
     * - `05` Monedero electrónico.
     * - `06` Dinero electrónico.
     * - `08` Vales de despensa.
     * - `12` Dación en pago.
     * - `13` Pago por subrogación.
     * - `14` Pago por consignación.
     * - `15` Condonación.
     * - `17` Compensación.
     * - `23` Novación.
     * - `24` Confusión.
     * - `25` Remisión de deuda.
     * - `26` Prescripción o caducidad.
     * - `27` A satisfacción del acreedor.
     * - `28` Tarjeta de débito.
     * - `29` Tarjeta de servicios.
     * - `30` Aplicación de anticipos.
     * - `31` Intermediario pagos.
     * - `99` Por definir.
     */
    var payment_form: String? = null,

    /**
     * Autoincremental. Número de folio del recibo para control interno y sin
     * validez fiscal.
     */
    var folio_number: Int = 0,

    /**
     * Código de la moneda, acorde al estándar ISO 4217.
     *
     * @see <a href="https://es.wikipedia.org/wiki/ISO_4217">ISO 4217</a>
     */
    var currency: String? = null,

    /**
     * Tipo de cambio conforme a la moneda usada. Representa el número de pesos
     * mexicanos que equivalen a una unidad de la divisa señalada en el atributo
     * `currency`. Su valor es `>= 0`.
     */
    var exchange: Int? = 0,

    /**
     * Nombre de la sucursal donde se expidió el recibo.
     */
    var branch: String? = null,
)