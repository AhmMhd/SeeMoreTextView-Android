package com.abdulhakeem.seemoretextviewsample

import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.ViewGroup
import android.view.View
import kotlinx.android.synthetic.main.li_item.view.*

class MyAdapter:RecyclerView.Adapter<MyAdapter.ViewHolder>() {
    class ViewHolder(view:View):RecyclerView.ViewHolder(view) {

    }

    override fun onBindViewHolder(holder: ViewHolder, pos: Int) {

        if (pos%2==0)
            holder.itemView.textview.setContent(holder.itemView.context.resources.getString(R.string.longtext))
        else
            holder.itemView.textview.setContent(holder.itemView.context.resources.getString(R.string.small_text))
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder{
        val view:View = LayoutInflater.from(parent.context).inflate(R.layout.li_item,parent,false)
        return ViewHolder(view)
    }

    override fun getItemCount(): Int {
        return 30
    }

}