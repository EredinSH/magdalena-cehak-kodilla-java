package com.kodilla.patterns.strategy.social;

import com.kodilla.patterns.strategy.BuyPredictor;

public class User {

    private String userName;
    protected SocialPublisher socialPublisher;

    public User(String userName) {
        this.userName = userName;
    }

    public String getUserName() {
        return userName;
    }

    public String sharing() {
        return socialPublisher.share();
    }

    public void setSharingStrategy(SocialPublisher socialPublisher) {
        this.socialPublisher = socialPublisher;
    }

}
