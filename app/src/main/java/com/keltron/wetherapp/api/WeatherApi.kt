package com.keltron.wetherapp.api

import com.keltron.wetherapp.api.models.ApiResponse
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Query

interface WeatherApi {
    @GET(APIEndpoints.ENDPOINT_CURRENT)
    fun getWeatherApi(
        @Query("key") apikey: String,
        @Query("q") local: String,
        @Query("aqi") aqi: String
    ):Call<ApiResponse>
}