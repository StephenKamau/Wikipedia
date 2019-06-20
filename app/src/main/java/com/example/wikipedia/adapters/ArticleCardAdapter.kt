package com.example.wikipedia.adapters

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.wikipedia.R
import com.example.wikipedia.holders.CardHolder

class ArticleCardAdapter() : RecyclerView.Adapter<CardHolder> (){

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CardHolder {
        val cardItem = LayoutInflater.from(parent.context).inflate(R.layout.article_card_item, parent, false)
        return CardHolder(cardItem)
    }

    override fun getItemCount(): Int {
        return 15
    }

    override fun onBindViewHolder(holder: CardHolder, position: Int) {

    }


}