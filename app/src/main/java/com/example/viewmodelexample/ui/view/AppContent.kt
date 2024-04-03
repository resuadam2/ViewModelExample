package com.example.viewmodelexample.ui.view

import androidx.compose.runtime.Composable
import androidx.lifecycle.viewmodel.compose.viewModel
import com.example.viewmodelexample.ui.state.ViewModelExample

@Composable
fun AppContent() {
    var vm : ViewModelExample = viewModel()

    BloqueVisual(vm.count, { vm.incrementCount() }, vm.text, { vm.modifyText(it) })
}