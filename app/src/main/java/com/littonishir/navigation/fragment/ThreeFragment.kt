package com.littonishir.navigation.fragment

import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView
import androidx.navigation.fragment.findNavController
import androidx.transition.TransitionInflater
import com.littonishir.navigation.R
import com.littonishir.navigation.base.BseFragment

class ThreeFragment: BseFragment() {
    override fun getLayoutId()= R.layout.fragment_three

    override fun initView(rootView: View) {
        super.initView(rootView)
        rootView.findViewById<Button>(R.id.toFragment).setOnClickListener {
            findNavController().navigate(R.id.action_three_to_one)
        }
    }
}