package com.example.laba4_1

import android.app.TabActivity
import android.content.Intent
import android.content.res.Resources
import android.os.Bundle
import android.widget.TabHost

class TabWidgetSampleActivity : TabActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_tab_widget_sample)
        val res: Resources = resources
        val tab1Indicator: String = res.getString(R.string.tab1_indicator)
        val tab2Indicator: String = res.getString(R.string.tab2_indicator)
        val tab3Indicator: String = res.getString(R.string.tab3_indicator)
        val tabHost: TabHost = tabHost
        var spec: TabHost.TabSpec
        var intent: Intent
        intent = Intent().setClass(this, Students::class.java)
        spec = tabHost.newTabSpec("students").setIndicator(tab1Indicator)
            .setContent(intent)
        tabHost.addTab(spec)
        intent = Intent().setClass(this, Teachers::class.java)
        spec = tabHost.newTabSpec("teachers").setIndicator(tab2Indicator)
            .setContent(intent)
        tabHost.addTab(spec)
        intent = Intent().setClass(this, Classes::class.java)
        spec = tabHost.newTabSpec("class").setIndicator(tab3Indicator)
            .setContent(intent)
        tabHost.addTab(spec)
        tabHost.setCurrentTab(1)
    }
}