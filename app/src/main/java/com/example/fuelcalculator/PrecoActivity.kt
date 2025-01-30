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
import com.google.android.material.snackbar.Snackbar
import com.google.android.material.textfield.TextInputEditText


        class PrecoActivity : AppCompatActivity() {
            private lateinit var binding: ActivityPrecoBinding

            override fun onCreate(savedInstanceState: Bundle?) {
                super.onCreate(savedInstanceState)
                binding = ActivityPrecoBinding.inflate(layoutInflater)
                setContentView(binding.root)

                binding.btnClean.setOnClickListener{
                    binding.tieCombustivel.setText("")
                    binding.tieConsulmo.setText("")
                    binding.tieDestino.setText("")

                }

                binding.btnResultado.setOnClickListener{
                    val precoTemp = binding.tieCombustivel.text
                    val consumoTemp = binding.tieConsulmo.text
                    val distanciaTemp = binding.tieDestino.text

                    if (precoTemp?.isEmpty() ==true ||
                        consumoTemp?.isEmpty() == true ||
                        distanciaTemp?.isEmpty() == true){
                        Snackbar.make(binding.tieCombustivel, "Preencha todos os campos", Snackbar.LENGTH_LONG)
                            .show()
                    }else {
                        var precocb: Float = precoTemp.toString().toFloat()
                        var consumo: Float = consumoTemp .toString().toFloat()
                        var distancia:Float = distanciaTemp.toString().toFloat()

                        var totalTemp = distancia / consumo
                        var custoTotal= totalTemp * precocb


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

            }



