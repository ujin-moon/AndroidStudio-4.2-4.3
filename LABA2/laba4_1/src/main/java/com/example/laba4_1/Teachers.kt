package com.example.laba4_1

import android.content.res.Resources
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class Teachers : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_classes);
        val res: Resources = resources
        val contentText: String = res.getString(R.string.tab2_content);
        val textView = TextView(this)
        textView.setText(contentText)
        setContentView(textView);
    }
}