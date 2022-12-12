package com.example.elvfragmenttask

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity()
{
    lateinit var varfistFragment:FirstFragment
    lateinit var varsecondFragment:SecondFragment

    override fun onCreate(savedInstanceState: Bundle?)
    {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        varfistFragment= FirstFragment.newInstance()
        varsecondFragment= SecondFragment.newInstance()
    }
   fun switchToFirstFragment()
   {
       supportFragmentManager.
       beginTransaction().
       replace(R.id.container,varfistFragment).
       commit()
   }
   fun switchToSecondFragment()
   {
       supportFragmentManager.
       beginTransaction().replace(R.id.container,varsecondFragment).
       commit()
   }
}