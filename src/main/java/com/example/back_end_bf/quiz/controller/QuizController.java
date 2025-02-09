package com.example.back_end_bf.quiz.controller;

import com.example.back_end_bf.global.common.dto.CommonResponse;
import com.example.back_end_bf.quiz.service.QuizService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/quiz")
@RequiredArgsConstructor
public class QuizController {
    private final QuizService quizService;

    @GetMapping
    public ResponseEntity<CommonResponse> getDailyQuiz() throws Exception {
        return quizService.getQuiz();
    }
}
