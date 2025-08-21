package com.microservices.tbalance.model;


import jakarta.persistence.*;
import lombok.Data;

import java.util.List;

@Entity
@Table(name = "user_type")
@Data
public class UserType {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int userTypeId;
    @Column(length = 100, nullable = false)
    private String descr;


    @OneToMany(mappedBy = "userType", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<Users> user;

}
