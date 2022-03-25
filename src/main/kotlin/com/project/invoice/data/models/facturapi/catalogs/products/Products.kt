package com.project.invoice.data.models.facturapi.catalogs.products

data class Products(
    var page: Int,
    var total_pages: Int,
    var total_results: Int,
    var data: ArrayList<Datum>,
)
