package com.tvd.testapplication

import android.annotation.SuppressLint
import android.content.Context
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v7.widget.LinearLayoutManager
import android.widget.LinearLayout
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    val androidName = listOf("Cupcake", "Donut", "Eclair", "Froyo",
        "Gingerbread", "Honeycomb", "Ice Cream Sandwich", "JellyBean", "Kitkat",
        "Lollipop", "Marshmallow", "Nougat", "Oreo")

    @SuppressLint("SetTextI18n")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        recycler_view_name.layoutManager = LinearLayoutManager(this,LinearLayout.VERTICAL, false)
        recycler_view_name.adapter = MyAdapter(androidName, this)
    }
}
