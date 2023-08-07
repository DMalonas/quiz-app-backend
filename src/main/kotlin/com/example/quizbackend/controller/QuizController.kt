// src/main/kotlin/com/example/quizbackend/controller/QuizController.kt

package com.example.quizbackend.controller

import com.example.quizbackend.model.Question
import org.springframework.web.bind.annotation.*

@RestController
@RequestMapping("/api")
class QuizController {

    private var questions: MutableList<Question> = mutableListOf() // In-memory storage for simplicity

    @GetMapping("/questions")
    fun getQuestions(): List<Question> = questions

    @PostMapping("/update-questions")
    fun updateQuestions(@RequestBody newQuestions: List<Question>, @RequestParam secret: String): String {
        if (secret == "YOUR_SECRET_KEY") {
            questions = newQuestions.toMutableList()
            return "Questions updated successfully!"
        } else {
            return "Unauthorized!"
        }
    }
}
