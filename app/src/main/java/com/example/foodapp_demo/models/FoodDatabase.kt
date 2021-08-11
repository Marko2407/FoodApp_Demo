package com.example.foodapp_demo.models

import androidx.room.Database
import androidx.room.RoomDatabase
import com.example.foodapp_demo.models.Food
import com.example.foodapp_demo.models.FoodDao

@Database(entities = [(dataClass::class)],version = 1)
abstract class FoodDatabase : RoomDatabase() {
    abstract fun foodDao(): FoodDao
}