package com.example.demo.models

data class Store(
    val storeID: String,
    val storeName: String,
    val isActive: String,
    val images: Image
)

data class Image(
    val banner: String,
    val logo: String,
    val icon: String
)
