package com.austin.markethub.ui.screens.onboarding

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Home
import androidx.compose.material.icons.filled.Menu
import androidx.compose.material.icons.filled.ShoppingCart
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun OnBoarding3Screen(navController: NavController){
    Scaffold { innerPadding ->
        Column(modifier =Modifier.padding(innerPadding).padding(16.dp))
        {

            TopAppBar(
                title = { Text(text = "Home") },

                navigationIcon = {
                    IconButton(onClick = {}) {
                        Icon(imageVector = Icons.Default.Home, contentDescription = "Menu")}

                },
                actions = {
                    IconButton(onClick = {}) {
                        Icon(imageVector = Icons.Default.ShoppingCart, contentDescription = "Shopping Cart")
                    }
                    IconButton(onClick = {}) {
                        Icon(imageVector = Icons.Default.Menu, contentDescription = "Menu")
                    }
                },
                colors = TopAppBarDefaults.topAppBarColors(
                    navigationIconContentColor = Color.Blue,
                    containerColor = Color.Black,
                    titleContentColor = Color.White,
                    actionIconContentColor = Color.White
                )


            )




        }
    }

}

@Preview(showBackground = true)
@Composable
fun OnBoarding3ScreenPreview(){
    OnBoarding3Screen(rememberNavController())
}