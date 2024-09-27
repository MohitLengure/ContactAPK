package com.example.contactapk.ui_layer.screen

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material3.Card
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.hilt.navigation.compose.hiltViewModel
import androidx.navigation.NavController
import com.example.contactapk.ui_layer.viewModel.ContactAppViewModel
import androidx.compose.ui.Modifier


@Composable
fun HomeScreenUI(navController: NavController,viewModel: ContactAppViewModel= hiltViewModel()) {

    Scaffold {
        LazyColumn(
           modifier = Modifier.padding(it)
        ) {
            items(viewModel.state.value.contactList.size) {
                Card(onClick = { /*TODO*/ }){
                    Column {
                        Text(text = it.name)
                        Text(text = it.phoneNumber)
                    }
                }
            }
            }
        }
    }


