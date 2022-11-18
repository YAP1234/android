package com.example.navigationui

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

class FriendActivity : AppCompatActivity() {
    private lateinit var appbarc: AppBarConfiguration

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_friend)

        val nhf = supportFragmentManager.findFragmentById(R.id.fragmentContainerView2) as NavHostFragment
        appbarc = AppBarConfiguration(nhf.navController.graph)
        setupActionBarWithNavController(nhf.navController, appbarc)
    }

    override fun onSupportNavigateUp(): Boolean { //업버튼 누르면 home페이지로 이동
        return findNavController(R.id.fragmentContainerView2).navigateUp(appbarc) || super.onSupportNavigateUp()
    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.friendmenu, menu)
        return true
    }
    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        when(item.itemId){
            R.id.blockList -> item.onNavDestinationSelected(findNavController(R.id.fragmentContainerView2))
            R.id.bestFriendList -> item.onNavDestinationSelected(findNavController(R.id.fragmentContainerView2))
            else -> return super.onOptionsItemSelected(item)
        }
        return true
    }
    override fun onStart() {
        super.onStart()
        println("second onstart")
    }

    override fun onStop() {
        super.onStop()
        println("second onstop")
    }

    override fun onDestroy() {
        super.onDestroy()
        println("second onDestroy")
    }
}