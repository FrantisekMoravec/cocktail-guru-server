package com.example.repository

import com.example.models.DrinkApiResponse
import com.example.models.Drink

interface DrinkRepository {

    val drinks: Map<Int, List<Drink>>

    val page1: List<Drink>
    val page2: List<Drink>
    val page3: List<Drink>
    val page4: List<Drink>
    val page5: List<Drink>

    suspend fun getAllDrinks(page: Int = 1): DrinkApiResponse
    suspend fun searchDrinks(name: String?): DrinkApiResponse

}