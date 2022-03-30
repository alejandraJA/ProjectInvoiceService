package com.project.invoice.data.repository.request

/**
 * [<h1>Crear organización</h1>]
 *
 * Objeto usado para crear una nueva organización.
 *
 * @author Alejandra JA - 17/03/2022
 */
data class CreateOrganizationRequest(
    /**
     * Nombre comercial de la organización.
     */
    var name: String? = null
)
