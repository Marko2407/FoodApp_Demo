package com.example.foodapp_demo.View

import android.content.Intent
import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.ViewModelProvider
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.foodapp_demo.adapters.MyAdapter
import com.example.foodapp_demo.databinding.ActivityMainBinding
import com.example.foodapp_demo.models.Food
import com.example.foodapp_demo.models.FoodGenerator
import com.example.foodapp_demo.models.FoodImages
import com.example.foodapp_demo.viewModel.MainActivityViewModel
import com.example.foodapp_demo.viewModel.MainActivityViewModelFactory

class MainActivity : AppCompatActivity(), MyAdapter.OnClickInterface {

    private lateinit var myAdapter: MyAdapter
    private lateinit var mainActivityViewModel: MainActivityViewModel
    private lateinit var binding: ActivityMainBinding
    private val titles = Food.Food

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        myAdapter = MyAdapter(titles, FoodImages().foodImages, this)
        mainActivityViewModel = ViewModelProvider(
            this,
            MainActivityViewModelFactory(FoodGenerator())
        )[MainActivityViewModel::class.java]
        binding.recyclerView.apply {
            layoutManager =
                LinearLayoutManager(this@MainActivity, LinearLayoutManager.HORIZONTAL, false)
            adapter = myAdapter
        }

        binding.addItemButton.setOnClickListener {
            startActivity(Intent(this, AddFoodActivity::class.java))
        }
    }

    override fun onClick(position: Int) {
        Toast.makeText(
            binding.root.context,
            "You have selected ${titles[position].title}",
            Toast.LENGTH_SHORT
        ).show()
    }
}