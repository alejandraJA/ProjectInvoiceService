package com.project.invoice.data.models.facturapi.organizacion

import com.project.invoice.data.models.facturapi.customer.Address

/**
 * <h1>Datos fiscales de la empresa.</h1>
 * Usado por [Organizacion]
 *
 * @version 17/03/2022
 * @author Alejandra JA
 * @category Organizacion
 */
data class Legal(
    /** Nombre comercial de la organización.  */
    var name: String,

    /** Nombre Fiscal o Razón Social de la organización.  */
    var legal_name: String,

    /** RFC  */
    var tax_id: String,

    /**
     * <h1>Código de Régimen Fiscal.</h1>
     *
     * @apiNote Su valor puede ser:
     * <P>
    </P> * <P>
     * `601` General de Ley Personas Morales
    </P> * <P>
     * `603` Personas Morales con Fines no Lucrativos
    </P> * <P>
     * `605` Sueldos y Salarios e Ingresos Asimilados a Salarios
    </P> * <P>
     * `606` Arrendamiento
    </P> * <P>
     * `608` Demás ingresos
    </P> * <P>
     * `609` Consolidación
    </P> * <P>
     * `610` Residentes en el Extranjero sin Establecimiento
     * Permanente en México
    </P> * <P>
     * `611` Ingresos por Dividendos (socios y accionistas)
    </P> * <P>
     * `612` Personas Físicas con Actividades Empresariales y
     * Profesionales
    </P> * <P>
     * `614` Ingresos por intereses
    </P> * <P>
     * `616` Sin obligaciones fiscales
    </P> * <P>
     * `620` Sociedades Cooperativas de Producción que optan por
     * diferir sus ingresos
    </P> * <P>
     * `621` Incorporación Fiscal
    </P> * <P>
     * `622` Actividades Agrícolas, Ganaderas, Silvícolas y Pesqueras
    </P> * <P>
     * `623` Opcional para Grupos de Sociedades
    </P> * <P>
     * `624` Coordinados
    </P> * <P>
     * `628` Hidrocarburos
    </P> * <P>
     * `607` Régimen de Enajenación o Adquisición de Bienes
    </P> * <P>
     * `629` De los Regímenes Fiscales Preferentes y de las Empresas
     * Multinacionales
    </P> * <P>
     * `630` Enajenación de acciones en bolsa de valores
    </P> * <P>
     * `615` Régimen de los ingresos por obtención de premios
    </P> * <P>
     * `625` Régimen de las Actividades Empresariales con ingresos a
     * través de Plataformas Tecnológicas
    </P> * <P>
     * `626` Régimen Simplificado de Confianza
    </P> */
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
