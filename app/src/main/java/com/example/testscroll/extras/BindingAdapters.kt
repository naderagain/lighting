package com.example.testscroll.extras

import android.widget.ImageView
import androidx.databinding.BindingAdapter
import com.bumptech.glide.Glide

@BindingAdapter("app:profileImage")
fun ImageView.profileImage(url: String) {
    Glide.with(this).asBitmap().load(url).into(this)
}