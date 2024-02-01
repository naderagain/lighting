package com.example.testscroll.ui.userslist

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import androidx.databinding.BindingAdapter
import androidx.recyclerview.widget.RecyclerView.Adapter
import androidx.recyclerview.widget.RecyclerView.ViewHolder
import com.bumptech.glide.Glide
import com.example.testscroll.data.db.entity.User
import com.example.testscroll.databinding.ViewItemUserBinding

class UsersAdapter : Adapter<UsersAdapter.UserViewHolder>() {

    val usersList = mutableListOf<User>()
    fun addUsers(users: List<User>) {
        usersList.clear()
        usersList.addAll(users)
        notifyDataSetChanged()
    }

    class UserViewHolder(val binding: ViewItemUserBinding) : ViewHolder(binding.root) {
        fun bind(user: User) {
            binding.user = user
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): UserViewHolder =
        UserViewHolder(
            ViewItemUserBinding.inflate(
                LayoutInflater.from(parent.context),
                parent,
                false
            )
        )

    override fun getItemCount(): Int = usersList.size

    override fun onBindViewHolder(holder: UserViewHolder, position: Int) {
        holder.bind(usersList[position])
    }


}