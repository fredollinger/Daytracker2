package com.fredollinger.day_tracker2

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val d = DTDate()
        var t = d.getCurrentTimeSeconds()
        textView.setText("hi")
        //tvMain.setText("Days Elapsed")
        // var button = (TextView) findViewById(R.id.textView);
    }
}
