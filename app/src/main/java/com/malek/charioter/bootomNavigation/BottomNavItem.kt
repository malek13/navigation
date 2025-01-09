package com.malek.charioter.bootomNavigation

import androidx.compose.ui.graphics.vector.ImageVector

data class  BottomNavItem(
    val title: String,
    val route: String,
    val selectedIcon : ImageVector,
    val unselectedIcon: ImageVector,
    val hasNews: Boolean,
    val badges: Int
)