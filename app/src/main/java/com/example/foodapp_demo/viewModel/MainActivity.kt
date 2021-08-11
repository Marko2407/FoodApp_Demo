package com.example.foodapp_demo.viewModel

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.lifecycle.ViewModelProvider
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.foodapp_demo.R
import com.example.foodapp_demo.adapters.MyAdapter
import com.example.foodapp_demo.models.Food
import com.example.foodapp_demo.models.dataClass


class MainActivity : AppCompatActivity() {

 private   lateinit var recyclerView: RecyclerView
 private lateinit var adapter: MyAdapter
    lateinit var mMainActivityViewModel : MainActivityViewModel


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        recyclerView = findViewById(R.id.recyclerView)
        adapter = MyAdapter(this, Food.Food)
        mMainActivityViewModel = ViewModelProvider(this).get(MainActivityViewModel::class.java)
       recyclerView.layoutManager = LinearLayoutManager(this,LinearLayoutManager.HORIZONTAL, false)
        recyclerView.adapter = adapter


    }

}