package com.chatzy.app

import android.app.Application
import dagger.hilt.android.HiltAndroidApp

@HiltAndroidApp
class ChatzyApplication : Application() {
    override fun onCreate() {
        super.onCreate()
        // Init logging, crashlytics, etc.
    }
}
