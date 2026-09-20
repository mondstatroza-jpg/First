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
            val number = edit1.text.toString().toIntOrNull()
            if (number == null) {
                textResult.text = "Введите номер (1-4)"
                return@setOnClickListener
            }
            val season = when (number) {
                1 -> "зима"
                2 -> "весна"
                3 -> "лето"
                4 -> "осень"
                else -> "Ошибка"
            }
            textResult.text = season
        }
    }
}