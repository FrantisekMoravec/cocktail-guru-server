package com.example.repository

import com.example.models.DrinkApiResponse
import com.example.models.Drink
//TODO přiadt obrázky drinků s větší kvalitou(výška 2280px)
/** tato třída slouží k zadání hodnot do repozitáře */

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
    /** zde jsou zadány parametry drinků */
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
            name = "Daiquiri",
            image = "/images/drinks/daiquiri.png",
            description = "Tento míchaný nápoj byl pojmenován po kubánském městě Daiquiri a jedná se údajně o nejoblíbenější koktejl spisovatele Ernesta Hemingwaye. Tento míchaný nápoj z bílého rumu, limetové šťávy a cukrového sirupu byl poprvé namíchán na konci 19. století.",
            rating = 5.0,
            ingredients = listOf(
                "Bílý rum (4,5 cl)",
                "Limetkový džus (2 cl)",
                "Cukrový sirup (0,5 cl)",
                "Led"
            ),
            tutorial = "Ten vyrobíme tak, že smícháme 100g cukru a 1dl studené vody (nebo menší množství, ale ve stejném poměru). Směs důkladně promícháme, pomalu přivedeme k varu a poté necháme vychladnout. Zbytek už je celkem snadný. Všechny ingredience vložíme do shakeru v předepsaném množství, přidáme nadrcený led a důkladně protřepeme. Obsah shakeru přelijeme přes sítko. Daiquiri podáváme s ledem nejlépe v koktejlové sklenici."
        ),
        Drink(
            id = 5,
            name = "Tequila Sunrise",
            image = "/images/drinks/tequila_sunrise.jpg",
            description = "Tento koktejl se zrodil v Americe ve 30. letech 20. století. Proč právě název Tequila Sunrise? Jak již z názvu vyplývá, obsahuje tequillu a pomerančový džus, grenadinu a svým vzhledem připomíná východ slunce.",
            rating = 4.0,
            ingredients = listOf(
                "Stříbrná tequila (4,5 cl)",
                "Pomerančový džus (6 cl)",
                "Grenadina (1 cl)",
                "Led"
            ),
            tutorial = "Do shakeru vložíme několik kostek ledu, přidáme pomerančový džus a tequilu. Vše důkladně promícháme a nalijeme do vysoké úzké sklenice. Poté přichází na řadu grenadina, kterou opatrně přidáme k ostatním ingrediencím. Grenadina se nám krásně usadí na dně. Koktejl podáváme ozdobený plátkem pomeranče."
        ),
        Drink(
            id = 6,
            name = "Cuba Libre",
            image = "/images/drinks/cuba_libre.png",
            description = "Tento velmi populární míchaný nápoj vznikl, jak již z názvu vyplývá, na Kubě, a to kolem roku 1900. Cuba libre se tradičně připravuje z kvalitního bílého rumu, coly, limetky a kostek ledu.",
            rating = 3.0,
            ingredients = listOf(
                "Bílý rum (2,5 cl)",
                "Coca Cola (6 cl)",
                "Kousek limetky",
                "Led"
            ),
            tutorial = "Do sklenice, vložte několik kostek ledu a kousků limetky, zalijte rumem a zbytek sklenice dolijte colou."
        )
    )

    override val page3 = listOf(
        Drink(
            id = 7,
            name = "Sex on the Beach",
            image = "/images/drinks/sex_on_the_beach.png",
            description = "Psal se rok 1987 a mladý barman Ted Pizio poprvé namíchal drink, kterým chtěl oslovit návštěvníky pláží ve Ft. Lauderdale na Floridě, kteří sem přijeli strávit jarní prázdniny. Drink lidem neobvykle zachutnal, a proto se zajímali o to, jak se vlastně tento chutný nápoj jmenuje. To ovšem barmana poměrně zaskočilo, neměl totiž ještě název vymyšlený. Znal však důvod, proč právě do Ft. Lauderdale mladí lidé jezdí trávit jarní prázdniny; kvůli plážím a také kvůli sexu. A název byl na světě – „Sex on the Beach“.",
            rating = 5.0,
            ingredients = listOf(
                "Vodka (2 cl)",
                "Broskvový likér (1 cl)",
                "Pomerančový džus (3 cl)",
                "Brusinkový džus (3 cl)",
                "Led"
            ),
            tutorial = "Sklenici naplněnou zhruba do třetiny ledem zalijte v shakeru umíchanou směsí z určených ingrediencí, koktejl můžete ozdobit plátkem pomeranče."
        ),
        Drink(
            id = 8,
            name = "Mimosa",
            image = "/images/drinks/mimosa.jpg",
            description = "Světlo světa spatřil koktejl Mimosa v roce 1925 a to konkrétně v pařížském hotelu Ritz. Netrvalo dlouho a Mimosa se stala oblíbeným nápojem pozdních snídaní především svatebních hostů, kteří potřebovali svěží vyprošťovák. Mnohým pak zřejmě zachutnal natolik, že jeho konzumaci neomezili pouze na svatební snídani, a Mimosa se tak stala typickou součástí nejednoho brunche.",
            rating = 1.5,
            ingredients = listOf(
                "Šampaňské (7 cl)",
                "Pomerančový džus (7 cl)"
            ),
            tutorial = "Do sklenky na šampaňské nalijte Šampaňské a džus, obojí dobře vychlazené. Zlehka promíchejte. Netřepejte, přišli byste totiž o bublinky. Budete-li chtít Mimosu dotáhnout k dokonalosti, ozdobte ji ještě spirálkou z pomerančové kůry."
        ),
        Drink(
            id = 9,
            name = "Mojito",
            image = "/images/drinks/mojito.png",
            description = "Zdá se to téměř neuvěřitelné, ale nápoje podobné mojitu jsou známy již koncem 16. století. V tuto dobu totiž spatřil světlo světa předchůdce samotného mojita zvaný „El Draque“, kterého z aguardiente (nerafinovaného předchůdce rumu), cukru, limetky a máty umíchal anglický korzár Richard Drake a pojmenoval ho podle svého nadřízeného, známého piráta Francise Drakea. „El Draque“ se díky zámořským výpravám, ale i díky své delikátní chuti okamžitě rozšířil i do dalších latinskoamerických zemí, kde se rovněž stal velmi populární. Skutečné mojito, tak jak ho známe dnes, však vzniklo až na počátku 20. století, kdy byl aguardiente nahrazen opravdovým rumem.",
            rating = 3.0,
            ingredients = listOf(
                "Bílý rum (4 cl)",
                "Limetková šťáva (3 cl)",
                "2 lžíce třtinového cukru",
                "Několik lístků máty",
                "Sodovka"
            ),
            tutorial = "Do vyšší sklenice vložte lístky máty a třtinový cukr. Vše dobře promněte tloučkem. Poté přidejte vymačkanou šťávu z limetek, trochu sodovky a nadrcený led. Nakonec přidejte kvalitní rum a dolijte opět sodovkou. Ozdobit můžete mátou a plátkem čerstvé limetky."
        )
    )

    override val page4 = listOf(
        Drink(
            id = 10,
            name = "Beton",
            image = "/images/drinks/beton.jpg",
            description = "Píše se rok 1967 a v kanadském Montrealu probíhá Expo 67, na němž se objevuje právě tento český, tehdy tedy ještě československý, lahodný koktejl. Jako aperitiv byl totiž „Becherbitter-tonic“ podáván jako důkaz československo-kanadského přátelství, kdy Československou stranu zastupovala Becherovka Original a Kanadu zase Indian Tonic Water.Ptáte se však, kdo ale vlastně přišel na tento jednoduchý recept? Vynálezcem Betonu byl Vlado Belovič, slovenský gastronom, jehož práci oceňoval i významný český someliér a rovněž významný gastronom Karel Pinka.",
            rating = 5.0,
            ingredients = listOf(
                "Becherovka (5 cl)",
                "Tonic (15 cl)",
                "Plátek citronu",
                "Led"
            ),
            tutorial = "Do sklenice vložíme led, nalijeme Becherovku, kterou poté zalijeme tonicem. Přidáme citron, kterým můžeme sklenici rovněž ozdobit."
        ),
        Drink(
            id = 11,
            name = "Black russian",
            image = "/images/drinks/black_russian.jpg",
            description = "Píše se rok 1949 a studená válka je naspadnutí. Americká velvyslankyně Perle Mesta usedá v bruselském hotelu Metropole k baru. Zde je jí umíchán jedinečný koktejl, který jinde nemá obdoby – Black Russian. Koktejl, který svým temným a téměř mystickým vzhledem výborně ladí s duchem doby a právě probíhajícími událostmi. Tvůrcem, tohoto jedinečného souznění pravé ruské vodky a kávového likéru Kahlúa, je místní barman jménem Gustave Tops.",
            rating = 4.0,
            ingredients = listOf(
                "Vodka (5 cl)",
                "Kahlúa (2 cl)",
                "Led"
            ),
            tutorial = "Do sklenice vložíme několik kostek ledu, na které poté nalijeme patřičné množství vodky a kávového likéru."
        ),
        Drink(
            id = 12,
            name = "Cosmopolitan",
            image = "/images/drinks/cosmopolitan.jpg",
            description = "Původ koktejlu Cosmopolitan je stejně jako třeba u Bloody Mary sporný a nejasný. Obecně je známo, že v 70. letech 20. století byl Cosmopolitan umíchán hned několika barmany nezávisle na sobě. Mnoho lidí se však přiklání k tvrzení, že hlavním průkopníkem koktejlu Cosmopolitan byl John Cain, vlastník mnoha populárních barů v San Franciscu, nebo kupříkladu Cheryl Cook, slavná floridská barmanka.",
            rating = 3.0,
            ingredients = listOf(
                "Vodka (4 cl)",
                "Cointreau (4 cl)",
                "Brusinkový džus (4 cl)",
                "Pár kapek citronové šťávy"
            ),
            tutorial = "Všechny zmíněné ingredience následně vložíme do shakeru a důkladně protřepeme. Cosmopolitan podáváme v koktejlové skleničce ve tvaru písmena V (tzv. koktejlka), a to zásadně bez ledu. Ten nasypeme do sklenice ještě před podáváním, abychom sklenku vychladily. Led před nalitím drinku odstraníme. Skleničku ozdobíme plátkem citronu, limetky či pomeranče. Nezapomeňte také na brčko, díky kterému je konzumace Cosmopolitanu pohodlnější."
        )
    )

    override val page5 = listOf(
        Drink(
            id = 13,
            name = "Negroni",
            image = "/images/drinks/negroni.jpg",
            description = "I přestože původ tohoto koktejlu není příliš jistý, traduje se příběh o jeho vynálezu, který je přinejmenším pravděpodobný. Údajně se tak mělo stát v roce 1919 v italské Florencii, konkrétně v Caffè Casoni. Jistý hrabě Camillo Negroni si zde měl objednat svůj oblíbený koktejl Americano. Jenže toho dne ho nechtěl s obvyklou sodovkou, nýbrž s ginem. Možná měl těžký den, možná se chystal k zásadnímu rozhodnutí, to už se dnes asi nedozvíme. Barman Frosco Scarselli jeho přání samozřejmě splnil a ještě do něj přidal trochu vlastní invence. Místo klasického citronu, který běžně zdobil koktejly Americano a použil pomeranč.",
            rating = 5.0,
            ingredients = listOf(
                "Gin (3 cl)",
                "Sladký červený vermut (3 cl)",
                "Campari (3 cl)"
            ),
            tutorial = "Do sklenice dejte led, který následně zalijte ginem, vermutem a Campari v předepsaném množství. Na závěr ozdobte kouskem pomeranče. Použijete-li místo pomeranče citrón, jistě nepůjde o zvlášť závažný prohřešek. Negroni pak podávejte nejlépe jako aperitiv. Jeho hořko-sladká chuť totiž skvěle nabudí k jídlu."
        ),
        Drink(
            id = 14,
            name = "Appletini",
            image = "/images/drinks/appletini.jpg",
            description = "Psal se rok 1994. Jeff Bezos tehdy položil základy Amazonu, televize Nova spustila vysílání a v jednom baru v Los Angeles se zrodilo Appletini. Stalo se tak v slavném baru Lola’s, který na podzim roku 2013 uzavřel svou 17 letou slavnou éru. Appletini však žije dál a těší se mimořádné popularitě. Dokonce daleko větší než sám bar. Podobně jako třeba Cosmopolitan ho totiž na výsluní katapultovaly seriálové postavy. Apple Martini je totiž nejoblíbenějším drinkem ústředních postav hned dvou populárních seriálů, Alana ze seriálu Dva a půl chlapa a Johna Doriana ze seriálu Scrubs.",
            rating = 4.0,
            ingredients = listOf(
                "Vodka (4 cl)",
                "Jablečný likér (1,5 cl)",
                "Triple sec Contreau (1,5 cl)"
            ),
            tutorial = "Všechny ingredience nalijte do shakeru. Vše dobře promíchejte a poté nalijte do vychlazené sklenky. Ozdobte kouskem jablka nebo třešní a můžete podávat."
        ),
        Drink(
            id = 15,
            name = "Mai Tai",
            image = "/images/drinks/mai_tai.png",
            description = "Během 30. let minulého století se Spojenými státy šiří tzv. Tiki kultura, inspirovaná kulturou domorodých Polynésanů. Po celých Spojených státech tak vznikají restaurace, bary a kluby vyzdobené v polynéském stylu. V takovém podniku jste mohli narazit na hořící pochodně, ratanový nábytek, palmové listy, květinové věnce i podprsenky vyrobené z kokosových ořechů. A přesně v této atmosféře se začíná psát historie koktejlu Mai Tai. Jako nejpravděpodobnější se jeví příběh, podle kterého byl tento drink poprvé umíchán v roce 1944 v Oaklandu v Kalifornii v restauraci Trader Vic’s. Její majitel, Victor J. Bergeron, jej prý umíchal svým přátelům, kteří ho přijeli navštívit z Tahiti. A tak vznikl i název tohoto koktejlu: Mai ta‘ neboli „dobrý“.",
            rating = 3.0,
            ingredients = listOf(
                "Tmavý rum (4 cl)",
                "Světlý rum (2 cl)",
                "Likér Curaçao (1,5 cl)",
                "Mandlový sirup (1,5 cl)",
                "Limetková šťáva (1 cl)",
                "Led"
            ),
            tutorial = "Do shakeru nalijte všechny ingredience kromě tmavého rumu a přidejte led. Obsah shakeru dobře promíchejte a přes sítko přelijte do vysoké sklenice. Poté pomalu přilijte tmavý rum, ozdobte nejlépe plátkem ananasu a plátkem limetky."
        )
    )

    /** tato metoda říká jak má vypadat odpověď pro každý drink pokud si necháváme poslat údaje o každém drinku */
    override suspend fun getAllDrinks(page: Int): DrinkApiResponse {
        return DrinkApiResponse(
            success = true,
            message = "ok",
            prevPage = calculatePage(page = page)[PREVIOUS_PAGE_DRINK_KEY],
            nextPage = calculatePage(page = page)[NEXT_PAGE_DRINK_KEY],
            drinks = drinks[page]!!,
            lastUpdated = System.currentTimeMillis()
        )
    }

    /** tato metoda spočítá jaká stránka je příští a jaká předchozí pro daný drink - předchozí stránka pro první stránku
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
        return mapOf(PREVIOUS_PAGE_DRINK_KEY to prevPage, NEXT_PAGE_DRINK_KEY to nextPage)
    }

    /** tato metoda říká jak má vypadat odpověď pro každý drink co bude mít ve jméně text který uživatel vyhledá */
    override suspend fun searchDrinks(name: String?): DrinkApiResponse {
        return DrinkApiResponse(
            success = true,
            message = "ok",
            drinks = findDrinks(query = name)
        )
    }

    /** tato metoda slouží k vyhledávání drinků */
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