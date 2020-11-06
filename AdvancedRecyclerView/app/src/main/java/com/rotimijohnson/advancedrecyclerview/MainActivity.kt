package com.rotimijohnson.advancedrecyclerview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import androidx.recyclerview.widget.LinearLayoutManager
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val itemList = generateDummyList(500)
        recycler_view.adapter = ListAdapter(itemList)
        recycler_view.layoutManager = LinearLayoutManager(this)
        recycler_view.setHasFixedSize(true)
    }

    fun insertItem(view: View){

    }

    fun removeItem(view: View){

    }

    private fun generateDummyList(size : Int): List<ListItem>{
        val list = ArrayList<ListItem>()

        for(i in 0 until size){
            val drawable = when ( i % 3){
                0 -> R.drawable.ic_android_black
                1 -> R.drawable.ic_album_
                else -> R.drawable.ic_beenhere
            }

            val item = ListItem(drawable,"Item $i","Line 2")
            list += item
        }
        return list
    }
}