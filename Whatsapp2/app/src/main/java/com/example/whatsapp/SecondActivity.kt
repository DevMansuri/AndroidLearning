package com.example.whatsapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler

class SecondActivity : AppCompatActivity() {
    private val splashScreentimeout : Long = 2500

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)
        Handler() .postDelayed({

            startActivity(Intent(this,MainActivity::class.java))
            finish()
        },splashScreentimeout)
    }
}
