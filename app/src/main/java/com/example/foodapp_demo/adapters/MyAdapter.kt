package com.example.foodapp_demo.adapters

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.core.content.ContextCompat
import androidx.recyclerview.widget.RecyclerView
import androidx.recyclerview.widget.RecyclerView.Adapter
import com.example.foodapp_demo.databinding.RowBinding
import com.example.foodapp_demo.models.Avatar
import com.example.foodapp_demo.models.DataClass

open class MyAdapter(
    private val title: List<DataClass>,
    private val images: List<Avatar>,
    private val onClickListener: OnClickInterface
) : Adapter<MyAdapter.MyViewHolder>() {

    interface OnClickInterface {
        fun onClick(position: Int)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {
        val binding = RowBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        val myViewHolder = MyViewHolder(binding)
        binding.root.setOnClickListener {
            onClickListener.onClick(myViewHolder.adapterPosition)
        }
        return myViewHolder
    }

    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
        holder.bind(title[position], images[position])

    }

    override fun getItemCount(): Int {
        return title.size
    }

    class MyViewHolder(private val binding: RowBinding) : RecyclerView.ViewHolder(binding.root) {
        fun bind(data: DataClass, imageId: Avatar) {
            binding.title1.text = data.description
            binding.titleMenu.text = data.title
            binding.img.setImageDrawable(
                ContextCompat.getDrawable(
                    binding.root.context,
                    imageId.imageFood
                )
            )
        }
    }

}


