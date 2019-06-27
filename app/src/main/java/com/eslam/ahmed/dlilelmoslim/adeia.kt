package com.eslam.ahmed.dlilelmoslim


import android.content.Intent
import android.os.Bundle
import android.support.v4.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import kotlinx.android.synthetic.main.fragment_adeia.view.*


class adeia : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_adeia, container, false)
        val intent = Intent(context, adeia_activity::class.java)
        fun onclick(v: View?, extra: String) {
            v!!.setOnClickListener {
                intent.putExtra("doaa", extra)
                startActivity(intent)
            }
        }
        onclick(view.estikara_paryer_doaa, "estikara prayer")
        onclick(view.grief_doaa, "grief doaa")
        onclick(view.travelling_doaa, "travelling doaa")
        onclick(view.anger_doaa, "anger doaa")
        onclick(view.entering_market_doaa, "entering market doaa")
        onclick(view.beginning,"beginning doaa")
        onclick(view.master_of_estikfar,"master of estikfar")
        onclick(view.kfart_almajlis,"kfart almajlis")

        return view
    }


}
