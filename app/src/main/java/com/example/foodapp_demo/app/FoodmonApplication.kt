package com.example.foodapp_demo.app

import android.app.Application
import androidx.room.Room
import com.example.foodapp_demo.models.FoodDatabase

class FoodmonApplication: Application() {

    companion object{
        lateinit var database: FoodDatabase
    }

    override fun onCreate() {
        super.onCreate()
        database = Room.databaseBuilder(this, FoodDatabase::class.java,"food_database").build()
    }

}