package com.example.foodapp_demo.models

import androidx.lifecycle.LiveData
import androidx.room.*

@Dao
interface FoodDao {
    @Insert(onConflict = OnConflictStrategy.REPLACE)
    fun insert(dataClass: DataClass)

    @Query("DELETE FROM food_table")
    fun clearFood()

    @Query("SELECT * FROM food_table ORDER BY title ASC")
    fun getAllFood(): LiveData<List<DataClass>>
}