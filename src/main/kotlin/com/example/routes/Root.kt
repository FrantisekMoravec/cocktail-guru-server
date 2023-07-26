package com.example.routes

import io.ktor.http.*
import io.ktor.server.application.*
import io.ktor.server.request.*
import io.ktor.server.response.*
import io.ktor.server.routing.*

fun Route.root() {
    get("/"){
        call.respond(
            message = "DrinkApp server root",
            status = HttpStatusCode.OK
        )

        println("URI: ${call.request.uri}")
    }
}