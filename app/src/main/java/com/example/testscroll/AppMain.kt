package com.example.testscroll

import android.app.Application
import dagger.hilt.android.HiltAndroidApp

@HiltAndroidApp
class AppMain : Application() {

    override fun onCreate() {
        super.onCreate()
        instance = this

    }



    companion object {
        lateinit var instance: AppMain
    }
}