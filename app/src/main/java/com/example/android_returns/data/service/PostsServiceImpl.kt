package com.example.android_returns.data.service

import com.example.android_returns.data.HttpConfig
import com.example.android_returns.data.dto.PostResponse
import io.ktor.client.HttpClient
import io.ktor.client.call.body
import io.ktor.client.request.get

class PostsServiceImpl(private val client: HttpClient) : PostsService {
    override suspend fun getPosts(): List<PostResponse> {
        return try {
            client.get(HttpConfig.POSTS).body()
        } catch (e: Exception){
            emptyList()
        }
    }
}