package com.example.ecommerceproject.presentation.profile

import android.util.Log
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class ProfileViewModel : ViewModel() {
    private val _isLogout: MutableLiveData<Boolean> = MutableLiveData()
    val isLogout: LiveData<Boolean> = _isLogout

    fun initialize() {
        Log.e("initialize:", "true")
        _isLogout.postValue(true)
    }
}