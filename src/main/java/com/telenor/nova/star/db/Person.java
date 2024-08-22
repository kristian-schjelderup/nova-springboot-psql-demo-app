package com.telenor.nova.star.db;


import jakarta.persistence.*;

@Entity
@Table(name = "my_table")
public class Person {

    @Id
    @Column(name = "name")
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
