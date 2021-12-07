package com.example.examapp

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import kotlin.random.Random

class MainFragment : Fragment() {

    lateinit var rollButton: Button

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_main, container, false)

        rollButton = view.findViewById(R.id.roll_button)

        rollButton.setOnClickListener{
            var randomNumLeft = Random.nextInt(0,9)
            var randomNumCenter = Random.nextInt(0,9)
            var randomNumRight = Random.nextInt(0,9)
        }

        return view

    }

}