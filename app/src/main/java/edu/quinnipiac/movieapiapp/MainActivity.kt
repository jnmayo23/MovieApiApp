package edu.quinnipiac.movieapiapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.widget.ShareActionProvider
import androidx.core.view.MenuItemCompat
import androidx.drawerlayout.widget.DrawerLayout
import androidx.navigation.fragment.NavHostFragment
import androidx.navigation.ui.AppBarConfiguration
import androidx.navigation.ui.NavigationUI
import androidx.navigation.ui.setupWithNavController
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import edu.quinnipiac.movieapiapp.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)

//        val recyclerView = view.findViewById<RecyclerView>(R.id.)
//        recyclerView.layoutManager = LinearLayoutManager(this)

//        setSupportActionBar(binding.toolbar)
//        val navHostFragment = supportFragmentManager.findFragmentById(R.id.nav_host_fragment) as NavHostFragment
//        val navController = navHostFragment.navController
//        val drawer = findViewById<DrawerLayout>(R.id.drawer_layout)
//        val builder = AppBarConfiguration.Builder(navController.graph)
//        builder.setOpenableLayout(drawer)
//        val appBarConfiguration = builder.build()
//        binding.toolbar.setupWithNavController(navController, appBarConfiguration)
//        NavigationUI.setupWithNavController(binding.navView, navController)
    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.menu_toolbar, menu)
        return super.onCreateOptionsMenu(menu)
    }

}