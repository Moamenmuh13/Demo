package com.example.demo.ui

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.ListAdapter
import androidx.recyclerview.widget.RecyclerView
import com.example.demo.databinding.StoreItemBinding
import com.example.demo.models.Store

class StoreListAdapter() :
    ListAdapter<Store, AsteroidViewHolder>(StoreDiffCallback()) {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): AsteroidViewHolder {
        return AsteroidViewHolder.from(parent)
    }

    override fun onBindViewHolder(holder: AsteroidViewHolder, position: Int) {
        val item = getItem(position)
        holder.bind(item)
    }
}



class AsteroidViewHolder(private val binding: StoreItemBinding) :
    RecyclerView.ViewHolder(binding.root) {

    fun bind(item: Store) {
        binding.store = item
    }

    companion object {
        fun from(parent: ViewGroup): AsteroidViewHolder {
            val layoutInflater = LayoutInflater.from(parent.context)
            val binding = StoreItemBinding.inflate(layoutInflater, parent, false)
            return AsteroidViewHolder(binding)
        }
    }
}
class StoreDiffCallback : DiffUtil.ItemCallback<Store>() {
    override fun areItemsTheSame(oldItem: Store, newItem: Store): Boolean {
        return oldItem.storeID == newItem.storeID
    }

    override fun areContentsTheSame(oldItem: Store, newItem: Store): Boolean {
        return oldItem == newItem
    }
}