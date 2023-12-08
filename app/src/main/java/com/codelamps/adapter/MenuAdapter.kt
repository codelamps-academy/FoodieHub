package com.codelamps.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.codelamps.databinding.MenuItemBinding

class MenuAdapter(private val MenuFoodName : MutableList<String>, private val MenuItemPrice : MutableList<String>, private val MenuImage : MutableList<Int>) : RecyclerView.Adapter<com.codelamps.adapter.MenuAdapter.MenuViewHolder>(){
    inner class MenuViewHolder(private val binding : MenuItemBinding) : RecyclerView.ViewHolder(binding.root) {
        fun bind(position: Int) {
            binding.apply {
                menuFoodName.text = MenuFoodName[position]
                menuPrice.text = MenuItemPrice[position]
                menuImage.setImageResource(MenuImage[position])
            }
        }

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MenuViewHolder {
        val binding = MenuItemBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return MenuViewHolder(binding)
    }

    override fun getItemCount(): Int = MenuFoodName.size
    override fun onBindViewHolder(holder: MenuViewHolder, position: Int) {
        holder.bind(position)
    }
}
