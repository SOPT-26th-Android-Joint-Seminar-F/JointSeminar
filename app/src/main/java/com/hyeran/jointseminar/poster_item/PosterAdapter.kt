package com.hyeran.jointseminar.poster_item

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.viewpager.widget.PagerAdapter
import com.hyeran.jointseminar.R
import kotlinx.android.synthetic.main.fragment_poster.view.*

class PosterAdapter (private val list: ArrayList<Poster>): PagerAdapter(){

    override fun instantiateItem(container: ViewGroup, position: Int): Any {
        val inflater = LayoutInflater.from(container.context)
        val view = inflater.inflate(R.layout.fragment_poster, container, false)


        view.iv_poster.setImageResource(list[position].getImageID(container.context))

        container.addView(view)
        return view
    }

    override fun destroyItem(container: ViewGroup, position: Int, `object`: Any) {
        container.removeView(`object` as View?)
    }

    override fun isViewFromObject(view: View, `object`: Any): Boolean {
        return view ==`object`
    }

    override fun getCount(): Int {
        return list.size
    }
}
