package com.example.ecommerceproject

import android.annotation.SuppressLint
import android.os.Build
import android.os.Bundle
import android.os.Handler
import android.os.Looper
import android.view.MotionEvent
import android.view.View
import android.view.WindowInsets
import android.widget.LinearLayout
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentTransaction
import com.example.ecommerceproject.databinding.ActivityFullscreenBinding
import com.example.ecommerceproject.presentation.cart.CartFragment
import com.example.ecommerceproject.presentation.categories.CategoriesFragment
import com.example.ecommerceproject.presentation.home.HomeFragment
import com.example.ecommerceproject.presentation.notification.NotificationFragment
import com.example.ecommerceproject.presentation.profile.ProfileFragment


/**
 * An example full-screen activity that shows and hides the system UI (i.e.
 * status bar and navigation/system bar) with user interaction.
 */
class FullscreenActivity : AppCompatActivity() {

    private lateinit var binding: ActivityFullscreenBinding

    private val homeFragment by lazy { HomeFragment() }
    private val cartFragment by lazy { CartFragment() }
    private val notificationFragment by lazy { NotificationFragment() }
    private val categoriesFragment by lazy { CategoriesFragment() }
    private val profileFragment by lazy { ProfileFragment() }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityFullscreenBinding.inflate(layoutInflater)
        setContentView(binding.root)

        setFragment(homeFragment)
        binding.bottomNav.setOnItemSelectedListener { item ->
            when (item.itemId) {
                R.id.home -> setFragment(homeFragment)
                R.id.cart -> setFragment(cartFragment)
                R.id.categories -> setFragment(categoriesFragment)
                R.id.profile -> setFragment(profileFragment)
                R.id.notification -> setFragment(notificationFragment)
                else -> setFragment(homeFragment)
            }
            true
        }
    }

    private fun setFragment(fragment: Fragment) {
        val transaction: FragmentTransaction = supportFragmentManager.beginTransaction()
        transaction.replace(R.id.fragment_container, fragment)
        transaction.addToBackStack(null)
        transaction.commit()
    }
}