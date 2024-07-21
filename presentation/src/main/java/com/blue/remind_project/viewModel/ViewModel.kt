package com.blue.remind_project.viewModel

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.SavedStateHandle
import androidx.lifecycle.ViewModel

class MainViewModel(private val savedStateHandle: SavedStateHandle): ViewModel(){
    private var _test = MutableLiveData(0)
    val test: LiveData<Int> = _test

    init {
        savedStateHandle.get<Int>("count")?.let {
            initCount(it)
        }
    }

    private fun initCount(it:Int){
        _test.value = it
    }

    fun countUp(){
        _test.value = _test.value!! +1
        savedStateHandle["count"] = _test.value
    }
}