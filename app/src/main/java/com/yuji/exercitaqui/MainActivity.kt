package com.yuji.exercitaqui

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        findViewById<Button>(R.id.btnLogin).setOnClickListener {
            val nome = findViewById<EditText>(R.id.nomeLogin).text.toString()
            val senha = findViewById<EditText>(R.id.senhaLogin).text.toString()

            if(nome.equals("thiagoyuji") and senha.equals("12345")){
                val intent = Intent(this,Perfil::class.java)

                intent.putExtra("nomeLogin",nome)
                intent.putExtra("senhaLogin",senha)

                startActivity(intent)
            }else{
                Toast.makeText(this, "Dados Inválidos", Toast.LENGTH_SHORT).show()
            }

        }
    }
}