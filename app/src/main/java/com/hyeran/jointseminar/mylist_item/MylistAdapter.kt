package com.hyeran.jointseminar.mylist_item

import android.content.Context
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.RecyclerView
import com.hyeran.jointseminar.ContentFragment
import com.hyeran.jointseminar.R

class MylistAdapter(private val context : Context) : RecyclerView.Adapter<MylistViewHolder>(){
    var datas = mutableListOf<MylistData>()
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MylistViewHolder {
        val view = LayoutInflater.from(context).inflate(R.layout.item_mylist, parent, false)
        return MylistViewHolder(view)
    }

    override fun getItemCount(): Int {
        return datas.size
    }

    override fun onBindViewHolder(holder: MylistViewHolder, position: Int) {
        holder.bind(datas[position])
        holder.img_mylist.setOnClickListener {
            val transaction = (context as AppCompatActivity).supportFragmentManager.beginTransaction()
            transaction.replace(R.id.framelayout_main, ContentFragment())
            transaction.addToBackStack(null)
            transaction.commit()
        }
    }
}