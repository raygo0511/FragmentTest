package com.raygo.fragmenttest

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.viewpager.widget.ViewPager
import com.google.android.material.tabs.TabLayout

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val tabLayout = findViewById(R.id.tabMode) as TabLayout
        val viewPager = findViewById(R.id.view_pager) as ViewPager

        tabLayout.addTab(tabLayout.newTab().setText("Home"))
        tabLayout.addTab(tabLayout.newTab().setText("Event"))
        tabLayout.addTab(tabLayout.newTab().setText("Setting"))

        val viewPagerAdapter = ViewPagerAdapter(getSupportFragmentManager())
        viewPagerAdapter.addFrg(FirstFragment(),"FirstFragment")
        viewPagerAdapter.addFrg(SecondFragment(),"SecondFragment")
        viewPagerAdapter.addFrg(ThirdFragment(),"ThirdFragment")

        viewPager.adapter = viewPagerAdapter
        viewPager!!.addOnPageChangeListener(TabLayout.TabLayoutOnPageChangeListener(tabLayout))
        tabLayout.addOnTabSelectedListener(object:TabLayout.OnTabSelectedListener
        {
            override fun onTabReselected(p0: TabLayout.Tab?) {

            }

            override fun onTabSelected(p0: TabLayout.Tab?) {
                viewPager.currentItem=p0!!.position
            }

            override fun onTabUnselected(p0: TabLayout.Tab?) {

            }
        })
    }
}
