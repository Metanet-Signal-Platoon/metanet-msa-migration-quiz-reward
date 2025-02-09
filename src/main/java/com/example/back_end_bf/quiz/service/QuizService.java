package com.example.back_end_bf.quiz.service;

import com.example.back_end_bf.global.common.dto.CommonResponse;
import com.example.back_end_bf.quiz.domain.Quiz;
import com.example.back_end_bf.quiz.repository.QuizRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@RequiredArgsConstructor
public class QuizService {
    private final QuizRepository quizRepository;
    // 퀴즈 조회
    @Transactional(readOnly = true)
    public ResponseEntity<CommonResponse> getQuiz() throws Exception {
        List<Quiz> quizResponse = quizRepository.findByRandomOXQuiz();
        if (quizResponse == null || quizResponse.isEmpty()) {
            throw new Exception();
        }
        return ResponseEntity.ok()
                .body(CommonResponse.builder().success(true).response(quizResponse).build());
    }
}
