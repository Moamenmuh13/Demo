package com.example.demo.ui

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.demo.models.Store
import com.example.demo.repository.StoreRepository
import kotlinx.coroutines.launch

class MainViewModel : ViewModel() {
    val stores: MutableLiveData<List<Store>> = MutableLiveData()

    private val repository = StoreRepository()

    init {
        viewModelScope.launch {
            stores.value = repository.getStores()
        }
    }
}