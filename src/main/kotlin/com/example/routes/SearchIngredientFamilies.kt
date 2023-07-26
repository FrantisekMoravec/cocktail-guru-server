package com.example.routes

import com.example.repository.IngredientFamilyRepository
import io.ktor.http.*
import io.ktor.server.application.*
import io.ktor.server.request.*
import io.ktor.server.response.*
import io.ktor.server.routing.*
import org.koin.ktor.ext.inject

fun Route.searchIngredientFamilies() {
    val ingredientFamilyRepository: IngredientFamilyRepository by inject()

    get("/ingredients/search") {
        val name = call.request.queryParameters["name"]

        val apiResponse = ingredientFamilyRepository.searchIngredientFamilies(name = name)
        call.respond(
            message = apiResponse,
            status = HttpStatusCode.OK
        )

        println("URI: ${call.request.uri}")
    }
}