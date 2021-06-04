package com.fozimat.made.tourismapp

import android.app.Application
import com.fozimat.core.di.databaseModule
import com.fozimat.core.di.networkModule
import com.fozimat.core.di.repositoryModule
import com.fozimat.made.tourismapp.di.useCaseModule
import com.fozimat.made.tourismapp.di.viewModelModule
import org.koin.android.ext.koin.androidContext
import org.koin.android.ext.koin.androidLogger
import org.koin.core.context.startKoin
import org.koin.core.logger.Level

class MyApplication : Application() {
    override fun onCreate() {
        super.onCreate()
        startKoin {
            androidLogger(Level.NONE)
            androidContext(this@MyApplication)
            modules(
                listOf(
                    databaseModule,
                    networkModule,
                    repositoryModule,
                    useCaseModule,
                    viewModelModule
                )
            )
        }
    }
}