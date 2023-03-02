package com.example.models

import kotlinx.serialization.Serializable

/** tato třída nám říká jak bude server odpovídat na drink request */
@Serializable
data class DrinkApiResponse(
    val success: Boolean,
    val message: String? = null,
    val prevPage: Int? = null,
    val nextPage: Int? = null,
    val drinks: List<Drink> = emptyList(),
    val lastUpdated: Long? = null
)