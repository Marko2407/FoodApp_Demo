package com.example.foodapp_demo.models

import com.example.foodapp_demo.viewModel.Possibilities

class FoodGenerator {
    fun generateFood(name: String = "", description: String = "", images: Possibilities = Possibilities.CAR): DataClass {
        return DataClass(name, description, images.value)
    }
}