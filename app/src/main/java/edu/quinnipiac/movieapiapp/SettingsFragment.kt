package edu.quinnipiac.movieapiapp

import android.graphics.Color
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button


class SettingsFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view = inflater.inflate(R.layout.fragment_settings, container, false)
        val redButton = view.findViewById<Button>(R.id.red)
        val orangeButton = view.findViewById<Button>(R.id.orange)
        val yellowButton = view.findViewById<Button>(R.id.yellow)
        val greenButton = view.findViewById<Button>(R.id.green)
        val blueButton = view.findViewById<Button>(R.id.blue)
        val purpleButton = view.findViewById<Button>(R.id.purple)
        val pinkButton = view.findViewById<Button>(R.id.pink)

        redButton.setOnClickListener {
            (activity as MainActivity).changeBackgroundColor(Color.rgb(233,0,0))
        }
        orangeButton.setOnClickListener {
            (activity as MainActivity).changeBackgroundColor(Color.rgb(255,161,0))
        }
        yellowButton.setOnClickListener {
            (activity as MainActivity).changeBackgroundColor(Color.rgb(239,222,4))
        }
        greenButton.setOnClickListener {
            (activity as MainActivity).changeBackgroundColor(Color.rgb(22,158,0))
        }
        blueButton.setOnClickListener {
            (activity as MainActivity).changeBackgroundColor(Color.rgb(0,96,158))
        }
        purpleButton.setOnClickListener {
            (activity as MainActivity).changeBackgroundColor(Color.rgb(106,0,185))
        }
        pinkButton.setOnClickListener {
            (activity as MainActivity).changeBackgroundColor(Color.rgb(255,95,241))
        }

        return view
    }


}