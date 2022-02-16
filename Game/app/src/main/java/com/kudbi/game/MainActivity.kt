package com.kudbi.game

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageButton
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val play: ImageButton = findViewById(R.id.play)
        val settings: ImageButton = findViewById(R.id.settings)
        val listLevels: ImageButton = findViewById(R.id.listLevels)
        var numberLevel: TextView = findViewById(R.id.numberLevel)
        val noAds: ImageButton = findViewById(R.id.noAds)
        val shop: ImageButton = findViewById(R.id.shop)
        val ladder: ImageButton = findViewById(R.id.ladder)


        when(numberLevel.text){
            "1" -> play.setOnClickListener{
                val intent = Intent(this, Level1::class.java)
                startActivity(intent)
            }
        }
    }
}