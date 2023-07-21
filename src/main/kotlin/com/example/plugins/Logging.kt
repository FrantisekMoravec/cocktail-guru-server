package com.example.plugins

import io.ktor.server.application.*

fun Application.configureLogging() {
    log.info("logging: active")
}