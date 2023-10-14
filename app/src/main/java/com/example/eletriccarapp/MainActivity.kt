package com.example.eletriccarapp

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.eletriccarapp.presentation.CalcularAutonomiaActivity

class MainActivity : AppCompatActivity() {

    lateinit var btnRedirect: android.widget.Button


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        setupViews()
        setupListeners()
    }

    fun setupViews() {
        btnRedirect = findViewById(R.id.btn_redirect)
    }

    fun setupListeners() {
        btnRedirect.setOnClickListener {
            startActivity(Intent(this, CalcularAutonomiaActivity::class.java))
        }
    }


}