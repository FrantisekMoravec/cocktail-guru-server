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

    override val page6 = listOf(
        Ingredient(
            id = 16,
            name = "Bílý rum",
            image = imagePath + "" + imageFormat,
            description = "",
            madeByUser = false
        ),
        Ingredient(
            id = 17,
            name = "Limetkový džus",
            image = imagePath + "" + imageFormat,
            description = "",
            madeByUser = false
        ),
        Ingredient(
            id = 18,
            name = "Led",
            image = imagePath + "" + imageFormat,
            description = "",
            madeByUser = false
        )
    )

    override val page7 = listOf(
        Ingredient(
            id = 19,
            name = "Stříbrná tequila",
            image = imagePath + "" + imageFormat,
            description = "",
            madeByUser = false
        ),
        Ingredient(
            id = 20,
            name = "Pomerančový džus",
            image = imagePath + "" + imageFormat,
            description = "",
            madeByUser = false
        ),
        Ingredient(
            id = 21,
            name = "Grenadina",
            image = imagePath + "" + imageFormat,
            description = "",
            madeByUser = false
        )
    )

    override val page8 = listOf(
        Ingredient(
            id = 22,
            name = "Coca Cola",
            image = imagePath + "" + imageFormat,
            description = "",
            madeByUser = false
        ),
        Ingredient(
            id = 23,
            name = "Kousek limetky",
            image = imagePath + "" + imageFormat,
            description = "",
            madeByUser = false
        ),
        Ingredient(
            id = 24,
            name = "Broskvový likér",
            image = imagePath + "" + imageFormat,
            description = "",
            madeByUser = false
        )
    )

    override val page9 = listOf(
        Ingredient(
            id = 25,
            name = "Brusinkový džus",
            image = imagePath + "" + imageFormat,
            description = "",
            madeByUser = false
        ),
        Ingredient(
            id = 26,
            name = "Šampaňské",
            image = imagePath + "" + imageFormat,
            description = "",
            madeByUser = false
        ),
        Ingredient(
            id = 27,
            name = "Limetková šťáva",
            image = imagePath + "" + imageFormat,
            description = "",
            madeByUser = false
        )
    )

    override val page10 = listOf(
        Ingredient(
            id = 28,
            name = "Třtinový cukr",
            image = imagePath + "" + imageFormat,
            description = "",
            madeByUser = false
        ),
        Ingredient(
            id = 29,
            name = "Mátové lístky",
            image = imagePath + "" + imageFormat,
            description = "",
            madeByUser = false
        ),
        Ingredient(
            id = 30,
            name = "Perlivá voda",
            image = imagePath + "" + imageFormat,
            description = "",
            madeByUser = false
        )
    )

    override val page11 = listOf(
        Ingredient(
            id = 31,
            name = "Becherovka",
            image = imagePath + "" + imageFormat,
            description = "",
            madeByUser = false
        ),
        Ingredient(
            id = 32,
            name = "Tonic",
            image = imagePath + "" + imageFormat,
            description = "",
            madeByUser = false
        ),
        Ingredient(
            id = 33,
            name = "Plátek citronu",
            image = imagePath + "" + imageFormat,
            description = "",
            madeByUser = false
        )
    )

    override val page12 = listOf(
        Ingredient(
            id = 34,
            name = "Cointreau",
            image = imagePath + "" + imageFormat,
            description = "",
            madeByUser = false
        ),
        Ingredient(
            id = 35,
            name = "Gin",
            image = imagePath + "" + imageFormat,
            description = "",
            madeByUser = false
        ),
        Ingredient(
            id = 36,
            name = "Vermouth",
            image = imagePath + "" + imageFormat,
            description = "",
            madeByUser = false
        )
    )

    override val page13 = listOf(
        Ingredient(
            id = 37,
            name = "Campari",
            image = imagePath + "" + imageFormat,
            description = "",
            madeByUser = false
        ),
        Ingredient(
            id = 38,
            name = "Jablečný likér",
            image = imagePath + "" + imageFormat,
            description = "",
            madeByUser = false
        ),
        Ingredient(
            id = 39,
            name = "Triple sec Contreau",
            image = imagePath + "" + imageFormat,
            description = "",
            madeByUser = false
        )
    )

    override val page14 = listOf(
        Ingredient(
            id = 40,
            name = "Tmavý rum",
            image = imagePath + "" + imageFormat,
            description = "",
            madeByUser = false
        ),
        Ingredient(
            id = 41,
            name = "Světlý rum",
            image = imagePath + "" + imageFormat,
            description = "",
            madeByUser = false
        ),
        Ingredient(
            id = 42,
            name = "Mandlový sirup",
            image = imagePath + "" + imageFormat,
            description = "",
            madeByUser = false
        )
    )

    override val page15 = listOf(
        Ingredient(
            id = 43,
            name = "Cukerný sirup",
            image = imagePath + "" + imageFormat,
            description = "",
            madeByUser = false
        ),
        Ingredient(
            id = 44,
            name = "Triple sec",
            image = imagePath + "" + imageFormat,
            description = "",
            madeByUser = false
        ),
        Ingredient(
            id = 45,
            name = "Gomme sirup",
            image = imagePath + "" + imageFormat,
            description = "",
            madeByUser = false
        )
    )

    override val page16 = listOf(
        Ingredient(
            id = 46,
            name = "Suchý Vermut",
            image = imagePath + "" + imageFormat,
            description = "",
            madeByUser = false
        ),
        Ingredient(
            id = 47,
            name = "Oliva",
            image = imagePath + "" + imageFormat,
            description = "",
            madeByUser = false
        ),
        Ingredient(
            id = 48,
            name = "Whisky",
            image = imagePath + "" + imageFormat,
            description = "",
            madeByUser = false
        )
    )

    override val page17 = listOf(
        Ingredient(
            id = 49,
            name = "Bourbon",
            image = imagePath + "" + imageFormat,
            description = "",
            madeByUser = false
        ),
        Ingredient(
            id = 50,
            name = "Angostura",
            image = imagePath + "" + imageFormat,
            description = "",
            madeByUser = false
        ),
        Ingredient(
            id = 51,
            name = "Zázvorové pivo",
            image = imagePath + "" + imageFormat,
            description = "",
            madeByUser = false
        )
    )

    override val page18 = listOf(
        Ingredient(
            id = 52,
            name = "Půl limetky",
            image = imagePath + "" + imageFormat,
            description = "",
            madeByUser = false
        ),
        Ingredient(
            id = 53,
            name = "Tequila",
            image = imagePath + "" + imageFormat,
            description = "",
            madeByUser = false
        ),
        Ingredient(
            id = 54,
            name = "Citronová šťáva",
            image = imagePath + "" + imageFormat,
            description = "",
            madeByUser = false
        )
    )

    override val page19 = listOf(
        Ingredient(
            id = 55,
            name = "Cukr",
            image = imagePath + "" + imageFormat,
            description = "",
            madeByUser = false
        ),
        Ingredient(
            id = 56,
            name = "Crème de cassis",
            image = imagePath + "" + imageFormat,
            description = "",
            madeByUser = false
        ),
        Ingredient(
            id = 57,
            name = "Šumivé víno",
            image = imagePath + "" + imageFormat,
            description = "",
            madeByUser = false
        )
    )

    override val page20 = listOf(
        Ingredient(
            id = 58,
            name = "Maliny",
            image = imagePath + "" + imageFormat,
            description = "",
            madeByUser = false
        ),
        Ingredient(
            id = 59,
            name = "Káva",
            image = imagePath + "" + imageFormat,
            description = "",
            madeByUser = false
        ),
        Ingredient(
            id = 60,
            name = "Smetana",
            image = imagePath + "" + imageFormat,
            description = "",
            madeByUser = false
        )
    )

    override val page21 = listOf(
        Ingredient(
            id = 61,
            name = "Cachaça",
            image = imagePath + "" + imageFormat,
            description = "",
            madeByUser = false
        ),
        Ingredient(
            id = 62,
            name = "Limetka",
            image = imagePath + "" + imageFormat,
            description = "",
            madeByUser = false
        ),
        Ingredient(
            id = 63,
            name = "Zlatý rum",
            image = imagePath + "" + imageFormat,
            description = "",
            madeByUser = false
        )
    )

    override val page22 = listOf(
        Ingredient(
            id = 64,
            name = "Pomerančová šťáva",
            image = imagePath + "" + imageFormat,
            description = "",
            madeByUser = false
        ),
        Ingredient(
            id = 65,
            name = "Ananasová šťáva",
            image = imagePath + "" + imageFormat,
            description = "",
            madeByUser = false
        ),
        Ingredient(
            id = 66,
            name = "Malinový likér",
            image = imagePath + "" + imageFormat,
            description = "",
            madeByUser = false
        )
    )

    override val page23 = listOf(
        Ingredient(
            id = 67,
            name = "Cherry Heering",
            image = imagePath + "" + imageFormat,
            description = "",
            madeByUser = false
        ),
        Ingredient(
            id = 68,
            name = "Bénédictine",
            image = imagePath + "" + imageFormat,
            description = "",
            madeByUser = false
        ),
        Ingredient(
            id = 69,
            name = "Borůvkový džus",
            image = imagePath + "" + imageFormat,
            description = "",
            madeByUser = false
        )
    )

    override val page24 = listOf(
        Ingredient(
            id = 70,
            name = "Ananasový džus",
            image = imagePath + "" + imageFormat,
            description = "",
            madeByUser = false
        ),
        Ingredient(
            id = 71,
            name = "Bílé víno",
            image = imagePath + "" + imageFormat,
            description = "",
            madeByUser = false
        ),
        Ingredient(
            id = 72,
            name = "Brandy",
            image = imagePath + "" + imageFormat,
            description = "",
            madeByUser = false
        )
    )

    override val page25 = listOf(
        Ingredient(
            id = 73,
            name = "Jablka",
            image = imagePath + "" + imageFormat,
            description = "",
            madeByUser = false
        ),
        Ingredient(
            id = 74,
            name = "Hrozny",
            image = imagePath + "" + imageFormat,
            description = "",
            madeByUser = false
        ),
        Ingredient(
            id = 75,
            name = "Broskev",
            image = imagePath + "" + imageFormat,
            description = "",
            madeByUser = false
        )
    )

    override val page26 = listOf(
        Ingredient(
            id = 76,
            name = "Sekt",
            image = imagePath + "" + imageFormat,
            description = "",
            madeByUser = false
        ),
        Ingredient(
            id = 77,
            name = "Čokoládový sirup",
            image = imagePath + "" + imageFormat,
            description = "",
            madeByUser = false
        ),
        Ingredient(
            id = 78,
            name = "Vanilkový extrakt",
            image = imagePath + "" + imageFormat,
            description = "",
            madeByUser = false
        )
    )

    override val page27 = listOf(
        Ingredient(
            id = 79,
            name = "Mletý muškátový oříšek",
            image = imagePath + "" + imageFormat,
            description = "",
            madeByUser = false
        ),
        Ingredient(
            id = 80,
            name = "Marakuja",
            image = imagePath + "" + imageFormat,
            description = "",
            madeByUser = false
        ),
        Ingredient(
            id = 81,
            name = "Skotská whisky",
            image = imagePath + "" + imageFormat,
            description = "",
            madeByUser = false
        )
    )

    override val page28 = listOf(
        Ingredient(
            id = 82,
            name = "Kostky ledu",
            image = imagePath + "" + imageFormat,
            description = "",
            madeByUser = false
        ),
        Ingredient(
            id = 83,
            name = "Grepový džus",
            image = imagePath + "" + imageFormat,
            description = "",
            madeByUser = false
        ),
        Ingredient(
            id = 84,
            name = "Midori",
            image = imagePath + "" + imageFormat,
            description = "",
            madeByUser = false
        )
    )

    override val page29 = listOf(
        Ingredient(
            id = 85,
            name = "Galliano",
            image = imagePath + "" + imageFormat,
            description = "",
            madeByUser = false
        ),
        Ingredient(
            id = 86,
            name = "Červené víno",
            image = imagePath + "" + imageFormat,
            description = "",
            madeByUser = false
        ),
        Ingredient(
            id = 87,
            name = "Citronová kůra",
            image = imagePath + "" + imageFormat,
            description = "",
            madeByUser = false
        )
    )

    override val page30 = listOf(
        Ingredient(
            id = 88,
            name = "Maraschino",
            image = imagePath + "" + imageFormat,
            description = "",
            madeByUser = false
        ),
        Ingredient(
            id = 89,
            name = "Zelený Chartreuse",
            image = imagePath + "" + imageFormat,
            description = "",
            madeByUser = false
        ),
        Ingredient(
            id = 90,
            name = "Kousek citronu",
            image = imagePath + "" + imageFormat,
            description = "",
            madeByUser = false
        )
    )

    override val page31 = listOf(
        Ingredient(
            id = 91,
            name = "Dýňový džus",
            image = imagePath + "" + imageFormat,
            description = "",
            madeByUser = false
        ),
        Ingredient(
            id = 92,
            name = "Malinový džus",
            image = imagePath + "" + imageFormat,
            description = "",
            madeByUser = false
        ),
        Ingredient(
            id = 93,
            name = "Worcestershire omáčka",
            image = imagePath + "" + imageFormat,
            description = "",
            madeByUser = false
        )
    )

    override val page32 = listOf(
        Ingredient(
            id = 94,
            name = "Celer",
            image = imagePath + "" + imageFormat,
            description = "",
            madeByUser = false
        ),
        Ingredient(
            id = 95,
            name = "Sambuca",
            image = imagePath + "" + imageFormat,
            description = "",
            madeByUser = false
        ),
        Ingredient(
            id = 96,
            name = "Advocaat",
            image = imagePath + "" + imageFormat,
            description = "",
            madeByUser = false
        )
    )

    override val page33 = listOf(
        Ingredient(
            id = 97,
            name = "Schweppes",
            image = imagePath + "" + imageFormat,
            description = "",
            madeByUser = false
        ),
        Ingredient(
            id = 98,
            name = "Koňak",
            image = imagePath + "" + imageFormat,
            description = "",
            madeByUser = false
        ),
        Ingredient(
            id = 99,
            name = "Crème de menthe",
            image = imagePath + "" + imageFormat,
            description = "",
            madeByUser = false
        )
    )

    override val page34 = listOf(
        Ingredient(
            id = 100,
            name = "Jägermeister",
            image = imagePath + "" + imageFormat,
            description = "",
            madeByUser = false
        ),
        Ingredient(
            id = 101,
            name = "Kokosový rum",
            image = imagePath + "" + imageFormat,
            description = "",
            madeByUser = false
        ),
        Ingredient(
            id = 102,
            name = "Grapefruitová šťáva",
            image = imagePath + "" + imageFormat,
            description = "",
            madeByUser = false
        )
    )

    override val page35 = listOf(
        Ingredient(
            id = 103,
            name = "Pomerančový likér",
            image = imagePath + "" + imageFormat,
            description = "",
            madeByUser = false
        ),
        Ingredient(
            id = 104,
            name = "Hroznová šťáva",
            image = imagePath + "" + imageFormat,
            description = "",
            madeByUser = false
        ),
        Ingredient(
            id = 105,
            name = "Bílý vermut",
            image = imagePath + "" + imageFormat,
            description = "",
            madeByUser = false
        )
    )

    override val page36 = listOf(
        Ingredient(
            id = 106,
            name = "Vanilkový likér",
            image = imagePath + "" + imageFormat,
            description = "",
            madeByUser = false
        ),
        Ingredient(
            id = 107,
            name = "Sahara",
            image = imagePath + "" + imageFormat,
            description = "",
            madeByUser = false
        ),
        Ingredient(
            id = 108,
            name = "Calvados",
            image = imagePath + "" + imageFormat,
            description = "",
            madeByUser = false
        )
    )

    override val page37 = listOf(
        Ingredient(
            id = 109,
            name = "Creme de Violette",
            image = imagePath + "" + imageFormat,
            description = "",
            madeByUser = false
        ),
        Ingredient(
            id = 110,
            name = "Kokosový krém",
            image = imagePath + "" + imageFormat,
            description = "",
            madeByUser = false
        ),
        Ingredient(
            id = 111,
            name = "Brusinková šťáva",
            image = imagePath + "" + imageFormat,
            description = "",
            madeByUser = false
        )
    )

    override val page38 = listOf(
        Ingredient(
            id = 112,
            name = "Medový sirup",
            image = imagePath + "" + imageFormat,
            description = "",
            madeByUser = false
        ),
        Ingredient(
            id = 113,
            name = "Borůvky",
            image = imagePath + "" + imageFormat,
            description = "",
            madeByUser = false
        ),
        Ingredient(
            id = 114,
            name = "Cukrový sirup",
            image = imagePath + "" + imageFormat,
            description = "",
            madeByUser = false
        )
    )

    override val page39 = listOf(
        Ingredient(
            id = 115,
            name = "Plymouth",
            image = imagePath + "" + imageFormat,
            description = "",
            madeByUser = false
        ),
        Ingredient(
            id = 116,
            name = "Slivovice",
            image = imagePath + "" + imageFormat,
            description = "",
            madeByUser = false
        ),
        Ingredient(
            id = 117,
            name = "Kondenzované mléko",
            image = imagePath + "" + imageFormat,
            description = "",
            madeByUser = false
        )
    )

    override val page40 = listOf(
        Ingredient(
            id = 118,
            name = "Mletá skořice",
            image = imagePath + "" + imageFormat,
            description = "",
            madeByUser = false
        ),
        Ingredient(
            id = 119,
            name = "Lillet Blanc",
            image = imagePath + "" + imageFormat,
            description = "",
            madeByUser = false
        ),
        Ingredient(
            id = 120,
            name = "Banánový krém",
            image = imagePath + "" + imageFormat,
            description = "",
            madeByUser = false
        )
    )

    override val page41 = listOf(
        Ingredient(
            id = 121,
            name = "Kokosové mléko",
            image = imagePath + "" + imageFormat,
            description = "",
            madeByUser = false
        ),
        Ingredient(
            id = 122,
            name = "Banán",
            image = imagePath + "" + imageFormat,
            description = "",
            madeByUser = false
        ),
        Ingredient(
            id = 123,
            name = "Zázvorový sirup",
            image = imagePath + "" + imageFormat,
            description = "",
            madeByUser = false
        )
    )

    override val page42 = listOf(
        Ingredient(
            id = 124,
            name = "Marakujový sirup",
            image = imagePath + "" + imageFormat,
            description = "",
            madeByUser = false
        ),
        Ingredient(
            id = 125,
            name = "Broskvový nektar",
            image = imagePath + "" + imageFormat,
            description = "",
            madeByUser = false
        ),
        Ingredient(
            id = 126,
            name = "Nakládaná cibule",
            image = imagePath + "" + imageFormat,
            description = "",
            madeByUser = false
        )
    )

    override val page43 = listOf(
        Ingredient(
            id = 127,
            name = "Amaretto",
            image = imagePath + "" + imageFormat,
            description = "",
            madeByUser = false
        ),
        Ingredient(
            id = 128,
            name = "Med",
            image = imagePath + "" + imageFormat,
            description = "",
            madeByUser = false
        ),
        Ingredient(
            id = 129,
            name = "Karamelový sirup",
            image = imagePath + "" + imageFormat,
            description = "",
            madeByUser = false
        )
    )

    override val page44 = listOf(
        Ingredient(
            id = 130,
            name = "Malibu",
            image = imagePath + "" + imageFormat,
            description = "",
            madeByUser = false
        ),
        Ingredient(
            id = 131,
            name = "Pivo",
            image = imagePath + "" + imageFormat,
            description = "",
            madeByUser = false
        ),
        Ingredient(
            id = 132,
            name = "Černý pepř",
            image = imagePath + "" + imageFormat,
            description = "",
            madeByUser = false
        )
    )

    override val page45 = listOf(
        Ingredient(
            id = 133,
            name = "Mléko",
            image = imagePath + "" + imageFormat,
            description = "",
            madeByUser = false
        ),
        Ingredient(
            id = 134,
            name = "Čokoládová poleva",
            image = imagePath + "" + imageFormat,
            description = "",
            madeByUser = false
        ),
        Ingredient(
            id = 135,
            name = "Meruňková brandy",
            image = imagePath + "" + imageFormat,
            description = "",
            madeByUser = false
        )
    )

/*
    override val page46 = listOf(
        Ingredient(
            id = 136,
            name = "",
            image = imagePath + "" + imageFormat,
            description = "",
            madeByUser = false
        ),
        Ingredient(
            id = 137,
            name = "",
            image = imagePath + "" + imageFormat,
            description = "",
            madeByUser = false
        ),
        Ingredient(
            id = 138,
            name = "",
            image = imagePath + "" + imageFormat,
            description = "",
            madeByUser = false
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