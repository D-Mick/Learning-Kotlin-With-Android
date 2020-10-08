package com.rotimijohnson.layoutsandviews

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.TextUtils
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    lateinit var hello_word : TextView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        hello_word = findViewById<TextView>(R.id.textView_1)
        hello_word.text = "Welcome to Layouts and Views"
        //trying to make the text view move
        hello_word.setSingleLine()
        hello_word.ellipsize = TextUtils.TruncateAt.MARQUEE
        hello_word.marqueeRepeatLimit = -1
        hello_word.isSelected = true

    }
}