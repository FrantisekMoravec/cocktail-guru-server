package com.example.di

import com.example.repository.DrinkRepository
import com.example.repository.DrinkRepositoryImpl
import com.example.repository.IngredientRepository
import com.example.repository.IngredientRepositoryImpl
import org.koin.dsl.module

val koinModule = module {
    single<DrinkRepository> {
        DrinkRepositoryImpl()
    }

    single<IngredientRepository> {
        IngredientRepositoryImpl()
    }
}