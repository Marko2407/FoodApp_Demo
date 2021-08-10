package com.example.foodapp_demo.repositories

import androidx.lifecycle.MutableLiveData
import com.example.foodapp_demo.R
import com.example.foodapp_demo.models.dataClass

class FoodRepository {
    lateinit var data : ArrayList<dataClass>
  private  companion object{
        lateinit var instance: FoodRepository
    }
    init {
        instance = this
    }

   fun getInstance() : FoodRepository{
        if (instance == null){
            instance = FoodRepository()
        }
        return instance
    }
    lateinit var dataa : MutableLiveData<List<dataClass>>
    fun getData(): MutableLiveData<List<dataClass>>{
     setData()
     dataa.value   //fali dataa.value(data)
        return dataa
    }

    fun setData(){
        data.add( dataClass("Snicker", "cokolada,kikiriki", R.drawable.food1))
        data.add( dataClass("1", "cokolada,kikiriki",R.drawable.fries))
        data.add( dataClass("2", "cokolada,kikiriki",  R.drawable.hamb))
        data.add( dataClass("3", "cokolada,kikiriki",R.drawable.mars))
        data.add( dataClass("4", "cokolada,kikiriki", R.drawable.milka))

    }
}

