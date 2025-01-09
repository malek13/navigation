package com.malek.charioter.bootomNavigation

import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import com.malek.charioter.screen.list.HomeScreen
import com.malek.charioter.screen.listPartage.PostsScreen
import com.malek.charioter.screen.settings.SettingsScreen

@Composable
fun AppNavigation(navController: NavHostController) {
    NavHost(
        navController = navController,
        startDestination = "home"
    ) {
        composable("home") { HomeScreen() }
        composable("posts") { PostsScreen() }
        composable("settings") { SettingsScreen() }
    }
}