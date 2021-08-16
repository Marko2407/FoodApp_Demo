package com.example.foodapp_demo.app

import android.app.Application
import androidx.room.Room
import com.example.foodapp_demo.adapters.MyAdapter
import com.example.foodapp_demo.models.FoodDatabase
import java.util.concurrent.ExecutorService
import java.util.concurrent.Executors

class App: Application() {

    val executorService: ExecutorService = Executors.newFixedThreadPool(4)

    override fun onCreate() {
        super.onCreate()
        database = Room.databaseBuilder(this, FoodDatabase::class.java,"food_database").build()
    }

    companion object{
        lateinit var database: FoodDatabase
    }
}