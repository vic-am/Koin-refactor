package com.example.koin_refactor

import android.widget.TextView
import androidx.lifecycle.ViewModel

class MainViewModel : ViewModel() {

    fun savePhrase(string: String, view: TextView) {
        view.text = string
    }
}