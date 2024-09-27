package com.example.devplannermobile

import android.content.Intent
import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.Button
import android.widget.ImageView
import android.widget.ListView
import androidx.appcompat.app.AppCompatActivity

class HomeActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.home)

        val addImageView = findViewById<ImageView>(R.id.add_button)
        addImageView.setOnClickListener {
            val intent = Intent(this, RecordVoiceActivity::class.java)
            startActivity(intent)
        }

        val arrayAdapter: ArrayAdapter<*>
        val alarms = arrayOf("Alarma 1", "Alarma 2", "Alarma 3", "Alarma 4", "Alarma 5")

        var mListView = findViewById<ListView>(R.id.alarmas_list)
        arrayAdapter = ArrayAdapter(this, android.R.layout.simple_list_item_1, alarms)
        mListView.adapter = arrayAdapter

    }
}