package com.fozimat.made.tourismapp.di

import com.fozimat.made.tourismapp.core.domain.usecase.TourismInteractor
import com.fozimat.made.tourismapp.core.domain.usecase.TourismUseCase
import com.fozimat.made.tourismapp.detail.DetailTourismViewModel
import com.fozimat.made.tourismapp.favorite.FavoriteViewModel
import com.fozimat.made.tourismapp.home.HomeViewModel
import org.koin.android.viewmodel.dsl.viewModel
import org.koin.dsl.module

val useCaseModule = module {
    factory<TourismUseCase> { TourismInteractor(get()) }
}

val viewModelModule = module {
    viewModel { HomeViewModel(get()) }
    viewModel { FavoriteViewModel(get()) }
    viewModel { DetailTourismViewModel(get()) }
}