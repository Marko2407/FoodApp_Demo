package com.example.foodapp_demo.viewModel

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.example.foodapp_demo.models.DataClass
import com.example.foodapp_demo.models.FoodGenerator

class MainActivityViewModel (private val generator: FoodGenerator) : ViewModel() {

    private val foodLiveData = MutableLiveData<DataClass>()

    lateinit var food: DataClass

    fun updateFood(title: String, description: String, images: Possibilities) {
        food = generator.generateFood(title, description, images)
    }

    fun getFoodLiveData(): LiveData<DataClass> = foodLiveData
}

enum class Possibilities constructor(val value: Int) {
    CAR(0), Cat(1)
}

class MainActivityViewModelFactory(var generator: FoodGenerator) : ViewModelProvider.Factory{

    override fun <T : ViewModel> create(modelClass: Class<T>): T {
        return MainActivityViewModel(generator) as T
    }

}