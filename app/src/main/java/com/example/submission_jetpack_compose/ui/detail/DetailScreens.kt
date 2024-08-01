package com.example.submission_jetpack_compose.ui.detail

import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.defaultMinSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import coil.compose.AsyncImage
import com.example.submission_jetpack_compose.ui.detail.component.City
import com.example.submission_jetpack_compose.ui.detail.component.Description

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun DetailScreens(
    goBack: () -> Unit,
    nameBus: String,
    cityBus: String,
    imageBus: String,
    descriptionBus: String
) {
    Scaffold(
        topBar = {
            TopAppBar(
                title = { Text(text = nameBus) },
                navigationIcon = {
                    IconButton(onClick = { goBack() }) {
                        Icon(
                            imageVector = Icons.Default.ArrowBack,
                            contentDescription = "navigate to back"
                        )
                    }
                },
            )
        }
    ) {
        LazyColumn(modifier = Modifier.padding(it)) {
            item {
                AsyncImage(
                    modifier = Modifier
                        .fillMaxWidth()
                        .clip(shape = RoundedCornerShape(12.dp))
                        .defaultMinSize(minHeight = 200 .dp),
                    model = imageBus,
                    contentDescription = null
                )
            }
            item {
                Text(
                    modifier = Modifier.padding(horizontal = 16.dp, vertical = 8.dp),
                    text = nameBus,
                    fontWeight = FontWeight.Bold,
                    style = MaterialTheme.typography.headlineLarge
                )
                City(modifier = Modifier.padding(horizontal = 16.dp), city = cityBus)
                Spacer(modifier = Modifier.padding(12.dp))
                Description(
                    modifier = Modifier.padding(horizontal = 16.dp),
                    description = descriptionBus
                )
            }
        }
    }
}