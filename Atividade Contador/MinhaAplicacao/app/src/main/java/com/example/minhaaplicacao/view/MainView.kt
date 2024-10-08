package com.example.minhaaplicacao.view

import androidx.compose.foundation.layout.Column
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.runtime.getValue
import androidx.compose.runtime.setValue
import androidx.compose.runtime.livedata.observeAsState

@Composable
fun MainView(modifier: Modifier = Modifier, viewModel: MainViewModel){

    val contador: Int by viewModel.contador.observeAsState(0)

    Column {
        TextField(value = contador.toString(), onValueChange = {})
        Button(onClick = {
            viewModel.incrementaContador()
        }) {
            Text(text = "Clique")
        }
    }
}