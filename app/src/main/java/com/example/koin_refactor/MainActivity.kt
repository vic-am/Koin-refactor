package com.example.koin_refactor

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.ViewModelProvider
import com.example.koin_refactor.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var viewModel: MainViewModel
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        initViewBinding()
        initViewModel()

        binding.button.setOnClickListener { savePhrase() }

    }

    private fun initViewBinding() {
        binding = ActivityMainBinding.inflate(layoutInflater)
        val root = binding.root
        setContentView(root)
    }

    private fun initViewModel() {
        viewModel = ViewModelProvider(this).get(MainViewModel::class.java)
    }

    private fun savePhrase() {
        val text = binding.textInput.editText?.text.toString()
        val textOutput = binding.textView
        if (text != "") {
            viewModel.savePhrase(text, textOutput)
        }
    }
}