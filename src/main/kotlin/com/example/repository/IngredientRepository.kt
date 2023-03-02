package com.example.repository

import com.example.models.Ingredient
import com.example.models.IngredientApiResponse

/** repozitář ingrediencí - sem se ukládají ingredience */
interface IngredientRepository {

    /** každá ingredience má přiřazené pořadové číslo */
    val ingredients: Map<Int, List<Ingredient>>

    val page1: List<Ingredient>
    val page2: List<Ingredient>
    val page3: List<Ingredient>
    val page4: List<Ingredient>
    val page5: List<Ingredient>

    suspend fun getAllIngredients(page: Int = 1): IngredientApiResponse
    suspend fun searchIngredients(name: String?): IngredientApiResponse

}