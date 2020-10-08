package com.rotimijohnson.buttonandgenymotion

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button

class MainActivity : AppCompatActivity() {
    lateinit var Btn : Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        Btn = findViewById<Button>(R.id.btn_click_me)
        Btn.setOnClickListener(View.OnClickListener {
            Btn.text = "Clicked"
        })

        Btn.setOnLongClickListener(View.OnLongClickListener {
            Btn.text = "Long Clicked"
            true
        })
    }
}