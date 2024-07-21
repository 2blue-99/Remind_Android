package com.blue.remind_project.viewModel

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

@HiltViewModel
class FirstViewModel @Inject constructor() : ViewModel() {
    private var _test = MutableLiveData<Int>(0)
    val test: LiveData<Int> = _test

    fun countUp(){
        _test.value = _test.value!! + 1
    }
}