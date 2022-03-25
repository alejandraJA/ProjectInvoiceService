package com.project.invoice.data.models.facturapi.customer

/**
 * <h1>Clase clientes.</h1>
 *
 * @author Alejandra JA
 * @version 16/03/2022
 */
class Customer (
    /** ID del cliente.  */
    var id: String,

    /** Fecha de registro.  */
    var created_at: String,

    /**
     * Modo de trabajo
     *
     * @implNote Si el valor es `true`, indica que el objeto fue creado en
     * ambiente Live; o si es `false`, en ambiente Test.
     */
    var livemode: Boolean,

    /**
     * Nombre fiscal o razón social del cliente.
     */
    var legal_name: String,

    /**
     * RFC o Identificacion tributaria.
     *
     * @implNote En clientes de México contiene el RFC del cliente.
     * <P>
     * Para extranjeros es opcional y representa el número de registro de
     * identificacón tributaria, es decir, el equivalente al RFC en el
     * país del
     * cliente.
    </P> */
    var tax_id: String,

    /**
     * Clave del régimen fiscal del cliente.
     *
     * @implNote Requerido para clientes nacionales.
     */
    var tax_system: String,

    /** Dirección de correo electrónico al cual enviar las facturas generadas.  */
    var email: String,

    /** Teléfono del cliente.  */
    var phone: String,

    /**
     * Domicilio fiscal.
     *
     * @see Address
     */
    var address: Address,
)