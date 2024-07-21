package com.blue.remind_project

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.viewbinding.ViewBinding
import java.util.zip.Inflater


typealias Inflate<T> = (LayoutInflater, ViewGroup?, Boolean) -> T
abstract class BaseFragment<VB: ViewBinding>(
    private val inflate: Inflate<VB>,
    name: String
): Fragment() {
    private var _binding: VB? = null
    val binding get() = _binding!!

    // Fragment 생성
    // 리소스 초기화 단계 -> 데이터 초기화
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        initData()
    }

    // 프래그먼트 레이아웃 확장 단계
    // View 관련 객체를 얻을 수 있어 View 초기화 진행 가능
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = inflate.invoke(inflater, container, false)
        return binding.root
    }

    // View 반환을 보장받는 단계
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        initUI()
        super.onViewCreated(view, savedInstanceState)
    }

    // Fragment가 사용자에게 보여질 수 있는 단계
    override fun onStart() {
        super.onStart()
    }

    // 이동, 애니메이션이 종료되고, 프래그먼트와 사용자가 상호작용할 수 있는 단계
    override fun onResume() {
        super.onResume()
        initListener()
        initObserver()
    }

    abstract fun initData()
    abstract fun initUI()
    abstract fun initListener()
    abstract fun initObserver()


    override fun onPause() {
        super.onPause()
    }

    override fun onStop() {
        super.onStop()
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }

    override fun onDestroy() {
        super.onDestroy()
    }


}