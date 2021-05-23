package com.fozimat.made.tourismapp.home

import androidx.lifecycle.ViewModel
import com.fozimat.made.tourismapp.core.data.TourismRepository

class HomeViewModel(tourismRepository: TourismRepository) : ViewModel() {

    val tourism = tourismRepository.getAllTourism()

}