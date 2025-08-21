package com.microservices.tbalance.model;

import jakarta.persistence.*;
import lombok.Data;

import java.util.List;

@Entity
@Table(name = "user_games")
@Data
public class UserGames {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)  // Auto-increment primary key
    private Long userGameId;

    @Column(nullable = false)
    private int rate;

    @Column(nullable = false)
    private String userGameAcctName;

    @ManyToOne
    @JoinColumn(name="game_id", nullable = false)
    private Games game;

    @ManyToOne
    @JoinColumn(name="user_id", nullable = false)
    private Users user;

    @OneToMany(mappedBy = "userGame" ,cascade = CascadeType.ALL, orphanRemoval = false)
    private List<TransactionHistory> transactionHistories;

    @Column(nullable = false)
    private int userGamePoint;

}
