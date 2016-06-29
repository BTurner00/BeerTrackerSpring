package com.theironyard.entities;

import javax.persistence.*;

/**
 * Created by zach on 11/10/15.
 */
@Entity
@Table(name = "beers")
public class Beer {
    @Id
    @GeneratedValue
    Integer id;

    @Column(nullable = false)
    public String name;

    @Column(nullable = false)
    public String type;

    @Column(nullable = false)
    public Integer calories;

    @ManyToOne
    public User user;

    public Beer(String name, String type, Integer calories, User user) {
        this.name = name;
        this.type = type;
        this.calories = calories;
        this.user = user;
    }

    public Beer() {
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Integer getCalories() {
        return calories;
    }

    public void setCalories(Integer calories) {
        this.calories = calories;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }
}
