package com.fozimat.made.tourismapp.core.domain.usecase

import com.fozimat.made.tourismapp.core.data.Resource
import com.fozimat.made.tourismapp.core.domain.model.Tourism
import kotlinx.coroutines.flow.Flow

interface TourismUseCase {
    fun getAllTourism(): Flow<Resource<List<Tourism>>>
    fun getFavoriteTourism(): Flow<List<Tourism>>
    fun setFavoriteTourism(tourism: Tourism, state: Boolean)
}