package com.example.submission_jetpack_compose.ui.profile

import android.graphics.drawable.shapes.Shape
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.defaultMinSize
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.verticalScroll
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
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import com.example.submission_jetpack_compose.R

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun ProfileScreens(goBack: () -> Unit) {
    val scrollableState = rememberScrollState()
    Scaffold(
        topBar = {
            TopAppBar(
                title = { Text(text = "About Me") },
                navigationIcon = {
                    IconButton(onClick = { goBack() }) {
                        Icon(imageVector = Icons.Default.ArrowBack, contentDescription = "about_page")
                    }
                }
            )
        }
    ) {
        Column(
            modifier = Modifier
                .verticalScroll(scrollableState)
                .padding(it)
                .fillMaxSize(),
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.Center
        ) {
            Image(
                modifier = Modifier
                    .defaultMinSize(minWidth = 100.dp, minHeight = 100.dp)
                    .size(300.dp)
                    .clip(RoundedCornerShape(20.dp)),
                painter = painterResource(id = R.drawable.foto),
                contentDescription = "Profile Photo"
            )
            Spacer(modifier = Modifier.padding(8.dp))
            Text(
                text = "Sayyid Muhammad".uppercase(),
                fontWeight = FontWeight.Bold,
                style = MaterialTheme.typography.headlineMedium
            )
            Text(
                text = "sayyid.olim12@gmail.com",
                style = MaterialTheme.typography.titleMedium
            )
            Spacer(modifier = Modifier.padding(16.dp))
        }
    }
}