package com.microservices.tbalance.model;

import jakarta.persistence.*;
import lombok.Data;

import java.time.LocalDateTime;

@Entity
@Table(name = "transaction_history")
@Data
public class TransactionHistory {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)  // Auto-increment primary key
    private Long trxHistoryId;

    @ManyToOne
    @JoinColumn(name = "user_id", nullable = false)
    private Users user;

    @ManyToOne
    @JoinColumn(name = "user_game_id", nullable = false)
    private UserGames userGame;

    @Column(nullable = false)
    private LocalDateTime entryDateTime;

    @ManyToOne
    @JoinColumn(name = "trxTypeId", nullable = false)
    private TransactionType transactionType;

    @Column(nullable = false)
    private int pointLoadedAmount;




    @PrePersist
    protected void onCreate() {
        entryDateTime = LocalDateTime.now();
    }
}
