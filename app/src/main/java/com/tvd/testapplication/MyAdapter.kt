package com.tvd.testapplication

import android.content.Context
import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import kotlinx.android.synthetic.main.list_row_item.view.*

class MyAdapter (val myAndroidOsList : List<String>, val context:Context):RecyclerView.Adapter<MyAdapter.MyViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {
        val v = LayoutInflater.from(context).inflate(R.layout.list_row_item, parent, false)
        return MyViewHolder(v)
    }

    override fun getItemCount(): Int {
        return myAndroidOsList.size
    }

    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
        holder.bindItems(myAndroidOsList[position])
    }

    class MyViewHolder(itemView: View):RecyclerView.ViewHolder(itemView) {
        fun bindItems(myAndroidOsListName : String){
            itemView.android_name_text_view.text = myAndroidOsListName
        }
    }
}