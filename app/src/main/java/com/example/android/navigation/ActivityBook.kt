package com.example.android.navigation

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import androidx.appcompat.app.AppCompatActivity

class ActivityBook: AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_book)

        //Intent ke activity BookDetail
        val imageKancil: ImageView = findViewById(R.id.iv_kancil)
        imageKancil.setOnClickListener {
            val intent = Intent(this, ActivityBookDetail::class.java)
            // Mulai Aktiviti
            startActivity(intent)
            finish()

        }

        //Intent ke activity Profile
        val buttonProfile: Button = findViewById(R.id.btn_profile_user)
        buttonProfile.setOnClickListener {
            val intent = Intent(this, ActivityProfile::class.java)
            // Mulai Aktiviti
            startActivity(intent)
            finish()
        }

    }
    //Button Back di HP
    override fun onBackPressed() {
        val intent = Intent(this, ActivityLogin::class.java)
        // Mulai Aktiviti
        startActivity(intent)
        finish()

    }


}