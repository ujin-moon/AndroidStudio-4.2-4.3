package com.example.laba4_2

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.TextView

class activity_third : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_third)
    }

    fun backToSecond(view: View)
    {
        var street1: TextView = findViewById<TextView>(R.id.editText_start_street)
        var house1: TextView = findViewById<TextView>(R.id.editText_start_house)
        var flat1: TextView = findViewById<TextView>(R.id.editText_start_floor)

        var street2: TextView = findViewById<TextView>(R.id.editText_end_street)
        var house2: TextView = findViewById<TextView>(R.id.editText_end_house)
        var flat2: TextView = findViewById<TextView>(R.id.editText_end_floor)

        var intent = Intent(this, SecondActivity::class.java).apply {
            putExtra("street1", street1.text.toString())
            putExtra("house1", house1.text.toString())
            putExtra("flat1", flat1.text.toString())

            putExtra("street2", street2.text.toString())
            putExtra("house2", house2.text.toString())
            putExtra("flat2", flat2.text.toString())

            putExtra("fullname",intent.getStringExtra("fullname"))
            putExtra("phone",intent.getStringExtra("phone"))
            putExtra("isCanCallTaxi", "true")
        }
        startActivity(intent)
    }
}