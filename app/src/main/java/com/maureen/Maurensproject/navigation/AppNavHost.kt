package com.maureen.Maurensproject.navigation

import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.maureen.Maurensproject.ui.theme.screens.Aboutus.Aboutscreen
import com.maureen.Maurensproject.ui.theme.screens.Booking.Bookingscreen
import com.maureen.Maurensproject.ui.theme.screens.Login.Loginscreen
import com.maureen.Maurensproject.ui.theme.screens.Register.Registrationscreen
import com.maureen.Maurensproject.ui.theme.screens.Splash.SplashScreen
import com.maureen.Maurensproject.ui.theme.screens.home.Homescreen


@Composable
fun AppNavHost(
    navController: NavHostController = rememberNavController(),
    startDestination: String = ROUTE_SPLASH
){
    NavHost(navController = navController, modifier = Modifier, startDestination = startDestination) {
        composable(ROUTE_HOME){
            Homescreen(navController)
        }
        composable(ROUTE_ABOUT){
            Aboutscreen(navController)
        }
        composable(ROUTE_REGISTER){
            Registrationscreen(navController)
        }
        composable(ROUTE_LOGIN){
            Loginscreen(navController)
        }
        composable(ROUTE_SPLASH){
            SplashScreen(navController)
        }
        composable(ROUTE_BOOKING){
           Bookingscreen(navController)
        }

    }
}