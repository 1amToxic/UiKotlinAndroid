package com.example.uikotlin.ui

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import android.view.View
import androidx.appcompat.widget.Toolbar
import androidx.coordinatorlayout.widget.CoordinatorLayout
import com.example.uikotlin.R
import com.google.android.material.bottomnavigation.BottomNavigationView
import com.google.android.material.floatingactionbutton.FloatingActionButton
import com.google.android.material.snackbar.Snackbar

class CoordinatorActivity : AppCompatActivity() {
    lateinit var coodinator:CoordinatorLayout
    lateinit var toolBar : Toolbar
    lateinit var bottomBar : BottomNavigationView
    lateinit var fab : FloatingActionButton
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_coordinator)
        toolBar = findViewById(R.id.toolBar)
        fab = findViewById(R.id.fab)
        bottomBar = findViewById(R.id.bottom_navigation)
        coodinator = findViewById(R.id.coordinator)
        //setup toolbar
        setSupportActionBar(toolBar)
        supportActionBar?.setDisplayHomeAsUpEnabled(true)
        supportActionBar?.setDisplayShowHomeEnabled(true)

        fab.setOnClickListener { view ->
            Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_SHORT)
                .setAction("Action", null).show()
        }
        bottomBar.setOnNavigationItemReselectedListener {
            view ->
            when(view.itemId){
                R.id.share -> createSnackbar("Share")
                R.id.save -> createSnackbar("Save")
            }
        }
    }
    fun createSnackbar(title:String){
        Snackbar.make(coodinator,title,Snackbar.LENGTH_SHORT).show()
    }
    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.menu_coordinator,menu)
        return true
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        return when(item.itemId){
            R.id.ic_more -> true
            else -> super.onOptionsItemSelected(item)
        }
    }
}
