package com.example.ppm_4.views

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.navigation.findNavController

import com.example.ppm_4.R
import com.example.ppm_4.databinding.FragmentResultsBinding
import com.example.ppm_4.databinding.FragmentStartBinding

/**
 * A simple [Fragment] subclass.
 */
class resultsFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val binding: FragmentResultsBinding = DataBindingUtil.inflate(
            inflater, R.layout.fragment_results, container, false)
        binding.btnReload.setOnClickListener{
            view?.findNavController()?.navigate(R.id.action_resultsFragment_to_registerFragment)
        }
        return binding.root
    }

}
