package com.codelamps

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class StartActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_start)

        val nextButton = findViewById<Button>(R.id.nextButton)

        nextButton.setOnClickListener {
            // intent ke login
            val intent: Intent = Intent(this, LoginActivity::class.java)
            startActivity(intent)
        }

    }
}
