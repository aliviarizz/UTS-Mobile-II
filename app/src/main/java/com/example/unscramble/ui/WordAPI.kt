package com.example.unscramble.ui

import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

object WordAPI {
    val retrofit: Retrofit? = Retrofit
        .Builder()
        .addConverterFactory(
        GsonConverterFactory.create()).build()

    val service = retrofit?.create<WordService>(WordService::class.java)
}