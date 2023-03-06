package com.example.jetnav1

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController
import com.example.jetnav1.ui.theme.Jetnav1Theme

class MainActivity : ComponentActivity() {
    lateinit var navController: NavHostController
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Jetnav1Theme {
                navController = rememberNavController()
                //SetupNavGraph hiya fun li dertha ana fl file navGraph
                SetupNavGraph(navController = navController)
            }
        }
    }
}
