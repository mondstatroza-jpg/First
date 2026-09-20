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
            val age = edit1.text.toString().toIntOrNull()
            if (age == null) {
                textResult.text = "Введите целое число"
                return@setOnClickListener
            }
            val message = when {
                age <= 20 -> "Вы слишком молоды!"
                age == 30 || age == 40 || age == 50 || age == 60 -> "Поздравляем с повышением!"
                age == 65 -> "Преподносим вам золотые часы!"
                age > 65 -> "Вы слишком стары!"
                else -> "Продолжайте накапливать опыт!"
            }
            textResult.text = message
        }
    }
}