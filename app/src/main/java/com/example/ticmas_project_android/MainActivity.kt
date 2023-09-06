package com.example.ticmas_project_android

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.TextView
import android.widget.EditText
import androidx.activity.viewModels
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import com.example.ticmas_project_android.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    //private lateinit var viewModel: MainViewModel
    private lateinit var binding:ActivityMainBinding

    private val rtaViewModel : RtaViewModel by viewModels()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        //viewModel = ViewModelProvider(this).get(MainViewModel::class.java)
        val compareButton = findViewById<Button>(R.id.botonComparar)
        compareButton.setOnClickListener {
            Log.d("tag" ,"Hiciste click al boton" )
            val editText1 = findViewById<EditText>(R.id.textCard1)
            val editText2 = findViewById<EditText>(R.id.textCard2)
            val resultTextView = findViewById<TextView>(R.id.textResult2)
            val text1 = editText1.text.toString()
            val text2 = editText2.text.toString()

            if (text1 == text2) {
                resultTextView.text = "Los textos SON IGUALES"

            } else {
                resultTextView.text = "Los textos NO SON IGUALES"
            }

            rtaViewModel.modelData.observe(this, Observer {
                binding.textResult3.text = it.cadena
            })
            binding.botonComparar.setOnClickListener {rtaViewModel.randomGen()}
        }
    }
}