package com.fozimat.made.tourismapp.favorite

import androidx.lifecycle.ViewModel
import com.fozimat.made.tourismapp.core.data.TourismRepository

class FavoriteViewModel(tourismRepository: TourismRepository) : ViewModel() {

    val favoriteTourism = tourismRepository.getFavoriteTourism()
}