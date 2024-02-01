package com.example.testscroll.ui.userslist

import android.app.Application
import androidx.lifecycle.AndroidViewModel
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.viewModelScope
import com.example.testscroll.data.UsersRepository
import com.example.testscroll.data.db.entity.User
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class UsersListViewModel @Inject constructor(
    val repository: UsersRepository,
    application: Application
) : AndroidViewModel(application) {
}