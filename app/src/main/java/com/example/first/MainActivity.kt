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
            if (input.isEmpty()) {
                textResult.text = "Введите число"
                return@setOnClickListener
            }
            val number = input.toIntOrNull()
            if (number == null) {
                textResult.text = "Ошибка: введите целое число"
                return@setOnClickListener
            }
            val day = when (number) {
                1 -> "Понедельник"
                2 -> "Вторник"
                3 -> "Среда"
                4 -> "Четверг"
                5 -> "Пятница"
                6 -> "Суббота"
                7 -> "Воскресенье"
                else -> "Неверный номер (1-7)"
            }
            textResult.text = day
        }
    }
}