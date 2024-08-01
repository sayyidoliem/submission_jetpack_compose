package com.example.submission_jetpack_compose.ui.detail.component

import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontWeight

@Composable
fun Description(
    modifier: Modifier,
    description: String
) {
    Text(
        modifier = modifier,
        text = "Description : ",
        fontWeight = FontWeight.Bold,
        style = MaterialTheme.typography.headlineSmall
    )
    Text(
        modifier = modifier,
        text = description,
        style = MaterialTheme.typography.bodyLarge
    )
}