package com.example.cleanarchitecture.di

import com.example.cleanarchitecture.common.Constants
import com.example.cleanarchitecture.data.remote.AirwaysApi
import com.example.cleanarchitecture.domain.model.Airways
import com.example.cleanarchitecture.presentation.airwaysDetails.components.HttpClient
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

object AppModule {
    fun buildRetrofit(): Retrofit {
    return Retrofit.Builder()
        .baseUrl(Constants.BASE_URL)
        .addConverterFactory(GsonConverterFactory.create())
        .client(HttpClient.getUnsafeOkHttpClient()!!.build())
        .build()
    }
}