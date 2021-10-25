package com.example.birthday

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        button.setOnClickListener {

            val message: String = etUserMessage.text.toString()
            val intent = Intent(this, BirhtDatWish::class.java)
            intent.putExtra("message", message)
            startActivity(intent)

        }
    }
}
