package com.fozimat.made.tourismapp.home

import androidx.lifecycle.ViewModel
import com.fozimat.made.tourismapp.core.domain.usecase.TourismUseCase

class HomeViewModel(tourismUseCase: TourismUseCase) : ViewModel() {

    val tourism = tourismUseCase.getAllTourism()

}