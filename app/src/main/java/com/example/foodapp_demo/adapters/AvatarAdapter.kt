package com.example.foodapp_demo.adapters

import android.graphics.BitmapFactory
import android.graphics.drawable.BitmapDrawable
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import androidx.recyclerview.widget.RecyclerView
import com.example.foodapp_demo.R
import com.example.foodapp_demo.models.Avatar

class AvatarAdapter(private val avatars: List<Avatar>, private val listener: AvatarListener): RecyclerView.Adapter<AvatarAdapter.ViewHolder>() {


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view =
            LayoutInflater.from(parent.context).inflate(R.layout.list_item_avatar, parent, false)
        return ViewHolder(view)
    }


    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.bind(avatars[position])
    }

    override fun getItemCount() = avatars.size

    inner class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView),
        View.OnClickListener {

        private lateinit var avatar: Avatar //data class image

        private val imageView = itemView.findViewById<ImageView>(R.id.imageView)

        init {
            itemView.setOnClickListener(this)
        }

        fun bind(avatar: Avatar) {
            this.avatar = avatar
            val bitmap = BitmapFactory.decodeResource(imageView.context.resources, avatar.imageFood)
            imageView.setImageDrawable(BitmapDrawable(imageView.context.resources, bitmap))
        }
        override fun onClick(view: View?) {
            listener.avatarClicked(this.avatar)
        }
    }
    interface AvatarListener {
        fun avatarClicked(avatar: Avatar)
    }

}




