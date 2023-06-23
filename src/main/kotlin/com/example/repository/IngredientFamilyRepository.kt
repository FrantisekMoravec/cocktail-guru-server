package com.example.repository

import com.example.models.IngredientFamily
import com.example.models.IngredientFamilyApiResponse

interface IngredientFamilyRepository {

    val ingredientFamilies: Map<Int, List<IngredientFamily>>

    val page1: List<IngredientFamily>
    val page2: List<IngredientFamily>
    val page3: List<IngredientFamily>
    val page4: List<IngredientFamily>
    val page5: List<IngredientFamily>

    val page6: List<IngredientFamily>
    val page7: List<IngredientFamily>
    val page8: List<IngredientFamily>
    val page9: List<IngredientFamily>
    val page10: List<IngredientFamily>

    val page11: List<IngredientFamily>
    val page12: List<IngredientFamily>
    val page13: List<IngredientFamily>

    suspend fun getAllIngredientFamilies(page: Int = 1): IngredientFamilyApiResponse
    suspend fun searchIngredientFamilies(name: String?): IngredientFamilyApiResponse
}