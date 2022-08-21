package com.lee989898.week1exercise

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.fragment.app.activityViewModels
import androidx.fragment.app.viewModels
import androidx.lifecycle.ViewModelProvider
import com.lee989898.week1exercise.databinding.FragmentMainBinding

class MainFragment : Fragment() {
    private lateinit var binding: FragmentMainBinding
    private val viewModels: MainViewModel by viewModels()
    private val activityViewModels: MainViewModel by activityViewModels()
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentMainBinding.inflate(inflater, container,false)
        binding.viewModels = viewModels
        binding.activityViewModel = activityViewModels
        binding.lifecycleOwner = this@MainFragment
        return binding.root
    }
}
