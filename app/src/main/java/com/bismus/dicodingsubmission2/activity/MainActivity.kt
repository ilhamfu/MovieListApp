package com.bismus.dicodingsubmission2.activity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.bismus.dicodingsubmission2.fragment.MainFragmentAdapter
import com.bismus.dicodingsubmission2.R
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val fragmentAdapter =
            MainFragmentAdapter(supportFragmentManager)
        view_pager.adapter = fragmentAdapter

        tab_layouts.setupWithViewPager(view_pager)
    }


}
