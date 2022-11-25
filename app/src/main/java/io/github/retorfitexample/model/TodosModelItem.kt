package io.github.retorfitexample.model

data class TodosModelItem(
    val userId: Int,
    val id: Int,
    val title: String,
    val completed: Boolean
)