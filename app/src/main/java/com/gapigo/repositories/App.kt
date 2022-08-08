package com.gapigo.repositories

import android.app.Application
import com.gapigo.repositories.data.di.DataModule
import com.gapigo.repositories.domain.di.DomainModule
import com.gapigo.repositories.presentation.di.PresentationModule
import org.koin.android.ext.koin.androidContext
import org.koin.core.context.startKoin


class App : Application() {
    override fun onCreate() {
        super.onCreate()

        startKoin {
            androidContext(this@App)
        }

        DataModule.load()
        DomainModule.load()
        PresentationModule.load()
    }
}