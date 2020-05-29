package com.hyeran.jointseminar.poster_item

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import androidx.fragment.app.Fragment
import com.hyeran.jointseminar.R

/**
 * A simple [Fragment] subclass.
 */
class PosterFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment

        var view = layoutInflater!!.inflate(R.layout.fragment_poster, container, false)
        var imageView = view.findViewById<ImageView>(R.id.iv_poster)

        if(arguments != null) {
            val args = arguments
            imageView.setImageResource(args!!.getInt("imgRes"))
        }

        return  view
    }
}
