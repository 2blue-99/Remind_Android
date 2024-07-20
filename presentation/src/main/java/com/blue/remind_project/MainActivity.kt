package com.blue.remind_project

import android.app.Application.ActivityLifecycleCallbacks
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.activity.viewModels
import androidx.lifecycle.ViewModelProvider
import com.blue.remind_project.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
//    private val viewModel: MainViewModel by viewModels()
    private val viewModel: MainViewModel by lazy {
    ViewModelProvider(this)[MainViewModel::class.java]
}
    private val binding: ActivityMainBinding by lazy { ActivityMainBinding.inflate(layoutInflater) }



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding.test.text = "Pureum"
        viewModel.filteredData.observe(this){
            binding.test.text = it ?: "값 비었어용"
        }
        binding.button.setOnClickListener {
            viewModel.setQuery()
        }
        setContentView(binding.root)
    }



    override fun onPause() {
        super.onPause()
    }

    override fun onStop() {
        super.onStop()
    }

    override fun onSaveInstanceState(outState: Bundle) {
        super.onSaveInstanceState(outState)
    }

    override fun onDestroy() {
        super.onDestroy()
    }
}