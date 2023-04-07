package com.example.tecsupapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.AdapterView
import android.widget.ArrayAdapter
import android.widget.Spinner

class RegisterP : AppCompatActivity() {
    lateinit var  opciones1: Spinner

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_register_p)

        val lista = listOf("Aplicaciones Moviles","Aplicaciones Web","Aplicaciones Empresariales","Pruebas de Software")


        opciones1=findViewById(R.id.spiner_cursos)
//        texto=findViewById(R.id.mostrar)
        val adaptador = ArrayAdapter(this,
            android.R.layout.simple_spinner_item,lista)

        opciones1.adapter=adaptador
        opciones1.onItemSelectedListener= object:
            AdapterView.OnItemSelectedListener{
            override fun onItemSelected(
                p0: AdapterView<*>?, p1: View?, p2: Int, p3: Long) {

            }

            override fun onNothingSelected(p0: AdapterView<*>?) {
                TODO("Not yet implemented")
            }
        }
    }
}

