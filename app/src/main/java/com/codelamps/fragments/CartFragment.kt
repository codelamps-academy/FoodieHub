package com.codelamps.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import androidx.recyclerview.widget.LinearLayoutManager
import com.codelamps.R
import com.codelamps.adapter.CartAdapter
import com.codelamps.databinding.FragmentCartBinding

// TODO: Rename parameter arguments, choose names that match
// the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
private const val ARG_PARAM1 = "param1"
private const val ARG_PARAM2 = "param2"

/**
 * A simple [Fragment] subclass.
 * Use the [CartFragment.newInstance] factory method to
 * create an instance of this fragment.
 */
class CartFragment : Fragment() {

    private lateinit var binding : FragmentCartBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentCartBinding.inflate(layoutInflater, container, false)

        val cartFoodName = listOf<String>("Burger", "Sandwich", "Pizza", "Item", "Makanan 4", "Makanan 5")
        val cartItemPrice = listOf<String>("$5", "$8", "$11", "$23", "$16", "$44")
        val cartImage = listOf(
            R.drawable.menu,
            R.drawable.menu_2,
            R.drawable.menu_3,
            R.drawable.menu_4,
            R.drawable.menu_5,
            R.drawable.menu_2
        )

        val adapter = CartAdapter(ArrayList(cartFoodName), ArrayList(cartItemPrice), ArrayList(cartImage))
        binding.CartRecycleView.layoutManager = LinearLayoutManager(requireContext())
        binding.CartRecycleView.adapter = adapter
        // Inflate the layout for this fragment
        return binding.root
    }

    companion object {

    }
}
