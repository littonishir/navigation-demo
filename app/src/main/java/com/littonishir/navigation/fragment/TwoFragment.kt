package com.littonishir.navigation.fragment

import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import androidx.navigation.fragment.FragmentNavigatorExtras
import androidx.navigation.fragment.findNavController
import androidx.transition.TransitionInflater
import com.littonishir.navigation.R
import com.littonishir.navigation.base.BseFragment

class TwoFragment: BseFragment() {
    override fun getLayoutId()= R.layout.fragment_two

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        sharedElementEnterTransition = TransitionInflater.from(requireContext()).inflateTransition(android.R.transition.move)
    }

    override fun initView(rootView: View) {
        super.initView(rootView)
        val string = arguments?.getString("args")
        val tv = rootView.findViewById<TextView>(R.id.tv)
        tv.text = string

        rootView.findViewById<Button>(R.id.back).setOnClickListener {
            findNavController().navigateUp()
        }
        rootView.findViewById<Button>(R.id.next).setOnClickListener {
            findNavController().navigate(R.id.action_two_to_three)
        }
    }
}