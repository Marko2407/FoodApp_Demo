package com.example.foodapp_demo.models

import androidx.lifecycle.LiveData
import com.example.foodapp_demo.app.App
import java.util.concurrent.Executor

class RoomRepository(private val executor: Executor) : FoodRepository {

    private val foodDao: FoodDao = App.database.foodDao()
    private val allFood: LiveData<List<DataClass>> = foodDao.getAllFood()

    override fun saveFood(food: DataClass) {
        executor.execute {
            foodDao.insert(food)
        }
    }

    override fun getAllFood() = allFood

    override fun clearAllFood() {
        executor.execute {
            foodDao.clearFood()
        }
    }

}