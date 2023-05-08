package com.example.ecommerceproject.presentation.cart

import android.content.Intent
import androidx.lifecycle.ViewModelProvider
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.ecommerceproject.R
import com.example.ecommerceproject.databinding.FragmentCartBinding
import com.example.ecommerceproject.presentation.OrderActivity

class CartFragment : Fragment() {
    private val viewModel by lazy { CartViewModel() }
    private lateinit var binding: FragmentCartBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentCartBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding.btnCheckout.setOnClickListener {
            startActivity(Intent(activity, OrderActivity::class.java))
        }
    }
}