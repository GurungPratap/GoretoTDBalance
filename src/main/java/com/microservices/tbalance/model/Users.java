package com.microservices.tbalance.model;

import jakarta.persistence.*;
import lombok.Data;

import java.util.List;

@Entity
@Table(name ="users")
@Data
public class Users {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)  // Auto-increment primary key
    private Long userId;

    @Column(unique = true,nullable = false, length = 100)
    private String login;

    @Column(length = 100, nullable = false)
    private String password;

    @Column(nullable = false, length = 100)
    private String firstName;

    @Column(nullable = false, length = 100)
    private String lastName;

    @Column(unique = true, nullable = true)
    private String email;

    @Column(unique = true, nullable = true)
    private String phoneNumber;

    @ManyToMany
    @JoinTable(
            name = "user_privilege",//junction table name
            joinColumns = @JoinColumn(name= "user_id"),
            inverseJoinColumns = @JoinColumn(name = "privilege_id")
    )
    private List<Privilege> privileges;


    @ManyToOne
    @JoinColumn(name = "user_type_id", nullable = false)
    private UserType userType;

    @OneToMany(mappedBy = "user", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<UserGames> userGames;

    @OneToMany(mappedBy = "user", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<TransactionHistory> transactionHistories;

    @OneToOne(mappedBy = "user", cascade = CascadeType.ALL, orphanRemoval = true)
    private UserBalance userBalance;
}
