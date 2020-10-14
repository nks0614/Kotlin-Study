package com.project.kotlin

import android.os.Bundle
import android.util.Log
import android.view.MenuItem
import androidx.appcompat.app.AppCompatActivity
import com.google.android.material.bottomnavigation.BottomNavigationView
import com.project.kotlin.Fragment.FirstFragment
import com.project.kotlin.Fragment.SecondFragment
import com.project.kotlin.Fragment.ThirdFragment
import com.project.simplecode.spStringSimilarity
import kotlinx.android.synthetic.main.activity_main.*


class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        supportFragmentManager.beginTransaction()
            .replace(R.id.frameLayout, FirstFragment())
            .commit()

        navigationView.setOnNavigationItemSelectedListener(ItemSelectedListener())
    }


    inner class ItemSelectedListener : BottomNavigationView.OnNavigationItemSelectedListener{
        override fun onNavigationItemSelected(item: MenuItem): Boolean {
            val fm = supportFragmentManager.beginTransaction()

            when(item.itemId){
                R.id.first -> fm.replace(R.id.frameLayout, FirstFragment()).commit()
                R.id.second -> fm.replace(R.id.frameLayout, SecondFragment()).commit()
                R.id.third -> fm.replace(R.id.frameLayout, ThirdFragment()).commit()
            }

            return true
        }
    }
}
