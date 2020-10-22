package com.rotimijohnson.spinner

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.AdapterView
import android.widget.ArrayAdapter
import android.widget.Spinner
import android.widget.TextView

class MainActivity : AppCompatActivity() {

    lateinit var option: Spinner
    lateinit var result:TextView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        option = findViewById<Spinner>(R.id.spinner_id)
        result = findViewById<TextView>(R.id.result_id)

        val items = arrayOf("Item 1","Item 2","Item 3")

        option.adapter = ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,items)
        option.onItemSelectedListener = object : AdapterView.OnItemSelectedListener{
            override fun onNothingSelected(p0: AdapterView<*>?) {
                result.text = "Please select an option"
            }

            override fun onItemSelected(p0: AdapterView<*>?, p1: View?, p2: Int, p3: Long) {
               result.text = items.get(p2)
            }

        }

    }
}