package com.example.android_returns.ui.components

import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Box
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier

@Composable
fun ClickableBox(){
    val (clicks, setClicks) = remember { mutableStateOf(0) }
    Box(
        modifier = Modifier
            .clickable {
                setClicks(clicks + 1)
            },
        contentAlignment = Alignment.BottomCenter
    ) {
        Text("I've been clicked $clicks times")
    }
}