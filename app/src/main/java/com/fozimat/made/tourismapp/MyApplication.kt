package com.fozimat.made.tourismapp

import android.app.Application
import com.fozimat.made.tourismapp.core.di.CoreComponent
import com.fozimat.made.tourismapp.core.di.DaggerCoreComponent
import com.fozimat.made.tourismapp.di.AppComponent
import com.fozimat.made.tourismapp.di.DaggerAppComponent

open class MyApplication : Application() {

    private val coreComponent: CoreComponent by lazy {
        DaggerCoreComponent.factory().create(applicationContext)
    }

    val appComponent: AppComponent by lazy {
        DaggerAppComponent.factory().create(coreComponent)
    }
}