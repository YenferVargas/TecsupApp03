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

        val button5 = findViewById<Button>(R.id.button_noticias)
        button5.setOnClickListener {
            startActivity(Intent(this, InfoCursoActivity::class.java))
        }


        val button8 = findViewById<Button>(R.id.button_nota)
        button8.setOnClickListener {
            startActivity(Intent(this, CursoActivity::class.java))
        }

        val button7 = findViewById<Button>(R.id.button_estudiante)
        button7.setOnClickListener {
            startActivity(Intent(this, RegistrarEstudianteActivity::class.java))
        }
        val button6 = findViewById<Button>(R.id.button_docentes)
        button6.setOnClickListener {
            startActivity(Intent(this, RegistrarDocenteActivity::class.java))
        }



    }
}