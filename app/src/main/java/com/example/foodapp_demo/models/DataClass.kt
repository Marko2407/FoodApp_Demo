package com.example.foodapp_demo.models

import androidx.annotation.NonNull
import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "food_table")
data class DataClass(
    @NonNull
    @ColumnInfo(name = "title")
    var title: String = "",
    @ColumnInfo(name = "description")
    var description: String = "",
    @ColumnInfo(name = "image")
    var image: Int,
) {
    @PrimaryKey(autoGenerate = true)
    var id: Int = 0
}


