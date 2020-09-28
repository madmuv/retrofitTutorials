package com.example.retrofitttutorials.api

import com.example.retrofitttutorials.model.Post
import retrofit2.http.GET

interface SimpleApi {

    @GET("posts/1")
    suspend fun getPost() : Post
}