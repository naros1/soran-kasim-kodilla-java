package com.kodilla.good.patterns.challanges.orderingservice;

public class User {
    private String name;
    private String suranme;

    public User(final String name,final String suranme) {
        this.name = name;
        this.suranme = suranme;
    }


    public String getName() {
        return name;
    }

    public String getSuranme() {
        return suranme;
    }
}
