package com.example.foodapp_demo.View

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.ViewModelProviders

import com.example.foodapp_demo.R
import com.example.foodapp_demo.models.Food
import com.example.foodapp_demo.models.FoodImages
import com.example.foodapp_demo.models.dataClass
import com.example.foodapp_demo.viewModel.MainActivityViewModel
import java.util.*

class AddFoodActivity : AppCompatActivity() {
    private lateinit var viewModel: MainActivityViewModel
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_add_food)
        viewModel = ViewModelProviders.of(this).get(MainActivityViewModel::class.java)
        configureLiveDataObservers()
        val button: Button = findViewById(R.id.addButton)
        button.setOnClickListener {
          finish()
        }
    }


    private fun configureLiveDataObservers() {

        val imageView:ImageView = findViewById(R.id.imageView)
        imageView.setImageResource(R.drawable.food_add)
        viewModel.getFoodLiveData().observe(this, androidx.lifecycle.Observer { food ->
            food?.let {
               imageView.setImageResource(R.drawable.food1)
            }
        })
    }
}

