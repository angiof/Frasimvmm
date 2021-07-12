package com.example.ejemploviewmodel

import android.os.Bundle
import androidx.activity.viewModels
import androidx.appcompat.app.AppCompatActivity
import com.example.ejemploviewmodel.databinding.ActivityMainBinding
import com.example.ejemploviewmodel.model.viemodels.ViewModelFreasi

class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding
    private val views: ViewModelFreasi by viewModels()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)


        views.frasiCitazioni.observe(this, { frase ->
            binding.tFrases.text = frase.frase
        })


        binding.layoutmain.setOnClickListener {

            views.iniziaCitazioni()
        }

    }
}