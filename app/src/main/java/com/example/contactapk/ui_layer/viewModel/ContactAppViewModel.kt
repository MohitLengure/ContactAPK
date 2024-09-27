package com.example.contactapk.ui_layer.viewModel

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.contactapk.data.repo.Repo
import com.example.contactapk.data.tables.Contact
import com.example.contactapk.ui_layer.state.ContactState
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.SharingStarted
import kotlinx.coroutines.flow.combine

import kotlinx.coroutines.flow.stateIn
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class ContactAppViewModel @Inject constructor(
    private val repo: Repo
):ViewModel() {

  private val contactList=repo.getAllContact().stateIn(
      viewModelScope, SharingStarted.WhileSubscribed(), emptyList()
  )

     private val _state= MutableStateFlow(ContactState())
    val state=combine(_state,contactList)
    {
        _state,contactList->
        _state.copy(contactList=contactList)

    }.stateIn(viewModelScope,SharingStarted.WhileSubscribed(5000), ContactState())

    fun upsertContact(){
        viewModelScope.launch { repo.upsertContact(
            Contact(
            name=state.value.name.value,
            phoneNumber = state.value.phoneNumber.value,
                email = state.value.email.value
                )
        )
    }
    }
}