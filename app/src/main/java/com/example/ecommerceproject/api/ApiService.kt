package com.example.ecommerceproject.api

import com.example.ecommerceproject.constance.ApiConstance
import com.google.gson.GsonBuilder
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import retrofit2.http.GET
import retrofit2.http.POST

interface ApiService {
    companion object{
        var gson = GsonBuilder()
            .setDateFormat("yyyy-mm-dd HH:mm:ss")
            .create()
        var apiService: ApiService = Retrofit.Builder()
            .baseUrl("http://192.168.21.101")
            .addConverterFactory(GsonConverterFactory.create(gson))
            .build()
            .create(ApiService::class.java)
    }

    //user

    @POST("${ApiConstance.userPort}/user/create")
    fun createUser()

    @GET("${ApiConstance.userPort}/user/me")
    fun getMe()


}