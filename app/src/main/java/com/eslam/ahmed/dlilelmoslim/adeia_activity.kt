package com.eslam.ahmed.dlilelmoslim

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.support.v7.widget.LinearLayoutManager
import android.view.Menu
import android.view.MenuInflater
import android.view.MenuItem
import android.widget.LinearLayout
import android.widget.Toast
import com.google.android.gms.ads.AdRequest
import com.google.android.gms.ads.AdSize
import com.google.android.gms.ads.AdView
import com.google.android.gms.ads.MobileAds
import kotlinx.android.synthetic.main.activity_thekr_activity.*

class adeia_activity : AppCompatActivity() {
    val arrayList = ArrayList<thker_content>()
    var x = 20
    lateinit var mAdView: AdView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_adeia_activity)
        // Sample AdMob app ID: ca-app-pub-3940256099942544~3347511713
        MobileAds.initialize(this, "ca-app-pub-3940256099942544~3347511713")

        val adView = AdView(this)
        adView.adSize = AdSize.BANNER
        adView.adUnitId = "ca-app-pub-3940256099942544/6300978111"

        mAdView = findViewById(R.id.adView)
        val adRequest = AdRequest.Builder().build()
        mAdView.loadAd(adRequest)

        val extras = intent.extras

        when {
            extras!!.get("doaa") == "estikara prayer" -> { // دعاء صلاة الاستخارة
                thker_set(1, resources.getString(R.string.estikara_prayer))
            }
            extras.get("doaa") == "grief doaa" -> {
                thker_set(1, resources.getString(R.string.grief_doaa))
            }
            extras.get("doaa") == "travelling doaa" -> {
                thker_set(1, resources.getString(R.string.travelling_doaa))
            }
            extras.get("doaa") == "anger doaa" -> {
                thker_set(1, resources.getString(R.string.anger_doaa))
            }
            extras.get("doaa") == "entering market doaa" -> {
                thker_set(1, resources.getString(R.string.entring_market_doaa))
            }
            extras.get("doaa") == "beginning doaa" -> {
                thker_set(1, resources.getString(R.string.beginning_doaa))
            }
            extras.get("doaa") == "master of estikfar" -> {
                thker_set(1, resources.getString(R.string.master_of_estikfar_doaa))
            }
            extras.get("doaa") == "kfart almajlis" -> {
                thker_set(1, resources.getString(R.string.kfart_almaglis_doaa))
            }
        }



        RecyclerView.layoutManager = LinearLayoutManager(
            this,
            LinearLayout.VERTICAL,
            false
        )

        val arraySize = thker_adapter(arrayList, this, x)
        RecyclerView.adapter = arraySize
    }

    fun thker_set(x: Int, b: String) {
        val d = x.toString()
        arrayList.add(thker_content(d, b, x))
    }

    override fun onCreateOptionsMenu(menu: Menu): Boolean {
        val inflater: MenuInflater = menuInflater
        inflater.inflate(R.menu.menu, menu)
        return true
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        // Handle item selection

        return when (item.itemId) {
            R.id.back -> {
                finish()
                true
            }
            R.id.zoomIn -> {
                x++
                val arraySize = thker_adapter(arrayList, this, x)
                RecyclerView.adapter = arraySize
                if (x > 30) {
                    x = 30
                    Toast.makeText(
                        applicationContext,
                        "لا يمكن التكبير أكثر",
                        Toast.LENGTH_SHORT
                    ).show()
                }

                true
            }
            R.id.zoomOut -> {
                x--

                val arraySize = thker_adapter(arrayList, this, x)
                RecyclerView.adapter = arraySize
                if (x < 16) {
                    x = 16
                    Toast.makeText(this, "لايمكن التصغير أكثر", Toast.LENGTH_SHORT).show()
                }

                true
            }

            else -> super.onOptionsItemSelected(item)
        }
    }
}
