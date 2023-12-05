package com.codelamps.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.codelamps.databinding.PopulerItemBinding

class PopularAdapter (private val items : List<String>,private val price : List<String>, private val image : List<Int>): RecyclerView.Adapter<PopularAdapter.PopularViewHolder>(){
    class PopularViewHolder (private val binding : PopulerItemBinding) : RecyclerView.ViewHolder(binding.root){
        private val imageView = binding.imageItem
        fun bind(item: String, price: String, images: Int) {
            binding.foodProduct.text = item
            binding.priceItem.text = price
            imageView.setImageResource(images)

        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): PopularViewHolder {
        return PopularViewHolder(PopulerItemBinding.inflate(LayoutInflater.from(parent.context), parent, false))
    }

    override fun getItemCount(): Int {
        return items.size
    }

    override fun onBindViewHolder(holder: PopularViewHolder, position: Int) {
        val item = items[position]
        val image = image[position]
        val price = price[position]
        holder.bind(item,price, image)
    }

}
