package com.example.retrofitttutorials.repository

import com.example.retrofitttutorials.api.RetrofitInstantce
import com.example.retrofitttutorials.model.Post

class Repository {
    suspend fun getPost() {
        RetrofitInstantce.api.getPost()
    }
}