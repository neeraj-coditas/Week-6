package com.example.week6

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class MyAdapter(val songs: List<Song>):RecyclerView.Adapter<MyAdapter.MyViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {
        val inflater = LayoutInflater.from(parent.context)
        val view = inflater.inflate(R.layout.item_view,parent,false)
        return MyViewHolder((view))
    }

    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
        holder.textTitle.text = songs[position].title
        holder.textDescription.text = songs[position].description
    }

    override fun getItemCount(): Int {
        return songs.size
    }

    class MyViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        var textTitle = itemView.findViewById<TextView>(R.id.txtTitle)
        var textDescription = itemView.findViewById<TextView>(R.id.txtDescription)
    }
}


