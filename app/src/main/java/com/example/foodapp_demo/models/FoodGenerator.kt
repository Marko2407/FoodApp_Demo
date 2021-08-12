package com.example.foodapp_demo.models




class FoodGenerator {
    fun generateFood(name: String = "", description: String = "", images: Int = 0): dataClass{


        return dataClass(name,description,images)

    }
}