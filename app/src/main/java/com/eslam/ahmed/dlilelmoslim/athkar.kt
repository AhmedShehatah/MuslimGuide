package com.eslam.ahmed.dlilelmoslim


import android.content.Intent
import android.os.Bundle
import android.support.v4.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import kotlinx.android.synthetic.main.fragment_athkar.view.*


class athkar : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_athkar, container, false)
        val intent = Intent(context, thekr_activity::class.java)

        fun onclick(v: View?, extra: String) {
            v!!.setOnClickListener {
                intent.putExtra("thker",extra )
                startActivity(intent)
            }
        }

        onclick(view.morning_athkar, "morning")
        onclick(view.evening_athkar, "evening")
        onclick(view.wakeup_athkar, "wakeup")
        onclick(view.sleeping_athkar, "sleeping")
        onclick(view.wodoo_athkar, "wodoo")
        onclick(view.home_athkar, "home")
        onclick(view.eating_athkar, "eating")
        onclick(view.athan_athkar, "athan")
        onclick(view.mosque_athkar, "mosque")
        onclick(view.afterprayer_athkar, "afterprayer")

        return view
    }


}
