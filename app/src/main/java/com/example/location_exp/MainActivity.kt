package com.example.location_exp

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.outlined.Home
import androidx.compose.material.icons.outlined.LocationOn
import androidx.compose.material.icons.outlined.Settings
import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import com.example.location_exp.ui.theme.Location_expTheme
import com.example.location_exp.ui.theme.Purple500

var txt = "Hello World"

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
//            Location_expTheme {
//                // A surface container using the 'background' color from the theme
//                Surface(
//                    modifier = Modifier.fillMaxSize(),
//                    color = MaterialTheme.colors.background
//                ) {
//                    MainScreen()
//                }
//            }
            MainScreen()
        }
    }
}

@Composable
fun MainScreen() {
    Scaffold(
        topBar = {
            MyTopBar()
        },
        bottomBar = { MyBottomNavigationBar() },
        drawerContent = { MyDrawerContent() },
    ) {
        Column(
            modifier = Modifier
                .background(Color.White)
                .fillMaxSize(), horizontalAlignment = Alignment.CenterHorizontally
        ) {
            androidx.compose.material.Text(text = txt)
        }
    }
}

@Composable
fun MyBottomNavigationBar() {
    BottomNavigation(
        backgroundColor = Color.DarkGray,
    ) {
        Row(verticalAlignment = Alignment.CenterVertically) {
            IconButton(onClick = { }, content = {
                Icon(imageVector = Icons.Outlined.LocationOn, contentDescription = "Location",
                tint = Color.White)
            })
            Text(text = txt)
        }


    }
}

@Composable
fun MyDrawerContent() {

}

@Composable
fun MyTopBar() {
    TopAppBar(
        navigationIcon = {
            IconButton(onClick = { }) {
                Icon(imageVector = Icons.Outlined.Settings, contentDescription = "Settings", tint = Color.White)
            }
        },
        title = { Text(text = "MyLocation", color = Color.White) },
        backgroundColor = Color.DarkGray

    )
}

@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    Location_expTheme {
        MainScreen()
    }
}