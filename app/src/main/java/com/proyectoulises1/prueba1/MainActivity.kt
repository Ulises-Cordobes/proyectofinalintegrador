package com.proyectoulises1.prueba1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.activity.viewModels
import androidx.lifecycle.Observer
import com.proyectoulises1.prueba1.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private val viewModel: CompareViewModel by viewModels()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        val binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.compareButton?.setOnClickListener {
            val text1 = binding.editText1?.text.toString()
            val text2 = binding.editText2?.text.toString()
            viewModel.compareStrings(text1, text2)
        }

        viewModel.resultText.observe(this, Observer { result ->
            binding.resultTextView?.text = result
        })
    }
}
