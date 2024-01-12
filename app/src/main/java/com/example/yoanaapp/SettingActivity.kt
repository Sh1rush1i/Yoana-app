package com.example.yoanaapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class SettingActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_setting)

        val button_8 = findViewById<Button>(R.id.button_8)
        button_8.setOnClickListener {
            val Intent = Intent(this, akunActivity::class.java)
            startActivity(Intent)
        }
        val button_6 = findViewById<Button>(R.id.button_6)
        button_6.setOnClickListener {
            val Intent = Intent(this, ratingActivity::class.java)
            startActivity(Intent)
        }
        val button_7 = findViewById<Button>(R.id.button_7)
        button_7.setOnClickListener {
            val Intent = Intent(this, DeveloperActivity::class.java)
            startActivity(Intent)
        }
        val kontak = findViewById<Button>(R.id.kontak)
        kontak.setOnClickListener {
            val Intent = Intent(this, Main::class.java)
            startActivity(Intent)
        }
    }
}