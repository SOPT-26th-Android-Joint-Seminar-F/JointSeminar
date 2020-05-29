package com.hyeran.jointseminar.poster_item

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import com.hyeran.jointseminar.R

/**
 * A simple [Fragment] subclass.
 */
class Poster3Fragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_poster3, container, false)

        var view = layoutInflater!!.inflate(R.layout.fragment_poster3, container, false)
        var imageView = view.findViewById<ImageView>(R.id.iv_poster3)

        if(arguments != null) {
            val args = arguments
            imageView.setImageResource(args!!.getInt("imgRes"))
        }

        return  view

    }
}
