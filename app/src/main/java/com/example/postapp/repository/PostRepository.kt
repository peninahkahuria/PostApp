package com.example.postapp.repository
import com.example.postapp.api.ApiClient
import com.example.postapp.api.ApiInterface
import com.example.postapp.models.Post
class PostsRepository() {
    suspend fun getPosts(): Response<List<Post>> = withContext(Dispatchers.IO + NonCancellable) {
        val apiClient = ApiClient.buildService(ApiInterface::class.java)
        val response = apiClient.getPosts()
        return@withContext response
    }
}