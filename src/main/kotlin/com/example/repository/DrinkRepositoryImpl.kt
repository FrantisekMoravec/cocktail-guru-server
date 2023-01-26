package com.example.repository

import com.example.models.ApiResponse
import com.example.models.Drink

const val NEXT_PAGE_DRINK_KEY = "nextPage"
const val PREVIOUS_PAGE_DRINK_KEY = "prevPage"

class DrinkRepositoryImpl : DrinkRepository {

    override val drinks: Map<Int, List<Drink>> by lazy {
        mapOf(
            1 to page1,
            2 to page2,
            3 to page3,
            4 to page4,
            5 to page5
        )
    }

    override val page1 = listOf(
        Drink(
            id = 1,
            name = "B52",
            image = "/images/drinks/b52.jpg",
            description = "B52 drink je třívrstvý míchaný nápoj nazvaný podle amerického bombardéru používaného ve válce ve Vietnamu. Zvláštností tohoto drinku je, že se podává doslova hořící.",
            rating = 5.0,
            ingredients = listOf(
                "Kahlúa (3 cl)",
                "Baileys (2 cl)",
                "Grand Marnier nebo Absinth nebo Stroh (3 cl)"
            ),
            tutorial = "Ingredience opatrně nalijte do panáku skrze kávovou lžičku, tak, aby zůstaly nepromíchané. A to přesně v tomto pořadí: 1. likér Kahlúa, 2. likér Baileys, a nakonec 3. Grand Marnier či Absinth nebo Stroh . Těsně před konzumací zapálíme zapalovačem. Podáváme s tlustým brčkem."
        ),
        Drink(
            id = 2,
            name = "Bloody Mary",
            image = "/images/drinks/bloody_mary.jpg",
            description = "Kdo by neznal krvavou Marii? Málokdo už však ví, že nápoj je pojmenován podle anglické královny Marie I. Tudorovny, která, jak už název drinku napoví, nebyla žádnou lidumilkou. Barva nápoje je krvavě červená, a po vodce, tabascu a pepři ostrá jako katova sekera.",
            rating = 4.0,
            ingredients = listOf(
                "Vodka (4,5 cl)",
                "Rajčatový džus (9 cl)",
                "Citronový džus (1,5 cl)",
                "Worcesterská omáčka",
                "Tabasco",
                "Sůl",
                "Pepř"
            ),
            tutorial = "Připravíme si sklenicí typu highball, do které nakapeme worcester, tabasco, přidáme špetku soli a pepře. Vložíme několik kostek ledu, nalijeme vodku a džusy v uvedeném množství. Nakonec vše lehce promícháme a ozdobíme plátkem citronu a stonkem celeru. Podáváme s brčkem."
        ),
        Drink(
            id = 3,
            name = "Modrá Laguna",
            image = "/images/drinks/blue_lagoon.jpg",
            description = "Lahodný alkoholický koktejl modravé barvy, který přináší osvěžení jako samotná modrá laguna na exotickém ostrově. Jeho základ tvoří kvalitní vodka.",
            rating = 3.0,
            ingredients = listOf(
                "Vodka (3 cl)",
                "Likér Curaçao (3 cl)",
                "Citrónová limonáda (12 cl)"
            ),
            tutorial = "Nalijte vodku do shakeru společně s Curaçaem a ledem. Důkladně protřepejte a přes sítko slijte do sklenice Highball Glass s ledem. Nakonec dolijte limonádou a ozdobte plátkem citrónu."
        )
    )

    override val page2 = listOf(
        Drink(
            id = 4,
            name = "B52",
            image = "/images/drinks/b52.jpg",
            description = "B52 drink je třívrstvý míchaný nápoj nazvaný podle amerického bombardéru používaného ve válce ve Vietnamu. Zvláštností tohoto drinku je, že se podává doslova hořící.",
            rating = 5.0,
            ingredients = listOf(
                "Kahlúa (3 cl)",
                "Baileys (2 cl)",
                "Grand Marnier nebo Absinth nebo Stroh (3 cl)"
            ),
            tutorial = "Ingredience opatrně nalijte do panáku skrze kávovou lžičku, tak, aby zůstaly nepromíchané. A to přesně v tomto pořadí: 1. likér Kahlúa, 2. likér Baileys, a nakonec 3. Grand Marnier či Absinth nebo Stroh . Těsně před konzumací zapálíme zapalovačem. Podáváme s tlustým brčkem."
        ),
        Drink(
            id = 5,
            name = "Bloody Mary",
            image = "/images/drinks/bloody_mary.jpg",
            description = "Kdo by neznal krvavou Marii? Málokdo už však ví, že nápoj je pojmenován podle anglické královny Marie I. Tudorovny, která, jak už název drinku napoví, nebyla žádnou lidumilkou. Barva nápoje je krvavě červená, a po vodce, tabascu a pepři ostrá jako katova sekera.",
            rating = 4.0,
            ingredients = listOf(
                "Vodka (4,5 cl)",
                "Rajčatový džus (9 cl)",
                "Citronový džus (1,5 cl)",
                "Worcesterská omáčka",
                "Tabasco",
                "Sůl",
                "Pepř"
            ),
            tutorial = "Připravíme si sklenicí typu highball, do které nakapeme worcester, tabasco, přidáme špetku soli a pepře. Vložíme několik kostek ledu, nalijeme vodku a džusy v uvedeném množství. Nakonec vše lehce promícháme a ozdobíme plátkem citronu a stonkem celeru. Podáváme s brčkem."
        ),
        Drink(
            id = 6,
            name = "Modrá Laguna",
            image = "/images/drinks/blue_lagoon.jpg",
            description = "Lahodný alkoholický koktejl modravé barvy, který přináší osvěžení jako samotná modrá laguna na exotickém ostrově. Jeho základ tvoří kvalitní vodka.",
            rating = 3.0,
            ingredients = listOf(
                "Vodka (3 cl)",
                "Likér Curaçao (3 cl)",
                "Citrónová limonáda (12 cl)"
            ),
            tutorial = "Nalijte vodku do shakeru společně s Curaçaem a ledem. Důkladně protřepejte a přes sítko slijte do sklenice Highball Glass s ledem. Nakonec dolijte limonádou a ozdobte plátkem citrónu."
        )
    )

    override val page3 = listOf(
        Drink(
            id = 7,
            name = "B52",
            image = "/images/drinks/b52.jpg",
            description = "B52 drink je třívrstvý míchaný nápoj nazvaný podle amerického bombardéru používaného ve válce ve Vietnamu. Zvláštností tohoto drinku je, že se podává doslova hořící.",
            rating = 5.0,
            ingredients = listOf(
                "Kahlúa (3 cl)",
                "Baileys (2 cl)",
                "Grand Marnier nebo Absinth nebo Stroh (3 cl)"
            ),
            tutorial = "Ingredience opatrně nalijte do panáku skrze kávovou lžičku, tak, aby zůstaly nepromíchané. A to přesně v tomto pořadí: 1. likér Kahlúa, 2. likér Baileys, a nakonec 3. Grand Marnier či Absinth nebo Stroh . Těsně před konzumací zapálíme zapalovačem. Podáváme s tlustým brčkem."
        ),
        Drink(
            id = 8,
            name = "Bloody Mary",
            image = "/images/drinks/bloody_mary.jpg",
            description = "Kdo by neznal krvavou Marii? Málokdo už však ví, že nápoj je pojmenován podle anglické královny Marie I. Tudorovny, která, jak už název drinku napoví, nebyla žádnou lidumilkou. Barva nápoje je krvavě červená, a po vodce, tabascu a pepři ostrá jako katova sekera.",
            rating = 4.0,
            ingredients = listOf(
                "Vodka (4,5 cl)",
                "Rajčatový džus (9 cl)",
                "Citronový džus (1,5 cl)",
                "Worcesterská omáčka",
                "Tabasco",
                "Sůl",
                "Pepř"
            ),
            tutorial = "Připravíme si sklenicí typu highball, do které nakapeme worcester, tabasco, přidáme špetku soli a pepře. Vložíme několik kostek ledu, nalijeme vodku a džusy v uvedeném množství. Nakonec vše lehce promícháme a ozdobíme plátkem citronu a stonkem celeru. Podáváme s brčkem."
        ),
        Drink(
            id = 9,
            name = "Modrá Laguna",
            image = "/images/drinks/blue_lagoon.jpg",
            description = "Lahodný alkoholický koktejl modravé barvy, který přináší osvěžení jako samotná modrá laguna na exotickém ostrově. Jeho základ tvoří kvalitní vodka.",
            rating = 3.0,
            ingredients = listOf(
                "Vodka (3 cl)",
                "Likér Curaçao (3 cl)",
                "Citrónová limonáda (12 cl)"
            ),
            tutorial = "Nalijte vodku do shakeru společně s Curaçaem a ledem. Důkladně protřepejte a přes sítko slijte do sklenice Highball Glass s ledem. Nakonec dolijte limonádou a ozdobte plátkem citrónu."
        )
    )

    override val page4 = listOf(
        Drink(
            id = 10,
            name = "B52",
            image = "/images/drinks/b52.jpg",
            description = "B52 drink je třívrstvý míchaný nápoj nazvaný podle amerického bombardéru používaného ve válce ve Vietnamu. Zvláštností tohoto drinku je, že se podává doslova hořící.",
            rating = 5.0,
            ingredients = listOf(
                "Kahlúa (3 cl)",
                "Baileys (2 cl)",
                "Grand Marnier nebo Absinth nebo Stroh (3 cl)"
            ),
            tutorial = "Ingredience opatrně nalijte do panáku skrze kávovou lžičku, tak, aby zůstaly nepromíchané. A to přesně v tomto pořadí: 1. likér Kahlúa, 2. likér Baileys, a nakonec 3. Grand Marnier či Absinth nebo Stroh . Těsně před konzumací zapálíme zapalovačem. Podáváme s tlustým brčkem."
        ),
        Drink(
            id = 11,
            name = "Bloody Mary",
            image = "/images/drinks/bloody_mary.jpg",
            description = "Kdo by neznal krvavou Marii? Málokdo už však ví, že nápoj je pojmenován podle anglické královny Marie I. Tudorovny, která, jak už název drinku napoví, nebyla žádnou lidumilkou. Barva nápoje je krvavě červená, a po vodce, tabascu a pepři ostrá jako katova sekera.",
            rating = 4.0,
            ingredients = listOf(
                "Vodka (4,5 cl)",
                "Rajčatový džus (9 cl)",
                "Citronový džus (1,5 cl)",
                "Worcesterská omáčka",
                "Tabasco",
                "Sůl",
                "Pepř"
            ),
            tutorial = "Připravíme si sklenicí typu highball, do které nakapeme worcester, tabasco, přidáme špetku soli a pepře. Vložíme několik kostek ledu, nalijeme vodku a džusy v uvedeném množství. Nakonec vše lehce promícháme a ozdobíme plátkem citronu a stonkem celeru. Podáváme s brčkem."
        ),
        Drink(
            id = 12,
            name = "Modrá Laguna",
            image = "/images/drinks/blue_lagoon.jpg",
            description = "Lahodný alkoholický koktejl modravé barvy, který přináší osvěžení jako samotná modrá laguna na exotickém ostrově. Jeho základ tvoří kvalitní vodka.",
            rating = 3.0,
            ingredients = listOf(
                "Vodka (3 cl)",
                "Likér Curaçao (3 cl)",
                "Citrónová limonáda (12 cl)"
            ),
            tutorial = "Nalijte vodku do shakeru společně s Curaçaem a ledem. Důkladně protřepejte a přes sítko slijte do sklenice Highball Glass s ledem. Nakonec dolijte limonádou a ozdobte plátkem citrónu."
        )
    )

    override val page5 = listOf(
        Drink(
            id = 13,
            name = "B52",
            image = "/images/drinks/b52.jpg",
            description = "B52 drink je třívrstvý míchaný nápoj nazvaný podle amerického bombardéru používaného ve válce ve Vietnamu. Zvláštností tohoto drinku je, že se podává doslova hořící.",
            rating = 5.0,
            ingredients = listOf(
                "Kahlúa (3 cl)",
                "Baileys (2 cl)",
                "Grand Marnier nebo Absinth nebo Stroh (3 cl)"
            ),
            tutorial = "Ingredience opatrně nalijte do panáku skrze kávovou lžičku, tak, aby zůstaly nepromíchané. A to přesně v tomto pořadí: 1. likér Kahlúa, 2. likér Baileys, a nakonec 3. Grand Marnier či Absinth nebo Stroh . Těsně před konzumací zapálíme zapalovačem. Podáváme s tlustým brčkem."
        ),
        Drink(
            id = 14,
            name = "Bloody Mary",
            image = "/images/drinks/bloody_mary.jpg",
            description = "Kdo by neznal krvavou Marii? Málokdo už však ví, že nápoj je pojmenován podle anglické královny Marie I. Tudorovny, která, jak už název drinku napoví, nebyla žádnou lidumilkou. Barva nápoje je krvavě červená, a po vodce, tabascu a pepři ostrá jako katova sekera.",
            rating = 4.0,
            ingredients = listOf(
                "Vodka (4,5 cl)",
                "Rajčatový džus (9 cl)",
                "Citronový džus (1,5 cl)",
                "Worcesterská omáčka",
                "Tabasco",
                "Sůl",
                "Pepř"
            ),
            tutorial = "Připravíme si sklenicí typu highball, do které nakapeme worcester, tabasco, přidáme špetku soli a pepře. Vložíme několik kostek ledu, nalijeme vodku a džusy v uvedeném množství. Nakonec vše lehce promícháme a ozdobíme plátkem citronu a stonkem celeru. Podáváme s brčkem."
        ),
        Drink(
            id = 15,
            name = "Modrá Laguna",
            image = "/images/drinks/blue_lagoon.jpg",
            description = "Lahodný alkoholický koktejl modravé barvy, který přináší osvěžení jako samotná modrá laguna na exotickém ostrově. Jeho základ tvoří kvalitní vodka.",
            rating = 3.0,
            ingredients = listOf(
                "Vodka (3 cl)",
                "Likér Curaçao (3 cl)",
                "Citrónová limonáda (12 cl)"
            ),
            tutorial = "Nalijte vodku do shakeru společně s Curaçaem a ledem. Důkladně protřepejte a přes sítko slijte do sklenice Highball Glass s ledem. Nakonec dolijte limonádou a ozdobte plátkem citrónu."
        )
    )

    override suspend fun getAllDrinks(page: Int): ApiResponse {
        return ApiResponse(
            success = true,
            message = "ok",
            prevPage = calculatePage(page = page)[PREVIOUS_PAGE_DRINK_KEY],
            nextPage = calculatePage(page = page)[NEXT_PAGE_DRINK_KEY],
            drinks = drinks[page]!!,
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
        return mapOf(PREVIOUS_PAGE_DRINK_KEY to prevPage, NEXT_PAGE_DRINK_KEY to nextPage)
    }

    override suspend fun searchDrinks(name: String?): ApiResponse {
        return ApiResponse(
            success = true,
            message = "ok",
            drinks = findDrinks(query = name)
        )
    }

    private fun findDrinks(query: String?): List<Drink> {
        val founded = mutableListOf<Drink>()
        return if (!query.isNullOrEmpty()) {
            drinks.forEach { (_, Drinks) ->
                Drinks.forEach { Drink ->
                    if (Drink.name.lowercase().contains(query.lowercase())) {
                        founded.add(Drink)
                    }
                }
            }
            founded
        } else {
            emptyList()
        }
    }
}