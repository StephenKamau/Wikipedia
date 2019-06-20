package com.example.wikipedia.fragments


import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.cardview.widget.CardView
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

import com.example.wikipedia.R
import com.example.wikipedia.activities.SearchActivity
import com.example.wikipedia.adapters.ArticleCardAdapter
import kotlinx.android.synthetic.main.activity_search.*
import kotlinx.android.synthetic.main.article_card_item.*
import kotlinx.android.synthetic.main.fragment_explore.*

/**
 * A simple [Fragment] subclass.
 *
 */
class ExplorerFragment : Fragment() {

    var searchCardView: CardView? = null
    var explorerRecyclerView: RecyclerView? = null

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        //inflate the layout for this fragment
        val view = inflater.inflate(R.layout.fragment_explore, container, false)

        searchCardView = view.findViewById(R.id.search_card_view)
        explorerRecyclerView = view.findViewById(R.id.explorer_recycler)

        searchCardView!!.setOnClickListener {
            val searchIntent= Intent(requireContext(),SearchActivity::class.java)
            requireContext().startActivity(searchIntent)
        }

        explorerRecyclerView!!.layoutManager = LinearLayoutManager(context)
        explorerRecyclerView!!.adapter = ArticleCardAdapter()

        return view

    }


}
