package com.example.ppm_4.views

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.databinding.DataBindingUtil
import com.example.ppm_4.R
import com.example.ppm_4.databinding.FragmentStartBinding

/**
 * A simple [Fragment] subclass.
 */
class startFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val binding: FragmentStartBinding = DataBindingUtil.inflate(
            inflater, R.layout.fragment_start, container, false)
        return binding.root
        }

    }

