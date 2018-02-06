package com.example.tai.reverseshoppinglist

import android.support.v7.app.AppCompatActivity

import android.support.v4.app.Fragment
import android.support.v4.app.FragmentManager
import android.support.v4.app.FragmentPagerAdapter
import android.os.Bundle

import kotlinx.android.synthetic.main.activity_add.*

class AddActivity : AppCompatActivity() {

    val pageAdapter = SectionsPageAdapter(supportFragmentManager)

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_add)

        pageAdapter.add(AddDishFragment(), "Add dish")
        pageAdapter.add(AddRecipeFragment(), "Add own recipe!")

        container.adapter = pageAdapter
        tabs.setupWithViewPager(container)

    }


    class SectionsPageAdapter(fm: FragmentManager) : FragmentPagerAdapter(fm) {

        private val tabNames: ArrayList<String>
        private val fragments: ArrayList<Fragment>

        init {
            tabNames = ArrayList()
            fragments = ArrayList()
        }

        fun add(fragment: Fragment, title: String) {
            tabNames.add(title)
            fragments.add(fragment)
        }

        override fun getCount(): Int {
            return fragments.size
        }

        override fun getItem(position: Int): Fragment {
            return fragments[position]
        }

        override fun getPageTitle(position: Int): CharSequence {
            return tabNames[position]
        }
    }

}
