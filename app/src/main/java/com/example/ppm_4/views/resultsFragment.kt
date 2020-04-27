package com.example.ppm_4.views

import android.content.Intent
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.databinding.DataBindingUtil
import androidx.navigation.findNavController

import com.example.ppm_4.R
import com.example.ppm_4.databinding.FragmentResultsBinding
import com.example.ppm_4.databinding.FragmentStartBinding
import com.example.ppm_4.models.Guest

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

        var mensaje = arguments?.getString("amount")

        binding.btnGuests.setOnClickListener{
            Toast.makeText(activity, mensaje, Toast.LENGTH_SHORT).show()
        }

        return binding.root
    }

}
