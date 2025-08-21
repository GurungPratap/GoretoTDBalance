package com.microservices.tbalance.model;

import jakarta.persistence.*;
import lombok.Data;

import java.util.List;

@Entity
@Table(name = "games")
@Data
public class Games {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)  // Auto-increment primary key
    private Long gameId;

    @Column(nullable = false, length = 100)
    private String gameName;

    @OneToMany(mappedBy = "game")
    private List<UserGames> userGames;

}
