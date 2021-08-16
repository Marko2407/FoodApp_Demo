package com.example.foodapp_demo.View

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.ViewModelProvider
import com.example.foodapp_demo.R
import com.example.foodapp_demo.databinding.ActivityAddFoodBinding
import com.example.foodapp_demo.models.FoodGenerator
import com.example.foodapp_demo.viewModel.MainActivityViewModel
import com.example.foodapp_demo.viewModel.MainActivityViewModelFactory

class AddFoodActivity : AppCompatActivity() {

    private lateinit var viewModel: MainActivityViewModel
    private lateinit var binding: ActivityAddFoodBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityAddFoodBinding.inflate(layoutInflater)
        setContentView(binding.root)
        viewModel =
            ViewModelProvider(this, MainActivityViewModelFactory(FoodGenerator()))[MainActivityViewModel::class.java]

        observe()

        binding.addButton.setOnClickListener {
            finish()
        }
    }

    private fun observe() {

        viewModel.getFoodLiveData().observe(this, { food ->
            food?.let {
                binding.imageView.setImageResource(R.drawable.food1)
            }
        })
    }
}

