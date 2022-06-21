package com.example.traductor_meses

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val resultadoEnPantalla: TextView = findViewById(R.id.textViewMes)
        val botonTraducir: Button = findViewById(R.id.buttonTraducir)
        val mes: EditText = findViewById(R.id.editTextMes)
        val meses = mapOf("Enero" to "Gener", "Febrero" to "Febrer", "Marzo" to "Març", "Abril" to "Abril", "Mayo" to "Maig", "Junio" to "Juny", "Julio" to "Juliol", "Agosto" to "Agost", "Septiembre" to "Setembre", "Octubre" to "Octubre", "Noviembre" to "Novembre", "Diciembre" to "Desembre")

        botonTraducir.setOnClickListener{
            var mesIntroducido = mes.text.toString()

            if (mesIntroducido in meses.keys){
                resultadoEnPantalla.text = meses.get(mesIntroducido)
            }
            if (mesIntroducido in meses.values){
                val matchingKey = meses.entries.find { it.value == mesIntroducido }?.key
                resultadoEnPantalla.text = matchingKey
            }
        }


    }
}