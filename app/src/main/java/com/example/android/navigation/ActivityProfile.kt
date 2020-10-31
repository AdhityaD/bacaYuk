package com.example.android.navigation

import android.os.Bundle
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity

class ActivityProfile : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_profile)


    }

    //Button Back di HP
    override fun onBackPressed() {
        val intent = Intent(this, ActivityBook::class.java)
        // Mulai Aktiviti
        startActivity(intent)
        finish()

    }



}