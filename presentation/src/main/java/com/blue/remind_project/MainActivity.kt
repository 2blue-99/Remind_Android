package com.blue.remind_project

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.activity.viewModels
import androidx.fragment.app.Fragment
import androidx.fragment.app.commit
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

        binding.button1.setOnClickListener {
            setFragment(FirstFragment())
        }

        binding.button2.setOnClickListener {
            setFragment(SecondFragment())
        }

        setContentView(binding.root)
    }

    fun setFragment(fragment: Fragment){
        supportFragmentManager.commit {
            replace(R.id.frameLayout, fragment)
            // 애니메이션과 전환이 올바르게 작동하도록 트랜잭션과 관련된 프래그먼트의 상태 변경을 최적화
            setReorderingAllowed(true)
            addToBackStack("")
        }
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