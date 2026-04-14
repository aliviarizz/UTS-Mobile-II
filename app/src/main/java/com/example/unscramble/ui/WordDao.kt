package com.example.unscramble.ui

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.Query

@Dao
interface WordDao {

    @Query("SELECT * FROM words WHERE isCorrect = 1")
    suspend fun getCorrectWords(): List<Word>

    @Insert
    suspend fun insert(vararg word: Word)

}