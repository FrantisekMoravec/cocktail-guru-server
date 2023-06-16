package com.example.di

import com.example.repository.*
import org.koin.dsl.module

val koinModule = module {
    single<DrinkRepository> {
        DrinkRepositoryImpl()
    }

    single<IngredientRepository> {
        IngredientRepositoryImpl()
    }

    single<IngredientFamilyRepository> {
        IngredientFamilyRepositoryImpl()
    }
}