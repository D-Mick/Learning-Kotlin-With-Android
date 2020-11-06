package com.rotimijohnson.viewbinding

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.rotimijohnson.viewbinding.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.textView1.text = "View Binding"
        binding.textView2.text = "is cool"

        binding.buttonOpenFragment.setOnClickListener(View.OnClickListener {
            openFragment()
        })
    }

    private fun openFragment() {
        supportFragmentManager.beginTransaction()
            .add(R.id.fragment_container, BlankFragment())
            .addToBackStack(null)
            .commit()
    }
}