package com.microservices.tbalance.model;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Table(name = "user_balance")
@Data
public class UserBalance {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)  // Auto-increment primary key
    private Long userBalanceId;

    @OneToOne
    @JoinColumn(name = "user_id")
    private Users user;

    @Column(nullable = false)
    private double balance;
}
