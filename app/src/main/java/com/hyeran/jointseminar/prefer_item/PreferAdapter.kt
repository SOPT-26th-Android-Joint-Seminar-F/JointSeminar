package com.hyeran.jointseminar.prefer_item

import android.content.Context
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.RecyclerView
import com.hyeran.jointseminar.ContentFragment
import com.hyeran.jointseminar.R

class PreferAdapter(private val context : Context) : RecyclerView.Adapter<PreferViewHolder>() {
    var datas = mutableListOf<PreferData>()
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): PreferViewHolder {
        val view = LayoutInflater.from(context).inflate(R.layout.item_prefer, parent, false)
        return PreferViewHolder(view)
    }

    override fun getItemCount(): Int {
        return datas.size
    }

    override fun onBindViewHolder(holder: PreferViewHolder, position: Int) {
        holder.bind(datas[position])
        holder.img_content.setOnClickListener {
            val transaction = (context as AppCompatActivity).supportFragmentManager.beginTransaction()
            transaction.replace(R.id.framelayout_main, ContentFragment())
            transaction.addToBackStack(null)
            transaction.commit()
        }
    }
}