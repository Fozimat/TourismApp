package com.fozimat.made.tourismapp.core.data.source.remote.network

import com.fozimat.made.tourismapp.core.data.source.remote.response.ListTourismResponse
import retrofit2.Call
import retrofit2.http.GET

interface ApiService {
    @GET("list")
    fun getList(): Call<ListTourismResponse>
}