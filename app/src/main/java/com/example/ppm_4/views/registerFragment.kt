package com.example.ppm_4.views

import android.content.Intent
import android.os.Bundle
import android.view.*
import android.widget.Toast
import androidx.core.os.bundleOf
import androidx.fragment.app.Fragment
import androidx.databinding.DataBindingUtil
import androidx.navigation.findNavController
import androidx.navigation.ui.NavigationUI

import com.example.ppm_4.R
import com.example.ppm_4.databinding.FragmentRegisterBinding
import com.example.ppm_4.databinding.FragmentStartBinding
import com.example.ppm_4.models.Guest
import kotlinx.android.synthetic.main.fragment_register.*
import kotlinx.android.synthetic.main.fragment_results.*

/**
 * A simple [Fragment] subclass.
 */
class registerFragment : Fragment() {


    private var guest = Guest(1)
    private var guestIndex = 1
    private var cont = 0
    private lateinit var binding:FragmentRegisterBinding
    private var mensaje = " "


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        binding = DataBindingUtil.inflate(
            inflater, R.layout.fragment_register, container, false)

        binding.guest = guest
        setHasOptionsMenu(true)
        return binding.root
    }

    override fun onCreateOptionsMenu(menu: Menu, inflater: MenuInflater) {
        super.onCreateOptionsMenu(menu, inflater)
        inflater.inflate(R.menu.action_bar, menu)
    }

    override fun onOptionsItemSelected(item: MenuItem) = when (item.itemId) {
        R.id.registered -> {
            // User chose the "Settings" item, show the app settings UI...
            guestIndex += 1
            cont += 1
            guest = Guest(guestIndex, registered = "Sí")
            binding.guest = guest
            mensaje +=  " " + guest.name + ":" + guest.registered + ", "
            if(guestIndex == 9){
                var bundle = bundleOf("Message" to mensaje)
                bundle = bundleOf("Counter" to cont)
                view?.findNavController()?.navigate(R.id.action_registerFragment_to_resultsFragment, bundle)
            }
            true
        }
        R.id.Notregistered -> {
            // User chose the "Settings" item, show the app settings UI...
            guestIndex += 1
            guest = Guest(guestIndex, registered = "No")
            binding.guest = guest
            mensaje +=  " " + guest.name + ":" + guest.registered + ", "
            if(guestIndex == 9){
                var bundle = bundleOf("Message" to mensaje)
                bundle = bundleOf("Counter" to cont)
                view?.findNavController()?.navigate(R.id.action_registerFragment_to_resultsFragment, bundle)
            }
            true
        }

        else -> {
            // If we got here, the user's action was not recognized.
            // Invoke the superclass to handle it.
            super.onOptionsItemSelected(item)
        }
    }




}
