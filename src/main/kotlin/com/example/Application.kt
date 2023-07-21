package com.example

import com.example.plugins.*
import io.ktor.server.application.*

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
    configureLogging()
}