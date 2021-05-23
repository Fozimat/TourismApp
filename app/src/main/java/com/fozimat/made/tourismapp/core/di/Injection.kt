package com.fozimat.made.tourismapp.core.di

import android.content.Context

import com.fozimat.made.tourismapp.core.data.source.local.LocalDataSource
import com.fozimat.made.tourismapp.core.data.source.local.room.TourismDatabase

import com.fozimat.made.tourismapp.core.data.TourismRepository
import com.fozimat.made.tourismapp.core.data.source.remote.RemoteDataSource
import com.fozimat.made.tourismapp.core.utils.AppExecutors
import com.fozimat.made.tourismapp.core.utils.JsonHelper

object Injection {
    fun provideRepository(context: Context): TourismRepository {
        val database = TourismDatabase.getInstance(context)

        val remoteDataSource = RemoteDataSource.getInstance(JsonHelper(context))
        val localDataSource = LocalDataSource.getInstance(database.tourismDao())
        val appExecutors = AppExecutors()

        return TourismRepository.getInstance(remoteDataSource, localDataSource, appExecutors)
    }
}
