package com.example.testapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import androidx.viewpager.widget.ViewPager
import com.tbuonomo.viewpagerdotsindicator.DotsIndicator

class MainActivity : AppCompatActivity() {

    private lateinit var viewPager:ViewPager
    private lateinit var btnGetStarted:Button
    private lateinit var dotsIndicator:DotsIndicator

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        initViews()
    }

    fun initViews(){
        viewPager = findViewById(R.id.viewPager)
        btnGetStarted = findViewById(R.id.btnGetStarted)
        dotsIndicator = findViewById(R.id.dotsIndicator)

        viewPager.adapter = MyPagerAdapter(this)
        dotsIndicator.attachTo(viewPager)

        btnGetStarted.setOnClickListener {
            val intent = Intent(this, InputAngkaActivity::class.java)
            startActivity(intent)
        }
    }
}