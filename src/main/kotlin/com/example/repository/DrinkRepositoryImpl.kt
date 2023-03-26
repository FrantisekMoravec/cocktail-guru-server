package com.example.repository

import com.example.models.DrinkApiResponse
import com.example.models.Drink

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
            20 to page20,
            21 to page21,
            22 to page22,
            23 to page23,
            24 to page24,
            25 to page25,
            26 to page26,
            27 to page27,
            28 to page28,
            29 to page29,
            30 to page30,
            31 to page31,
            32 to page32,
            33 to page33,
            34 to page34
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

    override val page6 = listOf(
        Drink(
            id = 16,
            name = "Long Island Iced Tea",
            image = "/images/drinks/long_island_iced_tea.jpg",
            description = "Poprvé byl Long Island Iced Tea namíchán buď v roce 1920 nebo v pozdějších 70. letech.Asi nejznámější a zároveň nejpravděpodobnější teorie o vzniku Long Island Icea Tea nám říká, že prvním, kdo se stavil do role autora tohoto koktejlu, byl jistý Robert Butt, zvaný „Rosebud“. Během svého působení na Oak Beach Inn na Long Islandu ve státě New York se totiž v roce 1972 účastnil soutěže, ve které měli soutěžící připravit nový drink za pomoci Triple secu.",
            rating = 5.0,
            ingredients = listOf(
                "Vodka (1,5 cl)",
                "Stříbrná tequila (1,5 cl)",
                "Bílý rum (1,5 cl)",
                "Triple sec (1,5 cl)",
                "Gin (1,5 cl)",
                "Citronová šťáva (2,5 cl)",
                "Gomme sirup (3 cl)",
                "1 střik coca-coly",
                "Led"
            ),
            tutorial = "Jelikož je obtížnější sehnat u nás Gomme sirup, lze tuto ingredienci nahradit cukrovým sirupem. Do sklenice vložíme led a poté postupně přilíváme ostatní ingredience. Po přidání coly vše jemně promícháme, přidáme brčko a sklenici ozdobíme plátkem citronu."
        ),
        Drink(
            id = 17,
            name = "Martini",
            image = "/images/drinks/martini.jpg",
            description = "Jedna z mnoha teorií o vzniku martini říká, že Martini vymyslel jistý barman v hotelu Knickerbocker v americkém New Yorku někdy mezi léty 1911 a 1912. Nutno však zmínit, že právě ve 20. letech 20. století byla v Americe zavedena prohibice. Ta ovšem, stejně jako snadná nelegální výroba ginu, vedla ke zvýšení popularity Martini a to se tak v té době stalo nejvyhledávanějším koktejlem v USA. V té době mu propadl i slavný spisovatel Ernest Hemingway.",
            rating = 5.0,
            ingredients = listOf(
                "Gin (5,5 cl)",
                "Suchý Vermut (1,5 cl)",
                "Led",
                "Oliva"
            ),
            tutorial = "Gin a vermut smícháme v mixovací sklenici společně s kostkami ledu a přes sítko přelijeme do sklenice. Ozdobíme jednou či dvěma olivami na napichovátku."
        ),
        Drink(
            id = 18,
            name = "Manhattan",
            image = "/images/drinks/manhattan.png",
            description = "Píše se rok 1870 a u zrodu slavného Manhattanu stojí jistý Dr. Iain Marshall a to přímo ve slavném Manhattan Clubu v NY City. Na počest prezidentské kandidatury Samuela J. Tildena se zde totiž koná banket, pořádaný Jennie Jerome – budoucí matkou Winstona Churchilla, a podává se zde netradiční a neokoukaný míchaný nápoj – Manhattan. Koktejl všem náramně chutná a i po banketu je velice žádaným pitím v ostatních New Yorských barech.",
            rating = 5.0,
            ingredients = listOf(
                "Whisky/Bourbon (5 cl)",
                "Sladký červený vermut (2 cl)",
                "Kapka angostura aromatic bitteru"
            ),
            tutorial = "Veškeré ledově vychlazené ingredience vložíme do míchací sklenice, zamícháme a přes sítko nalijeme do koktejlové sklenice. Můžeme přiložit třešničku."
        )
    )

    override val page7 = listOf(
        Drink(
            id = 19,
            name = "Moscow mule",
            image = "/images/drinks/moscow_mule.jpg",
            description = "Koktejl vznikl roku 1941 v New Yorku. První příběh nás zavede na Manhattan, do Chatham Hotel. Sešli se zde tři známí, John Martin (distributor vodky Smirnoff), Jack Morgan (výrobce zázvorového piva a majitel baru) a Sophie Berezinski (dcera majitele továrny na zpracování mědi). Všichni tři potřebovali zvýšit prodej svých výrobků, a tak se jim za večer zrodil nápad, který by pomohl všem. Smíchat jemnou vodku Smirnoff od Johna s Jackovo zázvorovým pivem a podávat ji v měděných hrncích od Sophie. Už týden po jejich schůzce byl koktejl známý pod svým jménem Moscow Mule a brzy se rozšířil po celé Americe.",
            rating = 5.0,
            ingredients = listOf(
                "Vodka (5 cl)",
                "Zázvorové pivo (15 cl)",
                "Půl limetky",
                "Led"
            ),
            tutorial = "Do sklenice prvně vymačkáme polovinu limetky, následně přilejeme vodku. Sklenici naplníme kostkami ledu až po okraj. Nakonec vše zalijeme zázvorovým pivem. Stačí už jen lehce promíchat lžičkou. Mícháme pomalu tak, aby nám nevypadl žádný led a zázvorové pivo nevypěnilo. Koktejl ozdobíme kouskem čerstvé limetky a můžeme přidat i čerstvý plátek zázvoru."
        ),
        Drink(
            id = 20,
            name = "Margarita",
            image = "/images/drinks/margarita.jpg",
            description = "Jedná se o koktejl na bázi tequily a citrusových plodů. Margarita se poprvé objevila v 30. letech 20. století v Tijuaně v Mexiku, kde ji údajně vytvořil Carlos 'Danny' Herrera pro americkou zpěvačku Marjorie King. Původně se koktejl podával bez ledu a míchal se s rovným množstvím soli a limetkové šťávy na okrajích sklenice.",
            rating = 5.0,
            ingredients = listOf(
                "Tequila (5 cl)",
                "Cointreau (2 cl)",
                "Čerstvě vymačkaná limetková šťáva (2 cl)",
                "Led"
            ),
            tutorial = "Všechny ingredience vložíme do shakeru s kostkami ledu a důkladně promícháme. Margaritu podáváme v připravených sklenicích s okrajem osoleným solí. Sklenice naplníme ledem a přelijeme směsí. Ozdobíme plátkem limetky a podáváme s brčkem."
        ),
        Drink(
            id = 21,
            name = "Whiskey Sour",
            image = "/images/drinks/whiskey_sour.jpg",
            description = "Whiskey Sour je koktejl, který má své kořeny hluboko v americké historii. Jeho původ sahá až do 19. století, kdy se poprvé objevil v knize s názvem 'The Bartender's Guide' od Jerryho Thomase. Koktejl se stal velmi populárním v dobách prohibice, kdy byl whiskey jedním z mála alkoholů, který byl legální. Dnes se Whiskey Sour stále řadí mezi nejoblíbenější koktejly v USA.",
            rating = 5.0,
            ingredients = listOf(
                "Bourbon (5 cl)",
                "Čerstvě vymačkaná citronová šťáva (2,5 cl)",
                "Cukerný sirup (1,5 cl)",
                "Led"
            ),
            tutorial = "Všechny ingredience vložíme do shakeru s kostkami ledu a důkladně promícháme. Koktejl podáváme v připravených sklenicích s kostkami ledu. Garnujeme plátkem citronu a případně kořením jako je muškátový oříšek nebo skořice. Pokud chceme koktejl osladit, můžeme přidat trochu cukerného sirupu."
        )
    )

    override val page8 = listOf(
        Drink(
            id = 22,
            name = "Tom Collins",
            image = "/images/drinks/tom_collins.jpg",
            description = "Tom Collins je osvěžující koktejl z ginu, citronové šťávy, cukru a perlivé vody. Podle legendy vznikl v 19. století v Londýně, kdy byl zmiňován v knize The Bartender's Guide od Jerryho Thomase. Koktejl byl velmi populární v 50. letech 20. století, kdy byly na vrcholu popularity koktejly s ginem. Nicméně i dnes si Tom Collins udržuje své místo mezi nejpopulárnějšími koktejly.",
            rating = 5.0,
            ingredients = listOf(
                "Gin (5 cl)",
                "Cukr (2 lžičky)",
                "Citronová šťáva (2,5 cl)",
                "Perlivá voda (cca 10 cl)",
                "Led"
            ),
            tutorial = "Nejprve do sklenice dáme gin, cukr a citronovou šťávu a zamícháme, dokud se cukr nerozpustí. Následně do sklenice naplníme ledem a dolijeme perlivou vodu až téměř na vrchol. Koktejl ozdobíme kolečkem citronu a máme hotovo."
        ),
        Drink(
            id = 23,
            name = "Kir Royale",
            image = "/images/drinks/kir_royale.jpg",
            description = "Kir Royale je elegantní francouzský koktejl, který vznikl v Burgundsku. Jeho vznik se datuje do 40. let minulého století, kdy byl původní Kir (založený na bílém víně) vylepšen přidáním šumivého vína. Nápoj je pojmenován po Félixi Kirovi, bývalém starostovi Dijonu a vášnivém propagátorovi burgundských vín. Je to skvělá volba pro ty, kteří preferují sladké nápoje s mírným alkoholovým obsahem.",
            rating = 5.0,
            ingredients = listOf(
                "Crème de cassis (2 cl)",
                "Šumivé víno (cca 10 cl)",
                "Čerstvé maliny (několik kusů)"
            ),
            tutorial = "Nejprve do šampaňského poháru (nebo do sklenice na martini) přidáme 2 cl crème de cassis. Následně dolijeme šumivým vínem, nejlépe šampaňským, a to až k okraji sklenice. Nakonec můžeme do sklenice přidat několik čerstvých malin, které nápoj ještě oživí.",
        ),
        Drink(
            id = 24,
            name = "White Russian",
            image = "/images/drinks/white_russian.jpg",
            description = "White Russian je koktejl složený ze tří ingrediencí - kávy, vodky a smetany. Poprvé byl tento drink připraven v roce 1949 v Belgii, a to s použitím ginu. O několik let později, v 60. letech, se však již používala vodka. White Russian se stal velmi populárním v 70. letech v USA díky filmu The Big Lebowski, v němž jej pil hlavní hrdina Dude. Dnes je tento drink oblíbený po celém světě pro svou jednoduchost a lahodnou chuť.",
            rating = 4.8,
            ingredients = listOf(
                "Vodka (5 cl)",
                "Káva (10 cl)",
                "Smetana (2 cl)"
            ),
            tutorial = "Do sklenice s kostkami ledu nalijeme vodku a kávu a promícháme. Nakonec přidáme smetanu a lehce promícháme. Můžeme ozdobit kouskem čokolády nebo kávovými zrny. ",
        )
    )

    override val page9 = listOf(
        Drink(
            id = 25,
            name = "Caipirinha",
            image = "/images/drinks/caipirinha.jpg",
            description = "Caipirinha je národním nápojem Brazílie a původně se vyrábí ze zeleného cukrového třtinového sirupu zvaného 'guarana'. V současnosti se často používá bílý cukr nebo cukr krystal. Kromě cukru se do nápoje přidává limetka a Cachaça - brazilský destilát z cukrové třtiny. Caipirinha je silný, osvěžující koktejl s výraznou chutí.",
            rating = 5.0,
            ingredients = listOf(
                "Cachaça (6 cl)",
                "Limetka (1 ks)",
                "Cukr (2-3 lžičky)",
                "Led (drcený)"
            ),
            tutorial = "Limetku omyjeme, očistíme a nakrájíme na menší kousky, které vložíme do sklenice. Přidáme cukr a vidličkou promícháme, dokud se cukr nerozpustí. Přidáme led a zalijeme Cachaçou. Opět promícháme a ozdobíme kousky limetky."
        ),
        Drink(
            id = 26,
            name = "Zombie",
            image = "/images/drinks/zombie.png",
            description = "Tento exotický drink vznikl na přelomu 30. a 40. let v restauraci Don the Beachcomber na Havaji, kterou vlastnil Ernest Beaumont-Gantt. Jeho receptura je dodnes tajná, ale ví se, že obsahuje celou řadu alkoholických ingrediencí a název má podle své silné účinnosti. Podle legendy Beaumont-Gantt tvrdil, že dvě zkonzumované Zombie stačí k tomu, aby vás nechali pohybovat se jako nemrtvý.",
            rating = 4.5,
            ingredients = listOf(
                "Zlatý rum (3 cl)",
                "Bílý rum (3 cl)",
                "Kapka rumu s banánovou příchutí (2 cl)",
                "Bílý rum s kokosovou příchutí (2 cl)",
                "Pomerančová šťáva (2 cl)",
                "Citronová šťáva (2 cl)",
                "Ananasová šťáva (2 cl)",
                "Grenadina (1 cl)",
                "Angostura kořenová (1 dash)",
                "Kostky ledu"
            ),
            tutorial = "V shakeru smícháme zlatý rum, bílý rum, rum s banánovou příchutí, bílý rum s kokosovou příchutí, pomerančovou, citronovou a ananasovou šťávu a grenadinu. Přidáme kostky ledu a důkladně protřepeme. Koktejl přelijeme přes sítko do vysoké sklenice a přidáme 1 dash Angostura kořenové. Do sklenice přidáme další kostky ledu a podle chuti můžeme ozdobit kouskem ananasu, pomeranče nebo třešní."
        ),
        Drink(
            id = 27,
            name = "Singapore sling",
            image = "/images/drinks/singapore_sling.jpg",
            description = "Singapore sling je exotický koktejl s ovocným nádechem, který byl vynalezen v roce 1915 v Raffles Hotel v Singapuru. Přesný recept se od té doby změnil a různé bary využívají různé variace. V současnosti existuje mnoho verzí Singapore sling, ale základem zůstávají gin, likér Cherry Heering, Triple sec, ananasový a citronový džus, angostura a grenadina. Do drinku se také přidávají rozličné bylinky a koření, jako je skořice, badyán a zázvor. Při servírování se Singapore sling podává vysoké sklenici s ledem a ozdobí se plátkem ananasu a třešní.",
            rating = 4.5,
            ingredients = listOf(
                "Gin (3 cl)",
                "Cherry Heering likér (1,5 cl)",
                "Bénédictine likér (1,5 cl)",
                "Angostura (2 dashes)",
                "Triple sec (0,75 cl)",
                "Ananasový džus (6 cl)",
                "Citrónová šťáva (1,5 cl)",
                "Grenadina (1 cl)",
                "Soda (6 cl)",
                "Led"
            ),
            tutorial = "Do shakeru vložíme všechny ingredience kromě sody a angostury a  naplníme ledem. Dobře protřepeme, poté přeslijeme do vysoké sklenice s ledem. Přidáme sodu a angosturu, zakápneme grenadinou a promícháme. Na závěr ozdobíme plátkem ananasu a třešní.",
        )
    )

    override val page10 = listOf(
        Drink(
            id = 28,
            name = "Šroubovák",
            image = "/images/drinks/screwdriver.jpg",
            description = "Šroubovák je jednoduchý koktejl, který vznikl v USA během 2. světové války. Koktejl získal své jméno podle skříňařského nářadí, které se používalo ke smíchání ingrediencí. Hlavními ingrediencemi jsou vodka a pomerančový džus, přičemž poměr těchto dvou složek se liší dle preference konzumenta.",
            rating = 4.5,
            ingredients = listOf(
                "Vodka (6 cl)",
                "Pomerančový džus (12 cl)",
                "Led"
            ),
            tutorial = "Do vysoké sklenice dáme led a přidáme vodku. Následně dolijeme pomerančový džus a jemně promícháme. Můžeme ozdobit plátkem pomeranče nebo kolečkem citronu."
        ),
        Drink(
            id = 29,
            name = "White Sangria",
            image = "/images/drinks/white_sangria.jpg",
            description = "Sangria je tradiční španělský nápoj založený na směsi vína s ovocem a dalšími ingrediencemi. Tento bílý variant vznikl v posledních desetiletích a získal si oblibu po celém světě. Bílé víno se smíchá s brandy, citronovou limonádou a ovocem (nejčastěji jablky, hrozny a broskvemi).",
            rating = 4.5,
            ingredients = listOf(
                "Bílé víno (1 láhev)",
                "Brandy (60 ml)",
                "Citronová limonáda (500 ml)",
                "Jablka (2 ks)",
                "Hrozny (hrst)",
                "Broskve (2 ks)",
                "Led"
            ),
            tutorial = "Jablka a broskve nakrájíme na tenké plátky a smícháme s hrozny. Vše vložíme do džbánu. Přidáme brandy a víno a zamícháme. Necháme odležet alespoň hodinu, nejlépe však přes noc, aby se chutě promíchaly. Před podáváním přidáme led a dolijeme citronovou limonádou. Podáváme v miskách nebo velkých sklenicích."
        ),
        Drink(
            id = 30,
            name = "French 75",
            image = "/images/drinks/french_75.png",
            description = "Tento osvěžující koktejl byl vynalezen v Paříži v roce 1915. Jeho jméno odkazuje k francouzské polní houfnici z první světové války, neboť tvůrce koktejlu tvrdil, že byl pro jeho sílu a efektivitu pojmenován podle této zbraně. French 75 se vyrábí z ginu, citronové šťávy, cukru a sektu. Ačkoli se může zdát, že jde o koktejl pro náročné, výsledek stojí za to.",
            rating = 4.8,
            ingredients = listOf(
                "Gin (4,5 cl)",
                "Čerstvá citronová šťáva (1,5 cl)",
                "Cukr (1,5 cl)",
                "Sekt (6 cl)"
            ),
            tutorial = "Do shakeru naplníme ledem a přidáme gin, citronovou šťávu a cukr. Vše důkladně protřepeme, aby se cukr rozpustil. Poté nápoj přecedíme přes síto do šampaňského poháru a doplníme sekt. Koktejl můžeme ozdobit tenkou plátkem citronu."
        )

    )

    override val page11 = listOf(
        Drink(
            id = 31,
            name = "Brandy Alexander",
            image = "/images/drinks/brandy_alexander.jpg",
            description = "Brandy Alexander je sladký koktejl, který se skládá ze dvou hlavních ingrediencí: brandy a smetany. Zajímavostí je, že Brandy Alexander byl původně vytvořen jako nápoj pro dámy, protože se v 20. letech 20. století měla špatná pověst ženy, které pilly tvrdý alkohol. Koktejl se ale brzy stal populární i u mužů a dodnes patří k jedněm z nejoblíbenějších dezertních nápojů. Kromě brandy a smetany se do něj přidává také čokoládový sirup, vanilková příchuť a mletý muškátový oříšek. Podává se v koktejlovém skle s trochou nastrouhaného muškátového oříšku na vrcholu.",
            rating = 4.5,
            ingredients = listOf(
                "Brandy (5 cl)",
                "Smetana (5 cl)",
                "Čokoládový sirup (2 cl)",
                "Vanilkový extrakt (2 cl)",
                "Mletý muškátový oříšek (špetka)",
                "Led"
            ),
            tutorial = "Vložte všechny ingredience do mixéru a rozmixujte, dokud směs není krémová a hladká. Nalijte do koktejlového skla a posypte nastrouhaným muškátovým oříškem. Podávejte okamžitě."
        ),
        Drink(
            id = 32,
            name = "Dark and Stormy",
            image = "/images/drinks/dark_and_stormy.jpg",
            description = "Tento koktejl vznikl na Bermudách a je charakteristický kombinací tmavého rumu a zázvorového piva. Název je příznačný díky tmavému rumu, který symbolizuje temnou a bouřlivou oblohu, a zázvorovému pivu, které evokuje bouři v moři.",
            rating = 4.8,
            ingredients = listOf(
                "Tmavý rum (6 cl)",
                "Zázvorové pivo (15 cl)",
                "Lime (1 ks)",
                "Led"
            ),
            tutorial = "Do sklenice s ledem nalijeme rum a přidáme šťávu z jedné limetky. Sklenici doplníme zázvorovým pivem a koktejl promícháme. Ozdobíme plátkem limetky a můžeme ihned podávat."
        ),
        Drink(
            id = 33,
            name = "Hurikán",
            image = "/images/drinks/hurricane.jpg",
            description = "Hurikán je sladký a ovocný koktejl, který vznikl na začátku 20. století na Novém Orleansu. Nápoj se stal oblíbeným mezi turisty, kteří navštěvovali Bourbon Street, a během 60. let se rozšířil po celých USA. Hurikán je obvykle podáván v množství 300-400 ml a mívá velmi silnou chuť, kterou lze mírnit přidáním sodové vody nebo džusu.",
            rating = 4.5,
            ingredients = listOf(
                "Světlý a tmavý rum (4 cl každý)",
                "Marakuja (4 cl)",
                "Ananasový džus (2 cl)",
                "Pomerančový džus (2 cl)",
                "Limetkový džus (2 cl)",
                "Cukr (1 lžička)",
                "Led"
            ),
            tutorial = "Hurikán se obvykle připravuje ve speciální sklenici ve tvaru trubice, ale lze jej také podávat v koktejlové sklenici. Do sklenice s kubovým ledem nalijeme světlý a tmavý rum, marakuju, ananasový, pomerančový a limetkový džus a lžičku cukru. Vše důkladně promícháme a ozdobíme kouskem ovoce nebo citrusovou kůrou. Pokud nápoj chceme mírnější, můžeme přidat sodovou vodu nebo více ovocného džusu. Pokud si přejeme větší množství, můžeme použít shaker a ingredience důkladně protřepat s ledem, poté nalijeme přes sítko do sklenice."
        )
    )

    override val page12 = listOf(
        Drink(
            id = 34,
            name = "Rezavý hřebík",
            image = "/images/drinks/rusty_nail.jpg",
            description = "Tento koktejl je považován za tradiční skotský nápoj a jeho původ se datuje do 60. let. Skotská whisky se smíchá se sladkým likérem Drambuie, který je vyroben z medu, bylin a koření. Název koktejlu odkazuje na vzhled nápoje, který díky kombinaci whisky a likéru získává jantarovou barvu, podobnou barvě rezavého hřebíku.",
            rating = 4.5,
            ingredients = listOf(
                "Skotská whisky (4,5 cl)",
                "Drambuie (1,5 cl)",
                "Kostky ledu"
            ),
            tutorial = "Do sklenice přidáme kostky ledu, whisky a Drambuie. Koktejl mícháme lžičkou, až se všechny ingredience propojí a nápoj získá svou charakteristickou chuť a vůni. Rezavý hřebík se podává v malých sklenicích a je ideální jako digestivum po jídle. Na ozdobu můžeme použít kousek pomeranče nebo citronovou kůru."
        ),
        Drink(
            id = 35,
            name = "El Diablo",
            image = "/images/drinks/el_diablo.jpg",
            description = "El Diablo je populární koktejl založený na tekile, který se poprvé objevil v roce 1946 v kalifornském baru Tommy's Mexican Restaurant. Jeho název v překladu znamená Ďábel a naráží na tmavou barvu nápoje a na to, že obsahuje zázvorový likér Ginger Ale, který dodává nápoji lehce pikantní chuť.",
            rating = 4.3,
            ingredients = listOf(
                "Tekila (4 cl)",
                "Crème de Cassis (1,5 cl)",
                "Limetková šťáva (1 cl)",
                "Ginger Ale",
                "Kostky ledu"
            ),
            tutorial = "Do shakeru přidáme tekilu, Crème de Cassis a limetkovou šťávu. Přidáme led a vše důkladně protřepeme. Nalijeme obsah shakeru do vysoké sklenice plné kostek ledu a dolijeme Ginger Ale. Koktejl můžeme ozdobit kouskem limetky nebo nakrájeným kouskem zázvoru."
        ),
        Drink(
            id = 36,
            name = "Gin Fizz",
            image = "/images/drinks/gin_fizz.png",
            description = "Gin Fizz je osvěžující koktejl na bázi ginu, citronové šťávy, cukru a sodovky. První zmínky o tomto nápoji sahají až do 19. století a koktejl se stal populárním zejména v USA. Dnes existuje mnoho variant tohoto drinku, ale klasický Gin Fizz se vyrábí podle jednoduchého receptu.",
            rating = 4.5,
            ingredients = listOf(
                "Gin (5 cl)",
                "Cukr (1-2 lžičky)",
                "Čerstvá citronová šťáva (2 cl)",
                "Sodovka",
                "Kostky ledu"
            ),
            tutorial = "Do shakeru přidáme gin, cukr a citronovou šťávu. Přidáme led a vše důkladně protřepeme. Nalijeme obsah shakeru do vysoké sklenice plné kostek ledu a dolijeme sodovkou. Koktejl můžeme ozdobit kouskem citronu nebo limetky."
        )
    )

    override val page13 = listOf(
        Drink(
            id = 37,
            name = "Greyhound",
            image = "/images/drinks/greyhound.jpg",
            description = "Greyhound je jednoduchý koktejl na bázi vodky a grapefruitového džusu. Vznikl pravděpodobně v USA v průběhu 20. století. Název koktejlu pochází ze jména rasy psa Greyhound, který je známý svou rychlostí a elegancí, podobně jako tento osvěžující drink.",
            rating = 4.0,
            ingredients = listOf(
                "Vodka (5 cl)",
                "Grapefruitový džus (10 cl)",
                "Led"
            ),
            tutorial = "Do vysoké sklenice plné kostek ledu nalijeme vodku a grapefruitový džus. Obsah sklenice promícháme lžičkou. Koktejl můžeme ozdobit kouskem grapefruitu nebo citronu."
        ),
        Drink(
            id = 38,
            name = "Hairy Navel",
            image = "/images/drinks/hairy_navel.jpg",
            description = "Hairy Navel je sladký koktejl na bázi broskvového likéru a pomerančového džusu. Vznikl v 70. letech v USA a jeho název v překladu znamená 'chlupatý pupík'.",
            rating = 3.5,
            ingredients = listOf(
                "Broskvový likér (2 cl)",
                "Pomerančový džus (10 cl)",
                "Led"
            ),
            tutorial = "Do sklenice naplněné kostkami ledu nalijeme broskvový likér a pomerančový džus. Koktejl důkladně promícháme lžičkou. Pokud chceme, můžeme ho ozdobit plátkem pomeranče nebo broskví."
        ),
        Drink(
            id = 39,
            name = "Japanese Slipper",
            image = "/images/drinks/japanese_slipper.jpg",
            description = "Japanese Slipper je ovocný koktejl vzniklý v Austrálii v 80. letech. Jeho základem je zelená melounová likéru Midori, která mu dodává sladkou a exotickou chuť.",
            rating = 4.5,
            ingredients = listOf(
                "Midori (4 cl)",
                "Cointreau (2 cl)",
                "Citronová šťáva (2 cl)",
                "Led"
            ),
            tutorial = "Do shakeru naplníme led a přidáme Midori, Cointreau a citronovou šťávu. Důkladně protřepeme a koktejl přelijeme do předem připraveného poháru naplněného ledem. Pokud chceme, můžeme koktejl ozdobit plátkem citronu nebo kouskem melounu."
        )
    )

    override val page14 = listOf(
        Drink(
            id = 40,
            name = "Harvey Wallbanger",
            image = "/images/drinks/harvey_wallbanger.jpg",
            description = "Harvey Wallbanger je sladký a ovocný koktejl vzniklý v 50. letech v Kalifornii. Obsahuje vodku, pomerančový džus a Galliano - bylinkový likér s anýzem.",
            rating = 4.0,
            ingredients = listOf(
                "Vodka (4 cl)",
                "Pomerančový džus (12 cl)",
                "Galliano (1,5 cl)",
                "Led"
            ),
            tutorial = "Nejprve do sklenice s kostkami ledu nalijeme vodku a pomerančový džus a důkladně promícháme. Následně přidáme Galliano a opět promícháme. Pokud chceme, můžeme koktejl ozdobit plátkem pomeranče."
        ),
        Drink(
            id = 41,
            name = "John Collins",
            image = "/images/drinks/john_collins.jpg",
            description = "John Collins je osvěžující koktejl, který vznikl v 19. století v Anglii. Jeho základem je gin a citronová šťáva, doplněné o sodovou vodu a led.",
            rating = 4.0,
            ingredients = listOf(
                "Gin (4 cl)",
                "Citronová šťáva (2 cl)",
                "Cukr (1 lžička)",
                "Sodová voda (12 cl)",
                "Led"
            ),
            tutorial = "Do vysokého sklenice vložíme led a přidáme gin, citronovou šťávu a cukr. Přilijeme sodovou vodu a vše opatrně promícháme lžičkou. Koktejl můžeme ozdobit kolečkem citronu nebo pomeranče a podávat s brčkem."
        ),
        Drink(
            id = 42,
            name = "Kalimotxo",
            image = "/images/drinks/kalimotxo.jpg",
            description = "Kalimotxo je populární a levný drink, který vznikl v Baskicku. Je to jednoduchá směs červeného vína a koly, podávaná s ledem a citronem.",
            rating = 3.5,
            ingredients = listOf(
                "Červené víno (100 ml)",
                "Kola (100 ml)",
                "Led",
                "Citronová kůra (na ozdobu)"
            ),
            tutorial = "Do velkého sklenice vložíme led a nalijeme červené víno. Přilijeme kolu a jemně promícháme. Do sklenice můžeme přidat také kousek citronové kůry jako ozdobu. Podáváme s brčkem a můžeme si vychutnat tento jednoduchý, osvěžující a oblíbený drink."
        )
    )

    override val page15 = listOf(
        Drink(
            id = 43,
            name = "Last Word",
            image = "/images/drinks/last_word.jpg",
            description = "Drink Last Word byl vynalezen v Detroitu v průběhu prohibice. Patří mezi tzv. forgotten cocktails, ale díky svému unikátnímu základu byl v posledních letech opět objeven a získal si oblibu v různých barech po celém světě.",
            rating = 4.5,
            ingredients = listOf(
                "Gin (2 cl)",
                "Maraschino likér (2 cl)",
                "Zelený Chartreuse (2 cl)",
                "Čerstvá šťáva z limetky (2 cl)",
                "Kostky ledu"
            ),
            tutorial = "Všechny ingredience vlijeme do shakeru a důkladně protřepeme s ledem, dokud se shaker nezachytí ledem zvenčí. Nalijeme přes sítko do koktejlové sklenice a podáváme s kouskem čerstvého ovoce nebo lístkem máty na ozdobu."
        ),
        Drink(
            id = 44,
            name = "Lemon Drop",
            image = "/images/drinks/lemon_drop.jpg",
            description = "Lemon Drop je osvěžující koktejl s kyselou chutí, který získal své jméno podle cukroví. Jeho základem je vodka, kterou mícháme s citronovou šťávou a jednoduchým sirupem. Koktejl můžeme ozdobit kouskem citronu na okraji sklenice.",
            rating = 4.6,
            ingredients = listOf(
                "Vodka (4 cl)",
                "Citronová šťáva (2 cl)",
                "Jednoduchý sirup (1,5 cl)",
                "Kousek citronu",
                "Led"
            ),
            tutorial = "Do shakeru naplníme ledem, následně přidáme vodka, citronovou šťávu a jednoduchý sirup. Shaker pevně zavřeme a důkladně protřepeme, aby se vše dobře spojilo. Sklenici naplníme kostkami ledu a koktejl přescedíme do sklenice. Na okraj sklenice můžeme připevnit kousek citronu a hotovo."
        ),
        Drink(
            id = 45,
            name = "Lynchburg Lemonade",
            image = "/images/drinks/lynchburg_lemonade.jpg",
            description = "Lynchburg Lemonade je koktejl s příjemně osvěžující chutí citrónu a limetky. Jeho základem je bourbon, který se míchá s citronovou limonádou, limetkovou šťávou a trochou jednoduchého sirupu. Nápoj se podává s plátkem citrónu a je ideální na horké letní dny.",
            rating = 4.9,
            ingredients = listOf(
                "Bourbon (4 cl)",
                "Citronová limonáda (12 cl)",
                "Limetková šťáva (1,5 cl)",
                "Jednoduchý sirup (1 cl)",
                "Plátek citronu",
                "Led"
            ),
            tutorial = "Do sklenice naplníme kostkami ledu a přidáme bourbon, citronovou limonádu, limetkovou šťávu a jednoduchý sirup. Sklenici důkladně promícháme a do nápoje můžeme přidat plátek citronu. Podáváme s brčkem a ledem."
        )
    )

    override val page16 = listOf(
        Drink(
            id = 46,
            name = "Madras",
            image = "/images/drinks/madras.jpg",
            description = "Madras je jednoduchý koktejl, který vznikl v 80. letech v USA a nese jméno po stejnojmenném indickém městě. Jeho základem je vodka, která se míchá s dýňovým džusem a brusinkovým džusem. Výsledkem je osvěžující nápoj s lehce kyselou chutí.",
            rating = 4.5,
            ingredients = listOf(
                "Vodka (4 cl)",
                "Dýňový džus (9 cl)",
                "Brusinkový džus (3 cl)",
                "Led"
            ),
            tutorial = "Do shakeru naplníme ledem a přidáme vodku, dýňový džus a brusinkový džus. Vše důkladně protřepeme, aby se koktejl dobře propojil. Poté nápoj přecedíme do vysoké sklenice naplněné ledem. Koktejl můžeme ozdobit plátkem citronu nebo pomeranče."
        ),
        Drink(
            id = 47,
            name = "Mary Pickford",
            image = "/images/drinks/mary_pickford.jpg",
            description = "Koktejl Mary Pickford vznikl v 20. letech minulého století a je pojmenován po slavné herečce Mary Pickford, která byla v té době největší hvězdou zlaté éry Hollywoodu. ",
            rating = 4.5,
            ingredients = listOf(
                "Bílý rum (6 cl)",
                "Ananasová šťáva (6 cl)",
                "Grenadina (1,5 cl)",
                "Maraschino (1,5 cl)"
            ),
            tutorial = "Do shakeru naplníme kameny ledu a přidáme bílý rum, ananasovou šťávu, grenadinu a maraschino. Silně protřepeme a následně přecedíme do předem připraveného koktejlového skla s ledem. Dozdobíme kouskem ananasu nebo višní. "
        ),
        Drink(
            id = 48,
            name = "Monkey Gland",
            image = "/images/drinks/monkey_gland.jpg",
            description = "Tento koktejl byl vynalezen v roce 1920 Harrym MacElhone v jeho baru v Paříži. Název koktejlu pochází z knihy Serge Voronoffa, který ve své knize popisuje svůj vynález - očkování žláz opičích do lidského těla, čímž by měla být zlepšena sexuální energie. Podobně jako očkování, byl koktejl Monkey Gland spojován s podobnými účinky.",
            rating = 4.5,
            ingredients = listOf(
                "Gin (5 cl)",
                "Citrónová šťáva (2 cl)",
                "Pomerančový džus (2 cl)",
                "Grenadina (1 cl)",
                "1 kapka absintu"
            ),
            tutorial = "Do shakeru vložíme led spolu se všemi ingrediencemi kromě absintu. Dobře protřepeme a slijeme do předem připraveného sklenice na drink. Nakapeme jednu kapku absintu a necháme ji zvolna stékat do drinku. Koktejl můžeme ozdobit pomerančovou kůrou nebo pomerančovým klínkem."
        )
    )

    override val page17 = listOf(
        Drink(
            id = 49,
            name = "Paloma",
            image = "/images/drinks/paloma.jpg",
            description = "Paloma je oblíbený mexický koktejl, který je velmi osvěžující a snadno se připravuje. Jeho název znamená holubice a legendy říkají, že byl inspirován nádhernou herečkou zlaté éry mexického filmu, která nesla právě jméno Paloma. Koktejl je oblíbený nejen v Mexiku, ale i po celém světě a je často označován za alternativu k Margaritě.",
            rating = 4.5,
            ingredients = listOf(
                "Tequila (4 cl)",
                "Hroznová soda (12 cl)",
                "Čerstvá limetka",
                "Sůl",
                "Led"
            ),
            tutorial = "Nejdříve si okraj sklenice osolíme, přidáme led a zalijeme tequilou. Následně přidáme šťávu z poloviny limetky a doplníme hroznovou sodou. Přidáme plátky limetky do koktejlu a můžeme ihned podávat."
        ),
        Drink(
            id = 50,
            name = "Planter's Punch",
            image = "/images/drinks/planters_punch.jpg",
            description = "Planter's Punch je koktejl původem z Karibiku. Recept na tento osvěžující mix sladkého a kyselého s alkoholovou pálivostí se v průběhu let vyvíjel až k dnešní podobě. Původně se připravoval z tmavého rumu, cukru, citronové šťávy a vody. Dnes se však často místo vody používá ananasová šťáva, což dodá koktejlu sladší chuť a exotickou vůni. Planter's Punch si oblíbili nejen místní obyvatelé Karibiku, ale i návštěvníci této tropické oblasti, kde se stal velmi populárním drinkem.",
            rating = 4.5,
            ingredients = listOf(
                "Tmavý rum (6 cl)",
                "Ananasová šťáva (6 cl)",
                "Pomerančová šťáva (4 cl)",
                "Citrónová šťáva (2 cl)",
                "Cukrový sirup (2 cl)",
                "Angostura (2-3 kapky)",
                "Led"
            ),
            tutorial = "Do shakeru vložíme led, tmavý rum, ananasovou šťávu, pomerančovou a citrónovou šťávu a cukrový sirup. Shaker pevně uzavřeme a silně protřepeme, dokud se nevytvoří ledový nápoj. Poté nápoj přecedíme přes jemné sítko do připravené sklenice s kousky ledu. Nakonec do nápoje přidáme několik kapek Angostury, které dodají koktejlu charakteristickou chuť a aroma. Koktejl můžeme ozdobit kouskem ovoce nebo čerstvou mátou."
        ),
        Drink(
            id = 51,
            name = "Purple Haze",
            image = "/images/drinks/purple_haze.jpg",
            description = "Purple Haze je populární koktejl, který byl vytvořen v 60. letech v USA. Jeho název byl inspirován stejnojmennou písní od Jimi Hendrixe. Tento drink se skládá z vodky, malinového likéru, borůvkového džusu a malinového džusu, což mu dává krásnou purpurovou barvu a osvěžující chuť.",
            rating = 4.5,
            ingredients = listOf(
                "Vodka (5 cl)",
                "Malinový likér (2,5 cl)",
                "Borůvkový džus (2,5 cl)",
                "Malinový džus (2,5 cl)",
                "Led"
            ),
            tutorial = "Vezměte si shaker a do něj dejte led. Přidejte vodku, malinový likér, borůvkový džus a malinový džus. Shaker dobře zavřete a silně protřepejte, dokud se nápoj nezchladí a nezměkne. Nalijte do sklenice s ledem a ozdobte malinou nebo borůvkou."
        )
    )

    override val page18 = listOf(
        Drink(
            id = 52,
            name = "Red Snapper",
            image = "/images/drinks/red_snapper.jpg",
            description = "Red Snapper je originální název pro Bloody Mary s ginem místo vodky. Tento drink vznikl v New Yorku během prohibice, kdy se díky absenci legálního alkoholu musela improvizovat. Gin byl v té době jednou z mála dostupných alkoholických nápojů. Výsledný drink je osvěžující a kořeněný, ideální pro milovníky ginu.",
            rating = 4.5,
            ingredients = listOf(
                "Gin (6 cl)",
                "Rajčatový džus (12 cl)",
                "Citronová šťáva (1,5 cl)",
                "Tabasco (pár kapek)",
                "Worcestershire omáčka (pár kapek)",
                "Sůl",
                "Pepř",
                "Kůra z citronu (na ozdobení)",
                "Celer (na ozdobení)",
                "Led"
            ),
            tutorial = "Do shakeru vložíme několik kusů ledu, gin, rajčatový džus, citronovou šťávu, Tabasco, Worcestershire omáčku, sůl a pepř. Shaker dobře zatřepeme, aby se všechny přísady promíchaly a následně slijeme do vysoké sklenice plné kostek ledu. Drink ozdobíme kůrou z citronu a větvičkou celeru a podáváme s brčkem. Sklenici můžeme také vymalovat směsí soli a pepře pro zajímavější vzhled.",
        ),
        Drink(
            id = 53,
            name = "Scotch Mist",
            image = "/images/drinks/scotch_mist.jpg",
            description = "Scotch Mist je velmi jednoduchý nápoj, který se vyznačuje svou jednoduchostí a čistotou. Hlavní složkou je skotská whisky, která je obohacena o vodu a led. Tento drink je oblíbený mezi milovníky skotské whisky, kteří si chtějí vychutnat její chuť a aroma.",
            rating = 4.5,
            ingredients = listOf(
                "Skotská whisky (5 cl)",
                "Voda (2-3 cl)",
                "Led"
            ),
            tutorial = "Do sklenice naplněné ledem přilijeme skotskou whisky a přidáme 2-3cl vody. Dochutíme dle potřeby. Drink můžeme ozdobit kolečkem citronu nebo pomeranče. Tento drink je ideální pro ty, kteří si chtějí vychutnat skutečnou chuť a aroma skotské whisky bez zbytečných příchutí."
        ),
        Drink(
            id = 54,
            name = "Shirley Temple",
            image = "/images/drinks/shirley_temple.jpg",
            description = "Shirley Temple je nealkoholický koktejl pojmenovaný po slavné americké herečce. Byl vytvořen v roce 1930 v legendárním hotelu The Royal Hawaiian na Havaji, kde byla malá Shirley hostem svých rodičů. Původně se skládal pouze z ginger ale, grenadiny a stroužku citronu, avšak později byly přidávány i další ingredience. Dnes je to oblíbený nápoj pro děti i dospělé, a to zejména na slavnostní příležitosti.",
            rating = 4.5,
            ingredients = listOf(
                "Ginger ale",
                "Grenadina",
                "Stroužek citronu",
                "Led"
            ),
            tutorial = "Do sklenice s velkým množstvím ledu nejdříve nalijeme ginger ale. Poté přidáme grenadinu, která by se měla samovolně propadnout ke dnu sklenice, a zároveň jí to dává krásnou barvu. Nakonec přidáme stroužek citronu, kterým sklenici ozdobíme. Některé recepty doporučují také přidat trošku třešňového džusu nebo několik třešňových plodů pro vylepšení chuti a dekoraci."
        )
    )

    override val page19 = listOf(
        Drink(
            id = 55,
            name = "Slippery Nipple",
            image = "/images/drinks/slippery_nipple.jpg",
            description = "Slippery Nipple je jednoduchý a lahodný koktejl, který si získal mnoho příznivců svou sladkou chutí a jednoduchostí přípravy. Vznikl v 80. letech v USA a jeho název znamená doslova kluzká bradavka.",
            rating = 4.5,
            ingredients = listOf(
                "Baileys (2,5 cl)",
                "Sambuca (2,5 cl)"
            ),
            tutorial = "Slippery Nipple se podává v shot skleničkách. Nejprve nalijeme Sambucu a následně Baileys. Důležité je dodržet pořadí, aby se Baileys netopil v Sambuce. Hotovo!"
        ),
        Drink(
            id = 56,
            name = "Snowball",
            image = "/images/drinks/snowball.jpg",
            description = "Snowball je koktejl, který vznikl v 60. letech 20. století v Anglii a rychle se stal velmi populárním. Jeho název odkazuje na kouli sněhu, neboť díky bílé barvě a textuře shakeru s ledem se koktejl podobá právě této kouli. Připravuje se z advocaat likéru, který je vyroben z žloutků, cukru a brandy, a limonády Schweppes Lemonade.",
            rating = 3.5,
            ingredients = listOf(
                "Advocaat (6 cl)",
                "Schweppes Lemonade (12 cl)",
                "Led"
            ),
            tutorial = "Do shakeru s ledem nalijeme advocaat likér a limonádu. Následně silně protřepeme, aby se vytvořila koule sněhu podobná textura a aby se všechny ingredience dobře propojily. Poté slijeme do vysokého sklenice a ozdobíme plátkem citronu. Pro zvýšení chuťových vlastností lze do koktejlu přidat i trošku limetové šťávy."
        ),
        Drink(
            id = 57,
            name = "Spritzer",
            image = "/images/drinks/spritzer.jpg",
            description = "Spritzer je osvěžující míchaný nápoj, který se skládá ze suchého bílého vína a perlivé minerální vody. Jeho původ je připisován středoevropské kuchyni, kde byl často podáván jako aperitiv.",
            rating = 3.5,
            ingredients = listOf(
                "Suché bílé víno (10 cl)",
                "Perlivá minerální voda (10 cl)",
                "Led",
                "Citronové kroužky (na ozdobu)"
            ),
            tutorial = "Do většího sklenice naplníme kameny ledu, nalijeme suché bílé víno a doplníme perlivou minerální vodou. Sklenici jemně promícháme lžičkou a ozdobíme kroužkem citronu. Podáváme ihned."
        )
    )

    override val page20 = listOf(
        Drink(
            id = 58,
            name = "Russian Spring Punch",
            image = "/images/drinks/russian_spring_punch.jpg",
            description = "Russian Spring Punch je osvěžující letní koktejl s vodkou, který pochází z Anglie. Byl vytvořen na konci 80. let 20. století v Londýně v hotelu Claridge's. Je inspirován ruskými ingrediencemi, které jsou v něm použity, jako je vodkou a angostura. Tento koktejl se stává stále populárnější nejen v Anglii, ale i po celém světě.",
            rating = 4.5,
            ingredients = listOf(
                "Vodka (5 cl)",
                "Čerstvě vylisovaný grapefruitový džus (5 cl)",
                "Angostura (2-3 dash)",
                "Cukr (1 lžička)",
                "Soda (asi 10-15 cl)",
                "Led"
            ),
            tutorial = "Vysokou sklenici naplníme ledem a do ní přidáme vodku, grapefruitový džus, angosturu a cukr. Vše důkladně promícháme a dolijeme sodou. Koktejl ozdobíme kolečkem grapefruitu a mátou."
        ),
        Drink(
            id = 59,
            name = "Stinger",
            image = "/images/drinks/stinger.jpg",
            description = "Stinger je elegantní koktejl, který vznikl již v první polovině 20. století. Vychází z klasické kombinace líhoviny a máty, která se používá v mnoha nápojích a likérech. V případě Stingeru se jedná o směs koňaku a crème de menthe, která dodá nápoji svěží a osvěžující chuť.",
            rating = 4.2,
            ingredients = listOf(
                "Koňak (5 cl)",
                "Crème de menthe (2 cl)"
            ),
            tutorial = "Do míchací sklenice s kostkami ledu přidáme koňak a crème de menthe. Koktejl důkladně promícháme a přecedíme přes sítko do vychlazeného koktejlového skla. Koktejl můžeme ozdobit lístkem máty."
        ),
        Drink(
            id = 60,
            name = "Surfer on Acid",
            image = "/images/drinks/surfer_on_acid.jpg",
            description = "Surfer on Acid je silný a osvěžující drink, který se poprvé objevil v 90. letech v kalifornské Santa Monice. Příběh o jeho vzniku není úplně jasný, ale všechny verze se shodují na tom, že byl vytvořen surfaři. Název drinku pochází z jedné z jeho ingrediencí, likéru Jägermeister, jehož logo obsahuje jelena. Ten je známý jako „hirsch“ v němčině, což znamená „jelen“. Recept se rychle rozšířil a dnes je oblíbený po celém světě.",
            rating = 4.2,
            ingredients = listOf(
                "Jägermeister (2 cl)",
                "Kokosový rum (2 cl)",
                "Ananasová šťáva (12 cl)",
                "Led"
            ),
            tutorial = "Do shakeru přidáme Jägermeister, kokosový rum a ananasovou šťávu. Přidáme led a silně protřepeme. Nalijeme do sklenice s kostkami ledu a dozdobíme kouskem ananasu nebo jiným ovocem dle chuti. Je připraven k podávání!"
        )
    )

    override val page21 = listOf(
        Drink(
            id = 61,
            name = "Swedish Fish",
            image = "/images/drinks/swedish_fish.jpg",
            description = "Tento koktejl se inspiroval sladkými cukrovinkami Swedish Fish. Vznikl ve Spojených státech a díky svému sladkému a ovocnému charakteru se stal oblíbeným nápojem na letních party. ",
            rating = 4.0,
            ingredients = listOf(
                "Vodka (5 cl)",
                "Cranberry juice (5 cl)",
                "Grapefruitová šťáva (2 cl)",
                "Malinová šťáva (2 cl)",
                "Led"
            ),
            tutorial = "Do shakeru přidáme led a všechny ingredience. Shaker důkladně protřepeme a poté přescedíme do sklenice naplněné ledem. Nápoj můžeme ozdobit malými cukrovými rybkami Swedish Fish. "
        ),
        Drink(
            id = 62,
            name = "Three Wise Men",
            image = "/images/drinks/three_wise_men.jpg",
            description = "Tento koktejl nese název po třech nejznámějších amerických whisky – Johnnie Walker, Jack Daniel's a Jim Beam. Je to silný nápoj s výraznou chutí pro opravdové whiskey fanoušky. ",
            rating = 3.5,
            ingredients = listOf(
                "Johnnie Walker whisky (2 cl)",
                "Jack Daniel's whisky (2 cl)",
                "Jim Beam whisky (2 cl)"
            ),
            tutorial = "Všechny tři druhy whisky přidáme do shakeru naplněného ledem a důkladně protřepeme. Poté přescedíme do sklenice s ledem a ozdobíme podle chuti. Doporučujeme podávat jako digestif. "
        ),
        Drink(
            id = 63,
            name = "Tootsie Roll",
            image = "/images/drinks/tootsie_roll.jpg",
            description = "Tootsie Roll je koktejl, který se inspiroval slavnou americkou cukrovinkou Tootsie Roll. Koktejl kombinuje výraznou chuť kakaa s příjemnou sladkostí a alkoholovou silou. Je to skvělý nápoj na oslavu nebo jako dezertní drink.",
            rating = 4.5,
            ingredients = listOf(
                "Vodka (3 cl)",
                "Kakaový likér (3 cl)",
                "Pomerančový likér (1.5 cl)",
                "Smetana (1.5 cl)",
                "Led"
            ),
            tutorial = "Do shakeru přidáme led, vodku, kakaový likér, pomerančový likér a smetanu. Shaker důkladně protřepeme, až se všechny ingredience spojí. Poté přescedíme do sklenice naplněné ledem. Můžeme ozdobit kouskem čokolády nebo pomerančovou kůrou. "
        )
    )

    override val page22 = listOf(
        Drink(
            id = 64,
            name = "Transfusion",
            image = "/images/drinks/transfusion.jpg",
            description = "Transfusion je osvěžující a snadno připravitelný koktejl. Původně byl vytvořen jako nápoj pro golfisty, kteří potřebovali hydratovat a osvěžit se na horkých letních dnech. Dnes se tento koktejl stává stále populárnější volbou pro všechny, kdo hledají snadný a chutný nápoj na oslavu nebo relaxaci.",
            rating = 4.2,
            ingredients = listOf(
                "Vodka (5 cl)",
                "Hroznová šťáva (10 cl)",
                "Zázvorové pivo (5 cl)",
                "Led"
            ),
            tutorial = "Do sklenice naplněné ledem postupně nalijeme vodku, hroznovou šťávu a zázvorové pivo. Vše jemně promícháme a ozdobíme plátkem citronu nebo čerstvou hroznovou větví. Podáváme s brčkem."
        ),
        Drink(
            id = 65,
            name = "Tuxedo",
            image = "/images/drinks/tuxedo.jpg",
            description = "Tuxedo je elegantní koktejl, který se řadí mezi klasické a náročné nápoje. Jeho chuťový profil je kořeněný a sladký a koktejl se často pije jako digestiv po jídle. ",
            rating = 3.9,
            ingredients = listOf(
                "Gin (6 cl)",
                "Bílý vermut (1,5 cl)",
                "Maraschino likér (0,5 cl)",
                "Angostura Bitter (1 dash)",
                "Pomerančová kůra"
            ),
            tutorial = "Do míchací sklenice naplněné ledem přidáme všechny ingredience a důkladně mícháme asi 30 sekund. Následně přescedíme do vychlazené koktejlové sklenice a ozdobíme pomerančovou kůrou. "
        ),
        Drink(
            id = 66,
            name = "Vampiro",
            image = "/images/drinks/vampiro.jpg",
            description = "Vampiro je oblíbeným mexickým koktejlem, který je založen na tequile a rajčatové šťávě. Chuťově je pikantní a sladká, což jej dělá ideálním pro ty, kteří si rádi pochutnají na něčem zajímavém. ",
            rating = 4.2,
            ingredients = listOf(
                "Tequila (5 cl)",
                "Rajčatová šťáva (10 cl)",
                "Citrónová šťáva (2 cl)",
                "Cukr (1 lžička)",
                "Sůl",
                "Tabasco omáčka",
                "Worcestershire omáčka",
                "Led"
            ),
            tutorial = "Do shakeru přidáme led, tequilu, rajčatovou a citrónovou šťávu, cukr, špetku soli, pár kapek Tabasco a Worcestershire omáčky. Shaker důkladně protřepeme a poté přescedíme do sklenice naplněné ledem. Nápoj můžeme ozdobit klínkem citronu a posypat solí. "
        )
    )

    override val page23 = listOf(
        Drink(
            id = 67,
            name = "Vanilla Sky",
            image = "/images/drinks/vanilla_sky.jpg",
            description = "Vanilla Sky je osvěžující a lahodný koktejl, který kombinuje vanilkový likér s citrusy a sodou. Je ideální pro letní dny a vyzkoušet by ho měl každý, kdo má rád sladké nápoje.",
            rating = 4.3,
            ingredients = listOf(
                "Vanilkový likér (3 cl)",
                "Bílý rum (3 cl)",
                "Čerstvě vymačkaná limetková šťáva (2 cl)",
                "Pomerančový džus (6 cl)",
                "Soda (doplnit dle chuti)",
                "Led"
            ),
            tutorial = "Do shakeru přidáme led a všechny tekuté ingredience kromě sody. Shaker důkladně protřepeme a přescedíme do sklenice s ledem. Přidáme sodu podle chuti. Nápoj můžeme ozdobit plátkem pomeranče a vanilkovou fazolkou. Na zdraví!"
        ),
        Drink(
            id = 68,
            name = "Velvet Hammer",
            image = "/images/drinks/velvet_hammer.jpg",
            description = "Velvet Hammer je sladký koktejl, který kombinuje chuť čokolády a smetany s alkoholovými nápoji. Tento drink je oblíbeným dezertním koktejlem a jeho chuť se bude líbit hlavně těm, kteří mají rádi sladké nápoje.",
            rating = 3.8,
            ingredients = listOf(
                "Smetanová vodka (4 cl)",
                "Creme de cacao (4 cl)",
                "Sodovka (2 cl)",
                "Sahara (2 cl)",
                "Led"
            ),
            tutorial = "Do shakeru přidáme led, smetanovou vodku, creme de cacao, sodovku a saharu. Shaker důkladně protřepeme a poté přescedíme do sklenice naplněné ledem. Drink můžeme ozdobit kakaovým práškem nebo hřebíčkem."
        ),
        Drink(
            id = 69,
            name = "Vesper",
            image = "/images/drinks/vesper.jpg",
            description = "Vesper je koktejl, který se stal známým díky Jamesi Bondovi. Byl představen v románu Casino Royale a později se objevil také ve stejnojmenném filmu. Je to suchý koktejl s vysokou alkoholickou dávkou, který zahrnuje tři různé druhy alkoholu.",
            rating = 4.5,
            ingredients = listOf(
                "Gin (6 cl)",
                "Vodka (1.5 cl)",
                "Lillet Blanc (1.5 cl)",
                "Citron (limetková šťáva, 1 nakrájená kroužek)",
                "Led"
            ),
            tutorial = "Do shakeru přidáme led a všechny ingredience. Shaker důkladně protřepeme a poté přecedíme do sklenice na martini. Koktejl můžeme ozdobit kouskem citronu."
        )
    )

    override val page24 = listOf(
        Drink(
            id = 70,
            name = "Ward Eight",
            image = "/images/drinks/ward_eight.jpg",
            description = "Ward Eight je koktejl, který se poprvé objevil v roce 1898 v Bostonu. Podle jedné verze jeho název odkazuje na číslo osmi v okrsku, kde byl vytvořen. Podle jiné verze se jednalo o název předměstí, kde byla hospoda, kde se tento nápoj poprvé podával.",
            rating = 4.3,
            ingredients = listOf(
                "Bourbon (6 cl)",
                "Čerstvě vymačkaná pomerančová šťáva (2 cl)",
                "Čerstvě vymačkaná citronová šťáva (2 cl)",
                "Grenadina (1 cl)",
                "Angostura kořenová kůra (2 kapky)",
                "Led"
            ),
            tutorial = "Do shakeru přidejte led, bourbon, čerstvě vymačkanou pomerančovou a citronovou šťávu, grenadinu a 2 kapky Angostura kořenové kůry. Shaker důkladně protřepejte a přeceďte do sklenice s ledem. Koktejl můžete ozdobit kůrkou pomeranče a kouskem třešně."
        ),
        Drink(
            id = 71,
            name = "Americano",
            image = "/images/drinks/americano.jpg",
            description = "Americano je lehký a osvěžující koktejl, který se skládá z Campariho, vermouthu a sodovky. Původně byl vytvořen pro americké turisty v Itálii, kteří chtěli mírnější verzi Negroniho. ",
            rating = 3.9,
            ingredients = listOf(
                "Campari (3 cl)",
                "Vermouth (3 cl)",
                "Sodovka",
                "Led"
            ),
            tutorial = "Do sklenice naplněného ledem přidáme Campari a vermouth. Doplňujeme sodovkou a mícháme lžičkou. Podáváme s kroužkem pomeranče jako ozdobou. "
        ),
        Drink(
            id = 72,
            name = "Angel Face",
            image = "/images/drinks/angel_face.jpg",
            description = "Angel Face je koktejl vytvořený na počátku 20. století. Jeho jméno odkazuje na jemnou a decentní chuť, kterou tento nápoj poskytuje. Kombinace ginu, brandy a Calvadosu, který se dříve používal jako základ pro mnoho koktejlů, tvoří harmonickou směs ovocných a kořeněných tónů.",
            rating = 4.2,
            ingredients = listOf(
                "Gin (3 cl)",
                "Brandy (3 cl)",
                "Calvados (3 cl)"
            ),
            tutorial = "Do shakeru přidáme led a všechny ingredience. Shaker důkladně protřepeme a poté přescedíme do koktejlové sklenice naplněné ledem. Nápoj můžeme ozdobit trochou citronové kůry nebo jablka. "
        )
    )

    override val page25 = listOf(
        Drink(
            id = 73,
            name = "Aviation Cocktail",
            image = "/images/drinks/aviation.jpg",
            description = "Aviation Cocktail je elegantní koktejl s výrazným ovocným aroma a jemnou vůní fialky. Byl vyvinut na počátku 20. století a dodnes patří k ikonickým nápojům v kategorii koktejlů s ginem.",
            rating = 4.5,
            ingredients = listOf(
                "Gin (4,5 cl)",
                "Creme de Violette (1,5 cl)",
                "Maraschino likér (1,5 cl)",
                "Citronová šťáva (1,5 cl)"
            ),
            tutorial = "Do shakeru přidejte led a všechny ingredience. Shaker důkladně protřepejte a nápoj přeceďte do ochucené sklenice s kostkami ledu. Můžete ozdobit citrusovou kůrou nebo fialkovými okvětními lístky."
        ),
        Drink(
            id = 74,
            name = "Bahama Mama",
            image = "/images/drinks/bahama_mama.jpg",
            description = "Bahama Mama je populární tropický koktejl s karibskými kořeny. Má sladkou a ovocnou chuť, kterou doplňuje rum a kokosový krém.",
            rating = 4.2,
            ingredients = listOf(
                "Rum tmavý (4 cl)",
                "Rum bílý (4 cl)",
                "Ananasová šťáva (4 cl)",
                "Pomerančová šťáva (4 cl)",
                "Kokosový krém (2 cl)",
                "Grenadina (1 cl)",
                "Led"
            ),
            tutorial = "Do shakeru přidáme led a všechny ingredience. Shaker důkladně protřepeme a poté přescedíme do sklenice naplněné ledem. Na závěr můžeme koktejl ozdobit kousky ovoce, např. pomerančovým kolečkem a ananasovým klíčkem."
        ),
        Drink(
            id = 75,
            name = "Bay Breeze",
            image = "/images/drinks/bay_breeze.jpg",
            description = "Bay Breeze je osvěžující drink se sladkou a kyselou chutí, který je ideální pro letní večery na pláži. Je velmi jednoduchý na přípravu a používá se k němu jen několik běžných ingrediencí.",
            rating = 3.9,
            ingredients = listOf(
                "Vodka (4 cl)",
                "Ananasová šťáva (6 cl)",
                "Brusinková šťáva (6 cl)",
                "Led"
            ),
            tutorial = "Do shakeru naplněného ledem přidáme vodku, ananasovou a brusinkovou šťávu. Vše důkladně protřepeme a přecedíme do vysoké sklenice naplněné ledem. Na ozdobu můžeme použít kousek ananasu a brusinky na koktejlové paličce."
        )
    )

    override val page26 = listOf(
        Drink(
            id = 76,
            name = "Bee's Knees",
            image = "/images/drinks/bees_knees.jpg",
            description = "Bee's Knees je osvěžující koktejl, který v sobě kombinuje sladkou chuť medu a kyselost citronu. Tento drink se datuje do dob prohibice a byl oblíbeným nápojem ve 20. letech minulého století. Dnes se stal populárním znovu díky svému vynikajícímu chuti a snadné přípravě.",
            rating = 4.5,
            ingredients = listOf(
                "Gin (6 cl)",
                "Čerstvě vymačkaná citronová šťáva (2,5 cl)",
                "Medový sirup (2,5 cl)",
                "Led"
            ),
            tutorial = "Do shakeru přidejte led a všechny ingredience. Shaker důkladně protřepejte, dokud se nápoj neochladí a nezmíchají se ingredience. Poté přelijte nápoj do sklenice naplněné ledem a ozdobte plátkem citronu nebo kouskem medu."
        ),
        Drink(
            id = 77,
            name = "Between the Sheets",
            image = "/images/drinks/between_the_sheets.jpg",
            description = "Between the Sheets je směsí rumu, brandy, triple sec a citronové šťávy. Tento koktejl se řadí mezi osvěžující a ovocné nápoje s trochou koňaku. Podobně jako u jiných koktejlů z období prohibice, mohou být ingredience přizpůsobeny podle vkusu konzumenta.",
            rating = 3.8,
            ingredients = listOf(
                "Rum (3 cl)",
                "Brandy (3 cl)",
                "Triple sec (3 cl)",
                "Citronová šťáva (2 cl)",
                "Led"
            ),
            tutorial = "Do shakeru přidáme led a všechny ingredience. Shaker důkladně protřepeme a poté přescedíme do sklenice naplněné ledem. Můžeme ozdobit kouskem citronu nebo pomeranče."
        ),
        Drink(
            id = 78,
            name = "Blackberry Bramble",
            image = "/images/drinks/blackberry_bramble.jpg",
            description = "Blackberry Bramble je osvěžující letní koktejl, který kombinuje silný gin se sladkými a kyselými tóny čerstvých borůvek a citronové šťávy. Tento nápoj se často podává s rozdrceným ledem a zdobí se plátky citronu a malinami.",
            rating = 4.5,
            ingredients = listOf(
                "Gin (6 cl)",
                "Čerstvé borůvky (10 ks)",
                "Cukrový sirup (2 cl)",
                "Čerstvá citronová šťáva (3 cl)",
                "Led"
            ),
            tutorial = "Vložte borůvky, citronovou šťávu a cukrový sirup do shakeru a rozmačkejte je vidličkou. Přidejte gin a led a protřepejte. Nalijte do sklenice plného ledu a ozdobte plátky citronu a malinami. Podávejte s koktejlovou slamkou."
        )
    )

    override val page27 = listOf(
        Drink(
            id = 79,
            name = "Blackthorn",
            image = "/images/drinks/blackthorn.jpg",
            description = "Blackthorn je koktejl se silnou sladkou chutí, kterou mu dodává sladký vermouth. Jedná se o poměrně silný koktejl, protože obsahuje hned dvě druhy destilátů. ",
            rating = 4.2,
            ingredients = listOf(
                "Plymouth Gin (3 cl)",
                "Slivovice (3 cl)",
                "Sladký vermouth (3 cl)",
                "Angostura kořenová bitters (2 dashes)"
            ),
            tutorial = "Do shakeru přidáme gin, slivovici, sladký vermouth a 2 dash Angostura kořenového bitteru. Shaker naplníme ledem a důkladně protřepeme. Koktejl přecedíme do sklenice s ledem a ozdobíme třešní a pomerančovou kůrou. Podáváme se slamkou. "
        ),
        Drink(
            id = 80,
            name = "Blood and Sand",
            image = "/images/drinks/blood_and_sand.jpg",
            description = "Tento koktejl se pojmenoval po stejnojmenném filmu z roku 1922, ve kterém hrál Rudolf Valentino. Je to sladký a ovocný nápoj, který se skládá ze skotské whisky, červeného vermutu, pomerančového džusu a Cherry Heering likéru.",
            rating = 4.3,
            ingredients = listOf(
                "Skotská whisky (3 cl)",
                "Červený vermut (3 cl)",
                "Pomerančový džus (3 cl)",
                "Cherry Heering (3 cl)",
                "Pomerančová kůra (na ozdobu)"
            ),
            tutorial = "Do shakeru přidáme led a všechny ingredience kromě pomerančové kůry. Důkladně protřepeme a přescedíme do sklenice s ledem. Nápoj můžeme ozdobit pomerančovou kůrou. "
        ),
        Drink(
            id = 81,
            name = "Boulevardier",
            image = "/images/drinks/boulevardier.jpg",
            description = "Boulevardier je podobný klasickému koktejlu Negroni, ale místo ginu se používá bourbon nebo rye whisky. Tento elegantní a hořký koktejl vznikl v Paříži v 20. letech 20. století a dodnes patří mezi oblíbené nápoje v barových kruzích.",
            rating = 4.5,
            ingredients = listOf(
                "Bourbon nebo rye whisky (3 cl)",
                "Cinzano Vermouth Rosso (3 cl)",
                "Campari (3 cl)",
                "Kůra z pomeranče"
            ),
            tutorial = "Do míchací sklenice naplněné ledem přidáme bourbon nebo rye whisky, Cinzano Vermouth Rosso a Campari. Koktejl důkladně promícháme pomocí míchacího náčiní. Poté nápoj přecedíme do připraveného sklenice a ozdobíme kůrou z pomeranče. "
        )
    )

    override val page28 = listOf(
        Drink(
            id = 82,
            name = "Brown Derby",
            image = "/images/drinks/brown_derby.jpg",
            description = "Brown Derby je koktejl, který vznikl v Los Angeles v 30. letech minulého století a je pojmenován po restauraci Brown Derby, kde se tento drink poprvé podával. Je to sladký a ovocný nápoj s lehkou chutí grapefruitu.",
            rating = 3.9,
            ingredients = listOf(
                "Bourbon (6 cl)",
                "Hroznová šťáva (3 cl)",
                "Grapefruitová šťáva (1,5 cl)",
                "Medový sirup (1 cl)",
                "Led"
            ),
            tutorial = "Do shakeru přidejte led a všechny ingredience. Shaker důkladně protřepejte a přelijte do sklenice s velkými kousky ledu. Ozdobte plátkem grapefruitu a servírujte. Díky své sladké a ovocné chuti se tento koktejl hodí jako aperitiv nebo jako koktejl k dezertu."
        ),
        Drink(
            id = 83,
            name = "Cape Codder",
            image = "/images/drinks/cape_codder.jpg",
            description = "Cape Codder je osvěžující koktejl, který se skládá ze dvou ingrediencí - vodka a brusinkový džus. Jednoduchý a rychlý recept na letní osvěžení.",
            rating = 3.8,
            ingredients = listOf(
                "Vodka (5 cl)",
                "Brusinkový džus (10 cl)",
                "Led",
            ),
            tutorial = "Do sklenice plné ledu přidáme vodku a brusinkový džus. Koktejl promícháme a ozdobíme plátkem citronu nebo pomeranče podle chuti."
        ),
        Drink(
            id = 84,
            name = "Coco Loco",
            image = "/images/drinks/coco_loco.jpg",
            description = "Coco Loco je koktejl z tropické Kostariky, který v sobě spojuje chuť kokosového mléka, ananasové šťávy a trochy rumu. Je to vynikající nápoj na osvěžení v horkém letním dni.",
            rating = 4.5,
            ingredients = listOf(
                "Bílý rum (4 cl)",
                "Hustý kokosový krém (2 cl)",
                "Ananasová šťáva (2 cl)",
                "Condensed milk (2 cl)",
                "Mleté skořice",
                "Led"
            ),
            tutorial = "Do shakeru přidáme led a všechny ingredience. Shaker důkladně protřepeme a poté přescedíme do sklenice naplněné ledem. Pokud chceme, můžeme nápoj posypat trochou mleté skořice. "
        )
    )

    override val page29 = listOf(
        Drink(
            id = 85,
            name = "Corpse Reviver #2",
            image = "/images/drinks/corpse_reviver_2.jpg",
            description = "Tento koktejl je založen na originálním nápoji z konce 19. století. Existuje několik verzí tohoto nápoje, ale nejslavnější je Corpse Reviver #2, který je osvěžující a lehký.",
            rating = 4.5,
            ingredients = listOf(
                "Gin (2 cl)",
                "Lillet Blanc (2 cl)",
                "Cointreau (2 cl)",
                "Citronová šťáva (2 cl)",
                "Absinth (pár kapek)",
                "Led"
            ),
            tutorial = "Do shakeru přidáme led a všechny ingredience kromě absinthu. Shaker důkladně protřepeme a přescedíme do sklenice naplněné ledem. Nakonec přidáme pár kapek absinthu a koktejl ozdobíme kůrkou z citronu. "
        ),
        Drink(
            id = 86,
            name = "Dirty Banana",
            image = "/images/drinks/dirty_banana.jpg",
            description = "Dirty Banana je koktejl z Jamajky, který je oblíbený po celém Karibiku. Tento nápoj má krémovou konzistenci a je plný ovocného a banánového charakteru.",
            rating = 4.5,
            ingredients = listOf(
                "Bílý rum (3 cl)",
                "Krém banán (3 cl)",
                "Kokosové mléko (3 cl)",
                "Šťáva z čerstvého limetky (1 cl)",
                "Banán (1 ks)",
                "Led"
            ),
            tutorial = "Vložte všechny ingredience do mixéru a důkladně rozmixujte, dokud nezískáte hladkou konzistenci. Nalijte do vysoké sklenice a ozdobte plátkem banánu nebo několika kousky čokolády. Podávejte okamžitě."
        ),
        Drink(
            id = 87,
            name = "Dragonfly",
            image = "/images/drinks/dragonfly.jpg",
            description = "Tento osvěžující koktejl vznikl v 80. letech v San Franciscu a brzy se stal populárním v celých Spojených státech. Jeho základem je gin a kombinuje se s pomerančovou šťávou a zázvorem, čímž vzniká výjimečná chuťová kombinace.",
            rating = 4.5,
            ingredients = listOf(
                "Gin (4 cl)",
                "Pomerančová šťáva (2 cl)",
                "Limonáda (2 cl)",
                "Zázvorový sirup (1 cl)",
                "Led"
            ),
            tutorial = "Do shakeru naplněného ledem přidáme gin, pomerančovou šťávu, limonádu a zázvorový sirup. Důkladně protřepeme a přecedíme do sklenice naplněné lehce rozmixovaným ledem. Koktejl můžeme ozdobit pomerančovými nebo limetkovými kůrkami. "
        )
    )

    override val page30 = listOf(
        Drink(
            id = 88,
            name = "Flamingo",
            image = "/images/drinks/flamingo.jpg",
            description = "Flamingo je exotický koktejl s vysokou dávkou ovoce a alkoholu, který vás okouzlí svou jemností a lahodným zážitkem.",
            rating = 4.2,
            ingredients = listOf(
                "Bílý rum (4 cl)",
                "Ananasová šťáva (6 cl)",
                "Pomerančová šťáva (4 cl)",
                "Marakuja sirup (1 cl)",
                "Grenadina (1 cl)",
                "Led"
            ),
            tutorial = "Do shakeru přidejte led a všechny ingredience. Shaker důkladně protřepejte, aby se koktejl dobře promíchal a ochladil. Poté nápoj přeceďte do vysoké sklenice naplněné ledem. Můžete ozdobit plátkem pomeranče nebo ananasu a kousek cukru zvaného kandovaný hřebíček."
        ),
        Drink(
            id = 89,
            name = "Georgia Peach",
            image = "/images/drinks/georgia_peach.jpg",
            description = "Tento osvěžující letní nápoj kombinuje sladké bílé víno, ovocnou broskvovou nektar a svěží citronovou limonádu. Je to ideální nápoj pro letní grilování nebo pikniky s přáteli a rodinou.",
            rating = 4.5,
            ingredients = listOf(
                "Bílé víno (12 cl)",
                "Broskvový nektar (6 cl)",
                "Citronová limonáda (3 cl)",
                "Ice cubes",
                "Plátky broskve a limetky (na ozdobu)"
            ),
            tutorial = "Do sklenice s ledem přidáme bílé víno, broskvový nektar a citronovou limonádu. Všechny ingredience důkladně promícháme. Sklenici můžeme ozdobit plátky čerstvé broskve a limetky. Podáváme okamžitě a užíváme si osvěžující chuť letního nápoje."
        ),
        Drink(
            id = 90,
            name = "Gibson",
            image = "/images/drinks/gibson.jpg",
            description = "Gibson je mírně kořeněný nápoj se silným chutí koření a cibule. Jeho chuť se od ostatních koktejlů liší především tím, že obsahuje cibuli jako ozdobu. ",
            rating = 3.8,
            ingredients = listOf(
                "Vodka (6 cl)",
                "Vermut (1,5 cl)",
                "Nakládaná cibule",
                "Led"
            ),
            tutorial = "Do míchací sklenice s ledem přidáme vodku a vermut. Směs důkladně promícháme a poté přecedíme do koktejlové sklenice. Na jeho okraj přidáme nakládanou cibuli jako ozdobu."
        )
    )

    override val page31 = listOf(
        Drink(
            id = 91,
            name = "Godmother",
            image = "/images/drinks/godmother.jpg",
            description = "Godmother je koktejl, který patří do kategorie short drinků. Je to kombinace dvou ingrediencí, které spolu vytvářejí lahodnou chuť. Jeho jednoduchost a silný alkoholový obsah ho činí oblíbeným nápojem mezi lidmi, kteří preferují tvrdší nápoje.",
            rating = 3.8,
            ingredients = listOf(
                "Vodka (4 cl)",
                "Amaretto (2 cl)"
            ),
            tutorial = "Do shakeru přidáme led a všechny ingredience. Shaker důkladně protřepeme a poté přescedíme do sklenice. Nápoj můžeme ozdobit kouskem citronu nebo lístkem máty."
        ),
        Drink(
            id = 92,
            name = "Gold Rush",
            image = "/images/drinks/gold_rush.jpg",
            description = "Gold Rush je koktejl s bourbonem, medem a čerstvou citronovou šťávou. Je to jednoduchý, ale lahodný nápoj, který lze snadno připravit doma. ",
            rating = 4.2,
            ingredients = listOf(
                "Bourbon (6 cl)",
                "Med (2 cl)",
                "Čerstvá citronová šťáva (2 cl)",
                "Led"
            ),
            tutorial = "Do shakeru přidáme led, bourbon, med a citronovou šťávu. Shaker důkladně protřepeme a poté přescedíme do sklenice s kousky ledu. Nápoj můžeme ozdobit plátkem citronu. "
        ),
        Drink(
            id = 93,
            name = "Jamaican Punch",
            image = "/images/drinks/jamaican_punch.jpg",
            description = "Jamaican Punch je silný koktejl s ovocnou chutí. Obsahuje tmavý rum, pomerančový a ananasový džus a karamelový sirup. Tento nápoj je velmi populární na Jamajce a může být vychlazený nebo namíchaný s ledem.",
            rating = 4.2,
            ingredients = listOf(
                "Tmavý rum (6 cl)",
                "Pomerančový džus (3 cl)",
                "Ananasový džus (3 cl)",
                "Karamelový sirup (1,5 cl)"
            ),
            tutorial = "Do shakeru přidáme led a všechny ingredience. Shaker důkladně protřepeme a poté přescedíme do sklenice naplněné ledem. Na dekoraci můžeme použít kousky ananasu nebo pomeranče. "
        )
    )

    override val page32 = listOf(
        Drink(
            id = 94,
            name = "Liquid Marijuana",
            image = "/images/drinks/liquid_marijuana.jpg",
            description = "Liquid Marijuana je sladký a ovocný koktejl s karibskou chutí. Kombinuje se v něm rum, malibu, blue curaçao, ananasová a limetková šťáva, které dodávají nápoji nejen chuť, ale i krásnou zelenou barvu.",
            rating = 4.2,
            ingredients = listOf(
                "Bílý rum (2 cl)",
                "Rum Malibu (2 cl)",
                "Blue curaçao (2 cl)",
                "Ananasová šťáva (2 cl)",
                "Limetková šťáva (1 cl)",
                "Kokosové mléko (1 cl)",
                "Led"
            ),
            tutorial = "Do shakeru přidejte led, bílý rum, rum Malibu, blue curaçao, ananasovou šťávu, limetkovou šťávu a kokosové mléko. Shaker dobře protřepejte a následně slijte do připravené sklenice s ledem. Podávejte ihned a ozdobte plátkem ananasu a kokosovou natí."
        ),
        Drink(
            id = 95,
            name = "Little Italy",
            image = "/images/drinks/little_italy.jpg",
            description = "Little Italy je elegantní nápoj s italskými kořeny. Tento míchaný drink kombinuje bourbon s červeným vínem a koňakem, což vytváří bohatou a komplexní chuť. Zkuste si ho užít s kvalitním jídlem, ideálně italským!",
            rating = 4.5,
            ingredients = listOf(
                "Bourbon (4.5 cl)",
                "Červené víno (1.5 cl)",
                "Koňak (1.5 cl)",
                "Maraschino likér (1.5 cl)",
                "Angostura kořenová bitters (1 dash)"
            ),
            tutorial = "Do shakeru naplněného ledem přidáme bourbon, červené víno, koňak, maraschino likér a dash angostura kořenového bitteru. Shaker důkladně protřepeme a přecedíme do sklenice na drink naplněné ledem. Ozdobíme pomerančovou kůrou."
        ),
        Drink(
            id = 96,
            name = "Michelada",
            image = "/images/drinks/michelada.jpg",
            description = "Michelada je osvěžující a pikantní mexický drink, který se obvykle podává jako lehký způsob, jak se ochladit v horkém dni. Kombinace slaného okraje sklenice, piva, limetky a koření dává Micheladě vynikající chuť.",
            rating = 4.2,
            ingredients = listOf(
                "Pivo (3 cl)",
                "Čerstvá limetka (1/2)",
                "Čerstvá chilli paprička (1/2)",
                "Sůl (1/4 lžičky)",
                "Černý pepř (1/4 lžičky)",
                "Worcesterská omáčka (1/2 lžičky)",
                "Tabasco (5-7 kapky)",
                "Led"
            ),
            tutorial = "Do větší sklenice s okrajem osoleným solí a pepřem přidáme led. Přidáme pivo, limetkovou šťávu a koření (nakrájenou chilli papričku, Worcesterskou omáčku a Tabasco). Vše důkladně promícháme a podáváme."
        )
    )

    override val page33 = listOf(
        Drink(
            id = 97,
            name = "Mudslide",
            image = "/images/drinks/mudslide.jpg",
            description = "Mudslide je lahodný dezertní koktejl, který kombinuje chuť kávy a čokolády s krémovou texturou. Tento koktejl je velmi oblíbený v Americe a slaví úspěch po celém světě. Je to skvělý způsob, jak si vychutnat koktejl i jako dezert.",
            rating = 4.8,
            ingredients = listOf(
                "Vodka (2 cl)",
                "Kahlua (2 cl)",
                "Baileys (2 cl)",
                "Polotučená smetana (2 cl)",
                "Mléko (2 cl)",
                "Čokoládová poleva (na ozdobení)"
            ),
            tutorial = "Do shakeru s ledem přidáme vodka, Kahlua, Baileys, smetanu a mléko. Shaker silně protřepeme, až se všechny ingredience dobře propojí. Do sklenice na drink dáme několik kostek ledu a směs přecedíme přes sítko. Ozdobíme čokoládovou polevou a podáváme s kořením."
        ),
        Drink(
            id = 98,
            name = "Painkiller",
            image = "/images/drinks/painkiller.jpg",
            description = "Painkiller je koktejl s exotickou chutí, který vám pomůže odreagovat a relaxovat. Tento drink byl vynalezen na Britských Panenských ostrovech a skládá se ze čtyř ingrediencí - tmavý rum, ananasová šťáva, pomerančová šťáva a kokosové mléko. Je ideálním nápojem pro ty, kteří touží po troše slunce a moře v srdci!",
            rating = 4.7,
            ingredients = listOf(
                "Tmavý rum (6 cl)",
                "Ananasová šťáva (6 cl)",
                "Pomerančová šťáva (3 cl)",
                "Kokosové mléko (6 cl)",
                "Strouhaný muškátový oříšek (pro zdobení)"
            ),
            tutorial = "V shakeru smícháme tmavý rum, ananasovou šťávu, pomerančovou šťávu a kokosové mléko. Přidáme led a důkladně protřepeme. Nalijeme do sklenice naplněné ledem. Pokud chceme, můžeme ozdobit strouhaným muškátovým oříškem."
        ),
        Drink(
            id = 99,
            name = "Paradise",
            image = "/images/drinks/paradise.jpg",
            description = "Paradise je svěží a ovocný koktejl s exotickou chutí. Kombinace ginu, apricot brandy a pomerančového džusu vytváří lahodnou a osvěžující chuťovou paletu, která okouzlí vaše smysly.",
            rating = 4.2,
            ingredients = listOf(
                "Beefeater gin (4.5 cl)",
                "Apricot brandy (1.5 cl)",
                "Pomerančový džus (6 cl)",
                "Maraschino likér (1.5 cl)"
            ),
            tutorial = "Do shakeru naplněného ledem přidáme Beefeater gin, apricot brandy, pomerančový džus a maraschino likér. Shaker důkladně protřepeme a přecedíme do sklenice na drink naplněné ledem. Ozdobíme pomerančovou kůrou nebo ananasovým klinem."
        )
    )

    override val page34 = listOf(
        Drink(
            id = 100,
            name = "Penicillin",
            image = "/images/drinks/penicillin.jpg",
            description = "Penicilin je moderní nápoj, který vytvořil skotský bartender Sam Ross. Tento koktejl kombinuje skotskou whisky, med, čerstvě vymačkanou citronovou šťávu a zázvorový sirup, což vytváří silnou, ale vyváženou chuť. Koktejl je poté dokončen rašelinou whisky, která mu dodává hloubku a složitost.",
            rating = 4.8,
            ingredients = listOf(
                "Skotská whisky (6 cl)",
                "Citronová šťáva (2 cl)",
                "Medový sirup (1.5 cl)",
                "Zázvorový sirup (1.5 cl)",
                "Rašelinná whisky (float, 1.5 cl)"
            ),
            tutorial = "Do shakeru naplněného ledem přidáme skotskou whisky, citronovou šťávu, medový sirup a zázvorový sirup. Shaker důkladně protřepeme a přecedíme do sklenice s velkým kamenem ledu. Nakonec přidáme rašelinovou whisky na float a ozdobíme kůrou z citronu."
        ),
        Drink(
            id = 101,
            name = "Sea Breeze",
            image = "/images/drinks/sea_breeze.jpg",
            description = "Sea Breeze je osvěžující a snadno připravitelný koktejl, který kombinuje vodku, grepový a brusinkový džus. Jeho název odkazuje na mořskou svěžest a čistotu. Tento koktejl je ideální volbou pro teplé letní dny.",
            rating = 4.2,
            ingredients = listOf(
                "Vodka (4.5 cl)",
                "Brusinkový džus (9 cl)",
                "Grepový džus (3 cl)"
            ),
            tutorial = "Do vysoké sklenice naplněného ledem nalijeme 4,5 cl vodky. Poté přidáme 9 cl brusinkového džusu a 3 cl grepového džusu. Vše důkladně promícháme a ozdobíme kouskem citronu nebo limetky."
        ),
        Drink(
            id = 102,
            name = "Sidecar",
            image = "/images/drinks/sidecar.jpg",
            description = "Sidecar je klasický koktejl s koňakem a pomerančovým likérem Cointreau. Tento elegantní nápoj byl poprvé podáván v Paříži v průběhu první světové války a dodnes si zachovává svou popularitu díky svému bohatému a vyváženému chuťovému profilu.",
            rating = 4.6,
            ingredients = listOf(
                "Koňak (5 cl)",
                "Cointreau (2 cl)",
                "Čerstvě stlačená citronová šťáva (2 cl)",
                "Kůra z citronu"
            ),
            tutorial = "Do shakeru s ledem přidáme koňak, Cointreau a čerstvě stlačenou citronovou šťávu. Shaker pečlivě protřepeme a přecedíme do vychlazeného sklenice na koktejly. Ozdobíme kůrou z citronu a podáváme."
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

        val lastPage = 34
        val almostLastPage = lastPage-1

        if (page in 1..almostLastPage) {
            nextPage = nextPage?.plus(1)
        }
        if (page in 2..lastPage) {
            prevPage = prevPage?.minus(1)
        }
        if (page == 1) {
            prevPage = null
        }
        if (page == lastPage) {
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