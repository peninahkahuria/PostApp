package com.example.postapp.api
object ApiClient {
    return retrofit.create(service)
}
}
var client = OkHttpClient.Builder().build()
var retrofit = Retrofit.Builder()
    .baseUrl("https://jsonplaceholder.typicode.com/")
    .addConverterFactory(GsonConverterFactory.create())
    .client(client)
    .build()
fun <T> buildService(service: Class<T>): T {