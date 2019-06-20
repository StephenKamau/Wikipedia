package com.example.wikipedia.fragments


import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

import com.example.wikipedia.R
import com.example.wikipedia.adapters.ArticleCardAdapter
import com.example.wikipedia.adapters.ArticleListAdapter
import kotlinx.android.synthetic.main.fragment_favourites.*

/**
 * A simple [Fragment] subclass.
 *
 */
class FavouritesFragment : Fragment() {

    var favouritesRecyclerView: RecyclerView? = null

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        // Inflate the layout for this fragment
        val view = inflater.inflate(R.layout.fragment_favourites, container, false)
        favouritesRecyclerView = view.findViewById(R.id.favourites_recycler)
        favouritesRecyclerView!!.layoutManager = LinearLayoutManager(context)
        favouritesRecyclerView!!.adapter = ArticleListAdapter()

        return view

    }


}
