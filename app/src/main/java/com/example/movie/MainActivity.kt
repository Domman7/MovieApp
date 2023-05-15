package com.example.movie

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.viewpager2.widget.ViewPager2


class MainActivity : AppCompatActivity() {
    private lateinit var adapter: FilmsAdapter
    private lateinit var adapterLower: FilmsLowerAdapter
    private lateinit var viewPager: ViewPager2
    private lateinit var viewLowerPager: ViewPager2

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.fragment_home)

        adapter = FilmsAdapter(this)
        adapterLower = FilmsLowerAdapter(this)
        viewPager = findViewById(R.id.homeUpperPager)
        viewLowerPager = findViewById(R.id.homeLowerPager)
        viewPager.adapter = adapter
        viewLowerPager.adapter = adapterLower
    }
}