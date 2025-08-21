package com.microservices.tbalance.model;

import jakarta.persistence.*;
import lombok.Data;

import java.util.List;

@Entity
@Table(name ="privilege")
@Data
public class Privilege {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)  // Auto-increment primary key
    private Long privilegeId;

    @Column(nullable = false, length = 100)
    private String component;

    @Column(nullable = false, length = 100)
    private String operation;

    @ManyToMany(mappedBy = "privileges")
    private List<Users> user;
}
