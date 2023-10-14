package com.example.eletriccarapp.presentation

import android.os.Bundle
import android.widget.EditText
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import com.example.eletriccarapp.R

class CalcularAutonomiaActivity: AppCompatActivity() {
    lateinit var preco: EditText
    lateinit var kmPercorrido: EditText
    lateinit var btnCalcular: android.widget.Button
    lateinit var resultado: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_calcular_autonomia)
        setupListeners()
        setupViews()
    }

    fun setupListeners() {
        btnCalcular.setOnClickListener {
            calcular()
        }
    }

    fun setupViews() {
        preco = findViewById(R.id.et_preco_kwh)
        kmPercorrido = findViewById(R.id.et_km_percorrido)
        resultado = findViewById(R.id.tv_resultado)
        btnCalcular = findViewById(R.id.btn_calcular)
    }

    fun calcular() {
        val preco = preco.text.toString().toFloat()
        val km = kmPercorrido.text.toString().toFloat()

        val result = preco / km
        resultado.text = "Autonomia: $result"
    }
}