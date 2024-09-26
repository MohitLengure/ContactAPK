package com.example.contactapk.ui_layer.viewModel

import androidx.lifecycle.ViewModel
import com.example.contactapk.data.repo.Repo
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

@HiltViewModel
class ContactAppViewModel @Inject constructor(
    private val repo: Repo
):ViewModel() {
    

}