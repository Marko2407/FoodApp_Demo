package com.example.foodapp_demo.adapters

import android.annotation.SuppressLint
import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import androidx.recyclerview.widget.RecyclerView
import androidx.recyclerview.widget.RecyclerView.*
import com.example.foodapp_demo.R
import com.example.foodapp_demo.models.dataClass

open class MyAdapter(private val context: Context, private val title: ArrayList<String>,private val desc: ArrayList<String>,private val image: ArrayList<Int>) : Adapter<MyAdapter.MyViewHolder>() {


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.row, parent, false)



        return MyViewHolder(view)


    }

    override fun onBindViewHolder(holder: MyViewHolder, @SuppressLint("RecyclerView") position: Int) {
       holder.textViewD.text = desc[position]
        holder.textViewTitle.text = title[position]
        holder.foodImage.setImageResource(image[position])

       holder.itemView.setOnClickListener(object : View.OnClickListener{
           override fun onClick(p0: View?) {
               Toast.makeText(context, "Odabrao si ${desc[position]}", Toast.LENGTH_SHORT).show()
           }
       })

    }

    override fun getItemCount(): Int {
       return 5
    }

    class MyViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        var textViewD: TextView = itemView.findViewById(R.id.title1)
        var foodImage: ImageView = itemView.findViewById(R.id.img)
        var textViewTitle: TextView = itemView.findViewById(R.id.titleMenu)
    }


}

