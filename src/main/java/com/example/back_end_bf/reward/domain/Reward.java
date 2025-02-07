package com.example.back_end_bf.reward.domain;

import jakarta.persistence.*;

@Entity
@Table(name = "reward")
public class Reward {
    @Id
    @Column(name = "reward_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "reward_type")
    private String rewardType; // 보상 종류 (포인트, 쿠폰 등)

    @Column(name = "received")
    private Boolean received; // 보상을 받았는지 여부

    //@ManyToOne
    //@JoinColumn(name = "user_id")
    //private User user; // 퀴즈를 푼 유저 (외래키)
}
