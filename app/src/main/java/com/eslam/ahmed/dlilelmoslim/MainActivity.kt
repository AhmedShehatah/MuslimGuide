package com.eslam.ahmed.dlilelmoslim

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.animation.AnimationUtils
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val animation = AnimationUtils.loadAnimation(this,R.anim.splash_screen)
        mosque.animation = animation

        val thread = object: Thread(){
            override fun run() {
                sleep(3000)
                val intent = Intent(applicationContext,Home::class.java)
                startActivity(intent)
                finish()
            }
        }
        thread.start()
    }
}
