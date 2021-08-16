package com.example.foodapp_demo.models

import androidx.room.Database
import androidx.room.RoomDatabase

@Database(entities = [(DataClass::class)],version = 1)
abstract class FoodDatabase : RoomDatabase() {
    abstract fun foodDao(): FoodDao
}