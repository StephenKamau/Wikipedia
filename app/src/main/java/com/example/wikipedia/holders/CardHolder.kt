package com.example.wikipedia.holders

import android.view.View
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.wikipedia.R
import kotlinx.android.synthetic.main.article_card_item.view.*

class CardHolder(itemView: View):RecyclerView.ViewHolder(itemView) {
    private val articleImageView:ImageView = itemView.findViewById(R.id.article_image)
    private val articleTitle:TextView = itemView.findViewById(R.id.article_title)
}