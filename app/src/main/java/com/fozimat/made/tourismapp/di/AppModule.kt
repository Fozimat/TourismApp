package com.fozimat.made.tourismapp.di

import com.fozimat.made.tourismapp.core.domain.usecase.TourismInteractor
import com.fozimat.made.tourismapp.core.domain.usecase.TourismUseCase
import dagger.Binds
import dagger.Module

@Module
abstract class AppModule {

    @Binds
    abstract fun provideTourismUseCase(tourismInteractor: TourismInteractor): TourismUseCase

}