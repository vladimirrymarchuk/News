package com.example.news.main

import com.example.news.data.ArticlesRepository
import com.example.news.data.models.Article
import kotlinx.coroutines.flow.Flow

class GetAllArticleUseCase(
    private val repository: ArticlesRepository
) {
    operator fun invoke(): Flow<List<Article>> = repository.getAll()
}