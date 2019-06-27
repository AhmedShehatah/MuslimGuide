package com.eslam.ahmed.dlilelmoslim
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import com.google.android.gms.ads.AdRequest
import com.google.android.gms.ads.AdSize
import com.google.android.gms.ads.AdView
import com.google.android.gms.ads.MobileAds
import kotlinx.android.synthetic.main.activity_home.*

class Home : AppCompatActivity() {
    lateinit var mAdView : AdView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)

        // Sample AdMob app ID: ca-app-pub-3940256099942544~3347511713
        MobileAds.initialize(this, "ca-app-pub-3940256099942544~3347511713")

        val adView = AdView(this)
        adView.adSize = AdSize.BANNER
        adView.adUnitId = "ca-app-pub-3940256099942544/6300978111"

        mAdView = findViewById(R.id.adView)
        val adRequest = AdRequest.Builder().build()
        mAdView.loadAd(adRequest)

        val fragment_init = athkar()
        supportFragmentManager.beginTransaction().replace(R.id.Frame_container, fragment_init).commit()



        bottom_nav.setOnNavigationItemSelectedListener { item ->

            when (item.itemId) {
                R.id.athkar -> {
                    val fragment = athkar()
                    supportFragmentManager.beginTransaction().replace(R.id.Frame_container, fragment).commit()
                }
                R.id.adeia -> {
                    val fragment = adeia()
                    supportFragmentManager.beginTransaction().replace(R.id.Frame_container, fragment).commit()
                }
                R.id.counter -> {
                    val fragment = counter()
                    supportFragmentManager.beginTransaction().replace(R.id.Frame_container, fragment).commit()
                }
                R.id.about -> {
                    val fragment = About()
                    supportFragmentManager.beginTransaction().replace(R.id.Frame_container, fragment).commit()
                }
            }

            true
        }

    }


}
