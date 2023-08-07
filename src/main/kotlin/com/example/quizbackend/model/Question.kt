// src/main/kotlin/com/example/quizbackend/model/Question.kt

package com.example.quizbackend.model

data class Question(
    val id: Int,
    val prompt: String,
    val choices: List<String>,
    val answer: Int
)
