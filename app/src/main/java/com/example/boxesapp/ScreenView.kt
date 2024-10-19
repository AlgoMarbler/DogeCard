package com.example.boxesapp

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

@Composable
fun Screen(centerDeviation: Int) {
    Box(
        modifier = Modifier.fillMaxSize(),
        contentAlignment = Alignment.Center
    ) {
        Text(
            text = "Hello World!",
            modifier = Modifier.align(Alignment.TopStart).padding(centerDeviation.dp)
        )
        Text(
            text = "Bye World!",
            modifier = Modifier.align(Alignment.TopEnd).padding(centerDeviation.dp)
        )
        Text(
            text = "Hello World!",
            modifier = Modifier.align(Alignment.CenterStart).padding(centerDeviation.dp)
        )
        Text(
            text = "Bye World!",
            modifier = Modifier.align(Alignment.CenterEnd).padding(centerDeviation.dp)
        )
        Text(
            text = "Hello World!",
            modifier = Modifier.align(Alignment.BottomStart).padding(centerDeviation.dp)
        )
        Text(
            text = "Bye World!",
            modifier = Modifier.align(Alignment.BottomEnd).padding(centerDeviation.dp)
        )
    }
}

@Preview
@Composable
fun ScreenPreview() {
    Screen(20)
}