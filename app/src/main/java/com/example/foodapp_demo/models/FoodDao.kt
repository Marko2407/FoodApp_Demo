package com.example.foodapp_demo.models

import androidx.lifecycle.LiveData
import androidx.room.*
import com.example.foodapp_demo.models.Food
import com.example.foodapp_demo.models.dataClass


@Dao
interface FoodDao {
    @Insert(onConflict = OnConflictStrategy.REPLACE)
    fun insert(dataClass: dataClass)

    @Delete
    fun clearFood(vararg dataClass: dataClass)

    @Query("SELECT * FROM food_table ORDER BY title ASC")
    fun getAllFood(): LiveData<List<dataClass>>
}