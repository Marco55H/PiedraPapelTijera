package com.example.piedrapapeltijera

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.Constraints
import androidx.compose.ui.unit.dp


@Composable
fun PantallaInicial(modifier: Modifier = Modifier) {

    Column(modifier = Modifier.fillMaxSize(), horizontalAlignment = Alignment.CenterHorizontally, verticalArrangement = Arrangement.Center){

        var text by remember { mutableStateOf("") }

        Text(
            text = "Bienvenido!",
            modifier = modifier
        )

        TextField(
            value = text,
            onValueChange = { text = it },
            label = { Text("Nombre") }
        )

    }

}

@Composable
fun paginaJugable(){

    var elegido by remember { mutableStateOf("") }

    Column(modifier = Modifier
        .fillMaxSize()
        .background(Color.Cyan),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.SpaceEvenly
    ){

        var modifier = Modifier
            .width(100.dp)
            .height(100.dp)

        Image(
            painter = painterResource(id = R.drawable.robot),
            contentDescription = "",
            modifier
        )
        Row() {
            Image(
                painter = painterResource(id = R.drawable.piedra),
                contentDescription = "",
                modifier
            )

            Image(
                painter = painterResource(id = R.drawable.papel),
                contentDescription = "",
                modifier
            )

            Image(
                painter = painterResource(id = R.drawable.tijera),
                contentDescription = "",
                modifier
            )
        }

        /**
        Button(onClick = { onClick() }) {
            Text("Pelea")
        }

        }
**/
        Row(verticalAlignment = Alignment.Top) {
            Image(
                painter = painterResource(id = R.drawable.piedra),
                contentDescription = "",
                if (elegido=="piedra") {
                    modifier.background(Color.Green)
                }else {
                    modifier.clickable { elegido = "piedra" }
                }
            )

            Image(
                painter = painterResource(id = R.drawable.papel),
                contentDescription = "",
                if (elegido=="papel") {
                    modifier.background(Color.Green)
                }else {
                    modifier.clickable { elegido = "papel" }
                }
            )


            Image(
                painter = painterResource(id = R.drawable.tijera),
                contentDescription = "",

                if (elegido=="tijera") {
                    modifier.background(Color.Green)
                }else {
                    modifier.clickable { elegido = "tijera" }
                }
            )
        }

        Image(
            painter = painterResource(id = R.drawable.persona),
            contentDescription = "",
            modifier
        )
    }
}