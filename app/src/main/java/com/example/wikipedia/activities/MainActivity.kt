package com.example.wikipedia.activities

import android.os.Bundle
import com.google.android.material.bottomnavigation.BottomNavigationView
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.Fragment
import com.example.wikipedia.R
import com.example.wikipedia.fragments.ExplorerFragment
import com.example.wikipedia.fragments.FavouritesFragment
import com.example.wikipedia.fragments.HistoryFragment
import kotlinx.android.synthetic.main.fragment_explore.*

class MainActivity : AppCompatActivity() {

    private val explorerFragment: Fragment
    private val favouritesFragment: Fragment
    private val historyFragment: Fragment

    init {
        explorerFragment = ExplorerFragment()
        favouritesFragment = FavouritesFragment()
        historyFragment = HistoryFragment()
    }

    private val onNavigationItemSelectedListener = BottomNavigationView.OnNavigationItemSelectedListener { item ->
        val transaction = supportFragmentManager.beginTransaction()
        transaction.setCustomAnimations(android.R.anim.fade_in, android.R.anim.fade_out)
        when (item.itemId) {
            R.id.navigation_explore -> transaction.replace(R.id.fragment_container, explorerFragment)
            R.id.navigation_history -> transaction.replace(R.id.fragment_container, historyFragment)
            R.id.navigation_favourites -> transaction.replace(R.id.fragment_container, favouritesFragment)
        }
        transaction.commit()
        true
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val navView: BottomNavigationView = findViewById(R.id.nav_view)

        setSupportActionBar(toolbar)
        navView.setOnNavigationItemSelectedListener(onNavigationItemSelectedListener)

        val transaction = supportFragmentManager.beginTransaction()
        transaction.add(R.id.fragment_container, explorerFragment)
        transaction.commit()
    }
}
