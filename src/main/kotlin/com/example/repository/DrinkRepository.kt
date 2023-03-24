package com.example.repository

import com.example.models.DrinkApiResponse
import com.example.models.Drink

/** repozitář drinků - sem se ukládají drinky */
interface DrinkRepository {

    /** každý drink má přiřazené pořadové číslo */
    val drinks: Map<Int, List<Drink>>
    //TODO přidat stránky
    val page1: List<Drink>
    val page2: List<Drink>
    val page3: List<Drink>
    val page4: List<Drink>
    val page5: List<Drink>
    val page6: List<Drink>
    val page7: List<Drink>
    val page8: List<Drink>
    val page9: List<Drink>
    val page10: List<Drink>

    val page11: List<Drink>
    val page12: List<Drink>
    val page13: List<Drink>
    val page14: List<Drink>
    /*
    val page15: List<Drink>
    val page16: List<Drink>
    val page17: List<Drink>
    val page18: List<Drink>
    val page19: List<Drink>
    val page20: List<Drink>

     */
/*
    val page21: List<Drink>
    val page22: List<Drink>
    val page23: List<Drink>
    val page24: List<Drink>
    val page25: List<Drink>
    val page26: List<Drink>
    val page27: List<Drink>
    val page28: List<Drink>
    val page29: List<Drink>
    val page30: List<Drink>

    val page31: List<Drink>
    val page32: List<Drink>
    val page33: List<Drink>
    val page34: List<Drink>
*/
    suspend fun getAllDrinks(page: Int = 1): DrinkApiResponse
    suspend fun searchDrinks(name: String?): DrinkApiResponse

}