package com.example.hackatondgu.screens

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.hackatondgu.MainActivity
import com.example.hackatondgu.R
import com.example.hackatondgu.databinding.FragmentChoiceBinding

class choice : Fragment() {
    private lateinit var binding: FragmentChoiceBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        binding = FragmentChoiceBinding.inflate(inflater)

        binding.singUpBtn.setOnClickListener {
            (activity as MainActivity).navController.navigate(R.id.action_choice_to_registration)
        }


        binding.singInBtn.setOnClickListener {
            (activity as MainActivity).navController.navigate(R.id.action_choice_to_singIn)
        }

        return binding.root
    }

}