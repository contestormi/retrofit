package io.github.retorfitexample.data.repository

import io.github.retorfitexample.data.api.RetrofitInstance
import io.github.retorfitexample.model.TodosModel
import retrofit2.Response

class Repository {
    suspend fun getTodos(): Response<TodosModel> {
        return RetrofitInstance.api.getTodos()
    }
}