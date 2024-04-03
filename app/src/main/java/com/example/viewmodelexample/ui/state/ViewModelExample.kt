package com.example.viewmodelexample.ui.state

import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableIntStateOf
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue
import androidx.lifecycle.ViewModel

class ViewModelExample : ViewModel() {
    var _count by mutableIntStateOf(0) // backing property
    val count get() = _count

    fun incrementCount() {
        _count++
    }

    var _text by mutableStateOf("") // backing property
    val text get() = _text

    fun modifyText(newText: String) {
        _text = newText
    }
}