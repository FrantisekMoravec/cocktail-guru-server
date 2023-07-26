package com.example.models

import kotlinx.serialization.Serializable
@Serializable
data class IngredientFamilyApiResponse (
    val success: Boolean,
    val message: String? = null,
    val prevPage: Int? = null,
    val nextPage: Int? = null,
    val ingredientFamilies: List<IngredientFamily> = emptyList(),
    val lastUpdated: Long? = null
)