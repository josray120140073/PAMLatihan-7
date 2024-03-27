package com.example.pamlatihan7

import retrofit2.Call
import retrofit2.http.GET

interface ApiService {
    @GET("users")
    fun getUsers(): Call<ApiResponse>
}

