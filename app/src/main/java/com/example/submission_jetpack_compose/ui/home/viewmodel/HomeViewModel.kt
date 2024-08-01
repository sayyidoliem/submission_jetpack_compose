package com.example.submission_jetpack_compose.ui.home.viewmodel

import androidx.lifecycle.ViewModel
import com.example.submission_jetpack_compose.data.DataBus
import com.example.submission_jetpack_compose.data.DataBus.data

class HomeViewModel : ViewModel() {

    fun getData(): List<DataBus.HomeListItemData> {
        return data
    }

}