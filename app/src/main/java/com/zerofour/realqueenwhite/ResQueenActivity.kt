package com.zerofour.realqueenwhite

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import com.zerofour.R

class ResQueenActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_res_queen)
        val b = findViewById<Button>(R.id.button2)
        b.setOnClickListener {
            startActivity(Intent(this,MainQueenGame::class.java))
        }
    }
}