package com.cigar.dailyspark

import android.annotation.SuppressLint
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.core.splashscreen.SplashScreen.Companion.installSplashScreen
import kotlinx.coroutines.runBlocking

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        installSplashScreen()
        super.onCreate(savedInstanceState)
        setContent {
            var selectedCategory by remember { mutableStateOf("General") }
            var articles by remember { mutableStateOf(emptyList<ArticleData>()) }
            val news = RetrofitHelper.getInstance().create(RetrofitInterface::class.java)

            LaunchedEffect(selectedCategory) {
                articles = when (selectedCategory) {
                    "Business" -> runBlocking { news.getBusinessNews().body()?.articles ?: emptyList() }
                    "Sports" -> runBlocking { news.getSportsNews().body()?.articles ?: emptyList() }
                    "Science" -> runBlocking { news.getScienceNews().body()?.articles ?: emptyList() }
                    "Entertainment" -> runBlocking { news.getEntertainmentNews().body()?.articles ?: emptyList() }
                    "Technology" -> runBlocking { news.getTechnologyNews().body()?.articles ?: emptyList() }
                    "Health" -> runBlocking { news.getHealthNews().body()?.articles ?: emptyList() }
                    else -> runBlocking { news.getGeneralNews().body()?.articles ?: emptyList() }
                }
            }
            MyApp(
                articles = articles,
                selectedCategory = selectedCategory,
                onCategorySelected = { category ->
                    selectedCategory = category
                }
            )
        }
    }
}

@SuppressLint("UnusedMaterial3ScaffoldPaddingParameter")
@Composable
fun MyApp(articles: List<ArticleData>, selectedCategory: String, onCategorySelected: (String) -> Unit) {
    Scaffold(
        bottomBar = {
            BottomNavigationBar(selectedCategory = selectedCategory, onCategorySelected = onCategorySelected)
        }
    ) {
        NewsScreen(articles = articles, name = selectedCategory)
    }
}

/*
@Composable
fun ErrorScreen() {
    Text(text = "Failed to fetch data", style = typography.titleLarge)
}
*/