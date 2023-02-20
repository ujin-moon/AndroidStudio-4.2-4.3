package com.example.laba4_1

import android.app.ListActivity;
import android.content.Context
import android.content.res.Resources
import android.os.Bundle;
import android.view.View
import android.widget.*
import android.widget.ListView

class ListView : ListActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val r: Resources = resources
        val stationsArray: Array<String> = r.getStringArray(R.array.stations)
        val aa: ArrayAdapter<String> = ArrayAdapter<String>(
            this,
            R.layout.list_item, stationsArray
        )
        setListAdapter(aa)
        val lv: ListView? = getListView()
        lv!!.setOnItemClickListener(object : AdapterView.OnItemClickListener {
            override fun onItemClick(
                parent: AdapterView<*>?, v: View,
                position: Int, id: Long
            ) {
                val text: CharSequence = (v as TextView).getText()
                val duration: Int = Toast.LENGTH_LONG
                val context: Context = applicationContext
                Toast.makeText(context, text, duration).show()
            }
        })

    }
}