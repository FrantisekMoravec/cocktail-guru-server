package com.example

import io.ktor.server.application.*
import com.example.plugins.*

/** hlavní metoda - spouští engine serveru - netty */
fun main(args: Array<String>): Unit =
    io.ktor.server.netty.EngineMain.main(args)

/** tato metoda nám říká jaké moduly server použije */
@Suppress("unused")
fun Application.module() {
    configureKoin()
    configureRouting()
    configureSerialization()
    configureMonitoring()
    configureDefaultHeader()
    configureStatusPages()
}