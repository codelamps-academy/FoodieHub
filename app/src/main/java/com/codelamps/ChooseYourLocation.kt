package com.codelamps

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import com.codelamps.databinding.ActivityChooseYourLocationBinding

class ChooseYourLocation : AppCompatActivity() {

    private val binding : ActivityChooseYourLocationBinding by lazy {
        ActivityChooseYourLocationBinding.inflate(layoutInflater)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)

        val locationList = arrayOf("Bandung", "Purwokerto", "Semarang", "Kebasen")
        val adapter = ArrayAdapter(this, android.R.layout.simple_list_item_1, locationList)
        val autoCompleteTextView = binding.listOfLocation
        autoCompleteTextView.setAdapter(adapter)
    }
}
