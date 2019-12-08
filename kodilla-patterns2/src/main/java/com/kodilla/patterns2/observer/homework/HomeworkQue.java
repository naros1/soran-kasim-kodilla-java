package com.kodilla.patterns2.observer.homework;

import java.util.ArrayList;
import java.util.List;

public class HomeworkQue implements Observable{
    private final List<String> homeworks;
    private final String studentName;
    private final List<Observer> observers;

    public HomeworkQue(String studentName) {
        homeworks = new ArrayList<>();
        observers = new ArrayList<>();
        this.studentName = studentName;
    }

    public void addHomework(String homework){
        homeworks.add(homework);
        notifyObserver();
    }

    @Override
    public void registerObserver(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void notifyObserver() {
        for (Observer observer : observers) {
            observer.update(this);
        }
    }

    @Override
    public void removeObserver(Observer observer) {
        observers.remove(observer);
    }

    public List<String> getHomeworks() {
        return homeworks;
    }

    public String getStudentName() {
        return studentName;
    }
}
