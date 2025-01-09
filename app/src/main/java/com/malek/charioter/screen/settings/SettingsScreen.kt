package com.malek.charioter.screen.settings

import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview

@Composable
fun SettingsScreen() {
    Text(
        text = "Welcome to Settings Screen",
        style = MaterialTheme.typography.headlineLarge
    )
}

@Preview
@Composable
fun SettingsScreenPreview() {
    SettingsScreen()
}