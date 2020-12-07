package com.example.espressotesting

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    lateinit var nextActivity : Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        nextActivity = findViewById(R.id.button_next_activity)
        nextActivity.setOnClickListener {
            val intent = Intent(this, SecondaryActivity::class.java)
            startActivity(intent)
        }
    }
}