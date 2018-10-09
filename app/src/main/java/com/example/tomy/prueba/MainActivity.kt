package com.example.tomy.prueba

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btnCosas.setOnClickListener {

            Log.i("Main Activity", "Pasaron cosas" )

            Toast.makeText(this, "Pasaron cosas", Toast.LENGTH_SHORT).show()

        }

        btnALaSiguienteActivity.setOnClickListener {
            val message: String = btnALaSiguienteActivity.text.toString()
            Toast.makeText(this, message, Toast.LENGTH_SHORT).show()

            val intent = Intent(this, SegundaActivity::class.java)
            startActivity(intent)


        }

    }
}
