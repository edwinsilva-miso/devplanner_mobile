package com.example.devplannermobile

import android.content.Intent
import android.os.Bundle
import android.widget.ImageView
import androidx.appcompat.app.AppCompatActivity

class StopRecordActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.stop_record)

        val stopImageView = findViewById<ImageView>(R.id.stop_image)
        stopImageView.setOnClickListener {
            val intent = Intent(this, CreateAlarmActivity::class.java)
            startActivity(intent)
        }
    }
}