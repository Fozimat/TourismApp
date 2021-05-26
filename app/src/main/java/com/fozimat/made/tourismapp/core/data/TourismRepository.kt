package com.fozimat.made.tourismapp.core.data

import com.fozimat.made.tourismapp.core.data.source.local.LocalDataSource
import com.fozimat.made.tourismapp.core.data.source.remote.RemoteDataSource
import com.fozimat.made.tourismapp.core.data.source.remote.network.ApiResponse
import com.fozimat.made.tourismapp.core.data.source.remote.response.TourismResponse
import com.fozimat.made.tourismapp.core.domain.model.Tourism
import com.fozimat.made.tourismapp.core.domain.repository.ITourismRepository
import com.fozimat.made.tourismapp.core.utils.AppExecutors
import com.fozimat.made.tourismapp.core.utils.DataMapper
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.map

class TourismRepository(
    private val remoteDataSource: RemoteDataSource,
    private val localDataSource: LocalDataSource,
    private val appExecutors: AppExecutors
) : ITourismRepository {

    override fun getAllTourism(): Flow<Resource<List<Tourism>>> =
        object : NetworkBoundResource<List<Tourism>, List<TourismResponse>>(appExecutors) {
            override fun loadFromDB(): Flow<List<Tourism>> {
                return localDataSource.getAllTourism().map { DataMapper.mapEntitiesToDomain(it) }
            }

            override fun shouldFetch(data: List<Tourism>?): Boolean =
                data == null || data.isEmpty()

            override suspend fun createCall(): Flow<ApiResponse<List<TourismResponse>>> =
                remoteDataSource.getAllTourism()

            override suspend fun saveCallResult(data: List<TourismResponse>) {
                val tourismList = DataMapper.mapResponsesToEntities(data)
                localDataSource.insertTourism(tourismList)
            }
        }.asFlow()

    override fun getFavoriteTourism(): Flow<List<Tourism>> {
        return localDataSource.getFavoriteTourism().map { DataMapper.mapEntitiesToDomain(it) }
    }

    override fun setFavoriteTourism(tourism: Tourism, state: Boolean) {
        val tourismEntity = DataMapper.mapDomainToEntity(tourism)
        appExecutors.diskIO().execute { localDataSource.setFavoriteTourism(tourismEntity, state) }
    }
}

