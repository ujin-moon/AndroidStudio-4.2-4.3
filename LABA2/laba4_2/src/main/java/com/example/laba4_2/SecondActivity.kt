package com.example.laba4_2

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class SecondActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)

        var fullname: TextView = findViewById<TextView>(R.id.nameTextView)
        var phone: TextView = findViewById<TextView>(R.id.phoneTextView)

        var txtName = intent.getStringExtra("name");

        var txtLastname = intent.getStringExtra("lastname")
        var txtPhone = intent.getStringExtra("phone")


        fullname.text = "$txtName $txtLastname";
        phone.text=txtPhone
        var isCanCallTaxi = intent.getStringExtra("isCanCallTaxi");
        if(isCanCallTaxi =="true")
        {
            fullname.text = intent.getStringExtra("fullname")
            phone.text = intent.getStringExtra("phone")
            phone.text=txtPhone
            var text: TextView = findViewById<TextView>(R.id.routeEditText)
            text.text = "Такси приедет по адресу "+intent.getStringExtra("street1")+", "+intent.getStringExtra("house1")+", "+intent.getStringExtra("flat1") +" через 7 минут "+intent.getStringExtra("street2")+", "+intent.getStringExtra("house2")+", "+intent.getStringExtra("flat2")+". Если вы согласны нажмите ВЫЗВАТЬ ТАКСИ."
            val btn = findViewById<View>(R.id.callTaxiButton) as Button
            btn.setEnabled(true);
        }
    }

    fun goToThirdActivity(view: View)
    {
        var fullname: TextView = findViewById<TextView>(R.id.nameTextView)
        var phone: TextView = findViewById<TextView>(R.id.phoneTextView)
        var intent = Intent(this, activity_third::class.java).apply{
            putExtra("fullname", fullname.text.toString())
            putExtra("phone",phone.text.toString())
        }
        startActivity(intent)
    }
    fun toastMe(view: View) {
        val myToast = Toast.makeText(this, "Такси скоро приедет, ожидайте!", Toast.LENGTH_SHORT)
        myToast.show()
        setContentView(R.layout.activity_main)
    }
}