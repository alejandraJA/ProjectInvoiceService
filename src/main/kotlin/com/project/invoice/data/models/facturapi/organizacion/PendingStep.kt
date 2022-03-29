package com.project.invoice.data.models.facturapi.organizacion

/**
 * [<H1>Pasos pendientes</H1>]
 * Lista de pasos que se necesitan completar para que esta organización pueda
 * emitir facturas válidas en ambiente Live.
 *
 * @author Alejandra JA - 17/03/2022
 * @see Organizacion
 */
data class PendingStep (
    /**
     * Código que representa el tipo de paso que se requiere completar.
     *
     * Su valor puede ser `legal`, `logo` y `certificate`.
    </P> */
    var type: String,

    /**
     * Texto que describe el paso que se requiere completar y que puedes usar para
     * mostrárselo al usuario.
     */
    var description: String,
)