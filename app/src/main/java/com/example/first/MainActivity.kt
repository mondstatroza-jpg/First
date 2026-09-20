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
            if (ch !in 'a'..'z') {
                textResult.text = "Не латинская строчная буква"
                return@setOnClickListener
            }
            if (ch in setOf('a', 'i', 'e', 'o', 'u')) {
                textResult.text = "Это гласные буквы"
            } else {
                textResult.text = "Возможно, это согласные буквы"
            }
        }
    }
}