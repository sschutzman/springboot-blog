package com.codeup.springbootblog.models;

import javax.persistence.*;

@Entity
public class User {
    @Id @GeneratedValue
    private long id;

    @Column(unique = true, nullable = false)
    private String username;

    @Column(unique = true, nullable = false)
    private String email;

    @Column(nullable = false)
    private String password;

    @OneToOne
    private User owner;

    public User(String username, String password, String email){
        this.username= username;
        this.password= password;
        this.email= email;
    }



}
