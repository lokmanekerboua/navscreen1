package com.example.jetnav1

import android.util.Log
import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.NavType
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.navArgument

@Composable
fun SetupNavGraph(navController: NavHostController) {
    NavHost(navController = navController, startDestination = Screens.Screen1.route) {
        composable(
            route = Screens.Screen1.route
        ) {
            Screen1(navController)
        }
        composable(
            route = Screens.Screen2.route,
            arguments = listOf(navArgument(SCREEN1_ARGUMENT1) {
                type = NavType.IntType
            },
                navArgument(SCREEN1_ARGUMENT2) {
                    type = NavType.StringType
                })

        ) {
            Log.d("args", it.arguments?.getInt("id").toString())
            Log.d("args", it.arguments?.getString("name").toString())
            //         Log.d("args", it.arguments?.getInt(DETAIL_ARGUMENT).toString())
            Screen2(navController = navController)
        }
    }
}