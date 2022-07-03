package com.example.finish

import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import androidx.navigation.findNavController
import com.bumptech.glide.Glide
import com.example.finish.databinding.FragmentUsersBinding
import com.example.finish.resource.UserRepository
import com.example.finish.resource.UserAdapter

class UsersFragment : Fragment(R.layout.fragment_users) {

    private var _binding: FragmentUsersBinding? = null
    private val binding get() = _binding!!
    private var adapter: UserAdapter? = null

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        _binding = FragmentUsersBinding.bind(view)
        adapter = UserAdapter(UserRepository.users, Glide.with(this)) {
            val action = UsersFragmentDirections.actionUsersFragmentToInfoFragment(it.id)
            binding.root.findNavController().navigate(action)
        }
        binding.rvUser.adapter = adapter
    }

    override fun onDestroyView() {
        _binding = null
        super.onDestroyView()
    }
}