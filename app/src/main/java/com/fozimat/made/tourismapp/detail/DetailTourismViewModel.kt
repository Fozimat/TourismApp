package com.fozimat.made.tourismapp.detail

import androidx.lifecycle.ViewModel
import com.fozimat.made.tourismapp.core.data.TourismRepository
import com.fozimat.made.tourismapp.core.data.source.local.entity.TourismEntity

class DetailTourismViewModel(private val tourismRepository: TourismRepository) : ViewModel() {
    fun setFavoriteTourism(tourism: TourismEntity, newStatus:Boolean) = tourismRepository.setFavoriteTourism(tourism, newStatus)
}