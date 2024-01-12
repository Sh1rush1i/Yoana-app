package com.example.yoanaapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class StartActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_start)

        val button_1 = findViewById<Button>(R.id.button_1)
        button_1.setOnClickListener {
            val Intent = Intent(this, LoginActivity::class.java)
            startActivity(Intent)
        }
        val button_2 = findViewById<Button>(R.id.button_2)
        button_2.setOnClickListener {
            val Intent = Intent(this, RegisActivity::class.java)
            startActivity(Intent)
        }
    }
}