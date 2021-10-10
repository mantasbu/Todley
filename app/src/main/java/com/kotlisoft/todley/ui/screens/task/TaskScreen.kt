package com.kotlisoft.todley.ui.screens.task

import androidx.compose.material.*
import androidx.compose.runtime.*
import androidx.navigation.NavHostController

@Composable
fun TaskScreen(
    navController: NavHostController,
) {
    val scaffoldState = rememberScaffoldState()

    Scaffold(
        scaffoldState = scaffoldState,
        topBar = {
            TaskAppBar(navController = navController)
        }
    ) {

    }
}