package com.example.android.navigation

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import androidx.appcompat.app.AppCompatActivity

class ActivityBookDetail: AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_book_detail)

        //intent ke hal baca
        val btnMembaca: Button = findViewById(R.id.btn_membaca)
        btnMembaca.setOnClickListener {
            val intent = Intent(this, ActivityMembaca::class.java)
            // Mulai Aktiviti
            startActivity(intent)
            finish()

        }




    }


    //Button Back di HP
    override fun onBackPressed() {
        val intent = Intent(this, ActivityBook::class.java)
        // Mulai Aktiviti
        startActivity(intent)
        finish()

    }
}