package com.blue.remind_project

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.SavedStateHandle
import androidx.lifecycle.ViewModel
import androidx.lifecycle.switchMap

class MainViewModel(private val savedStateHandle: SavedStateHandle): ViewModel(){
    private var _test = MutableLiveData<Int>()
    val test: LiveData<Int> = _test

    val filteredData:MutableLiveData<String> =
        savedStateHandle.getLiveData("query")

    fun setQuery(){
        savedStateHandle["query"] = "탈모쥐"
    }
}