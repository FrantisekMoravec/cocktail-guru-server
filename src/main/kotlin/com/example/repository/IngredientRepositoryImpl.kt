package com.example.repository

import com.example.models.Ingredient
import com.example.models.IngredientApiResponse

const val NEXT_PAGE_INGREDIENT_KEY = "nextPage"
const val PREVIOUS_PAGE_INGREDIENT_KEY = "prevPage"

class IngredientRepositoryImpl : IngredientRepository {

    override val ingredients: Map<Int, List<Ingredient>> by lazy {
        mapOf(
            1 to page1,
            2 to page2,
            3 to page3,
            4 to page4,
            5 to page5
        )
    }

    override val page1 = listOf(
        Ingredient(
            id = 1,
            name = "Vodka",
            image = "/images/ingredients/vodka.jpg",
            description = "Vodka je tvrdý bezbarvý alkoholický nápoj oblíbený po celém světě. Kvalita a chuť vodky se mohou lišit vlivem různých faktorů. Jedná se o to, že tento alkoholický nápoj se vyrábí z obilí, jehož specifické složení určuje výrobce. Některé druhy namísto obilí obsahují destilaci z brambor."
        ),
        Ingredient(
            id = 2,
            name = "Absint",
            image = "/images/ingredients/absint.jpg",
            description = "Absinth je tradičně destilovaný nápoj s vysokým podílem alkoholu (45%-75% ). Jeho charakteristická zelená barva mu vysloužila přezdívku „zelená víla“, i když může být i jinak zbarvený."
        ),
        Ingredient(
            id = 3,
            name = "Baileys",
            image = "/images/ingredients/vodka.jpg",
            description = "Vodka je tvrdý bezbarvý alkoholický nápoj oblíbený po celém světě. Kvalita a chuť vodky se mohou lišit vlivem různých faktorů. Jedná se o to, že tento alkoholický nápoj se vyrábí z obilí, jehož specifické složení určuje výrobce. Některé druhy namísto obilí obsahují destilaci z brambor."
        )
    )

    override val page2 = listOf(
        Ingredient(
            id = 4,
            name = "Vodka",
            image = "/images/ingredients/vodka.jpg",
            description = "Vodka je tvrdý bezbarvý alkoholický nápoj oblíbený po celém světě. Kvalita a chuť vodky se mohou lišit vlivem různých faktorů. Jedná se o to, že tento alkoholický nápoj se vyrábí z obilí, jehož specifické složení určuje výrobce. Některé druhy namísto obilí obsahují destilaci z brambor."
        ),
        Ingredient(
            id = 5,
            name = "Absint",
            image = "/images/ingredients/absint.jpg",
            description = "Absinth je tradičně destilovaný nápoj s vysokým podílem alkoholu (45%-75% ). Jeho charakteristická zelená barva mu vysloužila přezdívku „zelená víla“, i když může být i jinak zbarvený."
        ),
        Ingredient(
            id = 6,
            name = "Baileys",
            image = "/images/ingredients/vodka.jpg",
            description = "Vodka je tvrdý bezbarvý alkoholický nápoj oblíbený po celém světě. Kvalita a chuť vodky se mohou lišit vlivem různých faktorů. Jedná se o to, že tento alkoholický nápoj se vyrábí z obilí, jehož specifické složení určuje výrobce. Některé druhy namísto obilí obsahují destilaci z brambor."
        )
    )

    override val page3 = listOf(
        Ingredient(
            id = 7,
            name = "Vodka",
            image = "/images/ingredients/vodka.jpg",
            description = "Vodka je tvrdý bezbarvý alkoholický nápoj oblíbený po celém světě. Kvalita a chuť vodky se mohou lišit vlivem různých faktorů. Jedná se o to, že tento alkoholický nápoj se vyrábí z obilí, jehož specifické složení určuje výrobce. Některé druhy namísto obilí obsahují destilaci z brambor."
        ),
        Ingredient(
            id = 8,
            name = "Absint",
            image = "/images/ingredients/absint.jpg",
            description = "Absinth je tradičně destilovaný nápoj s vysokým podílem alkoholu (45%-75% ). Jeho charakteristická zelená barva mu vysloužila přezdívku „zelená víla“, i když může být i jinak zbarvený."
        ),
        Ingredient(
            id = 9,
            name = "Baileys",
            image = "/images/ingredients/vodka.jpg",
            description = "Vodka je tvrdý bezbarvý alkoholický nápoj oblíbený po celém světě. Kvalita a chuť vodky se mohou lišit vlivem různých faktorů. Jedná se o to, že tento alkoholický nápoj se vyrábí z obilí, jehož specifické složení určuje výrobce. Některé druhy namísto obilí obsahují destilaci z brambor."
        )
    )

    override val page4 = listOf(
        Ingredient(
            id = 10,
            name = "Vodka",
            image = "/images/ingredients/vodka.jpg",
            description = "Vodka je tvrdý bezbarvý alkoholický nápoj oblíbený po celém světě. Kvalita a chuť vodky se mohou lišit vlivem různých faktorů. Jedná se o to, že tento alkoholický nápoj se vyrábí z obilí, jehož specifické složení určuje výrobce. Některé druhy namísto obilí obsahují destilaci z brambor."
        ),
        Ingredient(
            id = 11,
            name = "Absint",
            image = "/images/ingredients/absint.jpg",
            description = "Absinth je tradičně destilovaný nápoj s vysokým podílem alkoholu (45%-75% ). Jeho charakteristická zelená barva mu vysloužila přezdívku „zelená víla“, i když může být i jinak zbarvený."
        ),
        Ingredient(
            id = 12,
            name = "Baileys",
            image = "/images/ingredients/vodka.jpg",
            description = "Vodka je tvrdý bezbarvý alkoholický nápoj oblíbený po celém světě. Kvalita a chuť vodky se mohou lišit vlivem různých faktorů. Jedná se o to, že tento alkoholický nápoj se vyrábí z obilí, jehož specifické složení určuje výrobce. Některé druhy namísto obilí obsahují destilaci z brambor."
        )
    )

    override val page5 = listOf(
        Ingredient(
            id = 13,
            name = "Vodka",
            image = "/images/ingredients/vodka.jpg",
            description = "Vodka je tvrdý bezbarvý alkoholický nápoj oblíbený po celém světě. Kvalita a chuť vodky se mohou lišit vlivem různých faktorů. Jedná se o to, že tento alkoholický nápoj se vyrábí z obilí, jehož specifické složení určuje výrobce. Některé druhy namísto obilí obsahují destilaci z brambor."
        ),
        Ingredient(
            id = 14,
            name = "Absint",
            image = "/images/ingredients/absint.jpg",
            description = "Absinth je tradičně destilovaný nápoj s vysokým podílem alkoholu (45%-75% ). Jeho charakteristická zelená barva mu vysloužila přezdívku „zelená víla“, i když může být i jinak zbarvený."
        ),
        Ingredient(
            id = 15,
            name = "Baileys",
            image = "/images/ingredients/vodka.jpg",
            description = "Vodka je tvrdý bezbarvý alkoholický nápoj oblíbený po celém světě. Kvalita a chuť vodky se mohou lišit vlivem různých faktorů. Jedná se o to, že tento alkoholický nápoj se vyrábí z obilí, jehož specifické složení určuje výrobce. Některé druhy namísto obilí obsahují destilaci z brambor."
        )
    )

    override suspend fun getAllIngredients(page: Int): IngredientApiResponse {
        return IngredientApiResponse(
            success = true,
            message = "ok",
            prevPage = calculatePage(page = page)[PREVIOUS_PAGE_INGREDIENT_KEY],
            nextPage = calculatePage(page = page)[NEXT_PAGE_INGREDIENT_KEY],
            ingredients = ingredients[page]!!,
            lastUpdated = System.currentTimeMillis()
        )
    }

    private fun calculatePage(page: Int): Map<String, Int?> {
        var prevPage: Int? = page
        var nextPage: Int? = page
        if (page in 1..4) {
            nextPage = nextPage?.plus(1)
        }
        if (page in 2..5) {
            prevPage = prevPage?.minus(1)
        }
        if (page == 1) {
            prevPage = null
        }
        if (page == 5) {
            nextPage = null
        }
        return mapOf(PREVIOUS_PAGE_INGREDIENT_KEY to prevPage, NEXT_PAGE_INGREDIENT_KEY to nextPage)
    }

    override suspend fun searchIngredients(name: String?): IngredientApiResponse {
        return IngredientApiResponse(
            success = true,
            message = "ok",
            ingredients = findIngredients(query = name)
        )
    }

    private fun findIngredients(query: String?): List<Ingredient> {
        val founded = mutableListOf<Ingredient>()
        return if (!query.isNullOrEmpty()) {
            ingredients.forEach { (_, Ingredients) ->
                Ingredients.forEach { Ingredient ->
                    if (Ingredient.name.lowercase().contains(query.lowercase())) {
                        founded.add(Ingredient)
                    }
                }
            }
            founded
        } else {
            emptyList()
        }
    }
}