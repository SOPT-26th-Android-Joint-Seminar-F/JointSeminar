package com.hyeran.jointseminar.poster_item

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentPagerAdapter
import com.hyeran.jointseminar.poster_item.Poster2Fragment
import com.hyeran.jointseminar.poster_item.Poster3Fragment
import com.hyeran.jointseminar.poster_item.PosterFragment

class PosterAdapter : FragmentPagerAdapter{

    var data1 : Fragment = PosterFragment()
    var data2 : Fragment = Poster2Fragment()
    var data3 : Fragment = Poster3Fragment()

    private val fragments: ArrayList<Fragment> = ArrayList()

    var mData : ArrayList<Fragment> = arrayListOf(data1,data2,data3)

    constructor(fm : FragmentManager) : super(fm)

    override fun getItem(position: Int): Fragment {
        return mData.get(position)
    }

    override fun getCount(): Int {
        return mData.size
    }
}
