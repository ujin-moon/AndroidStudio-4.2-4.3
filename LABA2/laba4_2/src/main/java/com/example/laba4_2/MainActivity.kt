package com.example.laba4_2

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun goToSecondActivity(view: View)
    {
        var name: TextView = findViewById<TextView>(R.id.etFirstName)
        var lastName: TextView = findViewById<TextView>(R.id.etLastName)
        var phone: TextView = findViewById<TextView>(R.id.etPhone)

        var intent = Intent(this, SecondActivity::class.java).apply {
            putExtra("name", name.text.toString())
            putExtra("lastname", lastName.text.toString())
            putExtra("phone", phone.text.toString())
            putExtra("isCanCallTaxi", "false")
        }
        startActivity(intent)
    }
}