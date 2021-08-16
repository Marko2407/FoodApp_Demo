package com.example.foodapp_demo

import com.example.foodapp_demo.models.FoodGenerator
import com.example.foodapp_demo.models.DataClass
import org.junit.Before
import org.junit.Test


class FoodGeneratorTest {
    private lateinit var foodGenerator: FoodGenerator

    @Before
    fun setup(){
        foodGenerator = FoodGenerator()
    }

    @Test

    fun testGenerateFood(){
        val foodName = "Protein"
        val foodDescription = "38 grama proteinski keks"
        val foodImage = R.drawable.fries
        val expectedFood = DataClass(foodName,foodDescription,R.drawable.fries)

    }

}