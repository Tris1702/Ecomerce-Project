package com.example.ecommerceproject.repository.user

interface UserRepository {
    fun getMe()
    fun signUp()
    fun login()
    fun update()
}