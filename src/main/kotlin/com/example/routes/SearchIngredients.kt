package com.example.routes

import com.example.repository.IngredientRepository
import io.ktor.server.application.*
import io.ktor.http.*
import io.ktor.server.response.*
import io.ktor.server.routing.*
import org.koin.ktor.ext.inject

fun Route.searchIngredients() {
    val ingredientRepository: IngredientRepository by inject()

    get("/ingredients/search") {
        val name = call.request.queryParameters["name"]

        val apiResponse = ingredientRepository.searchIngredients(name = name)
        call.respond(
            message = apiResponse,
            status = HttpStatusCode.OK
        )
    }
}