package com.keltron.wetherapp.api

import retrofit2.Retrofit

object RetroficInstance {
    object RetrofitHelper {

        val baseUrl = "https://quotable.io/"
        fun getInstance(): Retrofit {
            return Retrofit.Builder().baseUrl(baseUrl)
                .addConverterFactory(GsonConverterFactory.create())

                .build()
        }
    }
}