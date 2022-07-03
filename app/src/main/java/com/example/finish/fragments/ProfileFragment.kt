package com.example.finish.fragments

import android.content.Context
import android.os.Bundle
import android.view.View
import androidx.core.content.edit
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import com.example.finish.R
import com.example.finish.databinding.FragmentProfileBinding

class ProfileFragment : Fragment(R.layout.fragment_profile) {

    private var _binding: FragmentProfileBinding? = null
    private val binding get() = _binding!!

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        _binding = FragmentProfileBinding.bind(view)

        with(binding) {
            btnSettings.setOnClickListener {
                val bundle = Bundle()
                bundle.putString(
                    "ARG_TEXT",
                    (tvText.text ?: "Error").toString()
                )
                findNavController().navigate(
                    R.id.action_profile_fragment_to_finish_fragment,
                    bundle
                )
            }

        }
    }

    override fun onDestroyView() {
        _binding = null
        super.onDestroyView()
    }
}