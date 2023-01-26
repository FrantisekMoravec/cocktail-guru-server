package com.example.repository

import com.example.models.ApiResponse
import com.example.models.Ingredient

interface IngredientRepository {

    val ingredients: Map<Int, List<Ingredient>>

    val page1: List<Ingredient>
    val page2: List<Ingredient>
    val page3: List<Ingredient>
    val page4: List<Ingredient>
    val page5: List<Ingredient>

    suspend fun getAllIngredients(page: Int = 1): ApiResponse
    suspend fun searchIngredients(name: String?): ApiResponse

}