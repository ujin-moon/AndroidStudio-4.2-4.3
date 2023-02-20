package com.example.laba4_1

import android.content.res.Resources
import android.os.Bundle
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class Classes : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_classes);
        val res: Resources = resources
        val contentText: String = res.getString(R.string.tab3_content);
        val textView = TextView(this)
        textView.setText(contentText)
        setContentView(textView);
    }
}