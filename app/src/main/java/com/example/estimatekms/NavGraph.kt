package com.example.estimatekms

import androidx.compose.runtime.Composable
import androidx.navigation.NavController
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable

@Composable
fun SetUpNavGraph(
    navController: NavHostController
) {

    NavHost(
        navController = navController,
        startDestination = "enterDestination" ){
            composable("enterDestination" ){
            EnterDestination(navController = navController)
            }
            composable("map" ){
            MapScreen() }
    }
    
}