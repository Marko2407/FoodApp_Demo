package com.example.foodapp_demo.viewModel

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Toast
import androidx.annotation.Nullable
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.foodapp_demo.R
import com.example.foodapp_demo.adapters.MyAdapter
import com.example.foodapp_demo.models.dataClass
import com.example.foodapp_demo.repositories.FoodRepository


class MainActivity : AppCompatActivity() {

 private   lateinit var recyclerView: RecyclerView
 private lateinit var adapter: MyAdapter
    lateinit var mMainActivityViewModel : MainActivityViewModel


     var titles = arrayListOf("Meni 1", "Meni 2","Meni 3","Meni 4","Meni 5",)
     var images = arrayListOf<Int>(
         R.drawable.food1,
         R.drawable.fries,
         R.drawable.hamb,
         R.drawable.mars,
         R.drawable.milka
     )





    var description = arrayListOf("Snicker -  is a chocolate bar made by the American company Mars, Incorporated, consisting of nougat topped with caramel and peanuts that has been enrobed in milk chocolate.The annual global sales of Snickers was 2 billion as of 2004","Fries","hamburger","Mars", "Milka")
//    lateinit var s1: String
//    lateinit var s2: String

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        recyclerView = findViewById(R.id.recyclerView)
        adapter = MyAdapter(this, titles,description, images)
        mMainActivityViewModel = ViewModelProvider(this).get(MainActivityViewModel::class.java)
       // mMainActivityViewModel.getData().observe()  provjeriti što kako zasto
       recyclerView.layoutManager = LinearLayoutManager(this,LinearLayoutManager.HORIZONTAL, false)
        recyclerView.adapter = adapter


    }
}