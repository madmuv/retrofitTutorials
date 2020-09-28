package com.example.retrofitttutorials.repository

import com.example.retrofitttutorials.api.RetrofitInstantce
import com.example.retrofitttutorials.model.Post
import retrofit2.Response

class Repository {
    suspend fun getPost() : Response<Post> {
        return RetrofitInstantce.api.getPost()
    }
}