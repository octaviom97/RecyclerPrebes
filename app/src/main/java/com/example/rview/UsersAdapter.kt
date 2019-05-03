package com.example.rview

import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView

class UsersAdapter(val users:ArrayList<String>):RecyclerView.Adapter<UsersAdapter.ViewHolder>() {


    override fun onCreateViewHolder(p0: ViewGroup, p1: Int): UsersAdapter.ViewHolder {
        val view:View = LayoutInflater.from(p0.context).inflate(R.layout.user_row, p0,false )
        return ViewHolder(view)

    }

    override fun getItemCount():Int = users.size

    override fun onBindViewHolder(p0: UsersAdapter.ViewHolder, p1: Int) {
        p0.tv1.text = users[p1]
    }

    class ViewHolder(itemView: View):RecyclerView.ViewHolder(itemView) {
        val tv1:TextView = itemView.findViewById(R.id.tv1)
    }

}