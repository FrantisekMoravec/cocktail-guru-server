package com.example.routes

import io.ktor.server.application.*
import io.ktor.http.*
import io.ktor.server.response.*
import io.ktor.server.routing.*

fun Route.root() {
    get("/"){
        call.respond(
            message = "DrinkApp API",
            status = HttpStatusCode.OK
        )
    }
}