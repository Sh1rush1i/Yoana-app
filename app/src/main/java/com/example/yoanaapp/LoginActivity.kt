package com.example.yoanaapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class LoginActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)

        val button_3 = findViewById<Button>(R.id.button_3)
        button_3.setOnClickListener {
            val Intent = Intent(this, ProfilActivity::class.java)
            startActivity(Intent)
        }

        val reg_1 = findViewById<TextView>(R.id.reg_1)
        reg_1.setOnClickListener {
            val Intent = Intent(this, RegisActivity::class.java)
            startActivity(Intent)
        }
    }
}