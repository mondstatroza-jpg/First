package com.example.first

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val edit1 = findViewById<EditText>(R.id.edit1)
        val buttonOK = findViewById<Button>(R.id.buttonOK)
        val textResult = findViewById<TextView>(R.id.textResult)

        buttonOK.setOnClickListener {
            val input = edit1.text.toString()
            if (input.length != 1) {
                textResult.text = "Введите один символ"
                return@setOnClickListener
            }
            val ch = input[0]
            if (ch !in 'A'..'Z') {
                textResult.text = "Не латинская прописная буква"
                return@setOnClickListener
            }
            if (ch in setOf('L', 'M', 'K', 'D')) {
                textResult.text = "Это согласные буквы"
            } else {
                textResult.text = "Возможно, это гласные буквы"
            }
        }
    }
}