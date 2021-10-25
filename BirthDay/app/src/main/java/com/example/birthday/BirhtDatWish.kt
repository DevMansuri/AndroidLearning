package com.example.birthday

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_birht_dat_wish.*

class BirhtDatWish : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_birht_dat_wish)
        val message = intent.getStringExtra("message")
        msgtxt.text = message
    }
}
