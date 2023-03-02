package com.example.routes

import com.example.models.IngredientApiResponse
import com.example.repository.IngredientRepository
import io.ktor.server.application.*
import io.ktor.http.*
import io.ktor.server.response.*
import io.ktor.server.routing.*
import org.koin.ktor.ext.inject

/** tato metoda nám říká co pošle uživateli který zadá adresu server/ingredients - pošle první stránku ingrediencí
 *  server/ingredients/page=2 - pošle druhou stránku a tak to jde dále dokud nám nedojdou stránky */
fun Route.getAllIngredients() {
    val ingredientRepository: IngredientRepository by inject()

    get("/ingredients") {
        try {
            val page = call.request.queryParameters["page"]?.toInt() ?: 1
            println("NEW PAGE: $page")
            require(page in 1..5)

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
    }
}