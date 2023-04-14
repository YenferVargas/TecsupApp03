package com.example.tecsupapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.*

class RegisterActivity : AppCompatActivity() {

    lateinit var  opciones: Spinner


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_register)

        val button = findViewById<Button>(R.id.buttons)
        button.setOnClickListener {
            startActivity(Intent(this, NawActivity::class.java))
        }
        val lista = listOf("Estudiante","Profesor")

        opciones=findViewById(R.id.spinner_usuario)
//        texto=findViewById(R.id.mostrar)
        val adaptador = ArrayAdapter(this,
            android.R.layout.simple_spinner_item,lista)

        opciones.adapter=adaptador
        opciones.onItemSelectedListener= object:
            AdapterView.OnItemSelectedListener{
            override fun onItemSelected(
                p0: AdapterView<*>?, p1: View?, p2: Int, p3: Long) {

            }

            override fun onNothingSelected(p0: AdapterView<*>?) {
                TODO("Not yet implemented")
            }
        }


//

    }
}