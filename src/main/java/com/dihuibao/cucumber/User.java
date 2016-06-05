package com.dihuibao.cucumber;

/**
 * Created by dihuibao on 5/6/2016.
 */
public class User {
    private String name;
    private String email;
    private String twitter;

    public User(String name, String email, String twitter) {
        this.name = name;
        this.email = email;
        this.twitter = twitter;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public String getTwitter() {
        return twitter;
    }
}
