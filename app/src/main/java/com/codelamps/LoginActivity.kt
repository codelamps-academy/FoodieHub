package com.codelamps

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import com.codelamps.databinding.ActivityLoginBinding

class LoginActivity : AppCompatActivity() {

    private val binding : ActivityLoginBinding by lazy {
        ActivityLoginBinding.inflate(layoutInflater)
    }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)

        binding.dontHaveAccount.setOnClickListener{
            var intent = Intent(this, SignUpActivity::class.java)
            startActivity(intent)
        }
    }
}
