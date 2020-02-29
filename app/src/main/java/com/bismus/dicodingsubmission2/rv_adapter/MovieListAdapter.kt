package com.bismus.dicodingsubmission2.rv_adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.bismus.dicodingsubmission2.R
import com.bismus.dicodingsubmission2.model.MovieItem
import kotlinx.android.synthetic.main.movie_list_item.view.*

class MovieListAdapter (val movieItems:Array<MovieItem>,val clickListener: (MovieItem) -> Unit):RecyclerView.Adapter<RecyclerView.ViewHolder>(){


    override fun getItemCount(): Int = movieItems.size

    override fun onBindViewHolder(holder: RecyclerView.ViewHolder, position: Int) {
        (holder as MovieItemHolder).bind(movieItems[position],clickListener)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MovieItemHolder {
        val inflater = LayoutInflater.from(parent.context)
        val view = inflater.inflate(R.layout.movie_list_item,parent,false)
        return MovieItemHolder(view)
    }

    class MovieItemHolder(itemView: View):RecyclerView.ViewHolder(itemView){
        fun bind(movie:MovieItem,clickListener: (MovieItem) -> Unit){
            itemView.tv_movie_item_title?.text = movie.title
            itemView.tv_movie_item_desc?.text = movie.desc
            itemView.iv_movie_item_img?.setImageResource(movie.imgResId)
            itemView.tv_movie_item_rating?.text = String.format("%.1f",movie.rate)
            itemView.tv_movie_item_release?.text = movie.release.toString()

            itemView.setOnClickListener{clickListener(movie)}
        }

    }

}