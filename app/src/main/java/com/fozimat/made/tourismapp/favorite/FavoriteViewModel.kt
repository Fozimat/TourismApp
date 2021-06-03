package com.fozimat.made.tourismapp.favorite

import androidx.lifecycle.ViewModel
import androidx.lifecycle.asLiveData
import com.fozimat.made.tourismapp.core.domain.usecase.TourismUseCase
import javax.inject.Inject

class FavoriteViewModel @Inject constructor(tourismUseCase: TourismUseCase) : ViewModel() {

    val favoriteTourism = tourismUseCase.getFavoriteTourism().asLiveData()
}