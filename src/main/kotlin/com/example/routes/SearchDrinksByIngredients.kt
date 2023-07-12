package com.example.routes

import com.example.repository.DrinkRepository
import io.ktor.server.routing.*
import org.koin.ktor.ext.inject
import io.ktor.http.*
import io.ktor.server.application.*
import io.ktor.server.response.*

fun Route.searchDrinksByIngredients() {
    val drinkRepository: DrinkRepository by inject()

    get("/drinks/byingredients") {
        val ingredients = call.request.queryParameters["ingredients"]

        val apiResponse = drinkRepository.searchDrinksByIngredientNames(ingredients = ingredients)
        call.respond(
            message = apiResponse,
            status = HttpStatusCode.OK
        )
    }
}