package com.gapigo.repositories.ui

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.gapigo.repositories.R
import com.gapigo.repositories.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private val binding by lazy { ActivityMainBinding.inflate(layoutInflater)}

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)

        setSupportActionBar(binding.toolbar)
    }
}