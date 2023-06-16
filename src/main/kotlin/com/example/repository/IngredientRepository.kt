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
    val page6: List<Ingredient>
    val page7: List<Ingredient>
    val page8: List<Ingredient>
    val page9: List<Ingredient>
    val page10: List<Ingredient>
    val page11: List<Ingredient>
    val page12: List<Ingredient>
    val page13: List<Ingredient>
    val page14: List<Ingredient>
    val page15: List<Ingredient>
    val page16: List<Ingredient>
    val page17: List<Ingredient>
    val page18: List<Ingredient>
    val page19: List<Ingredient>
    val page20: List<Ingredient>
    val page21: List<Ingredient>
    val page22: List<Ingredient>
    val page23: List<Ingredient>
    val page24: List<Ingredient>
    val page25: List<Ingredient>
    val page26: List<Ingredient>
    val page27: List<Ingredient>
    val page28: List<Ingredient>
    val page29: List<Ingredient>
    val page30: List<Ingredient>
    val page31: List<Ingredient>
    val page32: List<Ingredient>
    val page33: List<Ingredient>
    val page34: List<Ingredient>
    val page35: List<Ingredient>
    val page36: List<Ingredient>
    val page37: List<Ingredient>
    val page38: List<Ingredient>
    val page39: List<Ingredient>
    val page40: List<Ingredient>

    suspend fun getAllIngredients(page: Int = 1): IngredientApiResponse
    suspend fun searchIngredients(name: String?): IngredientApiResponse

}