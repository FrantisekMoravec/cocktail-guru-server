package com.example.routes

import com.example.repository.IngredientRepository
import io.ktor.http.*
import io.ktor.server.application.*
import io.ktor.server.routing.*
import org.koin.ktor.ext.inject
import io.ktor.server.response.*

fun Route.searchIngredientsByIngredientFamily() {
    val ingredientRepository: IngredientRepository by inject()
    
    get("/ingredients/byingredientfamily") {
        val ingredientFamilyName = call.request.queryParameters["ingredientFamilyName"]
        
        val apiResponse = ingredientRepository.searchIngredientsByIngredientFamily(ingredientFamilyName = ingredientFamilyName)
        call.respond(
            message = apiResponse,
            status = HttpStatusCode.OK
        )
    }
}