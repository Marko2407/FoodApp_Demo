package com.example.foodapp_demo.repositories

import androidx.lifecycle.MutableLiveData
import com.example.foodapp_demo.R
import com.example.foodapp_demo.models.dataClass
import com.google.android.material.bottomsheet.BottomSheetBehavior

class FoodRepository{
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

//       dataa.postValue(data) //fali dataa.value(data)
        return dataa
    }


    }



