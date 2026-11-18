package com.austin.markethub.ui.screens.home

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
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
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController
import com.austin.markethub.R
import com.austin.markethub.navigation.ROUT_ONBOARDING2

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun HomeScreen(navController: NavController){

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

            Text(
                text = "Shop Now. Live Better",
                fontSize = 20.sp,
                fontWeight = FontWeight.Bold,
                color = androidx.compose.ui.graphics.Color.Magenta
            )

            Image(
                painter = painterResource(R.drawable.img),
                contentDescription = "MarketHub Logo",
                modifier = Modifier
                    .height(100.dp)
                    .width(300.dp)
            )

            Spacer(modifier = Modifier.height(20.dp))

            Text(
                text = "MarketHub is a modern ecommerce platform designed to connect local artisans and global shoppers in one seamless digital space. By blending intuitive search tools with personalized storefront recommendations, the site makes discovering unique goods both fast and effortless. Sellers benefit from real-time inventory tracking, automated shipping labels, and integrated payment processing that supports multiple currencies. Whether a customer is browsing for handcrafted home decor or everyday tech accessories, MarketHub ensures every transaction is backed by verified buyer reviews and reliable customer support."
            )

            Button(
                onClick = {navController.navigate(ROUT_ONBOARDING2)},
                colors = ButtonDefaults.buttonColors(androidx.compose.ui.graphics.Color.Magenta),
                shape = RoundedCornerShape(10.dp),

                )
            {
                Text( text = "Get Started")
            }




        }
    }
}

@Preview(showBackground = true)
@Composable
fun HomeScreenPreview(){
    HomeScreen(rememberNavController())
}