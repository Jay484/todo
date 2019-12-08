package com.example.kudoo

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.DefaultItemAnimator
import androidx.recyclerview.widget.DividerItemDecoration
import androidx.recyclerview.widget.LinearLayoutManager
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        setUpRecyclerView()
    }
    private fun setUpRecyclerView() = with(recyclerViewTodos) {
        adapter = RecyclerListAdapter(sampleData())  // Populates adapter/list with data
        layoutManager = LinearLayoutManager(this@MainActivity)  // Uses linear layout
        itemAnimator = DefaultItemAnimator()         // Optional layout niceties
        addItemDecoration(
            DividerItemDecoration(this@MainActivity, DividerItemDecoration.VERTICAL)
        )
    }

    private fun sampleData() = mutableListOf(
        TodoItem("Implement RecyclerView"),
        TodoItem("Store to-dos in database"),
        TodoItem("Delete to-dos on click")
    )
}
