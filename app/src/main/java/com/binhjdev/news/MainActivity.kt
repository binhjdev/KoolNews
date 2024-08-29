package com.binhjdev.news

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.material3.MaterialTheme
import androidx.compose.ui.Modifier
import androidx.core.splashscreen.SplashScreen.Companion.installSplashScreen
import com.binhjdev.news.presentation.on_boarding.OnBoardingScreen
import com.binhjdev.news.ui.theme.KooknewsTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        installSplashScreen()
        setContent {
            KooknewsTheme {
                Box(modifier = Modifier.background(color = MaterialTheme.colorScheme.background)) {
                    OnBoardingScreen()
                }
            }
        }
    }
}