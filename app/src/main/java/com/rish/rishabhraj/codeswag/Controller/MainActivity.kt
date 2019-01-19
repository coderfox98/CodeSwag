package com.rish.rishabhraj.codeswag.Controller

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v7.widget.LinearLayoutManager
import android.widget.ArrayAdapter
import android.widget.LinearLayout
import android.widget.Toast
import com.rish.rishabhraj.codeswag.Adapters.CategoryAdapter
import com.rish.rishabhraj.codeswag.Adapters.CategoryRecycleAdapter
import com.rish.rishabhraj.codeswag.Model.Category
import com.rish.rishabhraj.codeswag.R
import com.rish.rishabhraj.codeswag.Services.DataService
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    lateinit var adapter : CategoryRecycleAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        adapter = CategoryRecycleAdapter(this,DataService.categories)
        categoryListView.adapter = adapter

        val layoutManager = LinearLayoutManager(this)
        categoryListView.layoutManager = layoutManager

        categoryListView.setHasFixedSize(true)
        

    }
}
