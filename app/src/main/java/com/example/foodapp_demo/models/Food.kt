package com.example.foodapp_demo.models

import com.example.foodapp_demo.R

object Food {
    val Food: List<DataClass> by lazy {
        val food = mutableListOf<DataClass>()

        food.add( DataClass("Snicker", "ja sam snicker", R.drawable.food1))
        food.add( DataClass("Fries", "ja sam Fries", R.drawable.fries))
        food.add( DataClass("Hamburger", "ja sam Hamburger", R.drawable.hamb))
        food.add( DataClass("Mars", "ja sam Mars", R.drawable.food_mars))
        food.add( DataClass("Milka", "ja sam Milka", R.drawable.milka))
        food
        }

}