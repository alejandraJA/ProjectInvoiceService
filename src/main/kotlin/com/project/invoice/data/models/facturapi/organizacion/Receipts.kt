package com.project.invoice.data.models.facturapi.organizacion

/**
 * <h1>Editar config. recibos</h1>
 * Actualiza la configuración de recibos de la organización.
 * <P>
 * Usado por {@link Organizacion}
 *
 * @version 18/03/2022
 * @author Alejandra JA
 * @category Organizacion
 */
data class Receipts (
    /**
     * <h1>Periodo de facturación</h1>
     * Último día del periodo para la facturación electronica.
     */
    var invoicing_period: String,

    /**
     * <h1>Periodicidad</h1>
     * Periodicidad con la que la empresa decide realizar una factura global (al
     * público en general) por todos los recibos no facturados. Este valor se
     * utiliza como default al crear una factura global.
     * Sus valores pueden ser:
     * `day`, `week`, `fortnight`, `month` y
     * `two_months`
     * <P>
     * Preiodicidad por default: `month`.
    </P> */
    var periodicity: String,

    /**
     * <h1>Días de duración.</h1>
     * Días máximos para facturar por medio del portal de autofactura después de
     * emitido el recibo y antes del último día del periodo definido por el atributo
     * [.periodicity]. El valor `0` desactiva esta opción, haciendo que los recibos
     * expiren siempre el último día del periodo.
     */
    var duration_days: Int,

    /**
     * <h1>Siguiente folio de recibo</h1>
     * Número de folio que se asignará al siguiente recibo en ambiente
     * `Live` (y
     * que se incrementará automáticamente por cada nueva factura).
     */
    var next_folio_number: Int,

    /**
     * <h1>Siguiente folio de recibo</h1>
     * Número de folio que se asignará al siguiente recibo en ambiente
     * `Test` (y
     * que se incrementará automáticamente por cada nueva factura).
     *
     */
    var next_folio_number_test: Int,

    /** Correo electronico de soporte o preguntas  */
    var ask_address: String,
)