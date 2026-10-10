package cl.nora.composelab.ui.screens

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Button
import androidx.compose.material3.Card
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun HomeScreen() {
    Scaffold(
        topBar = {
            TopAppBar(title = { Text("Mi agenda Academica") })
        }
    ) { innerPadding ->
        Column(
            modifier = Modifier
                .padding(innerPadding)
                .padding(16.dp)
        ) {
            Text(
                text = "Mis Asignaturas",
                style = MaterialTheme.typography.headlineSmall
            )
            Spacer(modifier = Modifier.size(8.dp))

            // Llamamos a la tarjeta dentro del contenido principal de la pantalla
            AsignaturaCard(
                nombre = "Desarrollo de Aplicaciones Móviles",
                sala = "304",
                horario = "10:00 a 12:00",
                onVerDetalle = {}
            )
        }
    }
}

@Composable
fun AsignaturaCard(
    nombre: String,
    sala: String,
    horario: String,
    onVerDetalle: () -> Unit
) {
    Card(
        modifier = Modifier
            .fillMaxWidth()
            .padding(8.dp)
    ) {
        Column(modifier = Modifier.padding(16.dp)) {
            Text(text = nombre, style = MaterialTheme.typography.titleLarge)
            Text(text = "Sala: $sala")
            Text(text = "Horario: $horario")
            Spacer(modifier = Modifier.size(8.dp))
            Button(onClick = onVerDetalle) {
                Text(text = "Ver Detalle")
            }
        }
    }
}
@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun HomeScreen(onVerDetalle: () -> Unit) {
    AsignaturaCard(
        nombre = "Desarrollo de Aplicaciones Móviles",
        sala = "304",
        horario = "10:00 a 12:00",
        onVerDetalle = onVerDetalle
    )
}
