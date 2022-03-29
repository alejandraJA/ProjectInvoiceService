package com.project.invoice.data.models.facturapi.product

import com.project.invoice.data.models.facturapi.invoice.LineItem

/**
 * [<H1>Producto</H1>]
 *
 * @version 17/03/2022
 * @author Alejandra JA
 * @see [LineItem]
 */
data class Product (
    /** ID del producto.  */
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
     * Descripción del bien o servicio como aparecerá en la factura.
     */
    var description: String? = null,

    /**
     * Clave de producto/servicio, del catálogo del SAT.
     *
     * Nosotros te proporcionamos una manera más conveniente
     * de encontrarlo utilizando nuestra herramienta de
     * búsqueda de claves.
     *
     * @see <a href="https://www.facturapi.io/dashboard/tools/keys">Keys</a>
     */
    var product_key: Int = 0,

    /**
     * Precio por unidad del bien o servicio.
     *
     * Este valor representará el precio con
     * IVA incluído o sin él, dependiendo del valor de
     * [.tax_included].
     */
    var price: Double = 0.0,

    /**
     * Impuestos incluidos.
     *
     * Su valor puede ser:
     * - `true`: Indica que todos los impuestos aplicables
     * están incluídos en el precio (atributo price) y se
     * desglosarán automáticamente al emitir la factura.
     * [<P>]
     * - `false`: Indica que el atributo price no incluye
     * impuestos, por lo que aquellos impuestos a aplicar
     * se sumarán en el precio final.
     * */
    var tax_included: Boolean = false,

    /**
     * [<H2>Objeto de impuestos.</H2>]
     *
     * Código que representa si el bien o servicio es objeto de impuesto o no. Este
     * atributo corresponde al campo "ObjetoImp" en el CFDI.
     *
     * Su valor puede ser:
     * - `01`: No objeto de impuesto.
     * - `02`: Sí objeto de impuesto.
     * - `03`: Sí objeto de impuesto, pero no obligado a desglose.
     *
     * Default
     * - `01` si el array [.taxes] está vacío
     * - `02` si el array [.taxes] tiene por lo menos un elemento.
     */
    var taxability: String? = null,

    /**
     * Impuestos
     *
     * Lista de impuestos que deberán aplicarse a este producto.
     *
     * - Si el parámetro se omite o es nulo, se guardará con un elemento que
     * representa el `IVA trasladado 16%`, que es el impuesto más
     * común.
     * - En caso de mandar explícitamente un arreglo vacío, se entiende que
     * el producto **está exento de impuestos**.
     * @see Tax
     */
    var taxes: ArrayList<Tax?>? = null,

    /**
     * Impuestos locales
     *
     * Arreglo de impuestos locales (estatales o municipales), en caso de haberlos.
     *
     * @see LocalTax
     */
    var local_taxes: ArrayList<LocalTax?>? = null,

    /**
     * Clave de unidad de medida, del catálogo del SAT.
     *
     * El valor por default `H87` (elemento) es la clave para representar una
     * pieza o unidad de venta (lápiz, cuaderno, televisión, etc).
     *
     * Si la unidad de tu producto es kilogramos, litros, horas u otra unidad,
     * puedes encontrar la clave utilizando nuestra herramienta de búsqueda de
     * claves.
     *
     * @see <a href="https://www.facturapi.io/dashboard/tools/keys">Keys</a>
    </P> */
    var unit_key: String? = null,

    /**
     * Unidad de medida
     *
     * Palabra que representa la unidad de medida de tu producto. Debe estar
     * relacionada con la clave de unidad [.unit_key].
     */
    var unit_name: String? = null,

    /**
     * Identificador de uso interno designado por la empresa. Puede tener cualquier
     * valor.
     */
    var sku: String? = null,
)