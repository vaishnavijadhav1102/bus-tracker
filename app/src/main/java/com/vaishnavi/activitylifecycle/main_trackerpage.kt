package com.vaishnavi.activitylifecycle

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView

class main_trackerpage : AppCompatActivity() {
    lateinit var txtWelcome:TextView
    lateinit var btnTrack: Button
    lateinit var btnMessage: Button
    lateinit var btnContact:Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main_trackerpage)
    }

}