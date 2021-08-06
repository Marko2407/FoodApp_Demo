package com.example.foodapp_demo

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.cardview.widget.CardView
import androidx.recyclerview.widget.RecyclerView
import androidx.recyclerview.widget.RecyclerView.*
import kotlin.io.path.createTempDirectory
import kotlin.properties.Delegates

class MyAdapter(private val title: Array<String>,private val description: Array<String>,private val img: Array<Int> ) : Adapter<MyAdapter.MyViewHolder>() {


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyAdapter.MyViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.row, parent, false)
        return MyViewHolder(view)
    }

    override fun onBindViewHolder(holder: MyAdapter.MyViewHolder, position: Int) {
       holder.textViewT.text = title[position]
       holder.textViewD.text = description[position]
       holder.imageView.setImageResource() = img[position]
    }

    override fun getItemCount(): Int {
        TODO("Not yet implemented")
    }

    class MyViewHolder(itemView: View) : ViewHolder(itemView) {
        val textViewT: TextView
        val textViewD: TextView
        val imageView: ImageView

        init {
            // Define click listener for the ViewHolder's View.
            textViewT = itemView.findViewById(R.id.titleMenu)
            textViewD = itemView.findViewById(R.id.description)
            imageView = itemView.findViewById(R.id.foodImage)
        }
    }
}

