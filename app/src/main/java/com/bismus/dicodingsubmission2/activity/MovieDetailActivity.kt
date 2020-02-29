package com.bismus.dicodingsubmission2.activity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.bismus.dicodingsubmission2.R
import com.bismus.dicodingsubmission2.model.MovieItem
import kotlinx.android.synthetic.main.activity_movie_detail.*

class MovieDetailActivity : AppCompatActivity() {

    companion object{
        val MOVIE_DATA = "MOVIE_DATA"
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_movie_detail)

        val data = intent.getParcelableExtra<MovieItem>(MOVIE_DATA)

        iv_movie_detail_img.setImageResource(data.imgResId)
        tv_movie_title.text = data.title
        tv_movie_release.text = data.release.toString()
        tv_movie_desc.text = data.desc

    }
}
