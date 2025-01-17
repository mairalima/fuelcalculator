package com.example.fuelcalculator

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.fuelcalculator.databinding.ActivityMainBinding
import com.example.fuelcalculator.databinding.ActivityPrecoBinding
import com.google.android.material.textfield.TextInputEditText


        class PrecoActivity : AppCompatActivity() {
            private lateinit var binding: ActivityPrecoBinding

            override fun onCreate(savedInstanceState: Bundle?) {
                super.onCreate(savedInstanceState)
                binding = ActivityPrecoBinding.inflate(layoutInflater)
                setContentView(binding.root)

                binding.btnResultado.setOnClickListener{

                    var precocb: Float = binding.tieCombustivel.text.toString().toFloat()
                    var consumo: Float = binding.tieConsulmo.text.toString().toFloat()
                    var distancia:Float = binding.tieDestino.text.toString().toFloat()

                    var totalTemp = distancia / consumo
                    var custoTotal= totalTemp * precocb
                    println("Maira" + custoTotal)

                  var intent = Intent(this, ResultadoActivity::class.java)
                    intent.apply {
                        putExtra("precocb", precocb)
                        putExtra("consumo", consumo)
                        putExtra("distancia", distancia)
                        putExtra("custoTotal", custoTotal)
                    }
                    startActivity(intent)

                  }


                }

            }



