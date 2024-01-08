package com.example.a1030_test

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.benchmark.perfetto.Row
import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.a1030_test.ui.theme._1030_testTheme
import androidx.compose.material3.ButtonDefaults


class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            _1030_testTheme {
                MainComponent()
                }
            }
        }

    }


@Composable
fun MainComponent() {
    Column(
        verticalArrangement = Arrangement.Top,
        horizontalAlignment = Alignment.Start,
        modifier = Modifier.fillMaxSize().background(Color(0XFF495E57))
    ) {
        Text(
            text = "Little Lemon",
            fontSize = 32.sp,
            color = Color(0xFFF4CE14)
        )
        Text(
            text = "Chicago",
            fontSize = 24.sp,
            color = Color(0xFFF4CE14)
        )


        Row() {
            Button(
                onClick = { /* Handle button click here */ },
                modifier = Modifier
                    .background(Color.Gray) // Set the background color
                    .padding(8.dp), // Optional padding for better visual appearance
                border = BorderStroke(1.dp, Color.Red),
                shape = RoundedCornerShape(10.dp)
            ) {
                Text(
                    text = "Order Now", // Set the text directly
                    color = Color.Black // Set the text color
                )
            }

        }
    }
}

//Defining color constants
val lightGreen = Color(0XFF495E57)
val lemonYellow = Color(0xFFF4CE14)

@Composable
@Preview
fun MainComponentPreview() {
    MainComponent()
}