package com.example.laba3_3

import android.os.Bundle
import android.view.View
import android.view.animation.Animation
import android.view.animation.AnimationUtils
import android.widget.ImageView
import androidx.appcompat.app.AppCompatActivity

class Laba3_3 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_laba33)

        val ship: ImageView = findViewById<View>(R.id.shipView) as ImageView
        val shipAnim: Animation = AnimationUtils.loadAnimation(
            this,
            R.anim.ship_anim
        )
        ship.startAnimation(shipAnim)
    }
}