package com.example.android_returns.application

import android.app.Application
import io.ktor.client.HttpClient
import io.ktor.client.engine.android.Android

class AppsApplication : Application() {

    override fun onCreate() {
        super.onCreate()
        instance = this;
    }

    companion object {
        private var instance: AppsApplication? = null

        fun getInstance() = instance
    }

    fun getHttpClient() = HttpClient(Android) {

    }
}