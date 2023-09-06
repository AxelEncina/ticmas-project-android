package com.example.ticmas_project_android

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.TextView
import android.widget.EditText

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val compareButton = findViewById<Button>(R.id.botonComparar)
        compareButton.setOnClickListener {
            Log.d("tag" ,"Haz hecho click" )
            val editText1 = findViewById<EditText>(R.id.textCard1)
            val editText2 = findViewById<EditText>(R.id.textCard2)
            val resultTextView = findViewById<TextView>(R.id.textResult2)
            val text1 = editText1.text.toString()
            val text2 = editText2.text.toString()

            if (text1 == text2) {
                resultTextView.text = "Los textos son IGUALES"
            } else {
                resultTextView.text = "Los textos NO SON IGUALES"
            }
        }
    }
}