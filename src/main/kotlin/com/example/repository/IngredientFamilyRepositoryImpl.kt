package com.example.repository

import com.example.models.Ingredient
import com.example.models.IngredientApiResponse
import com.example.models.IngredientFamily
import com.example.models.IngredientFamilyApiResponse

private const val imagePath = "/images/ingredients/"

class IngredientFamilyRepositoryImpl : IngredientFamilyRepository {

    override val ingredientFamilies: Map<Int, List<IngredientFamily>> by lazy {
        mapOf(
            1 to page1,
            2 to page2,
            3 to page3,
            4 to page4,
            5 to page5,
            6 to page6,
            7 to page7,
            8 to page8,
            9 to page9,
            10 to page10,
            11 to page11,
            12 to page12,
            13 to page13,
            14 to page14
        )
    }

    override val page1 = listOf(
        IngredientFamily(
            //IngredientFamily pro ingredience které IngredientFamily nemají
            id = 1,
            name = "",
            description = "",
            image = ""
        ),
        IngredientFamily(
            id = 2,
            name = "Kahlúa",
            description = "",
            image = imagePath + ""
        ),
        IngredientFamily(
            id = 3,
            name = "Baileys",
            description = "",
            image = imagePath + ""
        )
    )

    override val page2 = listOf(
        IngredientFamily(
            id = 4,
            name = "Absinth",
            description = "",
            image = ""
        ),
        IngredientFamily(
            id = 5,
            name = "Vodka",
            description = "",
            image = imagePath + ""
        ),
        IngredientFamily(
            id = 6,
            name = "Curaçao",
            description = "",
            image = imagePath + ""
        )
    )

    override val page3 = listOf(
        IngredientFamily(
            id = 7,
            name = "Rum",
            description = "",
            image = ""
        ),
        IngredientFamily(
            id = 8,
            name = "Grenadina",
            description = "",
            image = imagePath + ""
        ),
        IngredientFamily(
            id = 9,
            name = "Tequila",
            description = "",
            image = imagePath + ""
        )
    )

    override val page4 = listOf(
        IngredientFamily(
            id = 10,
            name = "Heering Cherry",
            description = "",
            image = ""
        ),
        IngredientFamily(
            id = 11,
            name = "Bénédictine",
            description = "",
            image = imagePath + ""
        ),
        IngredientFamily(
            id = 12,
            name = "Šampaňské",
            description = "",
            image = imagePath + ""
        )
    )

    override val page5 = listOf(
        IngredientFamily(
            id = 13,
            name = "Becherovka",
            description = "",
            image = ""
        ),
        IngredientFamily(
            id = 14,
            name = "Cointreau",
            description = "",
            image = imagePath + ""
        ),
        IngredientFamily(
            id = 15,
            name = "Bílé víno",
            description = "",
            image = imagePath + ""
        )
    )

    override val page6 = listOf(
        IngredientFamily(
            id = 16,
            name = "Červené víno",
            description = "",
            image = ""
        ),
        IngredientFamily(
            id = 17,
            name = "Brandy",
            description = "",
            image = imagePath + ""
        ),
        IngredientFamily(
            id = 18,
            name = "Gin",
            description = "",
            image = imagePath + ""
        )
    )

    override val page7 = listOf(
        IngredientFamily(
            id = 19,
            name = "Vermut",
            description = "",
            image = ""
        ),
        IngredientFamily(
            id = 20,
            name = "Campari",
            description = "",
            image = imagePath + ""
        ),
        IngredientFamily(
            id = 21,
            name = "Triple sec",
            description = "",
            image = imagePath + ""
        )
    )

    override val page8 = listOf(
        IngredientFamily(
            id = 22,
            name = "Whisky",
            description = "",
            image = ""
        ),
        IngredientFamily(
            id = 23,
            name = "Bourbon",
            description = "",
            image = imagePath + ""
        ),
        IngredientFamily(
            id = 24,
            name = "Zázvorové pivo",
            description = "",
            image = imagePath + ""
        )
    )

    override val page9 = listOf(
        IngredientFamily(
            id = 25,
            name = "Sekt",
            description = "",
            image = ""
        ),
        IngredientFamily(
            id = 26,
            name = "Drambuie",
            description = "",
            image = imagePath + ""
        ),
        IngredientFamily(
            id = 27,
            name = "Midori",
            description = "",
            image = imagePath + ""
        )
    )

    override val page10 = listOf(
        IngredientFamily(
            id = 28,
            name = "Galliano",
            description = "",
            image = ""
        ),
        IngredientFamily(
            id = 29,
            name = "Maraschino",
            description = "",
            image = imagePath + ""
        ),
        IngredientFamily(
            id = 30,
            name = "Zelený chartreuse",
            description = "",
            image = imagePath + ""
        )
    )

    override val page11 = listOf(
        IngredientFamily(
            id = 31,
            name = "Sambuca",
            description = "",
            image = ""
        ),
        IngredientFamily(
            id = 32,
            name = "Advocaat",
            description = "",
            image = imagePath + ""
        ),
        IngredientFamily(
            id = 33,
            name = "Koňak",
            description = "",
            image = imagePath + ""
        )
    )

    override val page12 = listOf(
        IngredientFamily(
            id = 34,
            name = "Jägermeister",
            description = "",
            image = ""
        ),
        IngredientFamily(
            id = 35,
            name = "Malibu",
            description = "",
            image = imagePath + ""
        ),
        IngredientFamily(
            id = 36,
            name = "Sahara",
            description = "",
            image = imagePath + ""
        )
    )

    override val page13 = listOf(
        IngredientFamily(
            id = 37,
            name = "Lillet blanc",
            description = "",
            image = ""
        ),
        IngredientFamily(
            id = 38,
            name = "Calvados",
            description = "",
            image = imagePath + ""
        ),
        IngredientFamily(
            id = 39,
            name = "Slivovice",
            description = "",
            image = imagePath + ""
        )
    )

    override val page14 = listOf(
        IngredientFamily(
            id = 40,
            name = "Amaretto",
            description = "",
            image = ""
        ),
        IngredientFamily(
            id = 41,
            name = "Pivo",
            description = "",
            image = imagePath + ""
        ),
        IngredientFamily(
            //IngredientFamilies došly
            id = 42,
            name = "",
            description = "",
            image = imagePath + ""
        )
    )

    override suspend fun getAllIngredientFamilies(page: Int): IngredientFamilyApiResponse {
        return IngredientFamilyApiResponse(
            success = true,
            message = "ok",
            prevPage = calculatePage(page = page)[PREVIOUS_PAGE_INGREDIENT_KEY],
            nextPage = calculatePage(page = page)[NEXT_PAGE_INGREDIENT_KEY],
            ingredientFamilies = ingredientFamilies[page]!!,
            lastUpdated = System.currentTimeMillis()
        )
    }

    private fun calculatePage(page: Int): Map<String, Int?> {
        var prevPage: Int? = page
        var nextPage: Int? = page
        if (page in 1..13) {
            nextPage = nextPage?.plus(1)
        }
        if (page in 2..14) {
            prevPage = prevPage?.minus(1)
        }
        if (page == 1) {
            prevPage = null
        }
        if (page == 14) {
            nextPage = null
        }
        return mapOf(PREVIOUS_PAGE_INGREDIENT_KEY to prevPage, NEXT_PAGE_INGREDIENT_KEY to nextPage)
    }

    override suspend fun searchIngredientFamilies(name: String?): IngredientFamilyApiResponse {
        return IngredientFamilyApiResponse(
            success = true,
            message = "ok",
            ingredientFamilies = findIngredientFamilies(query = name)
        )
    }

    private fun findIngredientFamilies(query: String?): List<IngredientFamily> {
        val founded = mutableListOf<IngredientFamily>()
        return if (!query.isNullOrEmpty()) {
            ingredientFamilies.forEach { (_, ingFam) ->
                ingFam.forEach { ingredientFamily ->
                    if (ingredientFamily.name.lowercase().contains(query.lowercase())) {
                        founded.add(ingredientFamily)
                    }
                }
            }
            founded
        } else {
            emptyList()
        }
    }
}