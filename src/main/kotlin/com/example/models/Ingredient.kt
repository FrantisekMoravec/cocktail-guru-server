package com.example.models

import kotlinx.serialization.Serializable

/** tato třída definuje objekt ingredience */
@Serializable
data class Ingredient(
    val id: Int,
    val name: String,
    val ingredientFamily: String
)

/*
ingredientFamily - např. Skotská whisky a Irská whisky -> Whisky

drinky se filtrují pomocí ingredientFamily(ne jmen ingrediencí)

takže když si někdo rozklikne Whisky, tak mu tím pádem vyjedou všechny drinky s jakoukoliv whisky
 */