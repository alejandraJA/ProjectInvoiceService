package com.project.invoice.data.models.facturapi.organizacion

import com.project.invoice.data.models.facturapi.customer.Address

/**
 * [<h1>Datos fiscales de la empresa.</h1>]
 *
 * @version 17/03/2022
 * @author Alejandra JA - 17/03/2022
 * @see Organizacion
 */
data class Legal(
    /** Nombre comercial de la organización.  */
    var name: String,

    /** Nombre Fiscal o Razón Social de la organización.  */
    var legal_name: String,

    /** RFC  */
    var tax_id: String,

    /**
     * [<h2>Código de Régimen Fiscal.</h2>]
     *
     * Su valor puede ser:
     * - `601` General de Ley Personas Morales
     * - `603` Personas Morales con Fines no Lucrativos
     * - `605` Sueldos y Salarios e Ingresos Asimilados a Salarios
     * - `606` Arrendamiento
     * - `608` Demás ingresos
     * - `609` Consolidación
     * - `610` Residentes en el Extranjero sin Establecimiento Permanente en México
     * - `611` Ingresos por Dividendos (socios y accionistas)
     * - `612` Personas Físicas con Actividades Empresariales y Profesionales
     * - `614` Ingresos por intereses
     * - `616` Sin obligaciones fiscales
     * - `620` Sociedades Cooperativas de Producción que optan por diferir sus ingresos
     * - `621` Incorporación Fiscal
     * - `622` Actividades Agrícolas, Ganaderas, Silvícolas y Pesqueras
     * - `623` Opcional para Grupos de Sociedades
     * - `624` Coordinados
     * - `628` Hidrocarburos
     * - `607` Régimen de Enajenación o Adquisición de Bienes
     * - `629` De los Regímenes Fiscales Preferentes y de las Empresas Multinacionales
     * - `630` Enajenación de acciones en bolsa de valores
     * - `615` Régimen de los ingresos por obtención de premios
     * - `625` Régimen de las Actividades Empresariales con ingresos a través de Plataformas Tecnológicas
     * - `626` Régimen Simplificado de Confianza
     */
    var tax_system: String,

    /**
     * Sitio web de la organización, que se utilizará al enviar la factura por
     * correo electrónico.
     */
    var website: String,

    /**
     * Teléfono de la organización, que aparecerá en el PDF de la factura.
     */
    var phone: String,

    /** Email de la organización  */
    var support_email: String,

    /**
     * Domicilio fiscal de la organización.
     *
     * @see Address
     */
    var address: Address,
)
