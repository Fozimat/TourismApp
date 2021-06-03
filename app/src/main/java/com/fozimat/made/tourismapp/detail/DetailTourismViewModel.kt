package com.fozimat.made.tourismapp.detail

import androidx.lifecycle.ViewModel
import com.fozimat.made.tourismapp.core.domain.model.Tourism
import com.fozimat.made.tourismapp.core.domain.usecase.TourismUseCase

class DetailTourismViewModel(private val tourismUseCase: TourismUseCase) : ViewModel() {
    fun setFavoriteTourism(tourism: Tourism, newStatus: Boolean) =
        tourismUseCase.setFavoriteTourism(tourism, newStatus)
}