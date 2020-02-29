package com.bismus.dicodingsubmission2.fragment

import android.content.Context
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentPagerAdapter
import androidx.fragment.app.FragmentManager
import com.bismus.dicodingsubmission2.R


class MainFragmentAdapter(framgent:FragmentManager,private val context: Context):FragmentPagerAdapter(framgent,BEHAVIOR_RESUME_ONLY_CURRENT_FRAGMENT){
    override fun getCount(): Int {
        return 2
    }

    override fun getItem(position: Int): Fragment {
        return when (position){
            0->{
                MovieListFragment()
            }
            else -> {
                return TvShowFragment()
            }

        }
    }

    override fun getPageTitle(position: Int): CharSequence? {



        return when (position){
            0->{
                context.resources.getString(R.string.movie_list_tab)
            }
            else -> {
                return context.resources.getString(R.string.tv_list_tab)
            }

        }
    }

}