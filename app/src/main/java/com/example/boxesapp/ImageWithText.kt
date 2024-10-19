package com.example.boxesapp

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.runtime.Composable
import androidx.compose.material3.Text
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview

@Composable
fun ImageWithText() {
    Box(
        modifier = Modifier.fillMaxSize(),
        contentAlignment = Alignment.Center
    ) {
        Text(
            text = "Top Start",
            modifier = Modifier.align(Alignment.TopStart)
        )
        Text(
            text = "Top Center",
            modifier = Modifier.align(Alignment.TopCenter)
        )
        Text(
            text = "Top End",
            modifier = Modifier.align(Alignment.TopEnd)
        )
        Image(
            painter = painterResource(id = R.drawable.ic_launcher_foreground),
            contentDescription = null
        )
        Text(
            text = "Bottom Start",
            modifier = Modifier.align(Alignment.BottomStart)
        )
        Text(
            text = "Bottom Center",
            modifier = Modifier.align(Alignment.BottomCenter)
        )
        Text(
            text = "Bottom End",
            modifier = Modifier.align(Alignment.BottomEnd)
        )
    }
}

@Preview
@Composable
fun ImageTesterView() {
    ImageWithText()
}
