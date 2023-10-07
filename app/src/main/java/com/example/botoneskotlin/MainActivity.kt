package com.example.botoneskotlin

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.wrapContentSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.MutableState
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.botoneskotlin.componets.BotonIcono
import com.example.botoneskotlin.componets.BotonNormal12
import com.example.botoneskotlin.componets.BotonOutLine
import com.example.botoneskotlin.componets.BotonSwitch

import com.example.botoneskotlin.componets.DarkMode
import com.example.botoneskotlin.componets.FloatAction
import com.example.botoneskotlin.componets.Space
import com.example.botoneskotlin.ui.theme.BotonesKotlinTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            val darkMode = remember{ mutableStateOf(false) }

            BotonesKotlinTheme (darkMode.value){
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                   Content(darkMode)

                }

            }
        }

        }
    }


@Composable
fun Content(darkMode: MutableState<Boolean>){
    Column(
        modifier = Modifier
            .fillMaxWidth()
            .wrapContentSize(Alignment.Center),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        BotonIcono()
        Space()
        BotonNormal12()
        Space()
        BotonOutLine()
        Space()
        BotonIcono()
        Space()
        BotonSwitch()
        Space()
        DarkMode(darkMode = darkMode)
        Space()
        FloatAction()
    }


}