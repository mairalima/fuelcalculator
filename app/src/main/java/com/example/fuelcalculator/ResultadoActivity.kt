package com.example.fuelcalculator

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.fuelcalculator.databinding.ActivityResultadoBinding

class ResultadoActivity : AppCompatActivity() {
    private lateinit var binding: ActivityResultadoBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityResultadoBinding.inflate(layoutInflater)
        setContentView(binding.root)




        var precocb = intent.getFloatExtra("precocb", 0.0f)
        var consumo = intent.getFloatExtra("consumo", 0.0f)
        var distancia = intent.getFloatExtra("distancia", 0.0f)
        var custoTotal = intent.getFloatExtra("custoTotal", 0.0f)

        binding.tvTotalPreco.text = precocb.toString()
        binding.tvTotalConsumo.text = consumo.toString()
        binding.tvTotalKm.text = distancia.toString()
        binding.tvResult.text = custoTotal.toString()
        }
    }
