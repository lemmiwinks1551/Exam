package com.example.examapp

import android.view.View
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class DeveloperViewHolder(ItemView: View) : RecyclerView.ViewHolder(ItemView){

    private val developerNameTextureView: TextView = itemView.findViewById(R.id.developer_name_text_view)

    fun bind(name: String){
        developerNameTextureView.text = name
    }
}