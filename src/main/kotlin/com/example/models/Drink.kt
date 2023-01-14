package com.example.models

import kotlinx.serialization.Serializable

@Serializable
data class Drink(
    val id: Int,
    val name: String,
    val image: String,
    val description: String,
    val rating: Double,
    val ingredients: List<String>,
    val tutorial: String
)
