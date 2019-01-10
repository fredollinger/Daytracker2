package com.fredollinger.day_tracker2

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*
import android.view.Menu
import android.view.MenuInflater
import android.view.MenuItem

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val d = DTDate()
        textView.setText("Days Elapsed: " + d.daysElapsedString())
    }

    override fun onCreateOptionsMenu(menu: Menu): Boolean {
        val inflater: MenuInflater = menuInflater
        inflater.inflate(R.menu.options_menu, menu)
        return true
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        // Handle presses on the action bar menu items
        when (item.itemId) {
            R.id.action_about -> {
                textView.setText("Day Tracker \n (C) 2019 \n Frederick Olllinger")
            }
            R.id.action_reset_time -> {
                val d = DTDate()
                d.resetInitialTime()
                textView.setText("Days Elapsed: " + d.daysElapsedString())
            }
        }
        return true
    }
    fun silly() {
    }
}
