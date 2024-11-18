package com.example.amphibians.network

import retrofit2.http.GET

interface AmphibiansApiService {
    @GET(value = "amphibians")
    suspend fun getAmphibians(): List<Amphibian>
}