package com.example.dynamicfragmentwithbundle


import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import kotlinx.android.synthetic.main.fragment_only.view.*

class OnlyFragment : Fragment() {

    val fruits = arrayOf(
        "Apple", "Orange", "Banana",
        "Pineapple", "Grapes", "Pomegranate",
        "Kiwi", "Watermelon", "Cherry",
        "Apple", "Orange", "Banana",
        "Pineapple", "Grapes", "Pomegranate",
        "Kiwi", "Watermelon", "Cherry",
        "Apple", "Orange", "Banana",
        "Pineapple", "Grapes", "Pomegranate",
        "Kiwi", "Watermelon", "Cherry"
    )

    val vegetables = arrayOf(
        "Potato", "Onion", "Tomato",
        "Lettuce", "Carrot", "Capsicum",
        "Gourd", "Pumpkin", "Radish",
        "Potato", "Onion", "Tomato",
        "Lettuce", "Carrot", "Capsicum",
        "Gourd", "Pumpkin", "Radish",
        "Potato", "Onion", "Tomato",
        "Lettuce", "Carrot", "Capsicum",
        "Gourd", "Pumpkin", "Radish"
    )

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val fragmentView = inflater.inflate(R.layout.fragment_only, container, false)
        //val argument = arguments

        if (arguments?.getString("TYPE") == "FRUITS") {

            fragmentView.lv.adapter = ArrayAdapter<String>(
                requireContext(),
                android.R.layout.activity_list_item,
                android.R.id.text1,
                fruits
            )

        } else if (arguments?.getString("TYPE") == "VEGETABLES") {

            fragmentView.lv.adapter = ArrayAdapter<String>(
                requireContext(),
                android.R.layout.activity_list_item,
                android.R.id.text1,
                vegetables
            )

        }

        return fragmentView
    }


}
