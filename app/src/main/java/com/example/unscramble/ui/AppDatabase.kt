package com.example.unscramble.ui

import androidx.room.Database

@Database(entities = [Word::class], version = 1)
abstract class AppDatabase {
    abstract fun wordDao() : WordDao
}