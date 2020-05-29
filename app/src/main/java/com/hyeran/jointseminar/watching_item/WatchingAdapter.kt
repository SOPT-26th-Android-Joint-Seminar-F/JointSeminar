package com.hyeran.jointseminar.watching_item

import android.content.Context
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.hyeran.jointseminar.R
import com.hyeran.jointseminar.prefer_item.PreferData
import com.hyeran.jointseminar.prefer_item.PreferViewHolder

class WatchingAdapter(private val context : Context) : RecyclerView.Adapter<WatchingViewHolder>() {
    var datas = mutableListOf<WatchingData>()
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): WatchingViewHolder {
        val view = LayoutInflater.from(context).inflate(R.layout.item_watching, parent, false)
        return WatchingViewHolder(view)
    }

    override fun getItemCount(): Int {
        return datas.size
    }

    override fun onBindViewHolder(holder: WatchingViewHolder, position: Int) {
        holder.bind(datas[position])
    }
}