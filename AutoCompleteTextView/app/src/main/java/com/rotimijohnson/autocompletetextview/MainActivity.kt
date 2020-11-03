package com.rotimijohnson.autocompletetextview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.ArrayAdapter
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var suggestions =  arrayOf("Apple","Samsung","Google","Huawei","HTC")

        var adapter = ArrayAdapter(this,android.R.layout.simple_list_item_1,suggestions)
        auto_complete.threshold = 0
        auto_complete.setAdapter(adapter)
        auto_complete.setOnFocusChangeListener({ view, b -> if(b) auto_complete.showDropDown() })
    }
}