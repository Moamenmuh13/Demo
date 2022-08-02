package com.example.demo.api

import com.example.demo.models.Store
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import retrofit2.http.GET

interface StoreService {
    @GET("api/1.0/stores")
    suspend fun getStores(): List<Store>
}

const val API_BASE_URL = "https://www.cheapshark.com/"

object Network {
    private val retrofit = Retrofit.Builder()
        .baseUrl(API_BASE_URL)
        .addConverterFactory(GsonConverterFactory.create())
        .build()

    val service: StoreService by lazy {
        retrofit.create(StoreService::class.java)
    }
}