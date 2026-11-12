package com.Austin.markethub.navigation


import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.Austin.markethub.ui.screens.auth.LoginScreen
import com.Austin.markethub.ui.screens.auth.RegisterScreen
import com.Austin.markethub.ui.screens.users.HomeScreen
import com.Austin.markethub.ui.screens.onboarding.OnBoarding1Screen
import com.Austin.markethub.ui.screens.onboarding.OnBoarding2Screen

@Composable
fun AppNavHost(
    modifier: Modifier = Modifier,
    navController: NavHostController = rememberNavController(),
    startDestination: String = ROUT_ONBOARDING1
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
    }

}