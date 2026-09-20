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
        val edit2 = findViewById<EditText>(R.id.edit2)
        val edit3 = findViewById<EditText>(R.id.edit3)
        val buttonOK = findViewById<Button>(R.id.buttonOK)
        val textResult = findViewById<TextView>(R.id.textResult)

        buttonOK.setOnClickListener {
            val variant = edit1.text.toString().toIntOrNull()
            if (variant == null) {
                textResult.text = "Введите номер варианта (1 или 2)"
                return@setOnClickListener
            }
            when (variant) {
                1 -> {
                    val a = edit2.text.toString().toDoubleOrNull()
                    val h = edit3.text.toString().toDoubleOrNull()
                    if (a == null || h == null) {
                        textResult.text = "Введите сторону и высоту"
                        return@setOnClickListener
                    }
                    val s = a * h
                    textResult.text = "Площадь = $s"
                }
                2 -> {
                    val d1 = edit2.text.toString().toDoubleOrNull()
                    val d2 = edit3.text.toString().toDoubleOrNull()
                    if (d1 == null || d2 == null) {
                        textResult.text = "Введите диагонали"
                        return@setOnClickListener
                    }
                    val s = d1 * d2 / 2
                    textResult.text = "Площадь = $s"
                }
                else -> textResult.text = "Неверный вариант"
            }
        }
    }
}