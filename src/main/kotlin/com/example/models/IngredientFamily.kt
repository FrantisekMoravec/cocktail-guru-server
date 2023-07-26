package com.example.models

import kotlinx.serialization.Serializable
@Serializable
data class IngredientFamily(
    val id: Int,
    val name: String,
    val description: String,
    val image: String
)