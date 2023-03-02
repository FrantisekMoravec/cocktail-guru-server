package com.example.plugins

import com.example.routes.*
import io.ktor.server.application.*
import io.ktor.server.http.content.*
import io.ktor.server.routing.*

/** tato metoda nám říká kam se můžeme dostat */
fun Application.configureRouting() {
    routing {
        root()

        getAllDrinks()
        searchDrinks()

        getAllIngredients()
        searchIngredients()

        static("/images/drinks") {
            resources("/images/drinks")
        }

        static("/images/ingredients") {
            resources("/images/ingredients")
        }
    }
}
