package com.austin.markethub.navigation


import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.austin.markethub.ui.screens.splash.SplashScreen
import com.austin.markethub.ui.screens.auth.LoginScreen
import com.austin.markethub.ui.screens.auth.RegisterScreen
import com.austin.markethub.ui.screens.home.HomeScreen
import com.austin.markethub.ui.screens.intent.IntentScreen
import com.austin.markethub.ui.screens.onboarding.OnBoarding1Screen
import com.austin.markethub.ui.screens.onboarding.OnBoarding2Screen

@Composable
fun AppNavHost(
    modifier: Modifier = Modifier,
    navController: NavHostController = rememberNavController(),
    startDestination: String = ROUT_SPLASH
) {

    NavHost(
        navController = navController,
        startDestination = startDestination,
        modifier = modifier
    ) {
        composable(ROUT_HOME) {
            HomeScreen(navController)
        }


        composable(ROUT_LOGIN) {
            LoginScreen(navController)
        }


        composable(ROUT_REGISTER) {
            RegisterScreen(navController)
        }


        composable(ROUT_HOME) {
            HomeScreen(navController)
        }


        composable(ROUT_ONBOARDING1) {
            OnBoarding1Screen(navController)
        }

        composable(ROUT_ONBOARDING2) {
            OnBoarding2Screen(navController)
        }

        composable(ROUT_ONBOARDING3) {
            OnBoarding1Screen(navController)
        }
        composable (ROUT_INTENT){
            IntentScreen(navController)
        }
        composable (ROUT_SPLASH){
            SplashScreen(navController,)
        }
    }

}