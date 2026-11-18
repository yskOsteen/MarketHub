package com.austin.markethub.ui.screens.onboarding

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController
import com.austin.markethub.R
import com.austin.markethub.navigation.ROUT_HOME
import com.austin.markethub.navigation.ROUT_ONBOARDING2


@Composable
fun OnBoarding1Screen(navController: NavController){

    Column(
        modifier = Modifier.fillMaxSize(),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center,
    ) {

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
                .height(500.dp)
                .width(300.dp)
        )

        Spacer(modifier = Modifier.height(20.dp))

        Text(
            text = "MarketHub is a modern ecommerce platform designed to connect local artisans and global shoppers in one seamless digital space. By blending intuitive search tools with personalized storefront recommendations, the site makes discovering unique goods both fast and effortless. Sellers benefit from real-time inventory tracking, automated shipping labels, and integrated payment processing that supports multiple currencies. Whether a customer is browsing for handcrafted home decor or everyday tech accessories, MarketHub ensures every transaction is backed by verified buyer reviews and reliable customer support."
        )

        Button(
            onClick = {navController.navigate(ROUT_HOME)},
            colors = ButtonDefaults.buttonColors(androidx.compose.ui.graphics.Color.Magenta),
            shape = RoundedCornerShape(10.dp),

            )
        {
            Text( text = "Get Started")
        }


    }

}

@Preview(showBackground = true)
@Composable
fun OnBoarding1ScreenPreview(){
    OnBoarding1Screen(rememberNavController())

}