package com.example.demo.repository

import com.example.demo.api.Network
import com.example.demo.models.Store
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext

class StoreRepository {
    suspend fun getStores(): List<Store>? {
        return withContext(Dispatchers.IO) {
            try {
                Network.service.getStores()
            } catch (e: Exception) {
                null
            }
        }
    }
}
