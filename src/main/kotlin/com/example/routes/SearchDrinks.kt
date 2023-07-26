package com.example.routes

import com.example.repository.DrinkRepository
import io.ktor.http.*
import io.ktor.server.application.*
import io.ktor.server.request.*
import io.ktor.server.response.*
import io.ktor.server.routing.*
import org.koin.ktor.ext.inject

fun Route.searchDrinks() {
    val drinkRepository: DrinkRepository by inject()

    get("/drinks/search") {
        val name = call.request.queryParameters["name"]

        val apiResponses = drinkRepository.searchDrinks(name = name)

        println("počet stránek: ${apiResponses.size}")

        call.respond(
            message = apiResponses,
            status = HttpStatusCode.OK
        )

        println("URI: ${call.request.uri}")
    }
}