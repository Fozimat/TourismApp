package com.fozimat.made.tourismapp.core.domain.usecase

import androidx.lifecycle.LiveData
import com.fozimat.made.tourismapp.core.data.Resource
import com.fozimat.made.tourismapp.core.domain.model.Tourism

interface TourismUseCase {
    fun getAllTourism(): LiveData<Resource<List<Tourism>>>
    fun getFavoriteTourism(): LiveData<List<Tourism>>
    fun setFavoriteTourism(tourism: Tourism, state: Boolean)
}