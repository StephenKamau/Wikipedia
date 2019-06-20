package com.example.wikipedia.adapters

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.wikipedia.R
import com.example.wikipedia.holders.CardHolder
import com.example.wikipedia.holders.ListItemHolder

class ArticleListAdapter() : RecyclerView.Adapter<ListItemHolder> (){

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ListItemHolder {
        val listItem = LayoutInflater.from(parent.context).inflate(R.layout.article_list_item, parent, false)
        return ListItemHolder(listItem)
    }

    override fun getItemCount(): Int {
        return 15
    }

    override fun onBindViewHolder(holder: ListItemHolder, position: Int) {

    }


}