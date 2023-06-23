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
            13 to page13
        )
    }

    override val page1 = listOf(
        IngredientFamily(
            id = 1,
            name = "Amaretto",
            description = "Amaretto je sladký italský likér, který tradičně nabízí silnou mandlovou a meruňkovou chuť, ačkoli se často vyrábí z jádra meruňek nebo broskví, nikoli z mandlí. Jeho jméno pochází z italského \"amaro\", což znamená \"hořký\", ačkoli samotný likér je obecně sladký. Amaretto je populární samotné, jako digestiv, ve směsi s kávou, nebo jako součást různých koktejlů, jako je například Amaretto Sour.",
            image = imagePath + "amaretto.jpg"
        ),
        IngredientFamily(
            id = 2,
            name = "Kahlúa",
            description = "Kahlúa je populární mexický likér s chutí kávy, který se vyrábí ze sladkého cukrového třtinového destilátu a arabiky. Je známý jako klíčová složka v koktejlech jako jsou White Russian, Black Russian nebo Espresso Martini. Své unikátní jméno získal z arabštiny, kde \"kahwa\" znamená kávu.",
            image = imagePath + "kahlua.png"
        ),
        IngredientFamily(
            id = 3,
            name = "Baileys",
            description = "Baileys Irish Cream je irský krémový likér kombinující whisky a smetanu. Populární je pro svůj bohatý a krémový profil s nádechem kávy a čokolády. Ačkoli je smetana a whisky kombinací, která se zdá nestabilní, Baileys může vydržet až dva roky bez zkažení díky unikátnímu procesu emulgace.",
            image = imagePath + "baileys.png"
        )
    )

    override val page2 = listOf(
        IngredientFamily(
            id = 4,
            name = "Absinth",
            description = "Absinth je silný destilovaný alkohol známý pro svou charakteristickou zelenou barvu a hořkou chuť, která je způsobena třezalkou tečkovanou. Tento nápoj se proslavil v 19. a na začátku 20. století mezi umělci a spisovateli, často spojený s halucinogenními účinky, které jsou nyní považovány za mytus. Po mnoho let byl v mnoha zemích zakázán, ale na začátku 21. století se jeho prodej většinou legalizoval.",
            image = imagePath + "absinth.jpg"
        ),
        IngredientFamily(
            id = 5,
            name = "Vodka",
            description = "Vodka je průzračný destilovaný alkoholický nápoj s původem v Východní Evropě, konkrétně v Rusku a Polsku. Vyrobená je obvykle fermentací a destilací obilí nebo brambor, ale může být vyráběna i z jiných surovin. Přestože je známá svou \"neutrální\" chutí, různé značky a druhy vodky mohou mít jemné rozdíly v chuti a hladkosti.",
            image = imagePath + "vodka.png"
        ),
        IngredientFamily(
            id = 6,
            name = "Curaçao",
            description = "Curaçao je likér vyrobený z kůry hořkých pomerančů původem z ostrova Curaçao v Karibiku. Dostupný je v mnoha barvách, nejznámější je pravděpodobně modrý Curaçao, který se často používá v koktejlech pro jeho výraznou barvu. Chutná trochu hořce a je známý svými citrusovými tóny.",
            image = imagePath + "curaçao.png"
        )
    )

    override val page3 = listOf(
        IngredientFamily(
            id = 7,
            name = "Rum",
            description = "Rum je alkoholický nápoj, který se vyrábí fermentací a destilací cukrové třtiny nebo melasy. Existuje v mnoha stylech, včetně světlého, tmavého a kořeněného rumu, a je klíčovou složkou mnoha známých koktejlů, jako jsou Mojito a Daiquiri. Různé regiony, zejména Karibik a Latinská Amerika, jsou známé svými specifickými styly rumu.",
            image = imagePath + "rum.jpg"
        ),
        IngredientFamily(
            id = 8,
            name = "Grenadina",
            description = "Grenadina je sladký rudý sirup, který se tradičně vyrábí z šťávy granátových jablek a cukru, ačkoli dnes mnoho komerčních verzí obsahuje jiné druhy ovocných šťáv a příchutí. Tento sirup se často používá v koktejlech, aby jim dodal sladkost a jasnou barvu. Přestože je grenadina sladká, neobsahuje alkohol.",
            image = imagePath + "grenadina.png"
        ),
        IngredientFamily(
            id = 9,
            name = "Tequila",
            description = "Tequila je destilovaný alkoholický nápoj vyráběný z modré agáve, který pochází z oblasti kolem města Tequila v Mexiku. Existují různé druhy tequily, včetně blanco (bílá), reposado (odpočívaná) a añejo (zralá), které odrážejí různé úrovně stárnutí. Tequila je známá po celém světě a je klíčovou složkou mnoha populárních koktejlů, jako je Margarita a Tequila Sunrise.",
            image = imagePath + "tequila.jpeg"
        )
    )

    override val page4 = listOf(
        IngredientFamily(
            id = 10,
            name = "Heering Cherry",
            description = "Heering Cherry je luxusní třešňový likér z Dánska, který byl poprvé vytvořen v roce 1818. Jeho bohatá a plná třešňová chuť spolu s jemnými nuancemi hořké mandlové příchuti jej dělají oblíbenou volbou pro mnoho klasických koktejlů, včetně známého Singapore Sling. Heering Cherry je také známý tím, že je přirozeně slazen a neobsahuje umělé přísady.",
            image = imagePath + "heering_cherry.jpg"
        ),
        IngredientFamily(
            id = 11,
            name = "Bénédictine",
            description = "Bénédictine je bylinný likér vyráběný ve Francii, který byl údajně vynalezen benediktinskými mnichy v 16. století, i když skutečná historie výroby je méně romantická a spíše souvisí s 19. stoletím. Tento likér je složen z 27 různých bylin a koření, které mu dodávají jeho jedinečnou a složitou chuť. Bénédictine se může pít samotný nebo se používá jako součást koktejlů.",
            image = imagePath + "benedictine.jpg"
        ),
        IngredientFamily(
            id = 12,
            name = "Šampaňské",
            description = "Šampaňské je druh šumivého vína, které pochází z regionu Champagne ve Francii, a název může být použit pouze pro vína z této oblasti. Vyrábí se tradiční metodou druhotného kvašení ve sklenici, což způsobuje jeho charakteristickou bublinkovitost. Šampaňské je známé svou elegancí a je často spojováno s oslavami a speciálními příležitostmi.",
            image = imagePath + "champagne.jpg"
        )
    )

    override val page5 = listOf(
        IngredientFamily(
            id = 13,
            name = "Becherovka",
            description = "Becherovka je tradiční český bylinný likér, vyráběný v Karlových Varech. Je známá svou jedinečnou chutí, kterou získává z tajné směsi bylin a koření. Přestože se často pije samotná jako digestiv, také se používá v řadě koktejlů, včetně populárního Betonu, který kombinuje Becherovku s tonikem.",
            image = imagePath + "becherovka.jpg"
        ),
        IngredientFamily(
            id = 14,
            name = "Cointreau",
            description = "Cointreau je francouzský likér vyrobený z destilátů slupek pomerančů. Je známý svou jasně čistou barvou a bohatou, ale přesto svěží citrusovou chutí. Cointreau je často používán v mnoha klasických koktejlech, jako je Margarita a Cosmopolitan, a může být také pít samotný nebo s ledem.",
            image = imagePath + "cointreau.jpeg"
        ),
        IngredientFamily(
            id = 15,
            name = "Bílé víno",
            description = "Bílé víno je druh vína vyrobený z fermentace bezskořepinového hroznového moštu. Existuje velká škála bílých vín, od suchých až po sladké, od světlejších až po plnější varianty. Mezi nejznámější odrůdy patří Chardonnay, Sauvignon Blanc a Riesling, které se liší v závislosti na klimatu a půdě, kde byly hrozny vypěstovány.",
            image = imagePath + "white_vine.jpg"
        )
    )

    override val page6 = listOf(
        IngredientFamily(
            id = 16,
            name = "Červené víno",
            description = "Červené víno je druh vína, které se vyrábí z hroznů, a to fermentací šťávy spolu se slupkami, což vínu dodává jeho charakteristickou červenou nebo fialovou barvu. Existuje mnoho odrůd červeného vína, včetně Cabernet Sauvignon, Merlot a Pinot Noir, každá s vlastními jedinečnými charakteristikami.",
            image = imagePath + "red_vine.jpeg"
        ),
        IngredientFamily(
            id = 17,
            name = "Brandy",
            description = "Brandy je destilovaný alkoholický nápoj vyráběný z fermentovaného ovoce nebo ovocného vína. Název pochází z nizozemského slova \"brandewijn\", což znamená \"pálené víno\". Brandy se obvykle stárne v dřevěných sudech, často z dubu, což jí dodává jemnou barvu a složitou chuť. Existuje mnoho druhů brandy, včetně Cognacu a Armagnacu, které jsou pojmenované podle regionů ve Francii, kde se vyrábějí.",
            image = imagePath + "brandy.png"
        ),
        IngredientFamily(
            id = 18,
            name = "Gin",
            description = "Gin je destilovaný alkoholický nápoj, který získává svůj charakteristický chutný profil z použití jalovce jako klíčového botanického prvku. Původem z Holandska, gin se stal velmi populární v Británii a je základem mnoha klasických koktejlů, včetně ginu a toniku a martini. Existují různé styly ginu, včetně London Dry Ginu a Dutch Jenever, každý s vlastními specifickými pravidly pro výrobu a chutí.",
            image = imagePath + "gin.jpg"
        )
    )

    override val page7 = listOf(
        IngredientFamily(
            id = 19,
            name = "Vermut",
            description = "Vermut je druh aromatizovaného a často hořkého vína, které je ochuceno různými bylinami, kořením, květinami a kůrou. Existují dva hlavní typy vermutu: sladký (často červený) a suchý (často bílý). Vermut se často používá v koktejlech, jako je Martini nebo Negroni, a také se může pít samotný jako aperitiv. Jeho původ je v Itálii a Francii.",
            image = imagePath + "vermut.jpg"
        ),
        IngredientFamily(
            id = 20,
            name = "Campari",
            description = "Campari je italský hořký likér známý svou jasně červenou barvou a komplexní chutí, která je kombinací hořkosti, sladkosti a bylinných tónů. Byl vytvořen v roce 1860 Gasparem Camparim a receptura zůstává tajemstvím, i když je známo, že obsahuje více než 60 ingrediencí, včetně bylin, koření, kůry a ovocné šťávy. Campari je často součástí koktejlů, jako je Negroni nebo Americano.",
            image = imagePath + "campari.jpg"
        ),
        IngredientFamily(
            id = 21,
            name = "Triple sec",
            description = "Triple sec je druh sladkého a silného pomerančového likéru. Jeho název, který v překladu z francouzštiny znamená \"trojnásobně suchý\", odkazuje na jeho destilační proces. Triple sec se často používá v koktejlech pro svůj výrazný citrusový profil, je klíčovou součástí mnoha klasických koktejlů, jako je Margarita a Cosmopolitan. Cointreau a Grand Marnier jsou známé značky triple secu.",
            image = imagePath + "triple_sec.jpg"
        )
    )

    override val page8 = listOf(
        IngredientFamily(
            id = 22,
            name = "Whisky",
            description = "Whisky je destilovaný alkoholický nápoj vyrobený z kvašeného obilného mashu, který je poté zraje v dřevěných sudech, obvykle z amerického nebo evropského dubu. Existuje mnoho druhů whisky, včetně skotské whisky (často označované jako Scotch), irské whisky, americké bourbon a rye whisky, každá s vlastními specifickými pravidly pro výrobu a chutí. Whisky může mít širokou škálu chutí a aromat, včetně sladkosti, kořenitosti a dřevitých tónů.",
            image = imagePath + "whisky.jpg"
        ),
        IngredientFamily(
            id = 23,
            name = "Bourbon",
            description = "Bourbon je druh americké whisky, který se vyznačuje jemnou a bohatou chutí. Podle zákona musí být vyroben z minimálně 51% kukuřice a zrát v nových vypálených dubových sudech, což mu dodává jeho charakteristickou sladkou a plnou chutí s tóny vanilky, karamelu a dřeva. Bourbon je pojmenován po Bourbon County v Kentucky, ačkoli může být vyráběn kdekoli ve Spojených státech.",
            image = imagePath + "bourbon.jpg"
        ),
        IngredientFamily(
            id = 24,
            name = "Zázvorové pivo",
            description = "Zázvorové pivo, známé také jako ginger beer, je sladký, perlivý nápoj, který se vyrábí fermentací přírodních cukrů a zázvoru, což mu dodává jeho charakteristickou ostrou a pikantní chuť. Původně se vyrábělo jako alkoholický nápoj, ale dnes je většina zázvorového piva bezalkoholová. Zázvorové pivo je klíčovou složkou některých koktejlů, jako je Moscow Mule.",
            image = imagePath + "ginger_ale.jpg"
        )
    )

    override val page9 = listOf(
        IngredientFamily(
            id = 25,
            name = "Sekt",
            description = "Sekt je termín používaný pro německé a rakouské šumivé víno. Podobně jako šampaňské, sekt je vyroben druhotným kvašením, ale může být vyroben z různých druhů hroznů a ne všechny styly vyžadují kvašení v lahvi. Sekt se obvykle vyznačuje jemnými bublinkami a svěží, ovocnou chutí, a je populární volbou pro oslavy a jako aperitiv.",
            image = imagePath + "sekt.jpg"
        ),
        IngredientFamily(
            id = 26,
            name = "Drambuie",
            description = "Drambuie je skotský likér, který se vyrábí z whisky, medu, bylin a koření. Jeho jméno pochází z gaelského \"An Dram Buidheach\", což znamená \"nápoj, který uspokojuje\". Drambuie je známý svou bohatou a sladkou chutí s náznaky koření a bylin. Může být pít samotný, se zmrzlinou nebo jako součást koktejlů, jako je Rusty Nail.",
            image = imagePath + "drambuie.jpg"
        ),
        IngredientFamily(
            id = 27,
            name = "Midori",
            description = "Midori je sladký melounový likér původem z Japonska, známý svou zářivě zelenou barvou a svěží chutí. Slovo \"midori\" znamená v japonštině \"zelená\". Přestože se může pít samotný, je často součástí různých koktejlů, jako je například Midori Sour. Midori byl poprvé představen v roce 1978 na party v newyorském Studio 54.",
            image = imagePath + "midori.png"
        )
    )

    override val page10 = listOf(
        IngredientFamily(
            id = 28,
            name = "Galliano",
            description = "Galliano je italský likér, který se vyznačuje sladkou vanilkovou a anýzovou chutí a zlatou barvou. Je známý pro svou vysokou, úzkou láhev a je vyroben z více než 30 různých bylin a koření. Galliano se často pije samotný jako digestiv, ale je také klíčovou složkou některých koktejlů, jako je Harvey Wallbanger.",
            image = imagePath + "galliano.jpg"
        ),
        IngredientFamily(
            id = 29,
            name = "Maraschino",
            description = "Maraschino je sladký likér, který se vyrábí z destilace maraschino třešní, včetně jejich jader, což mu dodává jemný mandlový podtón. Pochází z Dalmácie, regionu v Chorvatsku, ale je nyní vyráběn po celém světě. Maraschino se používá v mnoha klasických koktejlech, jako je například Aviator nebo Hemingway Daiquiri.",
            image = imagePath + "maraschino.jpg"
        ),
        IngredientFamily(
            id = 30,
            name = "Zelený chartreuse",
            description = "Zelený Chartreuse je francouzský bylinný likér, který vyrábějí kartuziánští mniši podle tajné receptury, která se předává od roku 1605. Obsahuje více než 130 různých bylin a rostlin a je známý svou silnou a složitou chutí a svou zářivě zelenou barvou. Chartreuse se často pije samotný jako digestiv, ale je také součástí některých koktejlů, jako je například Last Word.",
            image = imagePath + "green_chartreuse.jpg"
        )
    )

    override val page11 = listOf(
        IngredientFamily(
            id = 31,
            name = "Sambuca",
            description = "Sambuca je italský likér, který se vyznačuje silnou anýzovou chutí, často doplněnou jinými přísadami, jako je máta nebo další bylinky. Je obvykle průzračný, ale existují také tmavé varianty. Sambuca se často podává s několika kávovými zrny, které symbolizují zdraví, štěstí a prosperitu. Někdy se také flambuje, aby se uvolnily chutě z kávových zrn.",
            image = imagePath + "sambuca.jpg"
        ),
        IngredientFamily(
            id = 32,
            name = "Advocaat",
            description = "Advocaat je bohatý a krémový likér z Nizozemska, který se vyrábí z vaječných žloutků, cukru, brandy a někdy také vanilky. Advocaat je obvykle podáván jako digestiv a je také hlavní složkou některých koktejlů, jako je Snowball.",
            image = imagePath + "advocaat.jpg"
        ),
        IngredientFamily(
            id = 33,
            name = "Koňak",
            description = "Koňak je druh brandy, který se vyrábí ve francouzském regionu Cognac podle přísných pravidel - musí být dvojitě destilován v měděných kotlích a zrát minimálně dva roky v dubových sudech. Výsledkem je bohatý a složitý alkoholický nápoj s chutí ovoce, květin, dřeva a koření. Koňak je často považován za luxusní produkt a některé staré nebo vzácné láhve mohou dosáhnout velmi vysokých cen.",
            image = imagePath + "cognac.jpg"
        )
    )

    override val page12 = listOf(
        IngredientFamily(
            id = 34,
            name = "Jägermeister",
            description = "Jägermeister je německý bylinný likér, který je známý svou tmavě hnědou barvou a jedinečnou chutí, která kombinuje sladké, hořké a kořeněné tóny. Jägermeister se vyrábí z 56 různých bylin, ovoce, koření a kořenů - přesná receptura je tajná. Tento likér je často podáván jako digestiv a je také populární složkou některých koktejlů a shotů, jako je například Jägerbomb.",
            image = imagePath + "jagermeister.jpg"
        ),
        IngredientFamily(
            id = 35,
            name = "Malibu",
            description = "Malibu je sladký likér s příchutí karibského rumu a kokosového mléka. Pochází z Barbadosu a je známý svou svěží a tropickou chutí, která je ideální pro letní koktejly. Malibu je základem mnoha populárních koktejlů, včetně Piña Colady. Jeho lehká, sladká chuť a nižší obsah alkoholu ho činí oblíbeným výběrem pro ty, kteří preferují méně silné alkoholické nápoje.",
            image = imagePath + "malibu.jpg"
        ),
        IngredientFamily(
            id = 36,
            name = "Pivo",
            description = "Pivo je jeden z nejstarších a nejrozšířenějších alkoholických nápojů na světě. Je vyráběno kvašením obilovin, nejčastěji ječmene, vody, kvasinek a chmele, který dodává typickou hořkost a aroma. Pivo je také důležitou součástí mnoha kultur a je oblíbené pro svou rozmanitost, přístupnost a sociální povahu konzumace.",
            image = imagePath + "beer.jpg"
        )
    )

    override val page13 = listOf(
        IngredientFamily(
            id = 37,
            name = "Lillet blanc",
            description = "Lillet Blanc je francouzský aperitiv z oblasti Bordeaux, který se vyrábí z bílého vína a je obohacený o tajný mix bylin a ovocných likérů. Má jemnou ovocnou a kořeněnou chuť s nádechem hořkosti od chininové kůry. Lillet Blanc se často pije chlazený s kůrou z citrusových plodů, ale je také klíčovou složkou některých koktejlů, včetně klasického Vesper Martini, který je známý z knih a filmů o Jamesi Bondovi.",
            image = imagePath + "lillet_blanc.jpg"
        ),
        IngredientFamily(
            id = 38,
            name = "Calvados",
            description = "Calvados je druh brandy, který pochází z Normandie ve Francii a je vyroben z jablek, ačkoli některé druhy mohou také obsahovat hrušky. Prochází procesem fermentace, destilace a pak zrání v dřevěných sudech, což mu dodává bohatou a složitou chuť s náznaky ovoce, vanilky a karamelu.",
            image = imagePath + "calvados.jpg"
        ),
        IngredientFamily(
            id = 39,
            name = "Slivovice",
            description = "Slivovice je tradiční český a slovenský pálený alkohol vyráběný z fermentovaných sliv. Je známá svou silnou, ale hladkou chutí a vysokým obsahem alkoholu, často přesahujícím 50%. Slivovice je často vyráběná domácnostmi v regionech, kde se pěstují švestky. Tento destilát je oblíbený jako digestiv nebo při speciálních příležitostech a slavnostech.",
            image = imagePath + "slivovice.jpg"
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
        if (page in 1..12) {
            nextPage = nextPage?.plus(1)
        }
        if (page in 2..13) {
            prevPage = prevPage?.minus(1)
        }
        if (page == 1) {
            prevPage = null
        }
        if (page == 13) {
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