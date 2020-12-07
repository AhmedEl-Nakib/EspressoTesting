package com.example.espressotesting

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class SecondaryActivity : AppCompatActivity() {
    lateinit var back : Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_secondary)
        back = findViewById(R.id.button_back)
        back.setOnClickListener {
            onBackPressed()
        }
    }
}