package com.hyeran.jointseminar

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentPagerAdapter

class MainPageAdapter (fm: FragmentManager):FragmentPagerAdapter
    (fm, BEHAVIOR_RESUME_ONLY_CURRENT_FRAGMENT) {
     override fun getItem(position: Int): Fragment {
         return when(position){
             0 -> HomeFragment()
             else -> ContentFragment()
         }
     }

     override fun getCount() = 2
 }