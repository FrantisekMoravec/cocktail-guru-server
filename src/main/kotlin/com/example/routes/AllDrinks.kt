package com.example.routes

import com.example.models.DrinkApiResponse
import com.example.repository.DrinkRepository
import io.ktor.server.application.*
import io.ktor.http.*
import io.ktor.server.response.*
import io.ktor.server.routing.*
import org.koin.ktor.ext.inject

/** tato metoda nám říká co pošle uživateli který zadá adresu server/drinks - pošle první stránku drinků
 *  server/drinks/page=2 - pošle druhou stránku a tak to jde dále dokud nám nedojdou stránky */
fun Route.getAllDrinks() {
    val drinkRepository: DrinkRepository by inject()

    get("/drinks") {
        try {
            val page = call.request.queryParameters["page"]?.toInt() ?: 1
            println("NEW PAGE: $page")
            require(page in 1..34)

            val apiResponse = drinkRepository.getAllDrinks(page = page)
            call.respond(
                message = apiResponse,
                status = HttpStatusCode.OK
            )
        } catch (e: NumberFormatException) {
            call.respond(
                message = DrinkApiResponse(success = false, message = "Only Numbers Allowed."),
                status = HttpStatusCode.BadRequest
            )
        } catch (e: IllegalArgumentException) {
            call.respond(
                message = DrinkApiResponse(success = false, message = "Drinks not Found."),
                status = HttpStatusCode.NotFound
            )
        }
    }
}