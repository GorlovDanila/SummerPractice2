package com.example.finish.fragments

import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import com.example.finish.R
import com.example.finish.databinding.FragmentMusicsBinding


class MusicsFragment : Fragment(R.layout.fragment_musics) {
    private var _binding: FragmentMusicsBinding? = null
    private val binding get() = _binding!!

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        _binding = FragmentMusicsBinding.bind(view)

        with(binding) {
            btnSettings.setOnClickListener {
                val bundle = Bundle()
                bundle.putString(
                    "ARG_TEXT",
                    (tvText.text ?: "Error").toString()
                )
                findNavController().navigate(
                    R.id.action_musics_fragment_to_finish_fragment,
                    bundle
                )
            }
        }
    }
}