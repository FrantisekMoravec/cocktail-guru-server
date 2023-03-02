package com.example.routes

import io.ktor.server.application.*
import io.ktor.http.*
import io.ktor.server.response.*
import io.ktor.server.routing.*

//TODO změnit message
/** pokud se někdo manuálně rozhodne zadat root adresu serveru tak mu server odpoví že se dostal na adresu této rest api */
fun Route.root() {
    get("/"){
        call.respond(
            message = "DrinkApp API",
            status = HttpStatusCode.OK
        )
    }
}