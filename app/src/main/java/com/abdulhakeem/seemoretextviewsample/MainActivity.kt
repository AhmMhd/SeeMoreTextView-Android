package com.abdulhakeem.seemoretextviewsample

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v7.widget.LinearLayoutManager
import android.widget.LinearLayout
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        list.adapter = MyAdapter()
        list.layoutManager = LinearLayoutManager(this,LinearLayoutManager.VERTICAL,false)
    }
}
