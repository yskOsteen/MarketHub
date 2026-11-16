package com.Austin.markethub

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.Austin.markethub.navigation.AppNavHost
import com.Austin.markethub.ui.theme.MarkethubTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            AppNavHost()
        }
    }
}

@Composable
fun Greeting(name: String, modifier: Modifier = Modifier) {
    Column {
        Text(
            text = "Hello $name!",
            modifier = modifier
        )
    }
    Spacer(modifier = Modifier.height(10.dp))
    Text(
        text = "Shop Now. Live Better",
        modifier = Modifier.padding(16.dp)
    )
    Button(
        onClick = {},
        colors = ButtonDefaults.buttonColors(androidx.compose.ui.graphics.Color.Magenta),
        shape = RoundedCornerShape(10.dp),

        )
    {
        Text( text = "Get Started")
    }
    }


@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    MarkethubTheme {
        Greeting("Austin")
    }
}