package com.example.finish.resource

import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.RequestManager
import com.example.finish.databinding.ItemUserBinding

class UserHolder(
    private val binding: ItemUserBinding,
    private val glide: RequestManager,
    private val onItemClick: (User) -> Unit,
) : RecyclerView.ViewHolder(binding.root) {

    fun onBind(user: User) {
        with(binding) {
            tvName.text = user.name
            tvHobby.text = user.hobby
            root.setOnClickListener {
                onItemClick(user)
            }
        }
    }
}