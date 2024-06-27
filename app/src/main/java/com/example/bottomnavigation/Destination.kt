package com.example.bottomnavigation

import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Home
import androidx.compose.material.icons.filled.Settings
import androidx.compose.ui.graphics.vector.ImageVector

interface Destination {
    val route: String
    val icon: ImageVector
    val title: String

}

object Home: Destination{
    override val route = "Home"
    override val icon = Icons.Filled.Home
    override val title =  "Home"
}

object Setting: Destination{
    override val route = "Setting"
    override val icon = Icons.Filled.Settings
    override val title =  "Setting"
}