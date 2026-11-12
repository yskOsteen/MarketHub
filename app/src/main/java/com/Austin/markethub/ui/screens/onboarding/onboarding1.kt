package com.Austin.markethub.ui.screens.onboarding

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController
import com.Austin.markethub.R


@Composable
fun OnBoarding1Screen(navController: NavController){

    Column(
        modifier = Modifier.fillMaxSize(),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ) {

        Text(
            text = "Shop Now. Live Better"
        )

        Image(
            painter = painterResource(R.drawable.img),
            contentDescription = "MarketHub Logo"
        )

        Text(
            text = "MarketHub is a modern ecommerce platform designed to connect local artisans and global shoppers in one seamless digital space. By blending intuitive search tools with personalized storefront recommendations, the site makes discovering unique goods both fast and effortless. Sellers benefit from real-time inventory tracking, automated shipping labels, and integrated payment processing that supports multiple currencies. Whether a customer is browsing for handcrafted home decor or everyday tech accessories, MarketHub ensures every transaction is backed by verified buyer reviews and reliable customer support."
        )

    }

}

@Preview(showBackground = true)
@Composable
fun OnBoarding1ScreenPreview(){
    OnBoarding1Screen(rememberNavController())
}