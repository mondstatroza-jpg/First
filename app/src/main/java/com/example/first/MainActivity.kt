package com.example.first

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import kotlin.math.sqrt

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val edit1 = findViewById<EditText>(R.id.edit1)
        val edit2 = findViewById<EditText>(R.id.edit2)
        val buttonOK = findViewById<Button>(R.id.buttonOK)
        val textResult = findViewById<TextView>(R.id.textResult)

        buttonOK.setOnClickListener {
            val letter = edit1.text.toString().trim().lowercase()
            val value = edit2.text.toString().toDoubleOrNull()
            if (value == null) {
                textResult.text = "Введите значение"
                return@setOnClickListener
            }
            when (letter) {
                "a" -> {
                    val a = value
                    val c = a * sqrt(2.0)
                    val s = a * a / 2
                    textResult.text = "a=$a, c=$c, S=$s"
                }
                "c" -> {
                    val c = value
                    val a = c / sqrt(2.0)
                    val s = a * a / 2
                    textResult.text = "a=$a, c=$c, S=$s"
                }
                "s" -> {
                    val s = value
                    val a = sqrt(2 * s)
                    val c = a * sqrt(2.0)
                    textResult.text = "a=$a, c=$c, S=$s"
                }
                else -> textResult.text = "Неверная буква (a, c, S)"
            }
        }
    }
}