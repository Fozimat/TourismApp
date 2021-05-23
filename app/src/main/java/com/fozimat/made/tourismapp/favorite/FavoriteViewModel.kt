package com.fozimat.made.tourismapp.favorite

import androidx.lifecycle.ViewModel
import com.fozimat.made.tourismapp.core.data.TourismRepository
import com.fozimat.made.tourismapp.core.domain.usecase.TourismUseCase

class FavoriteViewModel(tourismUseCase: TourismUseCase) : ViewModel() {

    val favoriteTourism = tourismUseCase.getFavoriteTourism()
}