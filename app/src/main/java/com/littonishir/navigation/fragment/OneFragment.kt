package com.littonishir.navigation.fragment

import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import androidx.core.app.ActivityOptionsCompat
import androidx.navigation.ActivityNavigatorExtras
import androidx.navigation.fragment.FragmentNavigatorExtras
import androidx.navigation.fragment.findNavController
import com.littonishir.navigation.R
import com.littonishir.navigation.base.BseFragment

class OneFragment: BseFragment() {
    override fun getLayoutId()= R.layout.fragment_one

    override fun initView(rootView: View) {
        super.initView(rootView)


        rootView.findViewById<Button>(R.id.toFragment).setOnClickListener {
            val launcher = rootView.findViewById<ImageView>(R.id.launcherIv)
            val extras = FragmentNavigatorExtras( launcher to "launcherTN")

            /**
             * 参数传递Bundle
             */
            val bundle = Bundle()
            bundle.putString("args","我是Fragment传递参数")
            findNavController().navigate(R.id.action_one_to_two,bundle,null,extras)
        }
        rootView.findViewById<TextView>(R.id.toActivity).setOnClickListener {
            val launcher = rootView.findViewById<ImageView>(R.id.launcherIv)
            val pair = androidx.core.util.Pair<View, String>(launcher, "launcherTN")
            val options = ActivityOptionsCompat.makeSceneTransitionAnimation(requireActivity(), pair)
            val extras = ActivityNavigatorExtras(options)

            /**
             * 参数传递Bundle
             */
            val bundle = Bundle()
            bundle.putString("args","我是Activity传递参数")
            findNavController().navigate(R.id.action_one_to_share,bundle,null,extras)
        }
        rootView.findViewById<Button>(R.id.simple).setOnClickListener {
            findNavController().navigate(R.id.action_one_to_simple)

        }
    }
}