package com.emri.jair.KotlinFragmentsAndDialogBoxes

import android.content.Intent
import android.os.Bundle
import android.support.design.widget.Snackbar
import android.support.design.widget.NavigationView
import android.support.v4.view.GravityCompat
import android.support.v7.app.ActionBarDrawerToggle
import android.support.v7.app.AppCompatActivity
import android.view.Menu
import android.view.MenuItem
import android.widget.Button
import com.emri.jair.KotlinFragmentsAndDialogBoxes.AllFragments.RepairCustomersFragment
import com.emri.jair.KotlinFragmentsAndDialogBoxes.AllFragments.RepairJobsFragment
import com.emri.jair.KotlinFragmentsAndDialogBoxes.AllFragments.RepairPartsFragment
import com.emri.jair.KotlinFragmentsAndDialogBoxes.AllFragments.RepairPersonalFragment
import kotlinx.android.synthetic.main.activity_repair.*
import kotlinx.android.synthetic.main.app_bar_repair.*

class Repair : AppCompatActivity(), NavigationView.OnNavigationItemSelectedListener {


    val manager = supportFragmentManager
    //val jobsList= arrayListOf<String>("hello","how","yoo")
    //val recView = findViewById<RecyclerView>(R.id.recyclerView_main)

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_repair)
        setSupportActionBar(toolbar)

        //val recView = findViewById<RecyclerView>(R.id.recyclerView_main)



       // recView.layoutManager = LinearLayoutManager(this)
        //recView.adapter = RepairJobsAdapter()

        fab.setOnClickListener { view ->
            Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                .setAction("Action", null).show()
        }

        val toggle = ActionBarDrawerToggle(
            this, drawer_layout, toolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close
        )
        drawer_layout.addDrawerListener(toggle)
        toggle.syncState()

        nav_view.setNavigationItemSelectedListener(this)

        val showRepairJobs = findViewById<Button>(R.id.button)
        val showRepairParts = findViewById<Button>(R.id.button4)
        val showCustomers = findViewById<Button>(R.id.button2)
        val showPersonal = findViewById<Button>(R.id.button3)


        showRepairJobs.setOnClickListener {
            showFragmentRepairJobs()
            showRepairJobs.setTextColor(resources.getColor(R.color.colorPrimary))
            showRepairParts.setTextColor(resources.getColor(R.color.colorBlackLetters))
            showCustomers.setTextColor(resources.getColor(R.color.colorBlackLetters))
            showPersonal.setTextColor(resources.getColor(R.color.colorBlackLetters))

        }

        showRepairParts.setOnClickListener {
            showFragmentRepairParts()
            showRepairJobs.setTextColor(resources.getColor(R.color.colorBlackLetters))
            showRepairParts.setTextColor(resources.getColor(R.color.colorPrimary))
            showCustomers.setTextColor(resources.getColor(R.color.colorBlackLetters))
            showPersonal.setTextColor(resources.getColor(R.color.colorBlackLetters))
        }

        showCustomers.setOnClickListener {
            showFragmentRepairCustomers()
            showRepairJobs.setTextColor(resources.getColor(R.color.colorBlackLetters))
            showRepairParts.setTextColor(resources.getColor(R.color.colorBlackLetters))
            showCustomers.setTextColor(resources.getColor(R.color.colorPrimary))
            showPersonal.setTextColor(resources.getColor(R.color.colorBlackLetters))
        }

        showPersonal.setOnClickListener {
            showFragmentPersonal()
            showRepairJobs.setTextColor(resources.getColor(R.color.colorBlackLetters))
            showRepairParts.setTextColor(resources.getColor(R.color.colorBlackLetters))
            showCustomers.setTextColor(resources.getColor(R.color.colorBlackLetters))
            showPersonal.setTextColor(resources.getColor(R.color.colorPrimary))
        }



    }

    override fun onBackPressed() {
        if (drawer_layout.isDrawerOpen(GravityCompat.START)) {
            drawer_layout.closeDrawer(GravityCompat.START)
        } else {
            super.onBackPressed()
        }
    }

    override fun onCreateOptionsMenu(menu: Menu): Boolean {
        // Inflate the menu; this adds items to the action bar if it is present.
        menuInflater.inflate(R.menu.repair, menu)
        return true
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        when (item.itemId) {
            R.id.action_settings -> return true
            else -> return super.onOptionsItemSelected(item)
        }
    }

    override fun onNavigationItemSelected(item: MenuItem): Boolean {
        // Handle navigation view item clicks here.
        when (item.itemId) {
            R.id.home -> {

                var intent = Intent(this,MainActivity::class.java)
                startActivity(intent)
            }
            R.id.repair -> {
                var intent = Intent(this, Repair::class.java)
                startActivity(intent)


            }
            R.id.service -> {
                var intent = Intent(this, Services::class.java)
                startActivity(intent)

            }
            R.id.electronic -> {
                var intent = Intent(this, Electronics::class.java)
                startActivity(intent)

            }
            R.id.projects -> {
                var intent = Intent(this, Projects::class.java)
                startActivity(intent)

            }
        }

        drawer_layout.closeDrawer(GravityCompat.START)
        return true
    }

    //Start the transaction in order to display the fragment specify
    fun showFragmentRepairJobs(){
        val transaction = manager.beginTransaction()
        val fragment = RepairJobsFragment()
        transaction.replace(R.id.fragment_holder,fragment)
        transaction.addToBackStack(null)
        transaction.commit()
        //recView.adapter = RerpairJobsAdapter(jobsList)
    }

    //Start the transaction in order to display the fragment specify
    fun showFragmentRepairParts(){
        val transaction = manager.beginTransaction()
        val fragment = RepairPartsFragment()
        transaction.replace(R.id.fragment_holder,fragment)
        transaction.addToBackStack(null)
        transaction.commit()
    }

    //Start the transaction in order to display the fragment specify
    fun showFragmentRepairCustomers(){
        val transaction = manager.beginTransaction()
        val fragment = RepairCustomersFragment()
        transaction.replace(R.id.fragment_holder,fragment)
        transaction.addToBackStack(null)
        transaction.commit()
    }

    //Start the transaction in order to display the fragment specify
    fun showFragmentPersonal(){
        val transaction = manager.beginTransaction()
        val fragment = RepairPersonalFragment()
        transaction.replace(R.id.fragment_holder,fragment)
        transaction.addToBackStack(null)
        transaction.commit()

    }

}
