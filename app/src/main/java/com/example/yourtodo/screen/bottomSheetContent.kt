package com.example.yourtodo.screen

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.rounded.Add
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.unit.dp
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import com.example.yourtodo.R

@Composable
fun BottomSheetContent() {
    Column(
        modifier = Modifier
            .fillMaxWidth()
            .padding(16.dp),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Spacer(modifier = Modifier.height(16.dp))
        Column {
            Button(
                onClick = { /* Handle button click */ }
            ) {
                Icon(Icons.Rounded.Add, contentDescription = "Add")
                Text("Add")
            }
            Spacer(modifier = Modifier.height(16.dp))
            Image(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(8.dp)
                    .padding(16.dp),
                painter = painterResource(id = R.drawable.todo),
                contentDescription = null
            )
        }
    }
}