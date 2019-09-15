package com.kodilla.good.patterns.challanges.orderingservice;

public class MailService extends InformationService {

    public void inform(User user){
        System.out.println("Mail with information have been sent to : " + user.getName() + " " + user.getSuranme().toUpperCase());
    }

}
