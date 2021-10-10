package com.kotlisoft.todley

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController
import com.kotlisoft.todley.navigation.SetupNavGraph
import com.kotlisoft.todley.ui.theme.TodleyTheme

class MainActivity : ComponentActivity() {

    private lateinit var navController: NavHostController

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            TodleyTheme {
                navController = rememberNavController()
                SetupNavGraph(navController = navController)
            }
        }
    }
}