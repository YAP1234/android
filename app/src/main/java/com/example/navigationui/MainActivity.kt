package com.example.navigationui

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import androidx.navigation.findNavController
import androidx.navigation.fragment.NavHostFragment
import androidx.navigation.ui.AppBarConfiguration
import androidx.navigation.ui.navigateUp
import androidx.navigation.ui.onNavDestinationSelected
import androidx.navigation.ui.setupActionBarWithNavController
import com.example.navigationui.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var appbarc: AppBarConfiguration

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val nhf = supportFragmentManager.findFragmentById(R.id.fragmentContainerView) as NavHostFragment
        appbarc = AppBarConfiguration(nhf.navController.graph)
        setupActionBarWithNavController(nhf.navController, appbarc)
    }

    override fun onSupportNavigateUp(): Boolean { //업버튼 누르면 home페이지로 이동
        return findNavController(R.id.fragmentContainerView).navigateUp(appbarc) || super.onSupportNavigateUp()
    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.menu, menu)
        return true
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        when (item.itemId) {
            R.id.profil -> item.onNavDestinationSelected(findNavController(R.id.fragmentContainerView))

            R.id.friendHome -> {
                intent = Intent(this, FriendActivity::class.java)
                startActivity(intent)
            }
        }
        return super.onOptionsItemSelected(item)
    }

    override fun onStart() {
        super.onStart()
        println("onstart")
    }

    override fun onStop() {
        super.onStop()
        println("onstop")
    }

    override fun onDestroy() {
        super.onDestroy()
        println("onDestroy")
    }
}