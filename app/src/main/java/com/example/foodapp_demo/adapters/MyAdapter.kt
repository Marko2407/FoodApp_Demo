package com.example.foodapp_demo.adapters

import android.annotation.SuppressLint
import android.content.Context
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import androidx.recyclerview.widget.RecyclerView
import androidx.recyclerview.widget.RecyclerView.*
import com.example.foodapp_demo.R
import com.example.foodapp_demo.models.Food
import com.example.foodapp_demo.models.dataClass

open class MyAdapter(private val context: Context, private val title: List<dataClass>) : Adapter<MyAdapter.MyViewHolder>() {


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.row, parent, false)



        return MyViewHolder(view)


    }

    override fun onBindViewHolder(holder: MyViewHolder, @SuppressLint("RecyclerView") position: Int) {
       holder.textViewD.text = Food.Food[position].description
        holder.textViewTitle.text = Food.Food[position].title
        holder.foodImage.setImageResource(Food.Food[position].image)

       holder.itemView.setOnClickListener {
           Toast.makeText(
               context,
               "Odabrao si ${Food.Food[position].title}",
               Toast.LENGTH_SHORT
           ).show()
          Log.i("Marko je kralj", Food.Food[position].title)
       }

    }

    override fun getItemCount(): Int {
       return title.size
    }

    class MyViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        var textViewD: TextView = itemView.findViewById(R.id.title1)
        var foodImage: ImageView = itemView.findViewById(R.id.img)
        var textViewTitle: TextView = itemView.findViewById(R.id.titleMenu)
    }


}


