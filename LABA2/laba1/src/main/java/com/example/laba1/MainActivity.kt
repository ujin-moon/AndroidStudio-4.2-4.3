package com.example.laba1

import android.content.Context
import android.os.Build
import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import java.util.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState);
        var locale = Locale.getDefault().getLanguage();
        if(locale.contentEquals("fr")){
            setContentView(R.layout.activity_main);
        }
        else
        {
            setContentView(R.layout.main);
        }
        Toast.makeText(this, "onCreate()", Toast.LENGTH_LONG).show();
    }
    override fun onPause() {
        Toast.makeText(this, "onPause()", Toast.LENGTH_LONG).show()
        super.onPause()
    }

    override fun onRestart() {
        super.onRestart()
        Toast.makeText(this, "onRestart()", Toast.LENGTH_LONG).show()
    }

    override fun onStart() {
        super.onStart()
        Toast.makeText(this, "onStart()", Toast.LENGTH_LONG).show()
    }

}