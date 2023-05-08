package com.example.ecommerceproject.model

data class User (
    val email: String,
    val name: String,
    val address: String,
    val phone: String,
    val verifyPhoneOTP: String,
    val resetPassOTP: String,
    val address1: String,
    val address2: String,
    val address3: String,
    val isActive: Boolean,
    val isStaff: Boolean
)