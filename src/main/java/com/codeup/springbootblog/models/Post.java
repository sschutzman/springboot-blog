package com.codeup.springbootblog.models;

import org.hibernate.annotations.Entity;

import javax.persistence.*;

@Entity
@Table(name = "posts")
public class Post {

    @Id
    @GeneratedValue
    private long id;

    @Column(nullable = false)
    private String title;

    @Column(columnDefinition = "TEXT")
    private String body;

    @ManyToOne
    private User user;


    public void setId(long id) {
        this.id = id;
    }

    public long getId(){
        return id;
    }

    public Post(String title, String body, User user) {
        this.body = body;
        this.title = title;
        this.user = user;
    }

    public Post() {

    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getBody() {
        return body;
    }

    public void setBody(String body) {
        this.body = body;
    }

}


