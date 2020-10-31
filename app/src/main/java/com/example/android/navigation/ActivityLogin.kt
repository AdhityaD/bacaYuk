package com.example.android.navigation

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class ActivityLogin: AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)

        val button: Button = findViewById(R.id.btn_submit_login)
        button.setOnClickListener {
            val intent = Intent(this, ActivityBook::class.java)
            // Mulai Aktiviti
            startActivity(intent)
        }

    }


}