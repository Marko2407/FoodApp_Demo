package com.example.foodapp_demo.models

import androidx.lifecycle.LiveData

interface FoodRepository {
    fun saveFood(food: DataClass)
    fun getAllFood(): LiveData<List<DataClass>>
    fun clearAllFood()
}