package com.zoro.springbootjwtserver.models;

import jakarta.persistence.*;

@Entity
@Table(name = "roles")
public class Role {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    
    @Enumerated(EnumType.STRING)
    @Column(length = 20)
    private ERole name;

    public Role() {

    }

    public Role(ERole name) {
        this.name = name;
    }
    // Getters

    public Integer getId () {
        return id;
    }

    public ERole getName () {
        return name;
    }

    // Setters

    public void setId (Integer id) {
        this.id = id;
    }

    public void setName (ERole name) {
        this.name = name;
    }
}
