package com.austin.markethub.ui.screens.intent

import android.content.Intent
import android.provider.MediaStore
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
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
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.core.net.toUri
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController
import com.austin.markethub.navigation.ROUT_ONBOARDING1


@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun IntentScreen(navController: NavController) {

    var mContext = LocalContext.current

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

        Spacer(modifier = Modifier.height(25.dp))


        Button(
            onClick = {
                val simToolKitLaunchIntent =
                mContext.packageManager.getLaunchIntentForPackage("com.android.stk")
                simToolKitLaunchIntent?.let { mContext.startActivity(it) }
            },

            colors = ButtonDefaults.buttonColors(androidx.compose.ui.graphics.Color.Magenta),
            shape = RoundedCornerShape(10.dp),
            modifier = Modifier
                .width(250.dp)
                .align(alignment = Alignment.CenterHorizontally)

            ) {
            Text( text = "Pay Now")
        }
        Spacer(modifier = Modifier.height(10.dp))

        Button(
            onClick = {  val smsIntent= Intent(Intent.ACTION_SENDTO)
                smsIntent.data="smsto:0720245837".toUri()
                smsIntent.putExtra("sms_body","Hello,how was your day?")
                mContext.startActivity(smsIntent)
            },

            colors = ButtonDefaults.buttonColors(androidx.compose.ui.graphics.Color.Magenta),
            shape = RoundedCornerShape(10.dp),
            modifier = Modifier
                .width(250.dp)
                .align(alignment = Alignment.CenterHorizontally)

        ) {
            Text( text = "Message Us")
        }
        Spacer(modifier = Modifier.height(10.dp))

        Button(
            onClick = {
                val callIntent= Intent(Intent.ACTION_DIAL)
                callIntent.data="tel:0719181932".toUri()
                mContext.startActivity(callIntent)
            },

            colors = ButtonDefaults.buttonColors(androidx.compose.ui.graphics.Color.Magenta),
            shape = RoundedCornerShape(10.dp),
            modifier = Modifier
                .width(250.dp)
                .align(alignment = Alignment.CenterHorizontally)

        ) {
            Text( text = "Call Now")
        }
        Spacer(modifier = Modifier.height(10.dp))

        Button(
            onClick = {
                val shareIntent = Intent(Intent.ACTION_SEND)
                shareIntent.type = "text/plain"
                shareIntent.putExtra(Intent.EXTRA_EMAIL, arrayOf("wahomeaustin3@gmail.com"))
                shareIntent.putExtra(Intent.EXTRA_SUBJECT, "subject")
                shareIntent.putExtra(Intent.EXTRA_TEXT, "Hello, this is the email body")
                mContext.startActivity(shareIntent)
            },

            colors = ButtonDefaults.buttonColors(Color.Magenta),
            shape = RoundedCornerShape(10.dp),
            modifier = Modifier
                .width(250.dp)
                .align(alignment = Alignment.CenterHorizontally)

        ) {
            Text( text = "Email Us")
        }
        Spacer(modifier = Modifier.height(10.dp))

        Button(
            onClick = {
                val cameraIntent=Intent(MediaStore.ACTION_IMAGE_CAPTURE)
                if (cameraIntent.resolveActivity(mContext.packageManager)!=null){
                    mContext.startActivity(cameraIntent)
                }else{
                    println("Camera app is not available")
                }
            },

            colors = ButtonDefaults.buttonColors(androidx.compose.ui.graphics.Color.Magenta),
            shape = RoundedCornerShape(10.dp),
            modifier = Modifier
                .width(250.dp)
                .align(alignment = Alignment.CenterHorizontally)

        ) {
            Text( text = "Take A Pic")
        }
        Spacer(modifier = Modifier.height(10.dp))

        Button(
            onClick = {
                val shareIntent=Intent(Intent.ACTION_SEND)
                shareIntent.type="text/plain"
                shareIntent.putExtra(Intent.EXTRA_TEXT, "https://github.com/gloryakinyi")
                mContext.startActivity(Intent.createChooser(shareIntent, "Share"))
            },

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


