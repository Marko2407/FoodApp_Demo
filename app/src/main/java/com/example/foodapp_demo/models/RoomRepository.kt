package com.example.foodapp_demo.models

import android.os.AsyncTask
import androidx.lifecycle.LiveData
import com.example.foodapp_demo.app.FoodmonApplication

class RoomRepository: FoodRepository {
    private val foodDao: FoodDao = FoodmonApplication.database.foodDao()

    private val allFood: LiveData<List<dataClass>> = foodDao.getAllFood()

    private class InsertAsyncTask internal constructor(private val dao: FoodDao): AsyncTask<dataClass,Void,Void>(){
        override fun doInBackground(vararg p0: dataClass?): Void? {
            p0[0]?.let { dao.insert(it) }
            return null
        }

    }
    private class DeleteAsyncTask internal constructor(private val dao: FoodDao): AsyncTask<dataClass,Void,Void>(){
        override fun doInBackground(vararg p0: dataClass?): Void? {
            dao.clearFood(*p0 as Array<out dataClass>)
            return null
        }
    }

    override fun saveFood(food: dataClass) {
       InsertAsyncTask(foodDao).execute(food)
    }

    override fun getAllFood() = allFood


    override fun clearAllFood() {
        val foodArray = allFood.value?.toTypedArray()
        if (foodArray != null){
            DeleteAsyncTask(foodDao).execute(*foodArray)
        }
    }

}