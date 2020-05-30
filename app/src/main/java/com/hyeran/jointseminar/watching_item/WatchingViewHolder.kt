package com.hyeran.jointseminar.watching_item

import android.media.Image
import android.view.View
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.hyeran.jointseminar.ContentFragment
import com.hyeran.jointseminar.R
import com.hyeran.jointseminar.prefer_item.PreferData

class WatchingViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
    val img_watching = itemView.findViewById<ImageView>(R.id.iv_watching)
    val tv_season = itemView.findViewById<TextView>(R.id.tv_season)
    val img = itemView.findViewById<ImageView>(R.id.imageView)


    fun bind(watchingData : WatchingData){
        Glide.with(itemView).load(watchingData.img_watching).into(img_watching)
        tv_season.text = watchingData.tv_season
        
    }

}