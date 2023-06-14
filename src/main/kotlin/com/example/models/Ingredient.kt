package com.example.models

import kotlinx.serialization.Serializable

/** tato třída definuje objekt ingredience */
@Serializable
data class Ingredient(
    val id: Int,
    val name: String,
    val image: String,
    val description: String,
    val searchable: Boolean,
    val madeByUser: Boolean
)