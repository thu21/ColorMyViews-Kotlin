package com.example.android.colormyviews

import android.annotation.SuppressLint
import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.ListView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        setListeners()
    }

    // val view1: View = findViewById(R.id.box_1_text)
    // val view2: View = findViewById(R.id.box_2_text)
    // val view3: View = findViewById(R.id.box_3_text)
    // val view4: View = findViewById(R.id.box_4_text)
    //   val view5: View = findViewById(R.id.box_5_text)
    //   val view6: View = findViewById(R.id.ConstrainLayout)


    private fun setListeners() {
        val clickableViews: List<View> = listOf( findViewById(R.id.box_1_text),findViewById(R.id.box_2_text), findViewById(R.id.box_3_text),
            findViewById(R.id.box_4_text),findViewById(R.id.box_5_text), findViewById(R.id.ConstrainLayout),
        findViewById(R.id.red_button),  findViewById(R.id.yellow_button),  findViewById(R.id.green_button))
        //listOf(view1, view2, view3, view4, view5, view6)
        for (item in clickableViews) {
            item.setOnClickListener { makeColored(it) }
        }

    }


    private fun makeColored(view: View) {
        when (view.id) {
            R.id.box_1_text -> view.setBackgroundColor(Color.DKGRAY)
            R.id.box_2_text -> view.setBackgroundColor(Color.GRAY)

            // Boxes using Android color resources for background
            R.id.box_3_text -> view.setBackgroundResource(android.R.color.holo_blue_bright)
            R.id.box_4_text -> view.setBackgroundResource(android.R.color.darker_gray)
            R.id.box_5_text -> view.setBackgroundResource(android.R.color.holo_red_light)


            R.id.red_button ->view.setBackgroundResource(R.color.my_red)
            R.id.green_button-> view.setBackgroundResource(R.color.my_green)
            R.id.yellow_button -> view.setBackgroundResource(R.color.my_yellow)

            else -> view.setBackgroundColor(Color.LTGRAY)


        }


    }
}

