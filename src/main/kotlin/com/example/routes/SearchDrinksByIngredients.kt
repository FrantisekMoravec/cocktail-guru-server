package com.example.routes

import com.example.repository.DrinkRepository
import com.example.repository.IngredientRepository
import com.example.repository.separator
import io.ktor.http.*
import io.ktor.server.application.*
import io.ktor.server.request.*
import io.ktor.server.response.*
import io.ktor.server.routing.*
import org.koin.ktor.ext.inject

fun Route.searchDrinksByIngredients() {
    val ingredientRepository: IngredientRepository by inject()
    val drinkRepository: DrinkRepository by inject()
    
    get("/ingredients/byingredientfamily") {
        val ingredientFamilyName = call.request.queryParameters["ingredientFamilyName"]
        
        val apiResponse = ingredientRepository.searchIngredientsByIngredientFamily(ingredientFamilyName = ingredientFamilyName)

        val ingredientList = mutableListOf<String>()
        apiResponse.ingredients.map { ingredient ->  ingredientList.add(ingredient.name.lowercase()) }

        val stringBuilder = StringBuilder()

        for (item in ingredientList){
            stringBuilder.append(item).append(separator)
        }
        stringBuilder.setLength(stringBuilder.length - separator.length)

        val ingredients = stringBuilder.toString()

        val apiResponse2 = drinkRepository.searchDrinksByIngredientNames(ingredients = ingredients)
        call.respond(
            message = apiResponse2,
            status = HttpStatusCode.OK
        )

        println("URI: ${call.request.uri}")
        println("apiResponse: ${apiResponse2.drinks.map { drink -> drink.name }}")
    }
}