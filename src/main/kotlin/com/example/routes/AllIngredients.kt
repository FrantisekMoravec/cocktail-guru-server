package com.example.routes

import com.example.models.IngredientApiResponse
import com.example.repository.IngredientRepository
import io.ktor.http.*
import io.ktor.server.application.*
import io.ktor.server.request.*
import io.ktor.server.response.*
import io.ktor.server.routing.*
import org.koin.ktor.ext.inject

fun Route.getAllIngredients() {
    val ingredientRepository: IngredientRepository by inject()

    get("/ingredients") {
        try {
            val page = call.request.queryParameters["page"]?.toInt() ?: 1
            println("NEW PAGE: $page")
            require(page in 1..20)

            val apiResponse = ingredientRepository.getAllIngredients(page = page)
            call.respond(
                message = apiResponse,
                status = HttpStatusCode.OK
            )
        } catch (e: NumberFormatException) {
            call.respond(
                message = IngredientApiResponse(success = false, message = "Only Numbers Allowed."),
                status = HttpStatusCode.BadRequest
            )
        } catch (e: IllegalArgumentException) {
            call.respond(
                message = IngredientApiResponse(success = false, message = "ingredients not Found."),
                status = HttpStatusCode.NotFound
            )
        }

        println("URI: ${call.request.uri}")
    }
}