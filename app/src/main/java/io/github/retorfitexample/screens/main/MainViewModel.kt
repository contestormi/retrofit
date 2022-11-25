package io.github.retorfitexample.screens.main

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import io.github.retorfitexample.data.repository.Repository
import io.github.retorfitexample.model.TodosModel
import kotlinx.coroutines.launch
import retrofit2.Response

class MainViewModel : ViewModel() {

    var repo = Repository()

    val postsList: MutableLiveData<Response<TodosModel>> = MutableLiveData()

    fun getPosts (){
        viewModelScope.launch {
            postsList.value = repo.getTodos()
        }
    }
}