package com.blue.remind_project.viewModel

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class FirstViewModel: ViewModel() {
    private var _test = MutableLiveData<Int>(0)
    val test: LiveData<Int> = _test

    fun countUp(){
        _test.value = _test.value!! + 1
    }
}