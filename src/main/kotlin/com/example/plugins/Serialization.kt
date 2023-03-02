package com.example.plugins

import io.ktor.server.application.*
import io.ktor.server.plugins.contentnegotiation.*
import io.ktor.serialization.kotlinx.json.*

/** tato metoda nám díky anotaci Serializable převede data do json formátu než je odešle */
fun Application.configureSerialization() {
    install(ContentNegotiation) {
        json()
    }
}
