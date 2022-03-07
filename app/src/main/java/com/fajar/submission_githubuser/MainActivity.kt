package com.fajar.submission_githubuser

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import com.fajar.submission_githubuser.data.DataDummy
import com.fajar.submission_githubuser.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var mainBinding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        mainBinding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(mainBinding.root)

        val userAdapter = UserAdapter()
        userAdapter.setAllData(DataDummy.listOfUser(this))

        mainBinding.rvListUser.apply {
            adapter = userAdapter
            layoutManager = LinearLayoutManager(this@MainActivity, LinearLayoutManager.VERTICAL, false)
        }
    }
}