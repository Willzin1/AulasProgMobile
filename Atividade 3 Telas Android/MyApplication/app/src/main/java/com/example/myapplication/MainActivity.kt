package com.example.myapplication

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.*
import androidx.compose.material3.Button
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.myapplication.ui.theme.MyApplicationTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MyApplicationTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    Column(
                        modifier = Modifier
                            .fillMaxSize()
                            .padding(16.dp)
                    ) {
                        TaskWidget(titulo = "Título Tarefa", observacao = "Observação")
                        TaskWidget(titulo = "Título Tarefa", observacao = "Observação")
                        TaskWidget(titulo = "Título Tarefa", observacao = "Observação")
                    }
                }
            }
        }
    }
}

@Composable
fun TaskWidget(titulo: String, observacao: String, modifier: Modifier = Modifier) {
    Column(
        modifier = modifier
            .fillMaxWidth()
            .padding(8.dp)
    ) {
        // Primeiro row com o conteúdo
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .padding(bottom = 8.dp)
        ) {
            Column(
                modifier = Modifier
                    .weight(1f)
                    .padding(end = 8.dp)
            ) {
                Text(
                    text = titulo,
                    style = MaterialTheme.typography.titleLarge
                )
                Spacer(modifier = Modifier.height(4.dp))
                Text(
                    text = observacao,
                    style = MaterialTheme.typography.bodyMedium
                )
                Spacer(modifier = Modifier.height(8.dp))
                // Botões
                Row(
                    modifier = Modifier.fillMaxWidth()
                ) {
                    // Botão Editar
                    Button(
                        onClick = {},
                        modifier = Modifier
                            .weight(1f)
                            .padding(end = 4.dp)
                    ) {
                        Text("Editar")
                    }

                    // Botão Feito
                    Button(
                        onClick = {},
                        modifier = Modifier
                            .weight(1f)
                            .padding(start = 4.dp)
                    ) {
                        Text("Feito")
                    }
                }
            }
        }

        // Segundo row vazio
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .padding(top = 8.dp)
        ) {
            Spacer(modifier = Modifier.weight(1f))
            Box(
                modifier = Modifier
                    .width(100.dp)
                    .height(48.dp)
                    .padding(8.dp)
            ) {
                // Este Box é intencionalmente vazio
            }
        }
    }
}

@Preview(showBackground = true)
@Composable
fun TaskWidgetPreview() {
    MyApplicationTheme {
        Column(
            modifier = Modifier
                .fillMaxSize()
                .padding(16.dp)
        ) {
            TaskWidget(titulo = "Título Tarefa", observacao = "Observação")
            TaskWidget(titulo = "Título Tarefa", observacao = "Observação")
            TaskWidget(titulo = "Título Tarefa", observacao = "Observação")
        }
    }
}
