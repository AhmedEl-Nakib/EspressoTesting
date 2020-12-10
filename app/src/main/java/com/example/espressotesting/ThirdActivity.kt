package com.example.espressotesting

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import androidx.recyclerview.widget.RecyclerView

class ThirdActivity : AppCompatActivity() {
    lateinit var recyclerView : RecyclerView
    lateinit var data : ArrayList<ModelItem>
    lateinit var recyclerViewAdapter: RecyclerViewAdapter
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_third)
        recyclerView = findViewById(R.id.recyclerViewId)
        data = ArrayList()
        data.add(ModelItem("Ahmed","Cairo"))
        data.add(ModelItem("Amr","Alex"))
        data.add(ModelItem("Omar","Aswan"))
        recyclerViewAdapter = RecyclerViewAdapter(data)
        recyclerView.adapter = recyclerViewAdapter
    }
}