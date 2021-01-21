package com.example.testfragment

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.MenuItem
import android.view.View
import android.widget.Button
import com.example.testfragment.fragments.ConsoleFragment
import com.example.testfragment.fragments.GameFragment
import com.example.testfragment.fragments.HomeFragment
import com.google.android.material.bottomnavigation.BottomNavigationView
import com.google.android.material.navigation.NavigationView

class MainActivity : AppCompatActivity(), View.OnClickListener, BottomNavigationView. OnNavigationItemSelectedListener, NavigationView.OnNavigationItemSelectedListener {

    // private lateinit var buttonHome: Button
    // private lateinit var buttonConsoles: Button
    // private lateinit var buttonGames: Button

    private lateinit var homeFragment: HomeFragment
    private lateinit var gameFragment: GameFragment
    private lateinit var consoleFragment: ConsoleFragment

    private lateinit var bottomNavigation: BottomNavigationView

    private lateinit var navigationView: NavigationView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContentView(R.layout.drawer_navigation_layout)

        //buttonHome = findViewById(R.id.button_home)
        // buttonHome.setOnClickListener(this)

        //buttonConsoles = findViewById(R.id.button_consoles)
        // buttonConsoles.setOnClickListener(this)

        //buttonGames = findViewById(R.id.button_games)
        //buttonGames.setOnClickListener(this)

        homeFragment = HomeFragment()
        consoleFragment = ConsoleFragment()
        gameFragment = GameFragment()

        bottomNavigation = findViewById(R.id.bottom_navigation)
        bottomNavigation.setOnNavigationItemSelectedListener(this)

        navigationView = findViewById(R.id.navigation_view)
        navigationView.setNavigationItemSelectedListener(this)

        supportFragmentManager.beginTransaction().replace(R.id.frame, gameFragment).commit()
    }

    override fun onClick(v: View) {
        // when (v.id) {
        //   R.id.button_home -> {
        //      supportFragmentManager.beginTransaction().replace(R.id.frame, homeFragment).commit()

        // }
        // R.id.button_consoles -> {
        //    supportFragmentManager.beginTransaction().replace(R.id.frame, consoleFragment).commit()

        // }
        //R.id.button_games -> {
        //    supportFragmentManager.beginTransaction().replace(R.id.frame, gameFragment).commit()
        // }
        //}
        }


      override fun onNavigationItemSelected(item: MenuItem): Boolean {


            when (item.itemId) {
                R.id.menu_home -> {
                    supportFragmentManager.beginTransaction().replace(R.id.frame, homeFragment)
                        .commit()
                }
                R.id.menu_consoles -> {
                    supportFragmentManager.beginTransaction().replace(R.id.frame, consoleFragment)
                        .commit()
                }

                R.id.menu_games -> {
                    supportFragmentManager.beginTransaction().replace(R.id.frame, gameFragment)
                        .commit()
                }
            }


            return true
        }

    }
