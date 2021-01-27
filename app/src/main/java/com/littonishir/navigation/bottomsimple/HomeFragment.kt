package com.littonishir.navigation.bottomsimple

import android.util.Log
import android.view.View
import com.littonishir.navigation.R
import com.littonishir.navigation.base.BseFragment

class HomeFragment: BseFragment() {
    override fun getLayoutId()= R.layout.fragment_home

    override fun initView(rootView: View) {
        super.initView(rootView)
        retainInstance = true
    }

}