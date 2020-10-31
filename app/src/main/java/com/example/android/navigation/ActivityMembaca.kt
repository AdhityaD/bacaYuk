package com.example.android.navigation

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class ActivityMembaca : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_membaca)
    }



    //Button Back di HP
    override fun onBackPressed() {
        val intent = Intent(this, ActivityBookDetail::class.java)
        // Mulai Aktiviti
        startActivity(intent)
        finish()

    }
}