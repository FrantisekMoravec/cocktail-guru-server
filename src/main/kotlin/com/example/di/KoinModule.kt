package com.example.di

import com.example.repository.DrinkRepository
import com.example.repository.DrinkRepositoryImpl
import org.koin.dsl.module

val koinModule = module {
    single<DrinkRepository> {
        DrinkRepositoryImpl()
    }
}