package com.hyeran.jointseminar.playlist_item

import android.view.View
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.hyeran.jointseminar.R

class PlaylistViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
//    val image = itemView.findViewById<ImageView>(R.id.iv_playlist)
    val title = itemView.findViewById<TextView>(R.id.tv_title_playlist)
    val count = itemView.findViewById<TextView>(R.id.tv_cnt_playlist)
    val date = itemView.findViewById<TextView>(R.id.tv_date_playlist)

    fun bind(playlistData: PlaylistData) {
        title.text = playlistData.title
        count.text = playlistData.count.toString()+"개"
        date.text = playlistData.date
    }
}