package com.cigar.dailyspark

data class NewsItem(
    val status: String,
    val totalResults: Int,
    val articles: List<ArticleData>
)