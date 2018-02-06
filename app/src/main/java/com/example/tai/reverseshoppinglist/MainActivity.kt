package com.example.tai.reverseshoppinglist

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.design.widget.FloatingActionButton
import android.view.Window
import android.widget.Toast
import android.view.WindowManager
import android.os.Build
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*


class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.KITKAT) {
            val w = window
            w.setFlags(WindowManager.LayoutParams.FLAG_LAYOUT_NO_LIMITS, WindowManager.LayoutParams.FLAG_LAYOUT_NO_LIMITS)
        }
        setContentView(R.layout.activity_main)


        val myFab = findViewById<FloatingActionButton>(R.id.floatingActionButton)

        myFab.setOnClickListener {
            val intent = Intent(this, AddActivity::class.java).apply {}
            startActivity(intent)
        }

    }

}
