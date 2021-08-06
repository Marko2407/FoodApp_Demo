package com.example.foodapp_demo

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView


class MainActivity : AppCompatActivity() {

 private   lateinit var recyclerView: RecyclerView
 private lateinit var adapter: MyAdapter



     var titles = arrayListOf("Meni 1", "Meni 2","Meni 3","Meni 4","Meni 5",)


//    lateinit var s1: String
//    lateinit var s2: String

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)




        recyclerView = findViewById(R.id.recyclerView)
        adapter = MyAdapter(this, titles)
        
       recyclerView.layoutManager = LinearLayoutManager(this,LinearLayoutManager.HORIZONTAL, false)
        recyclerView.adapter = adapter
    }
}