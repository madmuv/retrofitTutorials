package com.example.retrofitttutorials.api

import com.example.retrofitttutorials.model.Post
import retrofit2.Response
import retrofit2.http.GET
import retrofit2.http.Path

interface SimpleApi {

    @GET("posts/1")
    suspend fun getPost() : Response<Post>

    @GET("posts/{postNumber}")
    suspend fun getPost2(
        @Path("postNumber") number: Int
    ) : Response<Post>
}