package com.example.ecommerceproject.presentation.login

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.ecommerceproject.R
import com.example.ecommerceproject.databinding.ActivityOtpactivityBinding

class OTPActivity : AppCompatActivity() {
    private lateinit var binding: ActivityOtpactivityBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityOtpactivityBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.btnBack.setOnClickListener {
            onBackPressed()
        }

    }
}