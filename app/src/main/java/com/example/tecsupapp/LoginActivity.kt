package com.example.tecsupapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class LoginActivity: AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)

        val button = findViewById<Button>(R.id.btnRegistrar)
        button.setOnClickListener {
            startActivity(Intent(this, RegisterActivity::class.java))
        }
        val button2 = findViewById<Button>(R.id.btnIngresar)
        button2.setOnClickListener {
            startActivity(Intent(this, NawActivity::class.java))
        }


        }


    }