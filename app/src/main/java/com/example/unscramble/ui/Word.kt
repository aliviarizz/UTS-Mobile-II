package com.example.unscramble.ui

import androidx.room.ColumnInfo
import androidx.room.Entity
import com.google.gson.annotations.SerializedName

@Entity("words")
data class Word(
    @field:SerializedName("currentWord")
    val currentWord: String? = null,
)
