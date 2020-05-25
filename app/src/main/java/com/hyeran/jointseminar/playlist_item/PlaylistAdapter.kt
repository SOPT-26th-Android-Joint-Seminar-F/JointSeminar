package com.hyeran.jointseminar.playlist_item

import android.content.Context
import android.graphics.drawable.GradientDrawable
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.hyeran.jointseminar.R
import kotlinx.android.synthetic.main.item_playlist.view.*

class PlaylistAdapter(private val context: Context) : RecyclerView.Adapter<PlaylistViewHolder>() {
    var dataList = mutableListOf<PlaylistData>()

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): PlaylistViewHolder {
        val view = LayoutInflater.from(context).inflate(R.layout.item_playlist, parent, false)
        val drawable : GradientDrawable = context.getDrawable(R.drawable.round_image_background) as GradientDrawable
        view.iv_playlist.background = drawable
        view.iv_playlist.clipToOutline = true
        return PlaylistViewHolder(view)
    }

    override fun getItemCount() = dataList.size

    override fun onBindViewHolder(holder: PlaylistViewHolder, position: Int) {
        holder.bind(dataList[position])
    }
}