package com.example.routes

import com.example.repository.IngredientFamilyRepository
import io.ktor.server.application.*
import io.ktor.http.*
import io.ktor.server.response.*
import io.ktor.server.routing.*
import org.koin.ktor.ext.inject

//TODO změnit cestu

/** tato metoda nám říká jak se vyhledávají ingredience
 *  server/ingredients/search?name=vod - pokud někdo vylhedá tuto adresu server mu pošle
 *  všechny drinky které mají v názvu "vod" */
fun Route.searchIngredientFamilies() {
    val ingredientFamilyRepository: IngredientFamilyRepository by inject()

    get("/ingredients/search") {
        val name = call.request.queryParameters["name"]

        val apiResponse = ingredientFamilyRepository.searchIngredientFamilies(name = name)
        call.respond(
            message = apiResponse,
            status = HttpStatusCode.OK
        )
    }
}