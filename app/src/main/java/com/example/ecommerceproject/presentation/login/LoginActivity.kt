package com.example.ecommerceproject.presentation.login

import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import com.example.ecommerceproject.databinding.ActivityLoginBinding


class LoginActivity : AppCompatActivity() {
    private lateinit var binding: ActivityLoginBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityLoginBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.btnLogin.setOnClickListener {
            val regex = "-?[0-9]+(\\.[0-9]+)?".toRegex()
            if (binding.edtPhoneEmail.text?.matches(regex) == true) {
                startActivity(Intent(applicationContext, OTPActivity::class.java))
            } else if (binding.txtPassword.visibility == View.GONE) {
                binding.edtPassword.visibility = View.VISIBLE
                binding.txtPassword.visibility = View.VISIBLE
            } else {
                onBackPressed()
            }
        }

        binding.btnBack.setOnClickListener {
            onBackPressed()
        }
    }
}