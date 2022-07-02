package com.example.finish.fragments

import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import com.example.finish.R
import com.example.finish.databinding.FragmentShopsBinding

class ShopsFragment : Fragment(R.layout.fragment_shops) {
    private var _binding: FragmentShopsBinding? = null
    private val binding get() = _binding!!

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        _binding = FragmentShopsBinding.bind(view)

        with(binding) {
            btnSettings.setOnClickListener {
                val bundle = Bundle()
                bundle.putString(
                    "ARG_TEXT",
                    (tvText.text ?: "Error").toString()
                )
                findNavController().navigate(
                    R.id.action_shops_fragment_to_finish_fragment,
                    bundle
                )
            }
        }
    }
}