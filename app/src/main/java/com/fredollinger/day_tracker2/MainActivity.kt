package com.fredollinger.day_tracker2

import android.support.v7.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val d = new DTDate()
        var t = d.getCurrentTimeSeconds()
        var tvMain = findViewById(R.id.textViewMain) as textViewMain
        setContentView(R.layout.activity_main)
    }
}
