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
            when {
                ch in '0'..'9' -> textResult.text = "Это цифра!"
                ch == '&' || ch == '#' || ch == '<' -> textResult.text = "Это спец символ!"
                else -> textResult.text = "Непредусмотренный вариант!"
            }
        }
    }
}