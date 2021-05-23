package com.fozimat.made.tourismapp.core.domain.usecase

import androidx.lifecycle.LiveData
import com.fozimat.made.tourismapp.core.data.Resource
import com.fozimat.made.tourismapp.core.domain.model.Tourism
import com.fozimat.made.tourismapp.core.domain.repository.ITourismRepository

class TourismInteractor(private val tourismRepository: ITourismRepository) : TourismUseCase {
    override fun getAllTourism(): LiveData<Resource<List<Tourism>>> =
        tourismRepository.getAllTourism()


    override fun getFavoriteTourism(): LiveData<List<Tourism>> =
        tourismRepository.getFavoriteTourism()


    override fun setFavoriteTourism(tourism: Tourism, state: Boolean) =
        tourismRepository.setFavoriteTourism(tourism, state)

}