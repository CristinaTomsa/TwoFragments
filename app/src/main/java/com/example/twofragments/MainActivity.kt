package com.example.twofragments

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val firstFragment = FirstFragment()
        val secondFragment = SecondFragment()
        val btnFirstFragment = findViewById<Button>(R.id.btn_firstFragment)
        val btnSecondFragment = findViewById<Button>(R.id.btn_secondFragment)

        supportFragmentManager.beginTransaction().apply {
            replace(R.id.container, firstFragment).commit()
        }

        btnFirstFragment.setOnClickListener {
            supportFragmentManager.beginTransaction().apply {
                replace(R.id.container, firstFragment).addToBackStack(null).commit()
            }
        }

        btnSecondFragment.setOnClickListener {
            supportFragmentManager.beginTransaction().apply {
                replace(R.id.container, secondFragment).addToBackStack(null).commit()
            }
        }


    }
}