package com.bismus.dicodingsubmission2.activity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.bismus.dicodingsubmission2.R
import com.bismus.dicodingsubmission2.model.TvShowItem
import kotlinx.android.synthetic.main.activity_tv_show_detail.*

class TvShowDetailActivity : AppCompatActivity() {

    companion object{
        val TV_SHOW_DATA = "TV_SHOW_DATA"
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_tv_show_detail)

        val data = intent.getParcelableExtra<TvShowItem>(TV_SHOW_DATA)

        tv_tv_show_detail_title?.text = data.title
        tv_tv_show_detail_air?.text = data.air_date
        tv_tv_show_detail_desc?.text = data.desc
        tv_tv_show_detail_eps?.text = data.eps.toString()
        iv_tv_show_detail_img?.setImageResource(data.imgResId)

    }
}
