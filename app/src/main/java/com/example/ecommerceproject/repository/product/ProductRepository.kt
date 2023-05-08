package com.example.ecommerceproject.repository.product

interface ProductRepository {
    fun getAllProduct()
    fun getFiltedProduct()
    fun getFiltedTag()
    fun getProductDetail()
}