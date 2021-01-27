package com.littonishir.navigation.base

import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment

abstract class BseFragment:Fragment(){
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val rootView = inflater.inflate(getLayoutId(), container, false)
        val simpleName = javaClass.simpleName
        Log.e("BseFragment",simpleName)
        initView(rootView)
        return rootView
    }

    open fun initView(rootView: View){ }

    abstract fun getLayoutId(): Int
}