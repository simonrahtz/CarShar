package com.example.estimatekms

import android.content.Context
import android.location.Geocoder
import android.location.Location
import android.location.LocationManager
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.selection.selectable
import androidx.compose.material.*
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.estimatekms.ui.theme.EstimateKmsTheme
import com.google.android.gms.maps.GoogleMap
import com.google.android.gms.maps.model.CameraPosition
import com.google.android.gms.maps.model.LatLng
import com.google.android.gms.maps.model.Marker

import org.intellij.lang.annotations.JdkConstants

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        var context = this
        setContent {
            EstimateKmsTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colors.background
                ) {
                    Greeting()
                }
            }
        }
    }
}

@Composable
fun Greeting(){
    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(top = 40.dp),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Top
    ){
        Box(Modifier.padding(bottom = 10.dp)) {
            Text(text = "Enter destination address for your trip",
                style = MaterialTheme.typography.h6)

        }
    }
    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(top = 40.dp),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ){
        var text by remember { mutableStateOf("")}
        var location = "8 Parkwood Street, Plumpton"
        var estimatedKms : String
        OutlinedTextField(
            value = location ,
            onValueChange = {},
            enabled = false

        )
        OutlinedTextField(
            value = text ,
            onValueChange = {text = it},
            label = {Text(text = "Enter Address")}
        )


        Button(onClick = {



        },
            modifier = Modifier.padding(top = 20.dp)) {
            Text(text = "Start Trip")

        }

        }



}



@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    EstimateKmsTheme {
        Greeting()

    }
}