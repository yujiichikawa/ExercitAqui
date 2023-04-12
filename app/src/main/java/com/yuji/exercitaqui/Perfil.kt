package com.yuji.exercitaqui

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast

class Perfil : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_perfil)

        val nomePerfil = intent.getStringExtra("nomeLogin")
        val senhaPerfil = intent.getStringExtra("senhaLogin")
        val imc = intent.getStringExtra("valor")

        findViewById<TextView>(R.id.imc).setText(imc)

        findViewById<TextView>(R.id.nomePerfil).setText(nomePerfil)
        findViewById<TextView>(R.id.senhaPerfil).setText(senhaPerfil)

        findViewById<Button>(R.id.formImc).setOnClickListener {
            val intent = Intent(this,Formulario_Imc::class.java)
            startActivity(intent)
        }

        findViewById<Button>(R.id.alterarPerfil).setOnClickListener {
            Toast.makeText(this, "em desenvolvimento", Toast.LENGTH_SHORT).show()
        }
    }
}