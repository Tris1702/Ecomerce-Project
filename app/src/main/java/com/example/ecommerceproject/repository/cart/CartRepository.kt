package com.example.ecommerceproject.repository.cart

interface CartRepository {
    fun createCart()
    fun getCartDetail()
    fun addToCart()
    fun deleteCart()
}