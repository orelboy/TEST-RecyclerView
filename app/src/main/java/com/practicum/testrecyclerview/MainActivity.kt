package com.practicum.testrecyclerview

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val weatherAdapter = WeatherAdapter(
            listOf(
                DailyWeather("Пн", true, -23),
                DailyWeather("Вт", true, -20),
                DailyWeather("Ср", false, -15),
                DailyWeather("Чт", true, -3),
                DailyWeather("Пт", false, +6),
                DailyWeather("Сб", false, +11),
                DailyWeather("Вс", true, +20),
            )
        )

        val rvWeather = findViewById<RecyclerView>(R.id.rvWeather)
        rvWeather.adapter = weatherAdapter

        val buttonGlideTest = findViewById<Button>(R.id.GlideTest)
        buttonGlideTest.setOnClickListener {
            val displayIntent = Intent(this, GlideTest::class.java)
            startActivity(displayIntent)
        }
    }
}