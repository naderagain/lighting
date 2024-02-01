package com.example.testscroll.data

import androidx.lifecycle.LiveData
import com.example.testscroll.data.db.AppDatabase
import com.example.testscroll.data.db.UserDao
import com.example.testscroll.data.db.entity.User

class UsersRepository(private val userDao: UserDao) {
    suspend fun addNewUser(user: User) = userDao.addUser(user)
    fun getAllUsers(): LiveData<List<User>> = userDao.getAllUsers()

}