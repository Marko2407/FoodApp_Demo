package com.example.foodapp_demo.models

class dataClass(title: String, description : String, image : Int){

    val meni = "$title $description $image"
     val meni1: String
         get() {
             return meni
         }

}
