package com.example.contact

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.appcompat.app.ActionBar
import kotlinx.android.synthetic.main.activity_detail.*

class Detail : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detail)
        val actionBar : ActionBar? =  supportActionBar
        actionBar!! .setDisplayHomeAsUpEnabled(true)
        actionBar!!.setDisplayHomeAsUpEnabled(true)

        var intent = intent
        val atitle = intent.getStringExtra("ititle")
        actionBar.setTitle(atitle)
        a_title.text = atitle

    }
}
