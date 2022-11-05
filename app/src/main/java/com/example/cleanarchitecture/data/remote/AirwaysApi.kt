package com.example.cleanarchitecture.data.remote

import com.example.cleanarchitecture.data.remote.dto.AirwaysDto
import com.example.cleanarchitecture.domain.model.Airways
import retrofit2.Call
import retrofit2.http.GET

interface AirwaysApi {

    @get:GET("v1/8703cae8-f5f2-4682-9bd7-dfcc9eb2e861")
    val posts: Call<List<Airways>>

}