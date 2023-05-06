package com.example.pc1_16100781_latorre

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class ResultadoActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_resultado)

        val valor1 = intent.getIntExtra("valor1",0)
        val valor2 = intent.getIntExtra("valor2",0)
        val tvSumaRes = findViewById<TextView>(R.id.tvSumaRes)
        val tvRestaRes = findViewById<TextView>(R.id.tvRestaRes)
        val tvMultiRes = findViewById<TextView>(R.id.tvMultiRes)
        val tvDivRes = findViewById<TextView>(R.id.tvDivRes)
        val suma = valor1 + valor2
        val resta = valor1 - valor2
        val multi = valor1 * valor2
        val div = valor1 / valor2
        tvSumaRes.text =suma.toString()
        tvRestaRes.text =resta.toString()
        tvMultiRes.text =multi.toString()
        tvDivRes.text =div.toString()
        val btnVolver: Button = findViewById(R.id.btnVolver)
        btnVolver.setOnClickListener{
            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
        }
    }
}