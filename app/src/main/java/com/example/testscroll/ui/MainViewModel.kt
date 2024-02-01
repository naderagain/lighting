package com.example.testscroll.ui

import android.app.Application
import androidx.lifecycle.AndroidViewModel
import androidx.lifecycle.viewModelScope
import com.example.testscroll.data.UsersRepository
import com.example.testscroll.data.db.entity.User
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class MainViewModel @Inject constructor(val repository: UsersRepository, application: Application) :
    AndroidViewModel(application) {
    init {
        insertDummyUserData()
    }

    private fun insertDummyUserData() {
        viewModelScope.launch {
            repository.addNewUser(
                User(userId = 1,
                    profileImage = "https://images.pexels.com/photos/2955375/pexels-photo-2955375.jpeg",
                    userName = "abelard_123",
                    email = "abelard123@gmail.com",
                    name = "Abelard"
                )
            )
            repository.addNewUser(
                User(userId = 2,
                    profileImage = "https://images.pexels.com/photos/3782207/pexels-photo-3782207.jpeg",
                    userName = "grayson_908",
                    email = "Grayson_908@gmail.com",
                    name = "Grayson"
                )
            )
            repository.addNewUser(
                User(userId = 3,
                    profileImage = "https://images.pexels.com/photos/6326216/pexels-photo-6326216.jpeg?auto=compress&cs=tinysrgb&w=1260&h=750&dpr=2",
                    userName = "abc123",
                    email = "abc123@gmail.com",
                    name = "Abc"
                )
            )
            repository.addNewUser(
                User(userId = 4,
                    profileImage = "https://images.pexels.com/photos/3394347/pexels-photo-3394347.jpeg?auto=compress&cs=tinysrgb&w=1260&h=750&dpr=2",
                    userName = "malcolm_m",
                    email = "malcolm_m@gmail.com",
                    name = "Malcolm"
                )
            )
            repository.addNewUser(
                User(userId = 5,
                    profileImage = "https://images.pexels.com/photos/5456790/pexels-photo-5456790.jpeg?auto=compress&cs=tinysrgb&w=1260&h=750&dpr=2",
                    userName = "valentin123",
                    email = "valentin123@gmail.com",
                    name = "Valentin"
                )
            )
            repository.addNewUser(
                User(userId = 6,
                    profileImage = "https://images.pexels.com/photos/3400560/pexels-photo-3400560.jpeg?auto=compress&cs=tinysrgb&w=1200",
                    userName = "clemens_143",
                    email = "clemens_143@gmail.com",
                    name = "Clemens"
                )
            )
            repository.addNewUser(
                User(userId = 7,
                    profileImage = "https://images.pexels.com/photos/4551583/pexels-photo-4551583.jpeg?auto=compress&cs=tinysrgb&w=1200",
                    userName = "ismael_234",
                    email = "ismael@gmail.com",
                    name = "Ismael"
                )
            )
            repository.addNewUser(
                User(userId = 8,
                    profileImage = "https://images.pexels.com/photos/9464626/pexels-photo-9464626.jpeg?auto=compress&cs=tinysrgb&w=1200",
                    userName = "abc123",
                    email = "abc123@gmail.com",
                    name = "Abc"
                )
            )
            repository.addNewUser(
                User(userId = 9,
                    profileImage = "https://images.pexels.com/photos/8729954/pexels-photo-8729954.jpeg?auto=compress&cs=tinysrgb&w=1200",
                    userName = "kristoffer_o",
                    email = "kristoffer1992@gmail.com",
                    name = "Kristoffer"
                )
            )
            repository.addNewUser(
                User(userId = 10,
                    profileImage = "https://images.pexels.com/photos/8416406/pexels-photo-8416406.jpeg?auto=compress&cs=tinysrgb&w=1200",
                    userName = "matteus_123",
                    email = "matteus123@gmail.com",
                    name = "Matteus"
                )
            )

        }
    }
}