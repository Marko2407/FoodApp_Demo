package com.example.foodapp_demo.models

import com.example.foodapp_demo.R

object Food {
    val Food: List<dataClass> by lazy {
        val food = mutableListOf<dataClass>()

        food.add( dataClass("Snicker", "ja sam snicker", R.drawable.food1))
        food.add( dataClass("Fries", "ja sam Fries", R.drawable.fries))
        food.add( dataClass("Hamburger", "ja sam Hamburger", R.drawable.hamb))
        food.add( dataClass("Mars", "ja sam Mars", R.drawable.mars))
        food.add( dataClass("Milka", "ja sam Milka", R.drawable.milka))
        food
        }

}