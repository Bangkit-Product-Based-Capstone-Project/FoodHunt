package com.example.foodhunt.scan.api

import com.example.foodhunt.response.ScanResponse
import retrofit2.Call
import retrofit2.http.Field
import retrofit2.http.POST

interface ScanApiService {
    @POST("/api/predict")
    fun result(
        @Field("key") key: Int,
        @Field("value") value: String
    ): Call<ScanResponse>
}