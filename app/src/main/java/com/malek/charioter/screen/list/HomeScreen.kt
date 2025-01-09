package com.malek.charioter.screen.list

import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.material3.MaterialTheme

@Composable
fun HomeScreen() {
    Text(
        text = "Welcome to Home Screen",
        style = MaterialTheme.typography.headlineLarge
    )
}

@Preview
@Composable
fun HomeScreenPreview() {
    HomeScreen()
}