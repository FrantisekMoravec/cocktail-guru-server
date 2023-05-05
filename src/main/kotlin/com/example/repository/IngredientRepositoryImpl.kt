package com.example.repository

import com.example.models.Ingredient
import com.example.models.IngredientApiResponse

/** tato třída slouží k zadání hodnot do repozitáře */

const val NEXT_PAGE_INGREDIENT_KEY = "nextPage"
const val PREVIOUS_PAGE_INGREDIENT_KEY = "prevPage"

private const val imageFormat = ".png"
private const val imagePath = "/images/ingredients/"

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

    /** zde jsou zadány parametry ingrediencí */
    override val page1 = listOf(
        Ingredient(
            id = 1,
            name = "Vodka",
            image = imagePath + "vodka" + imageFormat,
            description = "Vodka je tvrdý bezbarvý alkoholický nápoj oblíbený po celém světě. Kvalita a chuť vodky se mohou lišit vlivem různých faktorů. Jedná se o to, že tento alkoholický nápoj se vyrábí z obilí, jehož specifické složení určuje výrobce. Některé druhy namísto obilí obsahují destilaci z brambor.",
            madeByUser = false
        ),
        Ingredient(
            id = 2,
            name = "Absint",
            image = imagePath + "absint" + imageFormat,
            description = "Absinth je tradičně destilovaný nápoj s vysokým podílem alkoholu (45%-75% ). Jeho charakteristická zelená barva mu vysloužila přezdívku „zelená víla“, i když může být i jinak zbarvený.",
            madeByUser = false
        ),
        Ingredient(
            id = 3,
            name = "Baileys",
            image = imagePath + "baileys" + imageFormat,
            description = "Baileys je alkoholický nápoj na bázi smetany a irské whiskey. Jeho chuť je sladká a krémová, s výrazným aroma kávy a karamelu.",
            madeByUser = false
        )
    )

    override val page2 = listOf(
        Ingredient(
            id = 4,
            name = "Curaçao",
            image = imagePath + "curaçao" + imageFormat,
            description = "Curaçao je ovocný likér, který se vyrábí z pomerančů z ostrova Curaçao v Karibiku. Existuje několik druhů tohoto likéru - modrý, zelený, oranžový a bílý, přičemž každý má odlišnou chuť a využití. Modrý curaçao je nejznámější a má sladkou, ovocnou chuť s nádechem citrusů. Zelený curaçao je o něco hořčejší a oranžový je jemný a aromatický. V našich koktejlech se používá výhradně modrá varianta tohoto likéru.",
            madeByUser = false
        ),
        Ingredient(
            id = 5,
            name = "Kahlua",
            image = imagePath + "kahlua" + imageFormat,
            description = "Kahlua je kávový likér, který se vyrábí v Mexiku. Jeho základem je destilovaná alkoholická báze smíchaná s kávovým extraktem, cukrem a vanilkou. Kahlua má tmavě hnědou barvu a sladkou, kávovou chuť s nádechem karamelu a vanilky.",
            madeByUser = false
        ),
        Ingredient(
            id = 6,
            name = "Citronový džus",
            image = imagePath + "lemon_juice" + imageFormat,
            description = "popis",
            madeByUser = false
        )
    )

    override val page3 = listOf(
        Ingredient(
            id = 7,
            name = "Citronová limonáda",
            image = imagePath + "lemon_lemonade" + imageFormat,
            description = "popis",
            madeByUser = false
        ),
        Ingredient(
            id = 8,
            name = "Pepř",
            image = imagePath + "pepper" + imageFormat,
            description = "",
            madeByUser = false
        ),
        Ingredient(
            id = 9,
            name = "Sůl",
            image = imagePath + "salt" + imageFormat,
            description = "",
            madeByUser = false
        )
    )

    override val page4 = listOf(
        Ingredient(
            id = 10,
            name = "Stroh",
            image = imagePath + "stroh" + imageFormat,
            description = "Stroh je rakouský rumový likér, který se vyrábí z cukrové třtiny. Je pojmenován po rodině, která tento likér vyrábí již od roku 1832. Stroh má tmavě hnědou až mahagonovou barvu a výraznou, kořenitou chuť s nádechem skořice a karamelu. Jeho alkoholový obsah se pohybuje v rozmezí 38 až 80 %, což ho řadí mezi velmi silné alkoholické nápoje.",
            madeByUser = false
        ),
        Ingredient(
            id = 11,
            name = "Tabasco omáčka",
            image = imagePath + "tabasco_sauce" + imageFormat,
            description = "Tabasco je značka pikantní omáčky, která je vyráběna z chilli papriček jalapeño, octa a soli. Omáčka je pojmenována po regionu Tabasco v Mexiku, kde se chilli papričky původně pěstovaly. Tabasco má vysokou úroveň pálivosti a její chuť je ostrá a pikantní s nádechem octa.",
            madeByUser = false
        ),
        Ingredient(
            id = 12,
            name = "Rajčatový džus",
            image = imagePath + "tomato_juice" + imageFormat,
            description = "popis",
            madeByUser = false
        )
    )

    override val page5 = listOf(
        Ingredient(
            id = 13,
            name = "Worcestrovská omáčka",
            image = imagePath + "worcestr_sauce" + imageFormat,
            description = "Worcesterská omáčka, také známá jako worcesterová omáčka, je anglická omáčka, která byla vynalezena v 19. století. Její přesný recept je stále tajemstvím, ale obvykle se vyrábí z octa, cukru, soli, cibule, česneku, křenu, tamarindu, ančoviček a několika koření. Worcesterská omáčka má tmavou barvu a silnou, slanou chuť s nádechem koření a octa.",
            madeByUser = false
        ),
        Ingredient(
            id = 14,
            name = "Absint",
            image = imagePath + "absint" + imageFormat,
            description = "Absinth je tradičně destilovaný nápoj s vysokým podílem alkoholu (45%-75% ). Jeho charakteristická zelená barva mu vysloužila přezdívku „zelená víla“, i když může být i jinak zbarvený.",
            madeByUser = false
        ),
        Ingredient(
            id = 15,
            name = "Baileys",
            image = imagePath + "baileys" + imageFormat,
            description = "Vodka je tvrdý bezbarvý alkoholický nápoj oblíbený po celém světě. Kvalita a chuť vodky se mohou lišit vlivem různých faktorů. Jedná se o to, že tento alkoholický nápoj se vyrábí z obilí, jehož specifické složení určuje výrobce. Některé druhy namísto obilí obsahují destilaci z brambor.",
            madeByUser = false
        )
    )

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

    /** tato metoda říká jak má vypadat odpověď pro každou ingredienci co bude mít ve jméně text který uživatel vyhledá */
    override suspend fun searchIngredients(name: String?): IngredientApiResponse {
        return IngredientApiResponse(
            success = true,
            message = "ok",
            ingredients = findIngredients(query = name)
        )
    }

    /** tato metoda slouží k vyhledávání ingrediencí */
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