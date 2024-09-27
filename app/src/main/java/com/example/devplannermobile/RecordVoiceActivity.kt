package com.example.devplannermobile

import android.content.Intent
import android.os.Bundle
import android.widget.ImageView
import androidx.appcompat.app.AppCompatActivity

class RecordVoiceActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.record_voice)

        val recordImageView = findViewById<ImageView>(R.id.record_image)
        recordImageView.setOnClickListener {
            val intent = Intent(this, StopRecordActivity::class.java)
            startActivity(intent)
        }
    }
}