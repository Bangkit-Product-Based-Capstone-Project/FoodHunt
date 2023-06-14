package com.example.foodhunt.articleapi

import com.example.foodhunt.response.ArticleResponse
import retrofit2.Call
import retrofit2.http.Field
import retrofit2.http.FormUrlEncoded
import retrofit2.http.GET
import retrofit2.http.POST

interface ArticleApiService {
    @FormUrlEncoded
    @GET("artikel")
    fun article(
        @Field("image") image: String,
        @Field("title") title: String,
        @Field("description") description: String
    ): Call<ArticleResponse>
}