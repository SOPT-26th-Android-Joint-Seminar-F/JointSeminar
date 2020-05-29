package com.hyeran.jointseminar

import android.content.Context
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ViewFlipper
import androidx.viewpager.widget.PagerAdapter
import androidx.viewpager.widget.ViewPager
import com.hyeran.jointseminar.playlist_item.PlaylistAdapter
import com.hyeran.jointseminar.playlist_item.PlaylistData
import kotlinx.android.synthetic.*
import kotlinx.android.synthetic.main.fragment_home.*

/**
 * A simple [Fragment] subclass.
 */
class HomeFragment : Fragment() {

    private lateinit var playlistAdapter : PlaylistAdapter

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_home, container, false)



    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {

        playlistAdapter = PlaylistAdapter(view.context)
        rv_playlist_home.adapter = playlistAdapter
        loadPlaylistDatas()

    }


    private fun loadPlaylistDatas() {
        val dataList = mutableListOf<PlaylistData>()

        dataList.apply {
            add(
                PlaylistData(
                    title = "유럽 비행기에서",
                    count = 12,
                    date = "2020.05.20"
               )
            )
            add(
                PlaylistData(
                    title = "KT에서",
                    count = 2,
                    date = "2020.05.22"
                )
            )
            add(
                PlaylistData(
                    title = "밥 친구",
                    count = 3,
                    date = "2020.05.23"
                )
            )
        }

        playlistAdapter.dataList = dataList
        playlistAdapter.notifyDataSetChanged()
    }

}
