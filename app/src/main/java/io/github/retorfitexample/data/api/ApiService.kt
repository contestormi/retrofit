package io.github.retorfitexample.data.api

import io.github.retorfitexample.model.TodosModel
import retrofit2.Response
import retrofit2.http.GET

interface ApiService {
    @GET("todos")
    suspend fun getTodos(): Response<TodosModel>
}