package com.bootcamp.ejercicionuevekotlin.view

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button


import androidx.compose.material3.OutlinedTextField

import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.setValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.bootcamp.ejercicionuevekotlin.components.MultiButtonSegmented
import com.bootcamp.ejercicionuevekotlin.components.Space

@Composable
fun HomeView() {
    var selectGenero by remember { mutableStateOf("Hombre")}
    var edad by remember { mutableStateOf("") }
    var peso by remember { mutableStateOf("") }
    var altura by remember { mutableStateOf("") }

    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(16.dp),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ) {
        Text(
            text = "Calculadora de IMC",
            fontSize = 34.sp,
            fontWeight = FontWeight.Bold,
            textAlign = TextAlign.Center,
            modifier = Modifier.padding(bottom = 16.dp)
        )



        MultiButtonSegmented(
            options = listOf("Hombre", "Mujer"),
            selectedOption = selectGenero,
            onOptionSelected = { selectGenero = it }
        )

        Space()

        OutlinedTextField(
            value = edad,
            onValueChange = { edad = it },
            label = {Text("Edad (años)")}
        )


        Space()
        OutlinedTextField(
            value = peso,
            onValueChange = { peso = it },
            label = {Text("Peso (Kg)")}
        )

        Space()


        OutlinedTextField(
            value = "altura",
            onValueChange = { altura = it},
            label = {Text("Altura (cm)")}
        )
        Space()



        Button(
            onClick = {},
            modifier = Modifier
                .fillMaxWidth()
        )
        {
            Text(text = "Calcular")
        }
    }
    }

