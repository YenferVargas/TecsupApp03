package com.example.tecsupapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class RegistrarEstudianteActivity: AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_register_estudiante)

        supportActionBar?.setDisplayHomeAsUpEnabled(true)
        supportActionBar?.title = getString(R.string.tituloGestionEstudiante)
        val drawable = resources.getDrawable(R.color.purple_640)
        supportActionBar?.setBackgroundDrawable(drawable)

    }

    override fun onSupportNavigateUp(): Boolean {
        onBackPressed()
        return true
    }

}