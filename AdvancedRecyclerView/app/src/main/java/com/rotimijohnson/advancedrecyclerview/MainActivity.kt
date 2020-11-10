package com.rotimijohnson.advancedrecyclerview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import androidx.recyclerview.widget.LinearLayoutManager
import kotlinx.android.synthetic.main.activity_main.*
import kotlin.random.Random

class MainActivity : AppCompatActivity() {
    private val itemList = generateDummyList(500)
    private val adapter = ListAdapter(itemList)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        recycler_view.adapter = adapter
        recycler_view.layoutManager = LinearLayoutManager(this)
        recycler_view.setHasFixedSize(true)
    }

    fun insertItem(view: View) {
        val index: Int = Random.nextInt(8)

        val newItem = ListItem(
            R.drawable.ic_check_circle,
            "New item at position $index",
            "Line 2"
        )

        itemList.add(index, newItem)
        adapter.notifyItemInserted(index)
    }

    fun removeItem(view: View) {
        val index: Int = Random.nextInt(8)
        itemList.removeAt(index)
        adapter.notifyItemRemoved(index)
    }

    private fun generateDummyList(size: Int): ArrayList<ListItem> {
        val list = ArrayList<ListItem>()

        for (i in 0 until size) {
            val drawable = when (i % 3) {
                0 -> R.drawable.ic_android_black
                1 -> R.drawable.ic_album_
                else -> R.drawable.ic_beenhere
            }

            val item = ListItem(drawable, "Item $i", "Line 2")
            list += item
        }
        return list
    }
}