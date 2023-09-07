package com.example.ticmas_project_android

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.TextView
import android.widget.EditText
import androidx.activity.viewModels
import androidx.core.content.ContextCompat
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import com.example.ticmas_project_android.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding:ActivityMainBinding

    private val rtaViewModel : RtaViewModel by viewModels()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.botonComparar.setOnClickListener {rtaViewModel.randomGen()
            rtaViewModel.modelData.observe(this, Observer {
                binding.textResult3.text = it.cadena
            })

            Log.d("tag" ,"Hiciste click al boton" )
            val editText1 = findViewById<EditText>(R.id.textCard1)
            val editText2 = findViewById<EditText>(R.id.textCard2)
            val resultTextView = findViewById<TextView>(R.id.textResult2)
            val text1 = editText1.text.toString()
            val text2 = editText2.text.toString()

            if (text1 == text2) {
                resultTextView.text = "Los Textos SON IGUALES"
                resultTextView.setTextColor(ContextCompat.getColor(this, R.color.colorVerde))
            } else {
                resultTextView.text = "Los Textos NO SON IGUALES"
                resultTextView.setTextColor(ContextCompat.getColor(this, R.color.colorRojo))
            }
        }
    }
}