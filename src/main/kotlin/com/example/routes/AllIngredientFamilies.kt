package com.example.routes

import com.example.models.IngredientApiResponse
import com.example.models.IngredientFamilyApiResponse
import com.example.repository.IngredientFamilyRepository
import com.example.repository.IngredientRepository
import io.ktor.server.application.*
import io.ktor.http.*
import io.ktor.server.response.*
import io.ktor.server.routing.*
import org.koin.ktor.ext.inject

fun Route.getAllIngredientFamilies() {
    val ingredientFamilyRepository: IngredientFamilyRepository by inject()

    get("/ingredient/families") {
        try {
            val page = call.request.queryParameters["page"]?.toInt() ?: 1
            println("NEW PAGE: $page")
            require(page in 1..13)

            val apiResponse = ingredientFamilyRepository.getAllIngredientFamilies(page = page)
            call.respond(
                message = apiResponse,
                status = HttpStatusCode.OK
            )
        } catch (e: NumberFormatException) {
            call.respond(
                message = IngredientFamilyApiResponse(success = false, message = "Only Numbers Allowed."),
                status = HttpStatusCode.BadRequest
            )
        } catch (e: IllegalArgumentException) {
            call.respond(
                message = IngredientFamilyApiResponse(success = false, message = "ingredients not Found."),
                status = HttpStatusCode.NotFound
            )
        }
    }
}