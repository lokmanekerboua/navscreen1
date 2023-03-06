package com.example.jetnav1

import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController

@Composable
fun Screen1(navcontroller: NavController) {
    Box(modifier = Modifier.fillMaxSize(), contentAlignment = Alignment.Center) {
        Text(
            modifier = Modifier.clickable {
//              navcontroller.navigate(route = Screens.Screen2.route)
//              navcontroller.navigate(route = "screen_2/"+1)
                navcontroller.navigate(route = Screens.Screen2.passIdName(12,"Lokmane"))
            },
            text = "Screen1",
            fontSize = 40.sp,
            fontWeight = FontWeight.Bold,
            fontFamily = FontFamily.Default,
            color = Color.Red
        )
    }
}

@Preview(showSystemUi = true, showBackground = true)
@Composable
fun Previewscreen() {
    Screen1(navcontroller = rememberNavController())
}