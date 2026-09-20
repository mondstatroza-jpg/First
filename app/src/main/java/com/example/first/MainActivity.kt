package com.example.first

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import kotlin.math.pow

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val edit1 = findViewById<EditText>(R.id.edit1)
        val edit2 = findViewById<EditText>(R.id.edit2)
        val edit3 = findViewById<EditText>(R.id.edit3)
        val edit4 = findViewById<EditText>(R.id.edit4)
        val buttonOK = findViewById<Button>(R.id.buttonOK)
        val textResult = findViewById<TextView>(R.id.textResult)

        buttonOK.setOnClickListener {
            val a = edit1.text.toString().toDoubleOrNull()
            val b = edit2.text.toString().toDoubleOrNull()
            val c = edit3.text.toString().toDoubleOrNull()
            val symbol = edit4.text.toString().trim()
            if (a == null || b == null || c == null) {
                textResult.text = "Введите три числа"
                return@setOnClickListener
            }
            when (symbol) {
                "a" -> {
                    val avg = (a + b + c) / 3.0
                    textResult.text = "Среднее арифметическое = $avg"
                }
                "g" -> {
                    val geom = (a * b * c).pow(1.0 / 3.0)
                    textResult.text = "Среднее геометрическое = $geom"
                }
                else -> textResult.text = "Ошибка: символ должен быть 'a' или 'g'"
            }
        }
    }
}