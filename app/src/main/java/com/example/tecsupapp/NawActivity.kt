package com.example.tecsupapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

import android.widget.Button


class NawActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_naw)

        val button = findViewById<Button>(R.id.button_Cursos)
        button.setOnClickListener {
            startActivity(Intent(this, RegisterP::class.java))
        }

        val button2 = findViewById<Button>(R.id.button_docentes)
        button2.setOnClickListener {
            startActivity(Intent(this, RegisterActivity::class.java))
        }

        val button4 = findViewById<Button>(R.id.button_estudiante)
        button4.setOnClickListener {
            startActivity(Intent(this, RegisterActivity::class.java))
        }



    }
}