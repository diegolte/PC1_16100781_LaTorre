package com.example.pc1_16100781_latorre

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val etValor1: EditText = findViewById(R.id.etValor1)
        val etValor2: EditText = findViewById(R.id.etValor2)
        val btnEnviar: Button = findViewById(R.id.btnEnviar)
        btnEnviar.setOnClickListener {
            this.sendValores(Integer.parseInt(etValor1.text.toString())
                ,Integer.parseInt(etValor2.text.toString()));
        }
    }
    private fun sendValores (valor1: Int, valor2: Int){
        val intent = Intent(this,ResultadoActivity::class.java)
        intent.putExtra("valor1",valor1)
        intent.putExtra("valor2",valor2)
        startActivity(intent)
    }
}