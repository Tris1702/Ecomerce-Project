package com.example.ecommerceproject.model

import java.util.Date

data class OrderItem(
    val order: Order,
    val productId: Int,
    val quantity: Int,
    val price: Double,
    val createAt: Date,
    val updateAt: Date
)
