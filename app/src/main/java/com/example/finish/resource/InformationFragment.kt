package com.example.finish.resource

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.navArgs
import com.bumptech.glide.Glide
import com.example.finish.R
import com.example.finish.databinding.FragmentInfoBinding
import com.example.finish.resource.UserRepository.users

class InformationFragment : Fragment(R.layout.fragment_info) {

    private var _binding: FragmentInfoBinding? = null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_info, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        _binding = FragmentInfoBinding.bind(view)
        val args by navArgs<InformationFragmentArgs>()
        val text = args.arg

        with(binding) {
            tvId.text = "Id: ${users[text].id}"
            tvName.text = "Name: ${users[text].name}"
            tvHobby.text = "Hobby: ${users[text].hobby}"
            tvInfo.text = "Information: ${users[text].info}"
            Glide.with(this@InformationFragment).load(users[text].url).into(ivView)
        }
    }
}