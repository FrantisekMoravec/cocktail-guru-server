package com.example.routes

import io.ktor.server.application.*
import io.ktor.http.*
import io.ktor.server.response.*
import io.ktor.server.routing.*

/** pokud se někdo manuálně rozhodne zadat root adresu serveru tak mu server řekne kam se dostal */
fun Route.root() {
    get("/"){
        call.respond(
            message = "DrinkApp server root",
            status = HttpStatusCode.OK
        )
    }
}