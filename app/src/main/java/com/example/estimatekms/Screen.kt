package com.example.estimatekms

sealed class Screen (val route: String ){
    object Home : Screen (route = "home_screen")
    object Map : Screen (route = "map_screen")
}
