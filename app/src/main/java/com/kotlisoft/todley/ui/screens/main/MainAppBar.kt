package com.kotlisoft.todley.ui.screens.main

import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.material.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.ui.res.stringResource
import com.kotlisoft.todley.R
import com.kotlisoft.todley.ui.theme.topAppBarBackgroundColor
import com.kotlisoft.todley.ui.theme.topAppBarContentColor

@Composable
fun MainAppBar() {
    TopAppBar(
        title = {
            Text(
                text = stringResource(id = R.string.main_screen_title),
                color = MaterialTheme.colors.topAppBarContentColor
            )
        },
        backgroundColor = MaterialTheme.colors.topAppBarBackgroundColor
    )
}