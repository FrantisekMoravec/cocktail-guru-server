package com.example.models

import kotlinx.serialization.Serializable

@Serializable
data class ApiResponse(
    val success: Boolean,
    val message: String? = null,
    val prevPage: Int? = null,
    val nextPage: Int? = null,
    val drinks: List<Drink> = emptyList(),
    val ingredients: List<Ingredient> = emptyList(),
    val lastUpdated: Long? = null
)