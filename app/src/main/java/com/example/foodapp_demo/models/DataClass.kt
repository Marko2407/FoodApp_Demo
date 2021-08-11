package com.example.foodapp_demo.models

import androidx.annotation.NonNull
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "food_table")
data class dataClass(
                    @PrimaryKey @NonNull var title: String ="",
                     var description: String = "",
                     var image: Int = 0)


