package com.example.yoanaapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import androidx.cardview.widget.CardView

class ProfilActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_profil)

        val d1 = findViewById<CardView>(R.id.d1)
        d1.setOnClickListener {
            val Intent = Intent(this, ScrollActivity::class.java)
            startActivity(Intent)
        }
        val d2 = findViewById<CardView>(R.id.d2)
        d2.setOnClickListener {
            val Intent = Intent(this, portoActivity::class.java)
            startActivity(Intent)
        }
        val d3 = findViewById<CardView>(R.id.d3)
        d3.setOnClickListener {
            val Intent = Intent(this, galeryActivity::class.java)
            startActivity(Intent)
        }

        val d4 = findViewById<CardView>(R.id.d4)
        d4.setOnClickListener {
            val Intent = Intent(this, SmsActivity::class.java)
            startActivity(Intent)
        }

        val setting = findViewById<ImageView>(R.id.setting)
        setting.setOnClickListener {
            val Intent = Intent(this, SettingActivity::class.java)
            startActivity(Intent)
        }
    }
}