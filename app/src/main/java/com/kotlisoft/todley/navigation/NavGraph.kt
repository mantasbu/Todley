package com.kotlisoft.todley.navigation

import androidx.compose.runtime.*
import androidx.navigation.NavHostController
import androidx.navigation.NavType
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.navArgument
import com.kotlisoft.todley.ui.screens.task.TaskScreen
import com.kotlisoft.todley.ui.screens.main.MainScreen

@Composable
fun SetupNavGraph(
    navController: NavHostController
) {
    NavHost(
        navController = navController,
        startDestination = Screen.MainScreen.route
    ) {
        composable(route = Screen.MainScreen.route) {
            MainScreen(navController = navController)
        }
        composable(
            route = Screen.DetailScreen.route + "?id={id}", // "/{id}"
            arguments = listOf(
                navArgument("id") {
                    type = NavType.IntType
                    defaultValue = -1
                    nullable = false
                }
            )
        ) { entry ->
            TaskScreen(
                navController = navController
            )
        }
    }
}