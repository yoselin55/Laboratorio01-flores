package com.flores.laboratorio01

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.flores.laboratorio01.ui.theme.Laboratorio01Theme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            Laboratorio01Theme {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                    Greeting(
                        name = "Yoselin Fabiola Flores Quispe",
                        modifier = Modifier.padding(innerPadding)
                    )
                }
            }
        }
    }
}

@Composable
fun Greeting(name: String, modifier: Modifier = Modifier) {
    // Variable de estado para cambiar el mensaje al hacer clic
    var mensaje by remember { mutableStateOf("") }

    Column(modifier = modifier.padding(16.dp)) {
        Text(
            text = "¡Hola, soy $name!",
            fontSize = 24.sp
        )
        Text(
            text = "Curso: Programación en Móviles"
        )

        Spacer(modifier = Modifier.height(12.dp))

        Button(onClick = { mensaje = "¡Bienvenido a Jetpack Compose!" }) {
            Text(text = "Presióname")
        }

        // Muestra el mensaje solo si no está vacío
        if (mensaje.isNotEmpty()) {
            Spacer(modifier = Modifier.height(12.dp))
            Text(
                text = mensaje,
                fontSize = 18.sp
            )
        }
    }
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    Laboratorio01Theme {
        Greeting("Yoselin Fabiola Flores Quispe")
    }
}