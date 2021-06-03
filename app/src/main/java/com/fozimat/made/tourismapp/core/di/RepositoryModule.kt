package com.fozimat.made.tourismapp.core.di

import com.fozimat.made.tourismapp.core.data.TourismRepository
import com.fozimat.made.tourismapp.core.domain.repository.ITourismRepository
import dagger.Binds
import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent

@Module(includes = [NetworkModule::class, DatabaseModule::class])
@InstallIn(SingletonComponent::class)
abstract class RepositoryModule {

    @Binds
    abstract fun provideRepository(tourismRepository: TourismRepository): ITourismRepository

}