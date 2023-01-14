package com.example.routes

import com.example.repository.DrinkRepository
import io.ktor.server.application.*
import io.ktor.http.*
import io.ktor.server.response.*
import io.ktor.server.routing.*
import org.koin.ktor.ext.inject

fun Route.searchDrinks() {
    val drinkRepository: DrinkRepository by inject()

    get("/drinks/search") {
        val name = call.request.queryParameters["name"]

        val apiResponse = drinkRepository.searchDrinks(name = name)
        call.respond(
            message = apiResponse,
            status = HttpStatusCode.OK
        )
    }
}