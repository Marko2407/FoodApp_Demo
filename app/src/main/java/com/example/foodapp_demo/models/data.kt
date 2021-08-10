package com.example.foodapp_demo.models
import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName


data class data (

 @Expose
 @SerializedName("title")
 val title: String? = null,

    @Expose
    @SerializedName("description")
    val description: String? = null,

    @Expose
    @SerializedName("image")
    val image: Int? = null

    ){
    override fun toString(): String {
        return "data(title=$title,description= $description, image=$image)"
    }
}