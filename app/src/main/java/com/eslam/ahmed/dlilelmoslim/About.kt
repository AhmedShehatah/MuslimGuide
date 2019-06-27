package com.eslam.ahmed.dlilelmoslim


import android.content.Intent
import android.os.Bundle
import android.support.v4.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import kotlinx.android.synthetic.main.fragment_about.view.*


class About : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_about, container, false)
        view.share_btn.setOnClickListener {
            val intent = Intent(Intent.ACTION_SEND)
            intent.putExtra(
                Intent.EXTRA_TEXT, "تطبيق دليل المسلم هو تطبيق مجاني! يضم كل ما يحتاجه المسلم من أذكار وأدعية" +
                        "\n حمله الان :" +
                        "\n https://play.google.com/store/apps/details?id=com.eslam.ahmed.dlilelmoslim"
            )
            intent.type = "text/plain"
            startActivity(Intent.createChooser(intent, "مشاركة التطبيق في"))
        }

        return view
    }


}
