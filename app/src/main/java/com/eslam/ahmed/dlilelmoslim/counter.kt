package com.eslam.ahmed.dlilelmoslim


import android.content.Context
import android.os.Bundle
import android.support.v4.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import kotlinx.android.synthetic.main.fragment_counter.view.*
import java.lang.Exception
import java.lang.StringBuilder


class counter : Fragment() {

    var score = 0
    var highest_score = 0

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        val view = inflater.inflate(R.layout.fragment_counter, container, false)

        try {
            val fileStream = context!!.openFileInput("High Score")
            val bufferedReader = fileStream.bufferedReader()
            val sb = StringBuilder()
            bufferedReader.forEachLine {
                sb.append(it)
            }
            view.highest_score.text = sb.toString()
            highest_score = sb.toString().toInt()
        } catch (ex: Exception) {
            view.highest_score.text = "0"
        }

        view.counter.setOnClickListener {
            score++
            view.Score.text = score.toString()
            if (score > highest_score) {
                highest_score = score
            }


        }

        view.highest_score.setOnClickListener {
            Toast.makeText(context!!, "أكبر عدد من التسبحات", Toast.LENGTH_SHORT).show()
        }
        view.reSete.setOnClickListener {
            score = 0
            view.Score.text = score.toString()
        }



        return view
    }

    override fun onDestroyView() {


            val fileName = "High Score"
            val fileContent = highest_score.toString()
            context!!.openFileOutput(fileName, Context.MODE_PRIVATE).use {
                it.write(fileContent.toByteArray())

        }

        super.onDestroyView()
    }


}
