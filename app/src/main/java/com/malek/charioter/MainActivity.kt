package com.malek.charioter

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Home
import androidx.compose.material.icons.filled.Settings
import androidx.compose.material.icons.filled.ShoppingCart
import androidx.compose.material.icons.outlined.Home
import androidx.compose.material.icons.outlined.Settings
import androidx.compose.material.icons.outlined.ShoppingCart
import androidx.compose.material3.Badge
import androidx.compose.material3.BadgedBox
import androidx.compose.material3.Icon
import androidx.compose.material3.NavigationBar
import androidx.compose.material3.NavigationBarItem
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableIntStateOf
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.compose.rememberNavController
import com.malek.charioter.bootomNavigation.AppNavigation
import com.malek.charioter.ui.theme.CharioterTheme
import com.malek.charioter.bootomNavigation.BottomNavItem


class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            CharioterTheme {
                val navController = rememberNavController()
                var selected by remember { mutableIntStateOf(0) }

                Scaffold(
                    topBar = {

                    },
                    bottomBar = {
                        NavigationBar {
                            bottomNavItems.forEachIndexed { index, bottomNavItem ->
                                NavigationBarItem(
                                    selected = index == selected,
                                    onClick = {
                                        selected = index
                                        navController.navigate(bottomNavItem.route)
                                    },
                                    icon = {
                                        BadgedBox(
                                            badge = {
                                                if (bottomNavItem.badges != 0) {
                                                    Badge {
                                                        Text(bottomNavItem.badges.toString())
                                                    }
                                                } else if (bottomNavItem.hasNews) {
                                                    Badge()
                                                }
                                            }
                                        ) {
                                            Icon(
                                                imageVector = if (index == selected)
                                                    bottomNavItem.selectedIcon
                                                else
                                                    bottomNavItem.unselectedIcon,
                                                contentDescription = bottomNavItem.title
                                            )
                                        }
                                    },
                                    label = { Text(text = bottomNavItem.title) }
                                )
                            }
                        }
                    }
                ) { padding ->
                    Box(modifier = Modifier.fillMaxSize().padding(padding)) {
                        AppNavigation(navController)
                    }
                }
            }
        }
    }
}


val bottomNavItems = listOf(
    BottomNavItem(
        title = "Home",
        route = "home",
        selectedIcon =  Icons.Filled.Home,
        unselectedIcon = Icons.Outlined.Home,
        hasNews = false ,
        badges = 0
    ),
    BottomNavItem(
        title = "Posts",
        route = "posts",
        selectedIcon =  Icons.Filled.ShoppingCart,
        unselectedIcon = Icons.Outlined.ShoppingCart,
        hasNews = false ,
        badges = 5
    ),
    BottomNavItem(
        title = "Settings",
        route = "settings",
        selectedIcon =  Icons.Filled.Settings,
        unselectedIcon = Icons.Outlined.Settings,
        hasNews = true ,
        badges = 0
    ),
)

