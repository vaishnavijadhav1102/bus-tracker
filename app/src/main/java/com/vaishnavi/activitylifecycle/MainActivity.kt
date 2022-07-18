package com.vaishnavi.activitylifecycle

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText

class MainActivity : AppCompatActivity() {

    lateinit var etID : EditText
    lateinit var etRouteNumber : EditText
    lateinit var btnLogin :Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main_location_login)
        title = "Bus Tracker"

        etID=findViewById(R.id.etID)
        etRouteNumber=findViewById(R.id.etRouteNumber)
        btnLogin=findViewById(R.id.btnLogin)

        btnLogin.setOnClickListener{
            val intent = Intent (this@MainActivity,main_location_options::class.java)
            startActivity(intent)


        }
    }



}