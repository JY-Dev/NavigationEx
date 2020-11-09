package com.jydev.navicontrollex

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.navigation.NavDirections
import androidx.navigation.findNavController

class BlankFragment : Fragment() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_blank, container, false)
        val button = view.findViewById<Button>(R.id.action_btn)
        button.setOnClickListener {
            val action = BlankFragmentDirections.actionBlankFragmentToBlankFragment022()
            it.findNavController().navigate(action)
        }
        return view
    }

}