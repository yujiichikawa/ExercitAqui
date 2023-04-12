package com.yuji.exercitaqui

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import java.lang.Float

class Formulario_Imc : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_formulario_imc)

        findViewById<Button>(R.id.calcularImc).setOnClickListener {
            val peso = Float.parseFloat(findViewById<EditText>(R.id.peso).toString())
            val altura = Float.parseFloat(findViewById<EditText>(R.id.altura).toString())

            val imc = peso/(altura*altura)
            val intent = Intent(this,Perfil::class.java)

            intent.putExtra("valor",imc)

            startActivity(intent)

        }
    }
}