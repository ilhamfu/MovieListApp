package com.bismus.dicodingsubmission2.fragment

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentPagerAdapter
import androidx.fragment.app.FragmentManager


class MainFragmentAdapter(framgent:FragmentManager):FragmentPagerAdapter(framgent,FragmentPagerAdapter.BEHAVIOR_RESUME_ONLY_CURRENT_FRAGMENT){
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
                "List of Movies"
            }
            else -> {
                return "List of TV Shows"
            }

        }
    }

}