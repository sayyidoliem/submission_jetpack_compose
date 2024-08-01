package com.example.submission_jetpack_compose.ui.home.component

import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Divider
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.material3.ListItem
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.unit.dp
import coil.compose.AsyncImage

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun HomeListItem(
    modifier: Modifier,
    headLineText: String,
    image: String,
    supportingText: String
) {
    ListItem(
        modifier = modifier,
        headlineText = { Text(text = headLineText) },
        leadingContent = {
            AsyncImage(
                modifier = Modifier
                    .size(56.dp)
                    .clip(RoundedCornerShape(12.dp)),
                model = image,
                contentDescription = null,
                contentScale = ContentScale.Crop
            )
        },
        supportingText = { Text(text = supportingText) }
    )
    Divider()
}