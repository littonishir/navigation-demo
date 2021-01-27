package com.littonishir.navigation.bottomsimple

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.fragment.app.FragmentContainer
import androidx.fragment.app.FragmentContainerView
import androidx.navigation.fragment.NavHostFragment
import androidx.navigation.ui.setupWithNavController
import com.google.android.material.bottomnavigation.BottomNavigationView
import com.littonishir.navigation.R

class HomeActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)
        initView()
    }

    private fun initView() {
        val bottomNavigation = findViewById<BottomNavigationView>(R.id.bottomNavigation)
        val navHostFragment = supportFragmentManager.findFragmentById(R.id.fragment_container_view) as NavHostFragment
//        navHostFragment.navController.navigate().
        bottomNavigation.setupWithNavController(navHostFragment.navController)
    }
}