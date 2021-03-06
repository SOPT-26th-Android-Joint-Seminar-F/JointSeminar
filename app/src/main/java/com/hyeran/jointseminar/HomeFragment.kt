package com.hyeran.jointseminar

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.hyeran.jointseminar.mylist_item.MylistAdapter
import com.hyeran.jointseminar.mylist_item.MylistData
import com.hyeran.jointseminar.playlist_item.PlaylistAdapter
import com.hyeran.jointseminar.playlist_item.PlaylistData
import com.hyeran.jointseminar.poster_item.Poster
import com.hyeran.jointseminar.poster_item.PosterAdapter
import com.hyeran.jointseminar.prefer_item.PreferAdapter
import com.hyeran.jointseminar.prefer_item.PreferData
import com.hyeran.jointseminar.watching_item.WatchingAdapter
import com.hyeran.jointseminar.watching_item.WatchingData
import kotlinx.android.synthetic.main.fragment_home.*

/**
 * A simple [Fragment] subclass.
 */
class HomeFragment : Fragment() {

    private lateinit var playlistAdapter: PlaylistAdapter
    lateinit var preferAdapter: PreferAdapter
    lateinit var mylistAdapter: MylistAdapter
    lateinit var watchingAdapter: WatchingAdapter

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_home, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val adapter = PosterAdapter(posterlist)
        vp_poster.adapter = adapter

        preferAdapter = PreferAdapter(view.context)
        rv_prefer_home.adapter = preferAdapter
        loadPreferDatas()

        playlistAdapter = PlaylistAdapter(view.context)
        rv_playlist_home.adapter = playlistAdapter
        loadPlaylistDatas()

        mylistAdapter = MylistAdapter(view.context)
        rv_mylist_home.adapter = mylistAdapter
        loadMylistDatas()

        watchingAdapter = WatchingAdapter(view.context)
        rv_watching_home.adapter = watchingAdapter
        loadWatchingDatas()


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
                    title = "KTX에서",
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

    private fun loadPreferDatas() {

        val datas = mutableListOf<PreferData>()
        datas.apply {
            add(
                PreferData(
                    img_contents = context?.getDrawable(R.drawable.mainview_img_itaewonclass)
                )
            )
            add(
                PreferData(
                    img_contents = context?.getDrawable(R.drawable.mainview_img_camelliaflower)
                )
            )
            add(
                PreferData(
                    img_contents = context?.getDrawable(R.drawable.mainview_img_1994)
                )
            )
        }
        preferAdapter.datas = datas
        preferAdapter.notifyDataSetChanged()
    }

    private fun loadMylistDatas() {

        val datas = mutableListOf<MylistData>()
        datas.apply {
            add(
                MylistData(
                    img_mylist = context?.getDrawable(R.drawable.mainview_img_lacasadepapel)
                )
            )
            add(
                MylistData(
                    img_mylist = context?.getDrawable(R.drawable.mainview_img_kingdom)
                )
            )
            add(
                MylistData(
                    img_mylist = context?.getDrawable(R.drawable.mainview_img_sexeducation)
                )
            )
        }
        mylistAdapter.datas = datas
        mylistAdapter.notifyDataSetChanged()
    }

    private fun loadWatchingDatas() {

        val datas = mutableListOf<WatchingData>()
        datas.apply {
            add(
                WatchingData(
                    img_watching = context?.getDrawable(R.drawable.mainview_img_hospital_playlist),
                    tv_season = "시즌 1: 10회"
                )
            )
            add(
                WatchingData(
                    img_watching = context?.getDrawable(R.drawable.mainview_img_extracurricular),
                    tv_season = "시즌 1: 8회"
                )
            )
            add(
                WatchingData(
                    img_watching = context?.getDrawable(R.drawable.mainview_img_heartsignal),
                    tv_season = "시즌 3: 7회"
                )
            )

        }
        watchingAdapter.datas = datas
        watchingAdapter.notifyDataSetChanged()
    }

    companion object{
         val posterlist = arrayListOf(
             Poster("mainview_img_poster"),
             Poster("mainview_img_poster"),
             Poster("mainview_img_poster")
         )
    }
}
