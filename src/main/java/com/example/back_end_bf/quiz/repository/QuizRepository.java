package com.example.back_end_bf.quiz.repository;

import com.example.back_end_bf.quiz.domain.Quiz;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface QuizRepository extends JpaRepository<Quiz, Long> {
    @Query(value = "SELECT * FROM quiz WHERE category = 'OX퀴즈' ORDER BY RAND() LIMIT 3", nativeQuery = true)
    List<Quiz> findByRandomOXQuiz();
}
