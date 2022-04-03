package com.example.estimatekms

import androidx.compose.foundation.layout.*
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.estimatekms.ui.theme.EstimateKmsTheme

@Composable
fun MapScreen() {
    val context = LocalContext.current
    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(top = 40.dp),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Top
    ) {
        Box(Modifier.padding(bottom = 10.dp)) {
            Text(
                text = "View on map",
                style = MaterialTheme.typography.h6
            )

        }
    }
}

@Composable
@Preview(showBackground = true)
fun MapScreenPreview() {
    EstimateKmsTheme {
        MapScreen()

    }
}