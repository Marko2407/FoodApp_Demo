package com.example.foodapp_demo.models

import com.example.foodapp_demo.R

object Food {
    val Food: List<dataClass> by lazy {
        val food = mutableListOf<dataClass>()

            food.add( dataClass("Snicker", "cokolada,kikiriki", R.drawable.food1))
            food.add( dataClass("1", "cokolada,kikiriki", R.drawable.fries))
            food.add( dataClass("2", "cokolada,kikiriki",  R.drawable.hamb))
            food.add( dataClass("3", "cokolada,kikiriki", R.drawable.mars))
            food.add( dataClass("4", "cokolada,kikiriki", R.drawable.milka))

            food
        }

}