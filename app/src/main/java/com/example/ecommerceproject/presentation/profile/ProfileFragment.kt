package com.example.ecommerceproject.presentation.profile

import android.content.Intent
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.viewModels
import com.example.ecommerceproject.databinding.FragmentProfileBinding
import com.example.ecommerceproject.presentation.login.LoginActivity

class ProfileFragment : Fragment() {

    private val viewModel: ProfileViewModel by viewModels()
    private lateinit var binding: FragmentProfileBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentProfileBinding.inflate(inflater, container, false)
        viewModel.initialize()
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        if (viewModel.isLogout.value == true) {
            binding.ctlProfile.visibility = View.GONE
            binding.btnSignIn.visibility = View.VISIBLE
        } else {
            binding.ctlProfile.visibility = View.VISIBLE
            binding.btnSignIn.visibility = View.GONE
        }

        binding.btnSignIn.setOnClickListener {
            startActivity(Intent(activity, LoginActivity::class.java))
        }
    }

}