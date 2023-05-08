package com.example.ecommerceproject.model

import java.util.*

data class Product(
    val title: String,
    val description: String,
    val price: Double,
    val link: String,
    val image: String,
    val quantity: Int,
    val tags: List<Tag>,
    val createAt: Date,
    val updateAt: Date
)
