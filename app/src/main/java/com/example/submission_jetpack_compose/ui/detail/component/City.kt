package com.example.submission_jetpack_compose.ui.detail.component

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.padding
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Place
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp

@Composable
fun City(
    modifier: Modifier,
    city: String
) {
    Row(modifier = modifier, horizontalArrangement = Arrangement.Start) {
        Icon(imageVector = Icons.Default.Place, contentDescription = null)
        Spacer(modifier = Modifier.padding(2.dp))
        Text(
            text = city,
            style = MaterialTheme.typography.bodyLarge
        )
    }
}