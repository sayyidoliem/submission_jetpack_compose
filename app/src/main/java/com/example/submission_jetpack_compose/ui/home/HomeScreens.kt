package com.example.submission_jetpack_compose.ui.home

import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Person
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.ListItem
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import androidx.lifecycle.viewmodel.compose.viewModel
import com.example.submission_jetpack_compose.R
import com.example.submission_jetpack_compose.ui.home.component.HomeListItem
import com.example.submission_jetpack_compose.ui.home.viewmodel.HomeViewModel

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun HomeScreens(
    goToDetail: (name: String?, city: String?, image: String?, desc: String?) -> Unit,
    goToProfile: () -> Unit
) {
    val viewModel = viewModel<HomeViewModel>()
    Scaffold(
        topBar = {
            TopAppBar(
                title = { Text(text = stringResource(id = R.string.app_name)) },
                actions = {
                    IconButton(onClick = { goToProfile() }) {
                        Icon(imageVector = Icons.Default.Person, contentDescription = "about_page")
                    }
                },
            )
        }
    ) {
        LazyColumn(modifier = Modifier.padding(it)) {
            items(viewModel.getData().size) { index ->
                HomeListItem(
                    modifier = Modifier.clickable {
                        goToDetail(
                            viewModel.getData()[index].headlineText,
                            viewModel.getData()[index].supportingText,
                            viewModel.getData()[index].imageUrl,
                            viewModel.getData()[index].description
                        )
                    },
                    headLineText = viewModel.getData()[index].headlineText,
                    image = viewModel.getData()[index].imageUrl,
                    supportingText = viewModel.getData()[index].supportingText
                )
            }
        }
    }
}