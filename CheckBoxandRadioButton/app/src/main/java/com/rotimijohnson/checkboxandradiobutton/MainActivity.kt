package com.rotimijohnson.checkboxandradiobutton

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.*

class MainActivity : AppCompatActivity() {
    lateinit var rg_gender: RadioGroup
    lateinit var rg_male: RadioButton
    lateinit var rg_female: RadioButton

    lateinit var ch_english: CheckBox
    lateinit var ch_yoruba: CheckBox
    lateinit var ch_igbo: CheckBox
    lateinit var ch_hausa: CheckBox

    lateinit var btn_submit: Button
    lateinit var tv_answer: TextView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        rg_gender = findViewById(R.id.rg_gender)
        rg_male = findViewById(R.id.rg_male)
        rg_female = findViewById(R.id.rg_female)

        ch_english = findViewById(R.id.ch_english)
        ch_yoruba = findViewById(R.id.ch_yoruba)
        ch_hausa = findViewById(R.id.ch_hausa)
        ch_igbo = findViewById(R.id.ch_igbo)

        btn_submit = findViewById(R.id.btn_submit)
        tv_answer = findViewById(R.id.tv_answer)

        btn_submit.setOnClickListener(View.OnClickListener {
            var result = ""
            if (rg_gender.checkedRadioButtonId != -1) {
                result += "Selected gender : "
                if (rg_male.isChecked)
                    result += "male\n"
                else if (rg_female.isChecked)
                    result += "female\n"
            }
            result += "Languages Known : "
            if (ch_english.isChecked)
                result += "English,"
            if (ch_hausa.isChecked)
                result += "Hausa,"
            if (ch_igbo.isChecked)
                result += "Igbo,"
            if (ch_yoruba.isChecked)
                result += "Yoruba"

            tv_answer.text = result
        })
    }
}