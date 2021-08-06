package com.example.foodapp_demo

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.RecyclerView


class MainActivity : AppCompatActivity() {

    lateinit var recyclerView: RecyclerView


    var menu1 = dataClass("Meni 1", "Piletina i riža", 1)
    var menu2 = dataClass("Meni 2", "janjetina i riža", 2)
    var menu3 = dataClass("Meni 3", "kruh i riža", 3)
    var menu4 = dataClass("Meni 4", "narezak i riža", 4)
    var menu5 = dataClass("Meni 5", "wok", 5)




    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var arraylistOfTitles = arrayListOf(menu1.Title,menu2.Title,menu3.Title,menu4.Title,menu5.Title)
        var arraylistOfDescription = arrayListOf(menu1.Description,menu2.Description,menu3.Description,menu4.Description,menu5.Description)
        var arraylistOfImages = arrayListOf(menu1.Image,menu2.Image,menu3.Image,menu4.Image,menu5.Image)

        recyclerView = findViewById(R.id.recyclerView)
    }
}