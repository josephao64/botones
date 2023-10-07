package com.example.botoneskotlin.componets

import android.graphics.drawable.Icon
import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.horizontalScroll
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.layout.wrapContentSize
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Add
import androidx.compose.material.icons.filled.Home
import androidx.compose.material.icons.filled.Star
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.FloatingActionButton
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.OutlinedButton
import androidx.compose.material3.Switch
import androidx.compose.material3.SwitchDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.MutableState
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.modifier.modifierLocalConsumer
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp


@Composable
    fun BotonNormal(){
        Button(onClick = { /*TODO*/ }) {
            Text(text= "mi boton ",fontSize = 24.sp)

        }
    }

@Composable
fun BotonNormal12(){
    Button(onClick = { /*TODO*/ }, colors = ButtonDefaults.buttonColors(containerColor = Color.Red))
    {
        Text(text = "BOTON2 ", fontSize = 30.sp)
    }
}


@Composable
fun BotonOutLine(){
    OutlinedButton(onClick = { /*TODO*/ },  border =  BorderStroke(3.dp, Color.Blue)) {
        Text(text = "Boton Outline", fontSize = 30.sp)

    }
}

@Composable
fun BotonIcono(){
    IconButton(onClick = { /*TODO*/ }) {
        Icon(
            imageVector = Icons.Default.Home,
            contentDescription = "icono",
            tint = Color.White,
            modifier = Modifier.size(50.dp)

        )

    }
}
@Composable
fun BotonSwitch() {
    var switched by remember { mutableStateOf(false) }
    Switch(
        checked = switched,
        onCheckedChange = { switched = it },
        colors = SwitchDefaults.colors(
            checkedThumbColor = Color.Red,
            checkedTrackColor = Color.Green,
            uncheckedThumbColor = Color.Blue,
            uncheckedTrackColor = Color.Magenta
        )
    )
}
@Composable
fun DarkMode(darkMode: MutableState<Boolean>) {
    Button(onClick = { darkMode.value = !darkMode.value }) {
        Icon(imageVector = Icons.Default.Star, contentDescription = "darkMode")
        Spacer(modifier = Modifier.width(5.dp))
        Text(text = "Dark Mode", fontSize = 30.sp)
    }
}
@Composable
fun FloatAction(){
    FloatingActionButton(
        onClick = { /*TODO*/},
        containerColor = Color.Blue,
        contentColor = Color.White
            ){
        Icon(
            Icons.Filled.Add,
            contentDescription = "",
            modifier = Modifier.size(30.dp)

        )
    }
}
@Composable
fun Space(){
    Spacer(modifier = Modifier.height(10.dp))
}
