package com.example.models

import kotlinx.serialization.Serializable

/** tato třída nám říká jak bude server odpovídat na ingredient request */
@Serializable
data class IngredientApiResponse(
    val success: Boolean,
    val message: String? = null,
    val prevPage: Int? = null,
    val nextPage: Int? = null,
    val ingredients: List<Ingredient> = emptyList(),
    val lastUpdated: Long? = null
)
