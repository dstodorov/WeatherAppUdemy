package com.dstod.weatherappudemy

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.dstod.weatherappudemy.pages.WeatherHomeScreen
import com.dstod.weatherappudemy.ui.theme.WeatherAppUdemyTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            WeatherApp()
        }
    }
}


@Composable
fun WeatherApp(modifier: Modifier = Modifier) {
    WeatherAppUdemyTheme {
        WeatherHomeScreen()
    }
}

@Preview
@Composable
private fun WeatherAppPreview() {
    WeatherApp()
}