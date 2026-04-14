package com.example.unscramble.ui

import retrofit2.http.GET
import retrofit2.http.Path

interface WordService {
    @GET("/{language}/words")
    suspend fun getWords(@Path("language") language: String = "en"): List<Word>
}