package com.example.myshopping.fragments

import androidx.appcompat.app.AppCompatActivity
import com.example.myshopping.R

object FragmentManager {
    var currentFragment: BaseFragment? = null

    fun setFragment(newFrag: BaseFragment, activity: AppCompatActivity) {
        val transaction = activity.supportFragmentManager.beginTransaction()
        transaction.replace(R.id.placeHolder, newFrag)
        transaction.commit()
        currentFragment = newFrag
    }
}