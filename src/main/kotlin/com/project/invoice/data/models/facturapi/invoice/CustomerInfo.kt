package com.project.invoice.data.models.facturapi.invoice

import com.project.invoice.data.models.facturapi.customer.Address

/**
 * <h1>Información del cliente</h1>
 * Objeto con información parcial del cliente receptor del comprobante. Para
 * obtener el objeto `Customer` completo, deberás consultarlo con el método de
 * Obtener Cliente.
 * <P>
 * Usado por [Invoice], [Retention]
 *
 * @version 17/03/2022
 * @author Alejandra JA
 * @category Invoice
</P> */
data class CustomerInfo (
    /**
     * ID del objeto `customer` relacionado a la factura, en caso de no haber sido
     * eliminado
     */
    var id: String,

    /**
     * Nombre Fiscal o Razón Social del cliente.
     */
    var legal_name: String,

    /**
     * RFC del cliente.
     */
    var tax_id: String,

    /**
     * Objeto Address que contiene la direccion del cliente.
     *
     * @see Address
     */
    var address: Address,
)