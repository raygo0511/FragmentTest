package com.raygo.fragmenttest

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentPagerAdapter

class ViewPagerAdapter(fragmentManager: FragmentManager) : FragmentPagerAdapter(fragmentManager) {

    var mFragmentListTitle=ArrayList<String>()
    var mFragmentList=ArrayList<Fragment>()

    override fun getCount(): Int {
        return mFragmentList.size
    }

    override fun getItem(p0: Int): Fragment {
        return mFragmentList.get(p0)
    }

    fun addFrg(fragment: Fragment,title:String) {
        mFragmentListTitle.add(title)
        mFragmentList.add(fragment)
    }

    override fun getPageTitle(position: Int): CharSequence? {
        return mFragmentListTitle.get(position)
    }
}