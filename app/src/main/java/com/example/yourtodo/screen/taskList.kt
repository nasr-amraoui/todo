package com.example.yourtodo.screen

import androidx.compose.runtime.Composable
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Favorite
import androidx.compose.material.icons.filled.Home
import androidx.compose.material.icons.filled.Info
import androidx.compose.material.icons.filled.Settings
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.yourtodo.data.Item

@Preview(showBackground = true)
@Composable
fun DefaultPreviews() {
    TaskList()
}

@Composable
fun TaskList() {
    Surface(
        modifier = Modifier.fillMaxWidth(),
        color = Color.White
    ) {
        val items = listOf(
            Item("Home", Icons.Default.Home),
            Item("Favorites", Icons.Default.Favorite),
            Item("Settings", Icons.Default.Settings),
            Item("About", Icons.Default.Info)
        )
        ItemList(items = items)
    }
}

@Composable
fun ItemList(items: List<Item>) {
    LazyColumn {
        items(items) { item ->
            ListItem(item = item)
        }
    }
}

@Composable
fun ListItem(item: Item) {
    Row(
        modifier = Modifier
            .fillMaxWidth()
            .padding(16.dp),
        verticalAlignment = Alignment.CenterVertically
    ) {
        Icon(
            imageVector = item.icon,
            contentDescription = item.text,
            modifier = Modifier.padding(end = 16.dp)
        )
    }
}