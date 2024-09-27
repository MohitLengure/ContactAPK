package com.example.contactapk.ui_layer.state

import androidx.compose.runtime.MutableState
import androidx.compose.runtime.mutableStateOf
import com.example.contactapk.data.tables.Contact


data class ContactState(

    val contactList:List<Contact> = emptyList(),
    val id:MutableState<Int?> = mutableStateOf(null),
    val name:MutableState<String> = mutableStateOf(""),
    val email:MutableState<String> = mutableStateOf(""),
    val phoneNumber:MutableState<String> = mutableStateOf("")

)
