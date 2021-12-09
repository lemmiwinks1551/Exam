package com.example.examapp

import android.graphics.Color
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentActivity
import kotlin.random.Random


class MainFragment : Fragment() {

    lateinit var rollButton: Button
    lateinit var outputLeft: TextView
    lateinit var outputRight: TextView
    lateinit var outputCentr: TextView
    lateinit var counter: TextView
    var index: Int = 0
    val dialog = MyDialogFragment()

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_main, container, false)

        rollButton = view.findViewById(R.id.roll_button)
        outputLeft = view.findViewById(R.id.outputLeft)
        outputRight = view.findViewById(R.id.outputRight)
        outputCentr = view.findViewById(R.id.outputCenter)
        counter = view.findViewById(R.id.counter)

        rollButton.setOnClickListener {
            var randomNumLeft = Random.nextInt(0, 10)
            var randomNumCenter = Random.nextInt(0, 10)
            var randomNumRight = Random.nextInt(0, 10)

            outputLeft.text = randomNumLeft.toString()
            outputRight.text = randomNumRight.toString()
            outputCentr.text = randomNumCenter.toString()

            if (randomNumLeft == randomNumCenter && randomNumRight == randomNumCenter) {
                dialog.show((activity as FragmentActivity).supportFragmentManager, null)
                index = 0
            }

            index++
            counter.text = "Попытка № " + index.toString()

        }

        return view

    }


}
