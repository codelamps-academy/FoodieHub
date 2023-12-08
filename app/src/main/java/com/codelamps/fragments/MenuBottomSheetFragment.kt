package com.codelamps.fragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import com.codelamps.R
import com.codelamps.adapter.MenuAdapter
import com.codelamps.databinding.FragmentMenuBottomSheetBinding
import com.google.android.material.bottomsheet.BottomSheetDialogFragment

class MenuBottomSheetFragment : BottomSheetDialogFragment() {

    private lateinit var binding: FragmentMenuBottomSheetBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentMenuBottomSheetBinding.inflate(inflater, container, false)

        val menuFoodName =
            listOf<String>("Burger", "Sandwich", "Pizza", "Item", "Makanan 4", "Makanan 5","Burger", "Sandwich", "Pizza", "Item", "Makanan 4", "Makanan 5","Burger", "Sandwich", "Pizza", "Item", "Makanan 4", "Makanan 5")
        val menuItemPrice = listOf<String>("$5", "$8", "$11", "$23", "$16", "$44","$5", "$8", "$11", "$23", "$16", "$44","$5", "$8", "$11", "$23", "$16", "$44")
        val menuImage = listOf(
            R.drawable.menu,
            R.drawable.menu_2,
            R.drawable.menu_3,
            R.drawable.menu_4,
            R.drawable.menu_5,
            R.drawable.menu_2,R.drawable.menu,
            R.drawable.menu_2,
            R.drawable.menu_3,
            R.drawable.menu_4,
            R.drawable.menu_5,
            R.drawable.menu_2,R.drawable.menu,
            R.drawable.menu_2,
            R.drawable.menu_3,
            R.drawable.menu_4,
            R.drawable.menu_5,
            R.drawable.menu_2
        )

        val adapter =
            MenuAdapter(ArrayList(menuFoodName), ArrayList(menuItemPrice), ArrayList(menuImage))
        binding.recyclerMenu.layoutManager = LinearLayoutManager(requireContext())
        binding.recyclerMenu.adapter = adapter
        // Inflate the layout for this fragment
        return binding.root
    }

    companion object {

    }
}
