package com.example.contactapk.ui_layer.navigation

import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.contactapk.ui_layer.screen.AddEditScreenUI
import com.example.contactapk.ui_layer.screen.HomeScreenUI


@Composable
fun AppNavigation(modifier: Modifier=Modifier)
{
    val navController= rememberNavController()
    NavHost(navController = navController, startDestination = HomeScreen){
        composable<HomeScreen>{
            HomeScreenUI(navController=navController)
        }
        composable<AddEditScreen>{


        }


    }

}