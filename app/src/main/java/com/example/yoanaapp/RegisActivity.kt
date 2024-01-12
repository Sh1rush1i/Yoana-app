package com.example.yoanaapp

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class RegisActivity : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_regis)

        val button_4 = findViewById<Button>(R.id.button_4)
        button_4.setOnClickListener {
            val Intent = Intent(this, ProfilActivity::class.java)
            startActivity(/* intent = */ Intent)
        }
        val reg_2 = findViewById<TextView>(R.id.reg_2)
        reg_2.setOnClickListener {
            val Intent = Intent(this, LoginActivity::class.java)
            startActivity(Intent)
        }
    }
}