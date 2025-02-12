package com.example.yourtodo.screen

import androidx.compose.animation.AnimatedVisibility
import androidx.compose.animation.core.tween
import androidx.compose.animation.fadeIn
import androidx.compose.animation.slideInVertically
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Surface
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import com.example.yourtodo.R
import kotlinx.coroutines.delay

@Composable
fun SplashScreen(navController: NavController) {
    val isVisible = remember { mutableStateOf(false) }

    LaunchedEffect(Unit) {
        delay(500)
        isVisible.value = true
        delay(3000)
        navController.navigate("main")
    }

    Surface(
        modifier = Modifier.fillMaxSize(),
        color = Color(0XFFDEFFF6)
    ) {
        Box(
            modifier = Modifier.fillMaxSize(),
            contentAlignment = Alignment.Center
        ) {
            AnimatedVisibility(
                visible = isVisible.value,
                enter = fadeIn(animationSpec = tween(durationMillis = 1000)) + slideInVertically(
                    initialOffsetY = { fullHeight -> fullHeight / 2 },
                    animationSpec = tween(durationMillis = 1000)
                )
            ) {
                Image(
                    painter = painterResource(id = R.drawable.todo),
                    modifier = Modifier.size(115.dp),
                    contentDescription = "App Logo"
                )
            }
        }
    }
}