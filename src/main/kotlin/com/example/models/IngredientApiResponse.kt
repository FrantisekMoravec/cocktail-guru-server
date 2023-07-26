package com.example.models

import kotlinx.serialization.Serializable

@Serializable
data class IngredientApiResponse(
    val success: Boolean,
    val message: String? = null,
    val prevPage: Int? = null,
    val nextPage: Int? = null,
    val ingredients: List<Ingredient> = emptyList(),
    val lastUpdated: Long? = null
)
