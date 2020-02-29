package com.bismus.dicodingsubmission2.rv_adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.bismus.dicodingsubmission2.R
import com.bismus.dicodingsubmission2.model.TvShowItem
import kotlinx.android.synthetic.main.tv_show_list_item.view.*

class TvShowListAdapter (private val tvShowItems:Array<TvShowItem>,val clickListener: (TvShowItem) -> Unit):RecyclerView.Adapter<RecyclerView.ViewHolder>(){

    override fun getItemCount(): Int = tvShowItems.size

    override fun onBindViewHolder(holder: RecyclerView.ViewHolder, position: Int) {
        (holder as TvShowItemHolder).bind(tvShowItems[position],clickListener)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): TvShowItemHolder {
        val inflater = LayoutInflater.from(parent.context)
        val view = inflater.inflate(R.layout.tv_show_list_item,parent,false)
        return TvShowItemHolder(view)
    }

    class TvShowItemHolder(itemView: View):RecyclerView.ViewHolder(itemView){
        fun bind(tvShow:TvShowItem,clickListener: (TvShowItem) -> Unit){
            itemView.tv_tv_show_item_title?.text = tvShow.title
            itemView.tv_tv_show_item_desc?.text = tvShow.desc
            itemView.tv_tv_show_item_airing?.text = tvShow.air_date
            itemView.tv_tv_show_episode?.text = tvShow.eps.toString()
            itemView.tv_tv_show_item_rating?.text = String.format("%.1f",tvShow.rating)
            itemView.iv_tv_show_item_img?.setImageResource(tvShow.imgResId)

            itemView.setOnClickListener { clickListener(tvShow) }
        }
    }

}