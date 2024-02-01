package com.example.testscroll.ui.userdetails

import android.app.Application
import androidx.lifecycle.AndroidViewModel
import com.example.testscroll.data.UsersRepository
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject
@HiltViewModel
class UserDetailsViewModel @Inject constructor(val repository: UsersRepository, application: Application) :
    AndroidViewModel(application){
}