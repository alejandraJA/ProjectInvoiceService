package com.project.invoice.data.repository.responses

/**
 * [<h1>Respuesta de listas</h1>]
 *
 * @author Alejandra JA -17/03/2022
 */
data class ResponseFacturapi (
    /**
     * Número de página de resultados
     */
    var page: Int = 0,
    /**
     * Número total de páginas de resultados.
     */
    var total_pages: Int = 0,
    /**
     * Número de elementos individuales en todas las páginas de resultados
     */
    var total_results: Int = 0,

    /**
     * Contiene la información del objeto según la petición.
     */
    var data: ArrayList<Any?>? = null
)