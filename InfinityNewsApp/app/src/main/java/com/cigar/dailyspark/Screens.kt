package com.cigar.dailyspark

import android.os.Build
import androidx.annotation.RequiresApi
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp

@RequiresApi(Build.VERSION_CODES.O)
@Composable
fun NewsScreen(articles: List<ArticleData>, name: String) {
    Box(
        modifier = Modifier
            .fillMaxSize()
            .background(Color.White)
            .padding(bottom = 40.dp)
    ) {
        LazyColumn(
            modifier = Modifier
                .padding(4.dp)
                .fillMaxWidth()
        ) {
            item {
                Text(
                    text = "$name Stories",
                    style = MaterialTheme.typography.headlineMedium,
                    modifier = Modifier.padding(vertical = 10.dp, horizontal = 6.dp)
                )
            }
            items(articles) { article ->
                NewsCard(article = article)
            }
        }
    }
}
