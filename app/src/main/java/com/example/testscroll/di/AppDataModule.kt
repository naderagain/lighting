package com.example.testscroll.di

import android.content.Context
import androidx.room.Room
import com.example.testscroll.AppMain
import com.example.testscroll.data.UsersRepository
import com.example.testscroll.data.db.AppDatabase
import com.example.testscroll.data.db.UserDao
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.qualifiers.ApplicationContext
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@InstallIn(SingletonComponent::class)
@Module
object AppDataModule {

    @Singleton
    @Provides
    fun provideAppMain(@ApplicationContext context: Context): AppMain {
        return AppMain.instance
    }
    @Singleton
    @Provides
    fun provideUsersDb(@ApplicationContext context: Context): AppDatabase {
        return Room.databaseBuilder(
            context,
            AppDatabase::class.java,
            AppDatabase.DB_NAME
        ).fallbackToDestructiveMigration().build()
    }

    @Singleton
    @Provides
    fun provideUsersDAO(database: AppDatabase): UserDao {
        return database.getUserDao()
    }

    @Singleton
    @Provides
    fun provideRepository(
        userDao: UserDao
    ): UsersRepository {
        return UsersRepository(userDao)
    }
}