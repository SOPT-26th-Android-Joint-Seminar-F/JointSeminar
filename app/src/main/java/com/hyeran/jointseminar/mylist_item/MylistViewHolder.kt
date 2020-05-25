package com.hyeran.jointseminar.mylist_item

import android.view.View
import android.widget.ImageView
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.hyeran.jointseminar.R
import com.hyeran.jointseminar.prefer_item.PreferData

class MylistViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
    val img_mylist = itemView.findViewById<ImageView>(R.id.iv_mylist)

    fun bind(mylistData : MylistData){
        Glide.with(itemView).load(mylistData.img_mylist).into(img_mylist)
    }
}