package com.hyeran.jointseminar.prefer_item

import android.view.View
import android.widget.ImageView
import androidx.recyclerview.widget.RecyclerView
import com.hyeran.jointseminar.R
import com.bumptech.glide.Glide

class PreferViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
    val img_content = itemView.findViewById<ImageView>(R.id.iv_prefer)

    fun bind(preferData : PreferData){
        Glide.with(itemView).load(preferData.img_contents).into(img_content)
    }
}