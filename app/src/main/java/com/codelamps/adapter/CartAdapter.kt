package com.codelamps.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.codelamps.databinding.CartItemBinding

class CartAdapter(
    private val CartTitles: MutableList<String>,
    private val CartItemPrices: MutableList<String>,
    private var CartImages: MutableList<Int>
) : RecyclerView.Adapter<CartAdapter.CartViewHolder>() {

    private val itemQuantities = IntArray(CartTitles.size){1}
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CartViewHolder {
        val binding = CartItemBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return CartViewHolder(binding)
    }

    override fun getItemCount(): Int = CartTitles.size

    override fun onBindViewHolder(holder: CartViewHolder, position: Int) {
        holder.bind(position)
    }

    inner class CartViewHolder(private val binding: CartItemBinding) :
        RecyclerView.ViewHolder(binding.root) {
        fun bind(position: Int) {
            binding.apply {
                val quantity = itemQuantities[position]
                cartTitle.text = CartTitles[position]
                priceItem.text = CartItemPrices[position]
                imageCart.setImageResource(CartImages[position])
                countCart.text = quantity.toString()

                buttonCartMinus.setOnClickListener {
                    deceaseQuantity(position)
                }

                buttonCartPlus.setOnClickListener {
                    increaseQuantity(position)
                }

                deleteCart.setOnClickListener {
                    val itemPosition = adapterPosition
                    if (itemPosition != RecyclerView.NO_POSITION){
                        deleteItem(itemPosition)
                    }
                }


            }
        }

        fun deceaseQuantity(position: Int) {
            if (itemQuantities[position] > 1) {
                itemQuantities[position]--
                binding.countCart.text = itemQuantities[position].toString()
            }
        }

        fun deleteItem(position: Int) {
            CartTitles.removeAt(position)
            CartImages.removeAt(position)
            CartItemPrices.removeAt(position)
            notifyItemRemoved(position)
            notifyItemRangeChanged(position, CartTitles.size)
        }

        fun increaseQuantity(position: Int) {
            if (itemQuantities[position] < 10) {
                itemQuantities[position]++
                binding.countCart.text = itemQuantities[position].toString()
            }


        }

    }
}
