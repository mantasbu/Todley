package com.kotlisoft.todley.ui.screens.task

import androidx.compose.material.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.runtime.Composable
import androidx.compose.ui.res.stringResource
import androidx.navigation.NavController
import com.kotlisoft.todley.R
import com.kotlisoft.todley.ui.theme.topAppBarBackgroundColor
import com.kotlisoft.todley.ui.theme.topAppBarContentColor

@Composable
fun TaskAppBar(navController: NavController) {
    TopAppBar(
        navigationIcon = {
             BackIcon {
                 navController.popBackStack()
             }
        },
        title = {
            Text(
                text = stringResource(id = R.string.task),
                color = MaterialTheme.colors.topAppBarContentColor
            )
        },
        backgroundColor = MaterialTheme.colors.topAppBarBackgroundColor
    )
}

@Composable
fun BackIcon(
    onBackClicked: () -> Unit
) {
    IconButton(onClick = { onBackClicked() }) {
        Icon(
            imageVector = Icons.Filled.ArrowBack,
            contentDescription = stringResource(id = R.string.back_arrow),
            tint = MaterialTheme.colors.topAppBarContentColor
        )
    }
}