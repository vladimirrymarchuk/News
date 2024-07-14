package com.example.news.data.models

import java.util.Date

data class Article(
    val id: Long = -1,
    val source: Source,
    val author: String,
    val title: String,
    val description: String,
    val url: String,
    val urlToImage: String,
    val publishedAt: Date,
    val content: String
)

data class Source(
    val id: String,
    val name: String
)