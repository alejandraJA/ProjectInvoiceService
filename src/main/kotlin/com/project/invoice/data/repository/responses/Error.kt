package com.project.invoice.data.repository.responses

/**
 * Error
 *
 * Usado en los repositorios cuando la respuesta de Facturapi es diferente de 200 o 201.
 */
data class Error(
    /**
     * Mensaje para corregir el error.
     */
    var message: String? = null
)
