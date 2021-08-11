package com.example.foodapp_demo.models

import androidx.lifecycle.LiveData
import com.example.foodapp_demo.models.dataClass

interface FoodRepository {
    fun saveFood(food: dataClass)
    fun getAllFood(): LiveData<List<dataClass>>
    fun clearAllFood()
}