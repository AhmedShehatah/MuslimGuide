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

class thekr_activity : AppCompatActivity() {
    val arrayList = ArrayList<thker_content>()
    var x = 20
    lateinit var mAdView : AdView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_thekr_activity)

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
            extras!!.get("thker") == "morning" -> {
                /*
                                 أذكار الصباح
                */

                thker_set(1, resources.getString(R.string.alkorsi_verse))
                thker_set(3, resources.getString(R.string.surat_aleklas))
                thker_set(3, resources.getString(R.string.surat_alfalk))
                thker_set(3, resources.getString(R.string.surat_alnas))
                thker_set(1, resources.getString(R.string.asbhna_wa_asbh))
                thker_set(1, resources.getString(R.string.allahma_ant_rby))
                thker_set(3, resources.getString(R.string.radit_bllah))
                thker_set(4, resources.getString(R.string.allahm_any_asbht))
                thker_set(1, resources.getString(R.string.allahm_ma_asbh_by))
                thker_set(7, resources.getString(R.string.hasby_allah))
                thker_set(3, resources.getString(R.string.bsmallah_althy_laytr))
                thker_set(1, resources.getString(R.string.allahm_bk_asbhna))
                thker_set(1, resources.getString(R.string.asbhna_ala_ftrt))
                thker_set(3, resources.getString(R.string.sbhan_allah_wa_behmdeh))
                thker_set(3, resources.getString(R.string.allahm_afny_febdny))
                thker_set(3, resources.getString(R.string.allahm_any_aoth_bk_mn_alkfr))
                thker_set(1, resources.getString(R.string.allahm_any_asalk))
                thker_set(3, resources.getString(R.string.yahy_ya))
                thker_set(1, resources.getString(R.string.asbhna_wa_asbh_almlk_llah_rb_alalmin))
                thker_set(1, resources.getString(R.string.allahm_alm))
                thker_set(3, resources.getString(R.string.aoth_bklmat))
                thker_set(10, resources.getString(R.string.allahm_saly))
                thker_set(3, resources.getString(R.string.allahm_ena_naoth))
                thker_set(3, resources.getString(R.string.allahm_eny_aoth_bkmn_alhm))
                thker_set(3, resources.getString(R.string.astkfer_allah_alathim))
                thker_set(3, resources.getString(R.string.yarb_lk_alhmd))
                thker_set(1, resources.getString(R.string.allahm_eny_asalk))
                thker_set(1, resources.getString(R.string.allahm_ant_rby_laelah_ela_ant))
                thker_set(100, resources.getString(R.string.la_elah_ela_allah))
                thker_set(100, resources.getString(R.string.sbhan_allah_wa_behmdeh_sbhan_allah_alathim))
                thker_set(100, resources.getString(R.string.astkfer_allah_wa_atob_elih))


            }
            extras.get("thker") == "evening" -> {
                /*
                أذكار المساء
                 */

                thker_set(1, resources.getString(R.string.alkorsi_verse))
                thker_set(1, resources.getString(R.string.amn_alrsol))
                thker_set(3, resources.getString(R.string.surat_aleklas))
                thker_set(3, resources.getString(R.string.surat_alfalk))
                thker_set(3, resources.getString(R.string.surat_alnas))
                thker_set(1, resources.getString(R.string.amsina_wa_amsa))
                thker_set(1, resources.getString(R.string.allahma_ant_rby))
                thker_set(3, resources.getString(R.string.radit_bllah))
                thker_set(4, resources.getString(R.string.allahm_eny_amsit))
                thker_set(1, resources.getString(R.string.allahm_ma_amsa))
                thker_set(7, resources.getString(R.string.hasby_allah))
                thker_set(3, resources.getString(R.string.bsmallah_althy_laytr))
                thker_set(1, resources.getString(R.string.allahm_bk_amsina))
                thker_set(1, resources.getString(R.string.amsina_ala_ftrt))
                thker_set(3, resources.getString(R.string.sbhan_allah_wa_behmdeh))
                thker_set(3, resources.getString(R.string.allahm_afny_febdny))
                thker_set(3, resources.getString(R.string.allahm_any_aoth_bk_mn_alkfr))
                thker_set(1, resources.getString(R.string.allahm_any_asalk))
                thker_set(3, resources.getString(R.string.yahy_ya))
                thker_set(1, resources.getString(R.string.amsina_wa_amsa_almlk_llah))
                thker_set(1, resources.getString(R.string.allahm_alm))
                thker_set(3, resources.getString(R.string.aoth_bklmat))
                thker_set(10, resources.getString(R.string.allahm_saly))
                thker_set(3, resources.getString(R.string.allahm_ena_naoth))
                thker_set(3, resources.getString(R.string.allahm_eny_aoth_bkmn_alhm))
                thker_set(3, resources.getString(R.string.astkfer_allah_alathim))
                thker_set(100, resources.getString(R.string.la_elah_ela_allah))
                thker_set(1, resources.getString(R.string.allahm_ant_rby_laelah_ela_ant))
                thker_set(100, resources.getString(R.string.sbhan_allah_Wa))

            }
            extras.get("thker") == "wakeup" -> {
                /*
                                 أذكار الاستيقاظ
                */
                thker_set(1, resources.getString(R.string.wakeup_1))
                thker_set(1, resources.getString(R.string.wakeup_2))
                thker_set(1, resources.getString(R.string.wakeup_3))
            }
            extras.get("thker") == "sleeping" -> {
                /*
                                 أذكار النوم
                */
                thker_set(1, resources.getString(R.string.sleeping_1))
                thker_set(1, resources.getString(R.string.sleeping_2))
                thker_set(3, resources.getString(R.string.sleeping_3))
                thker_set(1, resources.getString(R.string.sleeping_4))
                thker_set(1, resources.getString(R.string.sleeping_5))
                thker_set(1, resources.getString(R.string.sleeping_5))
                thker_set(1, resources.getString(R.string.allahm_alm))
                thker_set(1, resources.getString(R.string.sleeping_7))
                thker_set(33, resources.getString(R.string.sleeping_8))
                thker_set(33, resources.getString(R.string.sleeping_9))
                thker_set(33, resources.getString(R.string.sleeping_10))
                thker_set(3, resources.getString(R.string.sleeping_11))
                thker_set(1, resources.getString(R.string.amn_alrsol))
                thker_set(1, resources.getString(R.string.alkorsi_verse))

            }
            extras.get("thker") == "wodoo" -> {
                /*
                                 أذكار الوضوء
                */
                thker_set(1, resources.getString(R.string.before_wodoo))
                thker_set(1, resources.getString(R.string.after_wodoo))
            }
            extras.get("thker") == "home" -> {
                /*
                                 أذكار دخول المنزل
                */
                thker_set(1, resources.getString(R.string.enter_home))
                thker_set(1, resources.getString(R.string.out_home))
            }
            extras.get("thker") == "eating" -> {
                /*
                                 أذكار الطعام
                */
                thker_set(1,resources.getString(R.string.during_eating))
                thker_set(1,resources.getString(R.string.during_milk))
                thker_set(1,resources.getString(R.string.after_eatingOrDrinking))
                thker_set(1,resources.getString(R.string.gest_thker))
                thker_set(1,resources.getString(R.string.hady_alnabi))
            }
            extras.get("thker") == "athan" -> {
                /*
                                 أذكار الاذان
                */
                thker_set(1,resources.getString(R.string.what_to_say_during_athan))
                thker_set(1,resources.getString(R.string.hadith_1))
                thker_set(1,resources.getString(R.string.hadith_2))
                thker_set(1,resources.getString(R.string.hadith_3))
                thker_set(1,resources.getString(R.string.after_athan))
                thker_set(1,resources.getString(R.string.btw_atan_ekama))
            }
            extras.get("thker") == "mosque" -> {
                /*
                                 أذكار المسجد
                */
                thker_set(1,resources.getString(R.string.going_to_mosque))
                thker_set(1,resources.getString(R.string.entring_mosque))
                thker_set(1,resources.getString(R.string.outta_mosque))
            }
            extras.get("thker") == "afterprayer" -> {
                /*
                                 أذكار بعد الصلاة
                */
                thker_set(1,resources.getString(R.string.astkfer_allah_3t))
                thker_set(1,resources.getString(R.string.la_mane_la_atit))
                thker_set(1,resources.getString(R.string.lh_alnema))
                thker_set(33,resources.getString(R.string.sbhan_3t))
                thker_set(1,resources.getString(R.string.la_elah_ela_allah_wahdah_la_shrik_lh))
                thker_set(3,resources.getString(R.string.surat_aleklas))
                thker_set(3,resources.getString(R.string.surat_alfalk))
                thker_set(3,resources.getString(R.string.surat_alnas))
                thker_set(1,resources.getString(R.string.alkorsi_verse))
                thker_set(10,resources.getString(R.string.yohyy))
                thker_set(1,resources.getString(R.string.asalk))
                thker_set(7,resources.getString(R.string.allahm_ajerni))
                thker_set(1,resources.getString(R.string.allahm_aani))
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
