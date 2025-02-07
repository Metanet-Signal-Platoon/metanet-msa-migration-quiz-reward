package com.example.back_end_bf.quiz.domain;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Entity
@Table
@Getter
@NoArgsConstructor
public class Quiz {
    @Id
    @Column(name = "quiz_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name= "id")
    private Long uid;

    @Column(name = "category")
    private String category; // 구분 (OX, 객관식 등)

    @Column(name = "question")
    private String question; // 문제 내용

    @Column(name = "option1")
    private String option1;

    @Column(name = "option2")
    private String option2;

    @Column(name = "option3")
    private String option3;

    @Column(name = "option4")
    private String option4;

    @Column(name = "answer")
    private String answer; // 정답

    @Column(name = "explanation")
    private String explanation; // 해설
}

