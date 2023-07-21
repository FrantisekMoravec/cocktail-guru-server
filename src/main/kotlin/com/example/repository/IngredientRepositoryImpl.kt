package com.example.repository

import com.example.models.Ingredient
import com.example.models.IngredientApiResponse

/** tato třída slouží k zadání hodnot do repozitáře */

const val NEXT_PAGE_INGREDIENT_KEY = "nextPage"
const val PREVIOUS_PAGE_INGREDIENT_KEY = "prevPage"

class IngredientRepositoryImpl : IngredientRepository {

    override val ingredients: Map<Int, List<Ingredient>> by lazy {
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
            14 to page14,
            15 to page15,
            16 to page16,
            17 to page17,
            18 to page18,
            19 to page19,
            20 to page20
        )
    }

    /** zde jsou zadány parametry ingrediencí */
    override val page1 = listOf(
        Ingredient(
            id = 1,
            name = "Kahlúa",
            ingredientFamily = "Kahlúa"
        ),
        Ingredient(
            id = 2,
            name = "Baileys",
            ingredientFamily = "Baileys"
        ),
        Ingredient(
            id = 3,
            name = "Absinth",
            ingredientFamily = "Absinth"
        )
    )

    override val page2 = listOf(
        Ingredient(
            id = 4,
            name = "Vodka",
            ingredientFamily = "Vodka"
        ),
        Ingredient(
            id = 5,
            name = "Curaçao",
            ingredientFamily = "Curaçao"
        ),
        Ingredient(
            id = 6,
            name = "Tmavý rum",
            ingredientFamily = "Rum"
        )
    )

    override val page3 = listOf(
        Ingredient(
            id = 7,
            name = "Světlý rum",
            ingredientFamily = "Rum"
        ),
        Ingredient(
            id = 8,
            name = "Zlatý rum",
            ingredientFamily = "Rum"
        ),
        Ingredient(
            id = 9,
            name = "Grenadina",
            ingredientFamily = "Grenadina"
        )
    )

    override val page4 = listOf(
        Ingredient(
            id = 10,
            name = "Stříbrná tequila",
            ingredientFamily = "Tequila"
        ),
        Ingredient(
            id = 11,
            name = "Tequila",
            ingredientFamily = "Tequila"
        ),
        Ingredient(
            id = 12,
            name = "Broskvový likér",
            ingredientFamily = ""
        )
    )

    override val page5 = listOf(
        Ingredient(
            id = 13,
            name = "Jablečný likér",
            ingredientFamily = ""
        ),
        Ingredient(
            id = 14,
            name = "Malinový likér",
            ingredientFamily = ""
        ),
        Ingredient(
            id = 15,
            name = "Pomerančový likér",
            ingredientFamily = ""
        )
    )

    override val page6 = listOf(
        Ingredient(
            id = 16,
            name = "Vanilkový likér",
            ingredientFamily = ""
        ),
        Ingredient(
            id = 17,
            name = "Kakaový likér",
            ingredientFamily = ""
        ),
        Ingredient(
            id = 18,
            name = "Heering Cherry",
            ingredientFamily = "Heering Cherry"
        )
    )

    override val page7 = listOf(
        Ingredient(
            id = 19,
            name = "Angostura aromatic bitter",
            ingredientFamily = ""
        ),
        Ingredient(
            id = 20,
            name = "Angostura bitters",
            ingredientFamily = ""
        ),
        Ingredient(
            id = 21,
            name = "Bénédictine",
            ingredientFamily = "Bénédictine"
        )
    )

    override val page8 = listOf(
        Ingredient(
            id = 22,
            name = "Šampaňské",
            ingredientFamily = "Šampaňské"
        ),
        Ingredient(
            id = 23,
            name = "Becherovka",
            ingredientFamily = "Becherovka"
        ),
        Ingredient(
            id = 24,
            name = "Cointreau",
            ingredientFamily = "Cointreau"
        )
    )

    override val page9 = listOf(
        Ingredient(
            id = 25,
            name = "Bílé víno",
            ingredientFamily = "Bílé víno"
        ),
        Ingredient(
            id = 26,
            name = "Červené víno",
            ingredientFamily = "Červené víno"
        ),
        Ingredient(
            id = 27,
            name = "Brandy",
            ingredientFamily = "Brandy"
        )
    )

    override val page10 = listOf(
        Ingredient(
            id = 28,
            name = "Gin",
            ingredientFamily = "Gin"
        ),
        Ingredient(
            id = 29,
            name = "Sladký červený vermut",
            ingredientFamily = "Vermut"
        ),
        Ingredient(
            id = 30,
            name = "Červený vermut",
            ingredientFamily = "Vermut"
        )
    )

    override val page11 = listOf(
        Ingredient(
            id = 31,
            name = "Suchý vermut",
            ingredientFamily = "Vermut"
        ),
        Ingredient(
            id = 32,
            name = "Bílý vermut",
            ingredientFamily = "Vermut"
        ),
        Ingredient(
            id = 33,
            name = "Sladký vermut",
            ingredientFamily = "Vermut"
        )
    )

    override val page12 = listOf(
        Ingredient(
            id = 34,
            name = "Campari",
            ingredientFamily = "Campari"
        ),
        Ingredient(
            id = 35,
            name = "Triple sec",
            ingredientFamily = "Triple sec"
        ),
        Ingredient(
            id = 36,
            name = "Whisky",
            ingredientFamily = "Whisky"
        )
    )

    override val page13 = listOf(
        Ingredient(
            id = 37,
            name = "Skotská whisky",
            ingredientFamily = "Whisky"
        ),
        Ingredient(
            id = 38,
            name = "Bourbon",
            ingredientFamily = "Bourbon"
        ),
        Ingredient(
            id = 39,
            name = "Zázvorové pivo",
            ingredientFamily = "Zázvorové pivo"
        )
    )

    override val page14 = listOf(
        Ingredient(
            id = 40,
            name = "Sekt",
            ingredientFamily = "Sekt"
        ),
        Ingredient(
            id = 41,
            name = "Drambuie",
            ingredientFamily = "Drambuie"
        ),
        Ingredient(
            id = 42,
            name = "Midori",
            ingredientFamily = "Midori"
        )
    )

    override val page15 = listOf(
        Ingredient(
            id = 43,
            name = "Galliano",
            ingredientFamily = "Galliano"
        ),
        Ingredient(
            id = 44,
            name = "Maraschino",
            ingredientFamily = "Maraschino"
        ),
        Ingredient(
            id = 45,
            name = "Zelený chartreuse",
            ingredientFamily = "Zelený chartreuse"
        )
    )

    override val page16 = listOf(
        Ingredient(
            id = 46,
            name = "Sambuca",
            ingredientFamily = "Sambuca"
        ),
        Ingredient(
            id = 47,
            name = "Advocaat",
            ingredientFamily = "Advocaat"
        ),
        Ingredient(
            id = 48,
            name = "Koňak",
            ingredientFamily = "Koňak"
        )
    )

    override val page17 = listOf(
        Ingredient(
            id = 49,
            name = "Jägermeister",
            ingredientFamily = "Jägermeister"
        ),
        Ingredient(
            id = 50,
            name = "Malibu",
            ingredientFamily = "Malibu"
        ),
        Ingredient(
            id = 51,
            name = "Johnnie Walker whisky",
            ingredientFamily = "Whisky"
        )
    )

    override val page18 = listOf(
        Ingredient(
            id = 52,
            name = "Jack Daniel's whisky",
            ingredientFamily = "Whisky"
        ),
        Ingredient(
            id = 53,
            name = "Jim Beam whisky",
            ingredientFamily = "Whisky"
        ),
        Ingredient(
            id = 54,
            name = "Sahara",
            ingredientFamily = "Sahara"
        )
    )

    override val page19 = listOf(
        Ingredient(
            id = 55,
            name = "Lillet blanc",
            ingredientFamily = "Lillet blanc"
        ),
        Ingredient(
            id = 56,
            name = "Calvados",
            ingredientFamily = "Calvados"
        ),
        Ingredient(
            id = 57,
            name = "Slivovice",
            ingredientFamily = "Slivovice"
        )
    )

    override val page20 = listOf(
        Ingredient(
            id = 58,
            name = "Amaretto",
            ingredientFamily = "Amaretto"
        ),
        Ingredient(
            id = 59,
            name = "Pivo",
            ingredientFamily = "Pivo"
        ),
        Ingredient(
            id = 60,
            name = "Led",
            ingredientFamily = ""
        )
    )

    override val page21 = listOf(
        Ingredient(
            id = 61,
            name = "Worcesterská omáčka",
            ingredientFamily = ""
        ),
        Ingredient(
            id = 62,
            name = "Tabasco",
            ingredientFamily = ""
        ),
        Ingredient(
            id = 63,
            name = "Sůl",
            ingredientFamily = ""
        )
    )

    override val page22 = listOf(
        Ingredient(
            id = 64,
            name = "Pepř",
            ingredientFamily = ""
        ),
        Ingredient(
            id = 65,
            name = "Coca cola",
            ingredientFamily = ""
        ),
        Ingredient(
            id = 66,
            name = "Třtinový cukr",
            ingredientFamily = ""
        )
    )

    override val page23 = listOf(
        Ingredient(
            id = 67,
            name = "Cukr",
            ingredientFamily = ""
        ),
        Ingredient(
            id = 68,
            name = "Mátové lístky",
            ingredientFamily = ""
        ),
        Ingredient(
            id = 69,
            name = "Perlivá voda",
            ingredientFamily = ""
        )
    )

    override val page24 = listOf(
        Ingredient(
            id = 70,
            name = "Tonic",
            ingredientFamily = ""
        ),
        Ingredient(
            id = 71,
            name = "Oliva",
            ingredientFamily = ""
        ),
        Ingredient(
            id = 72,
            name = "Káva",
            ingredientFamily = ""
        )
    )

    override val page25 = listOf(
        Ingredient(
            id = 73,
            name = "Smetana",
            ingredientFamily = ""
        ),
        Ingredient(
            id = 74,
            name = "Vanilkový extrakt",
            ingredientFamily = ""
        ),
        Ingredient(
            id = 75,
            name = "Mletý muškátový oříšek",
            ingredientFamily = ""
        )
    )

    override val page26 = listOf(
        Ingredient(
            id = 76,
            name = "Citronová limonáda",
            ingredientFamily = ""
        ),
        Ingredient(
            id = 77,
            name = "Schweppes",
            ingredientFamily = ""
        ),
        Ingredient(
            id = 78,
            name = "Kondenzované mléko",
            ingredientFamily = ""
        )
    )

    override val page27 = listOf(
        Ingredient(
            id = 79,
            name = "Kokosové mléko",
            ingredientFamily = ""
        ),
        Ingredient(
            id = 80,
            name = "Med",
            ingredientFamily = ""
        ),
        Ingredient(
            id = 81,
            name = "Chilli paprička",
            ingredientFamily = ""
        )
    )

    override val page28 = listOf(
        Ingredient(
            id = 82,
            name = "Černý pepř",
            ingredientFamily = ""
        ),
        Ingredient(
            id = 83,
            name = "Mléko",
            ingredientFamily = ""
        ),
        Ingredient(
            id = 84,
            name = "Limetka",
            ingredientFamily = ""
        )
    )

    override val page29 = listOf(
        Ingredient(
            id = 85,
            name = "Citron",
            ingredientFamily = ""
        ),
        Ingredient(
            id = 86,
            name = "Maliny",
            ingredientFamily = ""
        ),
        Ingredient(
            id = 87,
            name = "Jablko",
            ingredientFamily = ""
        )
    )

    override val page30 = listOf(
        Ingredient(
            id = 88,
            name = "Hruška",
            ingredientFamily = ""
        ),
        Ingredient(
            id = 89,
            name = "Broskev",
            ingredientFamily = ""
        ),
        Ingredient(
            id = 90,
            name = "Pomeranč",
            ingredientFamily = ""
        )
    )

    override val page31 = listOf(
        Ingredient(
            id = 91,
            name = "Borůvky",
            ingredientFamily = ""
        ),
        Ingredient(
            id = 92,
            name = "Banán",
            ingredientFamily = ""
        ),
        Ingredient(
            id = 93,
            name = "Rajčatový džus",
            ingredientFamily = ""
        )
    )

    override val page32 = listOf(
        Ingredient(
            id = 94,
            name = "Citronový džus",
            ingredientFamily = ""
        ),
        Ingredient(
            id = 95,
            name = "Pomerančový džus",
            ingredientFamily = ""
        ),
        Ingredient(
            id = 96,
            name = "Brusinkový džus",
            ingredientFamily = ""
        )
    )

    override val page33 = listOf(
        Ingredient(
            id = 97,
            name = "Ananasový džus",
            ingredientFamily = ""
        ),
        Ingredient(
            id = 98,
            name = "Grapefruitový džus",
            ingredientFamily = ""
        ),
        Ingredient(
            id = 99,
            name = "Dýňový džus",
            ingredientFamily = ""
        )
    )

    override val page34 = listOf(
        Ingredient(
            id = 100,
            name = "Borůvkový džus",
            ingredientFamily = ""
        ),
        Ingredient(
            id = 101,
            name = "Malinový džus",
            ingredientFamily = ""
        ),
        Ingredient(
            id = 102,
            name = "Šťáva z limetky",
            ingredientFamily = ""
        )
    )

    override val page35 = listOf(
        Ingredient(
            id = 103,
            name = "Šťáva z citronu",
            ingredientFamily = ""
        ),
        Ingredient(
            id = 104,
            name = "Šťáva z pomeranče",
            ingredientFamily = ""
        ),
        Ingredient(
            id = 105,
            name = "Šťáva z grapefruitu",
            ingredientFamily = ""
        )
    )

    override val page36 = listOf(
        Ingredient(
            id = 106,
            name = "Šťáva z ovoce dle vašeho výběru",
            ingredientFamily = ""
        ),
        Ingredient(
            id = 107,
            name = "Citrónová limonáda",
            ingredientFamily = ""
        ),
        Ingredient(
            id = 108,
            name = "Cukrový sirup",
            ingredientFamily = ""
        )
    )

    override val page37 = listOf(
        Ingredient(
            id = 109,
            name = "Mandlový sirup",
            ingredientFamily = ""
        ),
        Ingredient(
            id = 110,
            name = "Gomme sirup",
            ingredientFamily = ""
        ),
        Ingredient(
            id = 111,
            name = "Čokoládový sirup",
            ingredientFamily = ""
        )
    )

    override val page38 = listOf(
        Ingredient(
            id = 112,
            name = "Medový sirup",
            ingredientFamily = ""
        ),
        Ingredient(
            id = 113,
            name = "Kokosový sirup",
            ingredientFamily = ""
        ),
        Ingredient(
            id = 114,
            name = "Karamelový sirup",
            ingredientFamily = ""
        )
    )

    override val page39 = listOf(
        Ingredient(
            id = 115,
            name = "Zázvorový sirup",
            ingredientFamily = ""
        ),
        Ingredient(
            id = 116,
            name = "Crème de Cassis",
            ingredientFamily = ""
        ),
        Ingredient(
            id = 117,
            name = "Crème de menthe",
            ingredientFamily = ""
        )
    )

    override val page40 = listOf(
        Ingredient(
            id = 118,
            name = "Crème de cacao",
            ingredientFamily = ""
        ),
        Ingredient(
            id = 119,
            name = "Crème de Violette",
            ingredientFamily = ""
        ),
        Ingredient(
            id = 120,
            name = "Banánový krém",
            ingredientFamily = ""
        )
    )

    /*

        override val page21 = listOf(
        Ingredient(
            id = 61,
            name = "",
            ingredientFamily = ""
        ),
        Ingredient(
            id = 62,
            name = "",
            ingredientFamily = ""
        ),
        Ingredient(
            id = 63,
            name = "",
            ingredientFamily = ""
        )
    )

     */


    /** tato metoda říká jak má vypadat odpověď pro každou ingredienci pokud si necháváme poslat údaje o každé ingredinci */
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

    /** tato metoda spočítá jaká stránka je příští a jaká předchozí pro danou ingredienci - předchozí stránka pro první stránku
     *  musí být null a další stránka pro poslední stránku musí být také null */
    private fun calculatePage(page: Int): Map<String, Int?> {
        var prevPage: Int? = page
        var nextPage: Int? = page
        if (page in 1..19) {
            nextPage = nextPage?.plus(1)
        }
        if (page in 2..20) {
            prevPage = prevPage?.minus(1)
        }
        if (page == 1) {
            prevPage = null
        }
        if (page == 20) {
            nextPage = null
        }
        return mapOf(PREVIOUS_PAGE_INGREDIENT_KEY to prevPage, NEXT_PAGE_INGREDIENT_KEY to nextPage)
    }

    /** tato metoda říká jak má vypadat odpověď pro každou ingredienci co bude mít ve jméně text který uživatel vyhledá */
    override suspend fun searchIngredients(name: String?): IngredientApiResponse {
        return IngredientApiResponse(
            success = true,
            message = "ok",
            ingredients = findIngredients(query = name)
        )
    }

    override suspend fun searchIngredientsByIngredientFamily(ingredientFamilyName: String?): IngredientApiResponse {
        var checkedIngredientFamilyName: String = ""

        if (ingredientFamilyName != null){
            //ošetření aby špatně napsaný dotaz nevrátil všechno
            if (ingredientFamilyName[ingredientFamilyName.length - 1].toString() == separator){
                checkedIngredientFamilyName = ingredientFamilyName.dropLast(1)
            }

            if (ingredientFamilyName[0].toString() == separator){
                checkedIngredientFamilyName = ingredientFamilyName.drop(1)
            }

            if (checkedIngredientFamilyName == ""){
                checkedIngredientFamilyName = ingredientFamilyName
            }

            return IngredientApiResponse(
                success = true,
                message = "ok",
                ingredients = ingredientsByIngredientFamilyName(ingredientFamilyNames = checkedIngredientFamilyName.split(separator))
            )
        } else {
            return IngredientApiResponse(
                success = false
            )
        }
    }

    /** vyhledá ingredience které mají stejnou rodinu ingrediencí */
    private fun ingredientsByIngredientFamilyName(ingredientFamilyNames: List<String>): List<Ingredient> {
        //ingredientFamilyNames.toMutableList().replaceAll{ it.lowercase() }

        val found = mutableListOf<Ingredient>()
        return if (!ingredientFamilyNames.isNullOrEmpty()) {
            ingredients.forEach{(_, Ingredients) ->
                Ingredients.forEach{ Ingredient ->
                    if (ingredientFamilyNames.any { it.lowercase() in Ingredient.ingredientFamily.lowercase() }) {
                        found.add(Ingredient)
                    }
                }
            }
            found.toSet().toList() //tohle odstraní duplikáty
        } else {
            emptyList()
        }
    }

    /** tato metoda slouží k vyhledávání ingrediencí */
    private fun findIngredients(query: String?): List<Ingredient> {
        val found = mutableListOf<Ingredient>()
        return if (!query.isNullOrEmpty()) {
            ingredients.forEach { (_, Ingredients) ->
                Ingredients.forEach { Ingredient ->
                    if (Ingredient.name.lowercase().contains(query.lowercase())) {
                        found.add(Ingredient)
                    }
                }
            }
            found
        } else {
            emptyList()
        }
    }
}