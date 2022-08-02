package com.example.demo.util

import android.widget.ImageView
import androidx.databinding.BindingAdapter
import com.example.demo.api.API_BASE_URL
import com.example.demo.models.Store
import com.squareup.picasso.Picasso


@BindingAdapter("pictureResponse")
fun ImageView.loadImage(store: Store) {
        val picasso = Picasso.Builder(context).build()
        picasso.load(API_BASE_URL +  store.images.logo)
            .into(this)
}

