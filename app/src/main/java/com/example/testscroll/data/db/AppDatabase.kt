package com.example.testscroll.data.db

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase
import com.example.testscroll.data.db.entity.User

@Database(entities = [User::class], version = 1)
abstract class AppDatabase : RoomDatabase() {
    abstract fun getUserDao(): UserDao
    companion object{
        const val DB_NAME = "users_database.db"
    }
}