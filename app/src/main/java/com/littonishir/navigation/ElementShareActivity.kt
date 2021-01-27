package com.littonishir.navigation

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import androidx.transition.TransitionInflater
import com.littonishir.navigation.R

class ElementShareActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_element_share)
        val string = intent?.getStringExtra("args")
        val tv = findViewById<TextView>(R.id.tv)
        tv.text = string

    }
}