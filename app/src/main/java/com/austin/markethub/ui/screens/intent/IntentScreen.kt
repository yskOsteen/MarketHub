package com.austin.markethub.ui.screens.intent

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Home
import androidx.compose.material.icons.filled.Menu
import androidx.compose.material.icons.filled.ShoppingCart
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController
import com.austin.markethub.navigation.ROUT_ONBOARDING1


@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun IntentScreen(navController: NavController) {
    Column(modifier = Modifier.fillMaxSize()){
        TopAppBar(
            title = { Text(text = "Home") },

            navigationIcon = {
                IconButton(onClick = {}) {
                    Icon(imageVector = Icons.Default.Home, contentDescription = "Menu")
                }

            },
            actions = {
                IconButton(onClick = {}) {
                    Icon(
                        imageVector = Icons.Default.ShoppingCart,
                        contentDescription = "Shopping Cart"
                    )
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


        Button(
            onClick = {navController.navigate(ROUT_ONBOARDING1)},
            colors = ButtonDefaults.buttonColors(androidx.compose.ui.graphics.Color.Magenta),
            shape = RoundedCornerShape(10.dp),
            modifier = Modifier
                .width(250.dp)
                .align(alignment = Alignment.CenterHorizontally)

            ) {
            Text( text = "Pay Now")
        }

        Button(
            onClick = {navController.navigate(ROUT_ONBOARDING1)},
            colors = ButtonDefaults.buttonColors(androidx.compose.ui.graphics.Color.Magenta),
            shape = RoundedCornerShape(10.dp),
            modifier = Modifier
                .width(250.dp)
                .align(alignment = Alignment.CenterHorizontally)

        ) {
            Text( text = "Message Us")
        }

        Button(
            onClick = {navController.navigate(ROUT_ONBOARDING1)},
            colors = ButtonDefaults.buttonColors(androidx.compose.ui.graphics.Color.Magenta),
            shape = RoundedCornerShape(10.dp),
            modifier = Modifier
                .width(250.dp)
                .align(alignment = Alignment.CenterHorizontally)

        ) {
            Text( text = "Call Now")
        }

        Button(
            onClick = {navController.navigate(ROUT_ONBOARDING1)},
            colors = ButtonDefaults.buttonColors(androidx.compose.ui.graphics.Color.Magenta),
            shape = RoundedCornerShape(10.dp),
            modifier = Modifier
                .width(250.dp)
                .align(alignment = Alignment.CenterHorizontally)

        ) {
            Text( text = "Email Us")
        }

        Button(
            onClick = {navController.navigate(ROUT_ONBOARDING1)},
            colors = ButtonDefaults.buttonColors(androidx.compose.ui.graphics.Color.Magenta),
            shape = RoundedCornerShape(10.dp),
            modifier = Modifier
                .width(250.dp)
                .align(alignment = Alignment.CenterHorizontally)

        ) {
            Text( text = "Take A Pic")
        }

        Button(
            onClick = {navController.navigate(ROUT_ONBOARDING1)},
            colors = ButtonDefaults.buttonColors(androidx.compose.ui.graphics.Color.Magenta),
            shape = RoundedCornerShape(10.dp),
            modifier = Modifier
                .width(250.dp)
                .align(alignment = Alignment.CenterHorizontally)

        ) {
            Text( text = "Share")
        }

    }

}



@Preview(showBackground = true)
@Composable
fun IntentScreenPreview(){
    IntentScreen(rememberNavController())
}


