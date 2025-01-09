package com.malek.charioter.screen.listPartage

import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview

@Composable
fun PostsScreen() {
    Text(
        text = "Welcome to Posts Screen",
        style = MaterialTheme.typography.headlineLarge
    )
}

@Preview
@Composable
fun PostsScreenPreview() {
    PostsScreen()
}