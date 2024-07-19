package com.blue.remind_project

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.activity.viewModels
import com.blue.remind_project.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private val viewModel: MainViewModel by viewModels()
    private val binding: ActivityMainBinding by lazy { ActivityMainBinding.inflate(layoutInflater) }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding.test.text = "Pureum"
        setContentView(binding.root)
    }
}