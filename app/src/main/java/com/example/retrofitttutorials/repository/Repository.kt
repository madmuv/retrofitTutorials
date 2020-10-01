package com.example.retrofitttutorials.repository

import com.example.retrofitttutorials.api.RetrofitInstantce
import com.example.retrofitttutorials.model.Post
import retrofit2.Response

class Repository {
    suspend fun getPost() : Response<Post> {
        return RetrofitInstantce.api.getPost()
    }

    suspend fun getPost2(number: Int) : Response<Post> {
        return RetrofitInstantce.api.getPost2(number)
    }

    suspend fun getCustomPosts(userId : Int, sort:String, order: String) : Response<List<Post>> {
        return RetrofitInstantce.api.getCustomPost(userId, sort, order)
    }

    suspend fun getCustomPosts2(userId : Int, option: Map<String, String>) : Response<List<Post>> {
        return RetrofitInstantce.api.getCustomPost2(userId, option)
    }
}