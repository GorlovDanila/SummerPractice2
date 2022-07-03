package com.example.finish.resource

data class User(
    val id: Int,
    val name: String,
    val hobby: String,
    var url: String = "",
    var info: String = "",
)
