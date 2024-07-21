package com.blue.remind_project

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.viewModels
import com.blue.remind_project.databinding.FragmentFirstBinding
import com.blue.remind_project.viewModel.FirstViewModel
import dagger.hilt.android.AndroidEntryPoint


@AndroidEntryPoint
class FirstFragment : BaseFragment<FragmentFirstBinding>(FragmentFirstBinding::inflate, "FirstFragment") {

    private val firstViewModel: FirstViewModel by viewModels()
    override fun initData() {

    }

    override fun initUI() {

    }

    override fun initListener() {
        binding.firstButton.setOnClickListener {
            firstViewModel.countUp()
        }
    }

    override fun initObserver() {
        firstViewModel.test.observe(viewLifecycleOwner){
            binding.count.text = it.toString()
        }
    }
}