package com.example.models

import kotlinx.serialization.Serializable

@Serializable
data class DrinkApiResponse(
    val success: Boolean,
    val message: String? = null,
    val prevPage: Int? = null,
    val nextPage: Int? = null,
    val drinks: List<Drink> = emptyList(),
    val drinksOnServer: Int? = null,
    val lastUpdated: Long? = null
)