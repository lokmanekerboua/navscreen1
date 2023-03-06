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
fun Screen2(navController: NavController) {
    Box(modifier = Modifier.fillMaxSize(), contentAlignment = Alignment.Center) {
        Text(
            modifier = Modifier.clickable {
                /*hna makhdemnach bl navigation kima screen1 khatar fihedi rah takhdem
                kima back button bsah lokhra rayha tholena screen jdida
                navController.popBackStack()*/

                //w edi hiya meuilleur methode
                navController.navigate(Screens.Screen1.route) {
                    popUpTo(Screens.Screen1.route) {
                        inclusive = true
                    }
                }
            },
            text = "Screen2",
            fontSize = 40.sp,
            fontWeight = FontWeight.Bold,
            fontFamily = FontFamily.Default,
            color = Color.Green
        )
    }
}

@Preview(showSystemUi = true, showBackground = true)
@Composable
fun Previewscreen2() {
    Screen2(navController = rememberNavController())
}