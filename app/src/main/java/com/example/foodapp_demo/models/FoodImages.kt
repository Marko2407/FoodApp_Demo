package com.example.foodapp_demo.models


import com.example.foodapp_demo.R

class FoodImages {
    val foodImages: List<Avatar> by lazy {
        val avatar = mutableListOf<Avatar>()
        avatar.add(Avatar(R.drawable.food1))
        avatar.add(Avatar(R.drawable.fries))
        avatar.add(Avatar(R.drawable.hamb))
        avatar.add(Avatar(R.drawable.food_mars))
        avatar.add(Avatar(R.drawable.milka))
        avatar
    }
}
