package com.example.finish.fragments

import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import com.example.finish.R
import com.example.finish.databinding.FragmentMessagesBinding

class MessagesFragment : Fragment(R.layout.fragment_messages) {

    private var _binding: FragmentMessagesBinding? = null
    private val binding get() = _binding!!

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        _binding = FragmentMessagesBinding.bind(view)

        with(binding) {
            btnSettings.setOnClickListener {
                val bundle = Bundle()
                bundle.putString(
                    "ARG_TEXT",
                    (tvText.text ?: "Error").toString()
                )
                findNavController().navigate(
                    R.id.action_message_fragment_to_finishFragment,
                    bundle
                )
            }
        }
    }
}