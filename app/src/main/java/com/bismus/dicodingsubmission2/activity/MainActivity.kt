package com.bismus.dicodingsubmission2.activity

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.provider.Settings
import android.view.Menu
import android.view.MenuItem
import android.widget.Toast
import com.bismus.dicodingsubmission2.fragment.MainFragmentAdapter
import com.bismus.dicodingsubmission2.R
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        setSupportActionBar(tb_main)

        val fragmentAdapter =
            MainFragmentAdapter(supportFragmentManager,this)
        view_pager.adapter = fragmentAdapter

        tab_layouts.setupWithViewPager(view_pager)
    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.main_activity_menu,menu)

        return super.onCreateOptionsMenu(menu)
    }

    override fun onOptionsItemSelected(item: MenuItem?): Boolean {
        val intent = Intent(Settings.ACTION_LOCALE_SETTINGS)
        startActivity(intent)
        return super.onOptionsItemSelected(item)
    }


}
