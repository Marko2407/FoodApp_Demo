package com.example.foodapp_demo.View

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.foodapp_demo.R
import com.example.foodapp_demo.adapters.MyAdapter
import com.example.foodapp_demo.models.Food
import com.example.foodapp_demo.models.FoodImages
import com.example.foodapp_demo.viewModel.MainActivityViewModel


class MainActivity : AppCompatActivity() {

    private lateinit var adapter: MyAdapter

 private lateinit var mMainActivityViewModel : MainActivityViewModel


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val recyclerView: RecyclerView = findViewById(R.id.recyclerView)
        val button: Button = findViewById(R.id.addItemButton)
        adapter = MyAdapter(this, Food.Food,FoodImages.foodImages)
        mMainActivityViewModel = ViewModelProvider(this)[MainActivityViewModel::class.java]
        recyclerView.layoutManager = LinearLayoutManager(this,LinearLayoutManager.HORIZONTAL, false)
        recyclerView.adapter = adapter

        button.setOnClickListener {
            startActivity(Intent(this, AddFoodActivity::class.java))
        }


    }
}