package com.example.foodapp_demo.viewModel

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.example.foodapp_demo.models.Food
import com.example.foodapp_demo.models.FoodGenerator

import com.example.foodapp_demo.models.dataClass

//
class MainActivityViewModel(private val generator: FoodGenerator = FoodGenerator()) : ViewModel() {
private val foodLiveData = MutableLiveData<dataClass>()

    fun getFoodLiveData(): LiveData<dataClass> = foodLiveData
        var title = ""
        var description = ""
        var images  = 0
        lateinit var food : dataClass

        fun updateFood(){
            food = generator.generateFood(title,description,images)
        }



}

