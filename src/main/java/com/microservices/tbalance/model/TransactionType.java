package com.microservices.tbalance.model;

import jakarta.persistence.*;
import lombok.Data;

import java.util.List;

@Entity
@Table(name = "transaction_type")
@Data
public class TransactionType {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)  // Auto-increment primary key
    private Long trxTypeId;

    @Column(nullable = false, length = 100)
    private String descr;

    @OneToMany(mappedBy = "transactionType")
    private List<TransactionHistory> transactionHistories;

}
