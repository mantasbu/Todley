package com.kotlisoft.todley.ui.screens.main

import androidx.compose.material.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Add
import androidx.compose.runtime.*
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.stringResource
import androidx.navigation.NavController
import com.kotlisoft.todley.R
import com.kotlisoft.todley.navigation.Screen
import com.kotlisoft.todley.ui.theme.fabBackgroundColor
import com.kotlisoft.todley.ui.theme.topAppBarBackgroundColor
import com.kotlisoft.todley.ui.theme.topAppBarContentColor

@Composable
fun MainScreen(navController: NavController) {

    val scaffoldState = rememberScaffoldState()

    Scaffold(
        scaffoldState = scaffoldState,
        topBar = {
             MainAppBar()
        },
        floatingActionButton = {
            AddTaskFab(navController = navController)
        }
    ) {

    }
}

@Composable
fun AddTaskFab(navController: NavController) {
    FloatingActionButton(
        onClick = {
            navController.navigate(Screen.DetailScreen.route)
        },
        backgroundColor = MaterialTheme.colors.fabBackgroundColor
    ) {
        Icon(
            imageVector = Icons.Filled.Add,
            contentDescription = stringResource(id = R.string.add_button),
            tint = Color.White
        )
    }
}