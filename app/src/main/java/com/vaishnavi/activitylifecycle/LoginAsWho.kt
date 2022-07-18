package com.vaishnavi.activitylifecycle

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView
import android.widget.Toast


class LoginAsWho : AppCompatActivity() {
    lateinit var txtSign_As:TextView
    lateinit var btnDriver : Button
    lateinit var btnStudent : Button


    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login_as_who)
        title = "Log In"
        txtSign_As = findViewById(R.id.txtSign_As)
        btnDriver= findViewById(R.id.btnDriver)
        btnStudent = findViewById(R.id.btnStudent)

        btnStudent.setOnClickListener{
            val intent  = Intent(this@LoginAsWho,MainActivity::class.java)
            startActivity(intent)

    }



    }




}