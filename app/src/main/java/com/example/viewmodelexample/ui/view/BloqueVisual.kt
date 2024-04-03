package com.example.viewmodelexample.ui.view

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp

@Composable
fun BloqueVisual(countParam: Int, increment: () -> Unit, textParam: String, textFromTextField: (String) -> Unit) {
    Column(
        modifier = Modifier.fillMaxSize(),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally,
    ) {
        Row(
            verticalAlignment = Alignment.CenterVertically,
        )
        {
            Button(onClick = increment) {
                Text(text = "Increment")
            }
            Spacer(modifier = Modifier.width(16.dp))
            Text(text = countParam.toString())
        }

        Spacer(modifier = Modifier.height(24.dp))

        Column {
            TextField(value = textParam, onValueChange = {
                textFromTextField(it) // textFromTextField es una función que se pasa como parámetro
            })
            Spacer(modifier = Modifier.height(8.dp))
            Text(text = textParam)
        }
    }
}