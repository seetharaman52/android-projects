package com.cigar.dailyspark

import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.horizontalScroll
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp

@Composable
fun BottomNavigationBar(selectedCategory: String, onCategorySelected: (String) -> Unit) {
    Row(
        modifier = Modifier
            .fillMaxWidth()
            .height(42.dp)
            .background(Color.Black)
            .horizontalScroll(rememberScrollState()),
        horizontalArrangement = Arrangement.SpaceAround,
        verticalAlignment = Alignment.CenterVertically
    ) {
        val categories = listOf("General", "Business", "Sports", "Science", "Entertainment", "Technology", "Health")
        categories.forEach { category ->
            Text(
                text = category,
                color = Color.White,
                modifier = Modifier
                    .padding(horizontal = 10.dp)
                    .background(if (category == selectedCategory) Color.Red else Color.Transparent, shape = RoundedCornerShape(20.dp))
                    .padding(top = 6.dp, bottom = 6.dp, start = 8.dp, end = 8.dp)
                    .clickable { onCategorySelected(category) }
            )
        }
    }
}
