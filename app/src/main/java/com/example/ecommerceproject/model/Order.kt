package com.example.ecommerceproject.model

import java.util.Date

data class Order(
    val accountId: Int,
    val orderDate: Date,
    val shippedDate: Date,
    val totalValue: Double,
    val orderStatus: OrderStatus,
    val createAt: Date,
    val updateAt: Date
)
