package com.rotimijohnson.viewbinding

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.rotimijohnson.viewbinding.databinding.FragmentBlankBinding

class BlankFragment : Fragment() {
    private var _binding: FragmentBlankBinding? = null
    private val binding get() = _binding!!
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = FragmentBlankBinding.inflate(inflater, container, false)

        binding.fragmentTextView1.text = "View Binding"
        binding.fragmentTextView2?.text = "works in fragment"
        binding.includeLayout.includeTextView1.text = "and with"
        binding.includeLayout.includeTextView2.text = "include layouts"
        return binding.root
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}