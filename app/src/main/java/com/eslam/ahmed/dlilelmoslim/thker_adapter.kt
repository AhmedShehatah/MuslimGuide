package com.eslam.ahmed.dlilelmoslim

import android.content.Context
import android.content.Intent
import android.support.v7.widget.CardView
import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView

class thker_adapter(var thker_array: ArrayList<thker_content>, var context: Context, var textSize: Int) :
    RecyclerView.Adapter<thker_adapter.ViewHolder>() {

    override fun onCreateViewHolder(p0: ViewGroup, p1: Int): ViewHolder {
        val V = LayoutInflater.from(p0.context).inflate(R.layout.thker_style, p0, false)

        return ViewHolder(V)
    }

    override fun getItemCount(): Int {

        return thker_array.size
    }

    override fun onBindViewHolder(p0: ViewHolder, p1: Int) {
        val thker_info = thker_array[p1]
        p0.thker_counter.text = thker_info.thker_counter
        p0.thker_content.text = thker_info.thker_text
        p0.textSzie.text = textSize.toString()
        p0.thker_content.textSize = p0.textSzie.text.toString().toInt().toFloat()
        var x = p0.thker_counter.text.toString().toInt()

        p0.click.setOnClickListener {
            x--
            p0.thker_counter.text = x.toString()


            if (x == 0) {
                thker_array.removeAt(p1)
                notifyItemRemoved(p1)
                notifyItemRangeChanged(p1, thker_array.size)
                if (thker_array.size == 0) {
                    val Intent = Intent(context, Home::class.java)
                    context.startActivity(Intent)
                }
            }


        }

        p0.share.setOnClickListener {
            val intent = Intent(Intent.ACTION_SEND)
            intent.putExtra(
                Intent.EXTRA_TEXT,
                p0.thker_content.text.toString() + "\n\n من تطبيق دليل المسلم \n" +
                        " https://play.google.com/store/apps/details?id=com.eslam.ahmed.dlilelmoslim"
            )
            intent.type = "text/plain"
            context.startActivity(Intent.createChooser(intent, "مشاركة الذكر في"))


        }


    }

    class ViewHolder(ItemView: View) : RecyclerView.ViewHolder(ItemView) {

        val thker_counter = ItemView.findViewById<TextView>(R.id.thker_counter)
        val thker_content = ItemView.findViewById<TextView>(R.id.thker_content)
        val click = ItemView.findViewById<CardView>(R.id.click)
        val share = ItemView.findViewById<TextView>(R.id.share)
        val textSzie = ItemView.findViewById<TextView>(R.id.TextSize)


    }

}
